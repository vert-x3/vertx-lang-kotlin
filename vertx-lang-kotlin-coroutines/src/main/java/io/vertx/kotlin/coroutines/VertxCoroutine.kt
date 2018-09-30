package io.vertx.kotlin.coroutines

import io.vertx.core.AsyncResult
import io.vertx.core.Context
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.core.Vertx
import io.vertx.core.streams.ReadStream
import io.vertx.core.streams.WriteStream
import kotlinx.coroutines.experimental.CancellableContinuation
import kotlinx.coroutines.experimental.CoroutineDispatcher
import kotlinx.coroutines.experimental.Runnable
import kotlinx.coroutines.experimental.asCoroutineDispatcher
import kotlinx.coroutines.experimental.channels.ArrayChannel
import kotlinx.coroutines.experimental.channels.ChannelIterator
import kotlinx.coroutines.experimental.channels.Closed
import kotlinx.coroutines.experimental.channels.ReceiveChannel
import kotlinx.coroutines.experimental.channels.SendChannel
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.selects.SelectClause1
import kotlinx.coroutines.experimental.suspendCancellableCoroutine
import java.util.concurrent.AbstractExecutorService
import java.util.concurrent.Callable
import java.util.concurrent.Delayed
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.ScheduledFuture
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicReference

/**
 * @author <a href="http://www.streamis.me">Stream Liu</a>
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 * @author [Julien Ponge](https://julien.ponge.org/)
 */

/**
 * Create a [ReceiveChannelHandler] of some type `T`.
 */
fun <T> Vertx.receiveChannelHandler(): ReceiveChannelHandler<T> = ReceiveChannelHandler(this)

/**
 * Runs an asynchronous [block] and awaits its completion.
 *
 * The [block] is executed with a `Handler<T>` argument that shall be called once.
 *
 * When the handler is called, `awaitEvent` returns the value that the handler received.
 *
 * This future can be passed to Vert.x asynchronous method:
 *
 * ```
 * val s = awaitEvent { handler ->
 *   server.setTimer(1000, handler)
 * }
 * ```
 *
 * The coroutine will be blocked until the event occurs, this action does not block vertx's event loop.
 *
 * @param block the code to run
 */
suspend fun <T> awaitEvent(block: (h: Handler<T>) -> Unit): T {
  return suspendCancellableCoroutine { cont: CancellableContinuation<T> ->
    try {
      block.invoke(Handler { t ->
        cont.resume(t)
      })
    } catch (e: Exception) {
      cont.resumeWithException(e)
    }
  }
}

/**
 * Runs an asynchronous [block] and awaits the result.
 *
 * The [block] is executed with a `Handler<AsyncResult<T>>` argument that can be completed or failed.
 *
 * - on completion `awaitResult` returns the value that completed the future
 * - on failure `awaitResult` throws the exception that failed the future
 *
 * This handler can be passed to Vert.x asynchronous method:
 *
 * ```
 * val s = awaitResult { handler ->
 *   server.listen(8080, handler)
 * }
 * ```
 *
 * The coroutine will be blocked until the future is completed or failed, this action does not block vertx's event loop.
 *
 * @param block the code to run
 */
suspend fun <T> awaitResult(block: (h: Handler<AsyncResult<T>>) -> Unit): T {
  val asyncResult = awaitEvent(block)
  if (asyncResult.succeeded()) return asyncResult.result()
  else throw asyncResult.cause()
}

/**
 * Runs an asynchronous [block] on a worker thread and awaits the result.
 *
 * The [block] is executed and should return an object or throw an exception.
 *
 * - when an object is returned, it is returned from the `awaitBlocking` call
 * - when an exception is thrown, it is thrown from the `awaitBlocking` call
 *
 * ```
 * val s = awaitBlocking {
 *   Thread.sleep(1000)
 *   "some-string"
 * }
 * ```
 *
 * The coroutine will suspend until the block is executed, this action does not block vertx's event loop.
 *
 * @param block the code to run
 */
