/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.coroutines

import io.vertx.core.Context
import io.vertx.core.Handler
import io.vertx.core.Vertx
import io.vertx.core.streams.ReadStream
import io.vertx.core.streams.WriteStream
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.ObsoleteCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ChannelIterator
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.SendChannel
import kotlinx.coroutines.launch
import kotlinx.coroutines.selects.SelectClause1
import kotlin.coroutines.CoroutineContext

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
  private val channel: Channel<T> = Channel(DEFAULT_CAPACITY)

  @ExperimentalCoroutinesApi
  override val isClosedForReceive: Boolean
    get() = channel.isClosedForReceive

  @ExperimentalCoroutinesApi
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

  @ObsoleteCoroutinesApi
  override suspend fun receiveOrNull(): T? {
    return channel.receiveOrNull()
  }

  override val onReceive: SelectClause1<T>
    get() = channel.onReceive

  @ExperimentalCoroutinesApi
  override val onReceiveOrNull: SelectClause1<T?>
    get() = channel.onReceiveOrNull

  override fun handle(event: T) {
    launch { channel.send(event) }
  }

  @ObsoleteCoroutinesApi
  @Deprecated(level = DeprecationLevel.ERROR, message = "Since 3.7.1, binary compatibility with versions <= 3.7.0")
  override fun cancel(cause: Throwable?): Boolean {
    channel.cancel(CancellationException(message = null, cause = cause))
    return true
  }

  override fun cancel(cause: CancellationException?) {
    channel.cancel(cause)
  }

  @Deprecated(level = DeprecationLevel.ERROR, message = "Since 3.7.1, binary compatibility with versions <= 3.7.0")
  override fun cancel(): Unit {
    return channel.cancel()
  }
}

/**
 * Create a [ReceiveChannelHandler] of some type `T`.
 */
fun <T> Vertx.receiveChannelHandler(): ReceiveChannelHandler<T> = ReceiveChannelHandler(this)

/**
 * Adapts the current read stream to Kotlin [ReceiveChannel].
 *
 * The adapter will fetch at most max channel capacity from the stream and pause it when the channel is full.
 *
 * @param vertx the related vertx instance
 * @param capacity the channel buffering capacity
 */
fun <T> ReadStream<T>.toChannel(vertx: Vertx): ReceiveChannel<T> {
  return toChannel(vertx.getOrCreateContext())
}

/**
 * Adapts the current read stream to Kotlin [ReceiveChannel].
 *
 * @param context the vertx context
 */
fun <T> ReadStream<T>.toChannel(context: Context): ReceiveChannel<T> {
  this.pause()
  val ret = ChannelReadStream(
    stream = this,
    channel = Channel(0),
    context = context
  )
  ret.subscribe()
  this.fetch(1)
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
        stream.fetch(1)
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
@ExperimentalCoroutinesApi
fun <T> WriteStream<T>.toChannel(vertx: Vertx, capacity: Int = DEFAULT_CAPACITY): SendChannel<T> {
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
@ExperimentalCoroutinesApi
fun <T> WriteStream<T>.toChannel(context: Context, capacity: Int = DEFAULT_CAPACITY): SendChannel<T> {
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

  @ExperimentalCoroutinesApi
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

private const val DEFAULT_CAPACITY = 16
