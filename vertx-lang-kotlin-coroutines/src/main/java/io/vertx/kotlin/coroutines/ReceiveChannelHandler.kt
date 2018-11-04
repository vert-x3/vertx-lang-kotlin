package io.vertx.kotlin.coroutines

import io.vertx.core.Context
import io.vertx.core.Handler
import io.vertx.core.Vertx
import io.vertx.core.streams.ReadStream
import io.vertx.core.streams.WriteStream
import kotlinx.coroutines.experimental.CoroutineScope
import kotlinx.coroutines.experimental.channels.Channel
import kotlinx.coroutines.experimental.channels.ChannelIterator
import kotlinx.coroutines.experimental.channels.ReceiveChannel
import kotlinx.coroutines.experimental.channels.SendChannel
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.selects.SelectClause1
import kotlin.coroutines.experimental.CoroutineContext

/**
 * @author <a href="http://www.streamis.me">Stream Liu</a>
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 * @author [Julien Ponge](https://julien.ponge.org/)
 * @author [Guido Pio Mariotti](https://github.com/gmariotti)
 */

/**
 * An adapter that converts a stream of events from the [Handler] into a [ReceiveChannel] which allows the events
 * to be received synchronously.
 */
class ReceiveChannelHandler<T>(context: Context) : ReceiveChannel<T>, Handler<T>, CoroutineScope {

  constructor(vertx: Vertx) : this(vertx.getOrCreateContext())

  override val coroutineContext: CoroutineContext = context.dispatcher()
  private val channel: Channel<T> = Channel(MAX_CAPACITY)

  override val isClosedForReceive: Boolean
    get() = channel.isClosedForReceive

  override val isEmpty: Boolean
    get() = channel.isEmpty

  override fun iterator(): ChannelIterator<T> {
    return channel.iterator()
  }

  override fun poll(): T? {
    return channel.poll()
  }

  override suspend fun receive(): T {
    return channel.receive()
  }

  override suspend fun receiveOrNull(): T? {
    return channel.receiveOrNull()
  }

  override val onReceive: SelectClause1<T>
    get() = channel.onReceive

  override val onReceiveOrNull: SelectClause1<T?>
    get() = channel.onReceiveOrNull

  override fun handle(event: T) {
    launch { channel.send(event) }
  }

  override fun cancel(cause: Throwable?): Boolean {
    return channel.cancel(cause)
  }

  override fun cancel(): Boolean {
    return this.cancel(null)
  }
}

/**
 * Create a [ReceiveChannelHandler] of some type `T`.
 */
fun <T> Vertx.receiveChannelHandler(): ReceiveChannelHandler<T> = ReceiveChannelHandler(this)

/**
 * Adapts the current read stream to Kotlin [ReceiveChannel].
 *
 * The channel can be used to receive the read stream items, the stream is paused when the channel
 * is full and resumed when the channel is half empty.
 *
 * @param vertx the related vertx instance
 * @param capacity the channel buffering capacity
 */
fun <T> ReadStream<T>.toChannel(vertx: Vertx, capacity: Int = MAX_CAPACITY): ReceiveChannel<T> {
  return toChannel(vertx.getOrCreateContext(), capacity)
}

/**
 * Adapts the current read stream to Kotlin [ReceiveChannel].
 *
 * The channel can be used to receive the read stream items, the stream is paused when the channel
 * is full and resumed when the channel is half empty.
 *
 * @param context the vertx context
 * @param capacity the channel buffering capacity
 */
fun <T> ReadStream<T>.toChannel(context: Context, capacity: Int = MAX_CAPACITY): ReceiveChannel<T> {
  val ret = ChannelReadStream(
    stream = this,
    channel = Channel(capacity),
    context = context
  )
  ret.subscribe()
  return ret
}

private class ChannelReadStream<T>(val stream: ReadStream<T>,
                                   val channel: Channel<T>,
                                   context: Context) : Channel<T> by channel, CoroutineScope {

  override val coroutineContext: CoroutineContext = context.dispatcher()

  fun subscribe() {
    stream.endHandler {
      close()
    }
    stream.exceptionHandler { err ->
      close(err)
    }
    stream.handler { event ->
      launch {
        send(event)
      }
    }
  }

  override suspend fun send(element: T) {
    channel.send(element)
    pauseStreamIfFull()
  }

  override fun offer(element: T): Boolean {
    val isOffered = channel.offer(element)
    if (isOffered) {
      pauseStreamIfFull()
    }
    return isOffered
  }

  private fun pauseStreamIfFull() {
    if (isFull) {
      stream.pause()
    }
  }

  override suspend fun receive(): T {
    stream.fetch(1)
    return channel.receive()
  }

  override suspend fun receiveOrNull(): T? {
    stream.fetch(1)
    return channel.receiveOrNull()
  }

  override fun poll(): T? {
    stream.fetch(1)
    return channel.poll()
  }

  override fun iterator(): ChannelIterator<T> {
    return object : ChannelIterator<T> {
      private val iterator = channel.iterator()
      override suspend fun hasNext(): Boolean {
        return iterator.hasNext()
      }

      override suspend fun next(): T {
        stream.fetch(1)
        return iterator.next()
      }
    }
  }

}

/**
 * Adapts the current write stream to Kotlin [SendChannel].
 *
 * The channel can be used to write items, the coroutine is suspended when the stream is full
 * and resumed when the stream is drained.
 *
 * @param vertx the related vertx instance
 * @param capacity the channel buffering capacity
 */
fun <T> WriteStream<T>.toChannel(vertx: Vertx, capacity: Int = MAX_CAPACITY): SendChannel<T> {
  return toChannel(vertx.getOrCreateContext(), capacity)
}

/**
 * Adapts the current write stream to Kotlin [SendChannel].
 *
 * The channel can be used to write items, the coroutine is suspended when the stream is full
 * and resumed when the stream is drained.
 *
 * @param context the vertx context
 * @param capacity the channel buffering capacity
 */
fun <T> WriteStream<T>.toChannel(context: Context, capacity: Int = MAX_CAPACITY): SendChannel<T> {
  val ret = ChannelWriteStream(
    stream = this,
    channel = Channel(capacity),
    context = context
  )
  ret.subscribe()
  return ret
}

private class ChannelWriteStream<T>(val stream: WriteStream<T>,
                                    val channel: Channel<T>,
                                    context: Context) : Channel<T> by channel, CoroutineScope {

  override val coroutineContext: CoroutineContext = context.dispatcher()

  fun subscribe() {
    stream.exceptionHandler {
      channel.close(it)
    }

    launch {
      while (true) {
        val elt = channel.receiveOrNull()
        if (stream.writeQueueFull()) {
          stream.drainHandler {
            if (dispatch(elt)) {
              subscribe()
            }
          }
          break
        } else {
          if (!dispatch(elt)) {
            break
          }
        }
      }
    }
  }

  fun dispatch(elt: T?): Boolean {
    return if (elt != null) {
      stream.write(elt)
      true
    } else {
      close()
      false
    }
  }

  override fun close(cause: Throwable?): Boolean {
    val ret = channel.close(cause)
    if (ret) stream.end()
    return ret
  }
}

private const val MAX_CAPACITY = 256