suspend fun <T> awaitBlocking(block: () -> T): T {
  return awaitResult { handler ->
    val ctx = Vertx.currentContext()
    ctx.executeBlocking<T>({ fut ->
      fut.complete(block())
    }, { ar ->
      handler.handle(ar)
    })
  }
}

/**
 * Awaits the completion of a future without blocking the event loop.
 */
suspend fun <T> Future<T>.await(): T = when {
  succeeded() -> result()
  failed() -> throw cause()
  else -> suspendCancellableCoroutine { cont: CancellableContinuation<T> ->
    setHandler { asyncResult ->
      if (asyncResult.succeeded()) cont.resume(asyncResult.result() as T)
      else cont.resumeWithException(asyncResult.cause())
    }
  }
}

/**
 * An adapter that converts a stream of events from the [Handler] into a [ReceiveChannel] which allows the events
 * to be received synchronously.
 */
class ReceiveChannelHandler<T> constructor(context: Context) : ReceiveChannel<T>, Handler<T> {

  constructor(vertx: Vertx) : this(vertx.getOrCreateContext())

  private val stream: ReadStream<T> = object : ReadStream<T> {
    override fun pause(): ReadStream<T> = this
    override fun exceptionHandler(handler: Handler<Throwable>?): ReadStream<T> = this
    override fun endHandler(endHandler: Handler<Void>?): ReadStream<T> = this
    override fun resume(): ReadStream<T> = this
    override fun fetch(amount: Long): ReadStream<T> = this
    override fun handler(h: Handler<T>?): ReadStream<T> {
      handler = h
      return this
    }
  }

  private val channel: ReceiveChannel<T> = stream.toChannel(context)
  private var handler: Handler<T>? = null

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
    handler?.handle(event)
  }

  override fun cancel(): Boolean {
    TODO("not implemented")
  }

  override fun cancel(cause: Throwable?): Boolean {
    return channel.cancel(cause)
  }

  override fun cancel(): Boolean {
    return this.cancel(null)
  }
}

/**
 * Adapts the current read stream to Kotlin [ReceiveChannel].
 *
 * The channel can be used to receive the read stream items, the stream is paused when the channel
 * is full and resumed when the channel is half empty.
 *
 * @param vertx the related vertx instance
 * @param capacity the channel buffering capacity
 */
fun <T> ReadStream<T>.toChannel(vertx: Vertx, capacity: Int = 256): ReceiveChannel<T> {
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
fun <T> ReadStream<T>.toChannel(context: Context, capacity: Int = 256): ReceiveChannel<T> {
  val ret = ChannelReadStream(context, this, capacity)
  ret.subscribe()
  return ret
}

private class ChannelReadStream<T>(val context: Context,
                                   val stream: ReadStream<T>,
                                   capacity: Int) : ArrayChannel<T>(capacity) {

  @Volatile
  private var size = 0

  fun subscribe() {
    stream.endHandler { _ ->
      close()
    }
    stream.exceptionHandler { err ->
      close(err)
    }
    stream.handler { event ->
      launch(context.dispatcher()) {
        send(event)
      }
    }
  }

  override fun offerInternal(element: T): Any {
    val ret = super.offerInternal(element)
    // Not great - fix this
    if (ret.toString() == "OFFER_SUCCESS") {
      size++
      if (isFull) {
        stream.pause()
      }
    }
    return ret
  }

  override fun pollInternal(): Any? {
    val ret = super.pollInternal()
    // Not great - fix this
    if (ret.toString() != "POLL_FAILED" && ret !is Closed<*>) {
      if (--size < capacity / 2) {
        stream.resume()
      }
    }
    return ret
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
fun <T> WriteStream<T>.toChannel(vertx: Vertx, capacity: Int = 256): SendChannel<T> {
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
fun <T> WriteStream<T>.toChannel(context: Context, capacity: Int = 256): SendChannel<T> {
  val ret = ChannelWriteStream(context, this, capacity)
  ret.subscribe()
  return ret
}

private class ChannelWriteStream<T>(val context: Context,
                                    val stream: WriteStream<T>,
                                    capacity: Int) : ArrayChannel<T>(capacity) {

  fun subscribe() {
    launch(context.dispatcher()) {
      while (true) {
        val elt = receiveOrNull()
        if (stream.writeQueueFull()) {
          stream.drainHandler { _ ->
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
      stream.end()
      false
    }
  }
}

/**
 * Returns a coroutine dispatcher for the current Vert.x context.
 *
 * It uses the Vert.x context event loop.
 *
 * This is necessary if you want to execute coroutine synchronous operations in your handler
 */
fun Vertx.dispatcher(): CoroutineDispatcher {
  return getOrCreateContext().dispatcher()
}

/**
 * Returns a coroutine dispatcher for this context.
 *
 * It uses the Vert.x context event loop.
 *
 * This is necessary if you want to execute coroutine synchronous operations in your handler
 */
fun Context.dispatcher(): CoroutineDispatcher {
  require(!isMultiThreadedWorkerContext) { "Must not be a multithreaded worker verticle." }
  return VertxCoroutineExecutor(this).asCoroutineDispatcher()
}

private class VertxScheduledFuture(
  val vertxContext: Context,
  val task: Runnable,
  val delay: Long,
  val unit: TimeUnit) : ScheduledFuture<Any>, Handler<Long> {

  // pending : null (no completion)
  // done : true
  // cancelled : false
  val completion = AtomicReference<Boolean?>()
  var id: Long? = null

  fun schedule() {
    val owner = vertxContext.owner()
    id = owner.setTimer(unit.toMillis(delay), this)
  }

  override fun get(): Any? {
    return null
  }

  override fun get(timeout: Long, unit: TimeUnit?): Any? {
    return null
  }

  override fun isCancelled(): Boolean {
    return completion.get() == false
  }

  override fun handle(event: Long?) {
    if (completion.compareAndSet(null, true)) {
      task.run()
    }
  }

  override fun cancel(mayInterruptIfRunning: Boolean): Boolean {
    return if (completion.compareAndSet(null, false)) {
      vertxContext.owner().cancelTimer(id!!)
    } else {
      false
    }
  }

  override fun isDone(): Boolean {
    return completion.get() == true
  }

  override fun getDelay(u: TimeUnit): Long {
    return u.convert(unit.toNanos(delay), TimeUnit.NANOSECONDS)
  }

  override fun compareTo(other: Delayed): Int {
    return getDelay(TimeUnit.NANOSECONDS).compareTo(other.getDelay(TimeUnit.NANOSECONDS))
  }
}

private class VertxCoroutineExecutor(val vertxContext: Context) : AbstractExecutorService(), ScheduledExecutorService {

  override fun execute(command: Runnable) {
    if (Vertx.currentContext() != vertxContext) {
      vertxContext.runOnContext { command.run() }
    } else {
      command.run()
    }
  }

  override fun schedule(command: Runnable, delay: Long, unit: TimeUnit): ScheduledFuture<*> {
    val t = VertxScheduledFuture(vertxContext, command, delay, unit)
    t.schedule()
    return t
  }

  override fun scheduleAtFixedRate(command: Runnable, initialDelay: Long, period: Long, unit: TimeUnit?): ScheduledFuture<*> {
    throw UnsupportedOperationException("should not be called")
  }

  override fun <V : Any?> schedule(callable: Callable<V>?, delay: Long, unit: TimeUnit?): ScheduledFuture<V> {
    throw UnsupportedOperationException("should not be called")
  }

  override fun scheduleWithFixedDelay(command: Runnable?, initialDelay: Long, delay: Long, unit: TimeUnit?): ScheduledFuture<*> {
    throw UnsupportedOperationException("should not be called")
  }

  override fun isTerminated(): Boolean {
    throw UnsupportedOperationException("should not be called")
  }

  override fun shutdown() {
    throw UnsupportedOperationException("should not be called")
  }

  override fun shutdownNow(): MutableList<Runnable> {
    throw UnsupportedOperationException("should not be called")
  }

  override fun isShutdown(): Boolean {
    throw UnsupportedOperationException("should not be called")
  }

  override fun awaitTermination(timeout: Long, unit: TimeUnit?): Boolean {
    throw UnsupportedOperationException("should not be called")
  }
}
