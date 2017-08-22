package io.vertx.kotlin.coroutines

import io.vertx.core.*
import io.vertx.core.Future
import io.vertx.core.streams.ReadStream
import io.vertx.core.streams.WriteStream
import kotlinx.coroutines.experimental.*
import kotlinx.coroutines.experimental.CancellationException
import kotlinx.coroutines.experimental.channels.*
import kotlinx.coroutines.experimental.selects.SelectInstance
import java.util.concurrent.*
import java.util.concurrent.atomic.AtomicInteger
import kotlin.coroutines.experimental.Continuation
import kotlin.coroutines.experimental.CoroutineContext

/**
 * Created by stream.
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */

/**
 * Convert a standard handler to a handler which runs on a coroutine.
 * This is necessary if you want to do fiber blocking synchronous operation in your handler
 */
fun Vertx.runCoroutine(block: suspend CoroutineScope.() -> Unit) {
  getOrCreateContext().runCoroutine(block)
}

/**
 * Create a `ReceiveChannelHandler` of some type `T`.
 */
fun <T> Vertx.receiveChannelHandler(): ReceiveChannelHandler<T> = ReceiveChannelHandler(this)

/**
 * Receive a single event from a handler synchronously.
 * The coroutine will be blocked until the event occurs, this action do not block vertx's eventLoop.
 */
suspend fun <T> asyncEvent(block: (h: Handler<T>) -> Unit) : T {
  return asyncResult { f ->
    val fut = Future.future<T>().setHandler(f)
    val adapter : Handler<T> = Handler { t ->
      fut.tryComplete(t)
    }
    try {
      block.invoke(adapter)
    } catch(t: Throwable) {
      fut.tryFail(t)
    }
  }
}

/**
 * Invoke an asynchronous operation and obtain the result synchronous.
 * The coroutine will be blocked until the event occurs, this action do not block vertx's eventLoop.
 */
suspend fun <T> asyncResult(block: (h: Handler<AsyncResult<T>>) -> Unit) : T {
  return suspendCancellableCoroutine { cont: Continuation<T> ->
    block(Handler { asyncResult ->
      if (asyncResult.succeeded()) cont.resume(asyncResult.result())
      else cont.resumeWithException(asyncResult.cause())
    })
  }
}

/**
 * Awaits for completion of future without blocking eventLoop
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
class ReceiveChannelHandler<T> constructor(context : Context) : ReceiveChannel<T>, Handler<T> {

  constructor(vertx : Vertx) : this(vertx.getOrCreateContext())

  private val stream : ReadStream<T> = object: ReadStream<T> {
    override fun pause(): ReadStream<T> = this
    override fun exceptionHandler(handler: Handler<Throwable>?): ReadStream<T> = this
    override fun endHandler(endHandler: Handler<Void>?): ReadStream<T> = this
    override fun resume(): ReadStream<T> = this
    override fun handler(h: Handler<T>?): ReadStream<T> {
      handler = h
      return this
    }
  }

  private val channel : ReceiveChannel<T> = toChannel(context, stream)
  private var handler : Handler<T>? = null

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

  suspend override fun receive(): T {
    return channel.receive()
  }

  suspend override fun receiveOrNull(): T? {
    return channel.receiveOrNull()
  }

  override fun <R> registerSelectReceive(select: SelectInstance<R>, block: suspend (T) -> R) {
    return channel.registerSelectReceive(select, block)
  }

  override fun <R> registerSelectReceiveOrNull(select: SelectInstance<R>, block: suspend (T?) -> R) {
    return channel.registerSelectReceiveOrNull(select, block)
  }

  override fun handle(event: T) {
    val h = handler
    if (h != null) {
      h.handle(event)
    }
  }
}

/**
 * Converts this deferred value to the instance of Future.
 * The deferred value is cancelled when the resulting future is cancelled or otherwise completed.
 */
fun <T> Deferred<T>.asFuture(): Future<T> {
  val future = Future.future<T>()
  future.setHandler({ asyncResult ->
    //if fail, we cancel this job
    if (asyncResult.failed()) cancel(asyncResult.cause())
  })
  invokeOnCompletion {
    try {
      future.complete(getCompleted())
    } catch (t: Throwable) {
      future.fail(VertxException(t))
    }
  }
  return future
}

fun <T> toChannel(vertx : Vertx, stream : ReadStream<T>, capacity : Int = 256) : ReceiveChannel<T> {
  return toChannel(vertx.getOrCreateContext(), stream, capacity)
}

fun <T> toChannel(context : Context, stream : ReadStream<T>, capacity : Int = 256) : ReceiveChannel<T> {
  val ret = ChannelReadStream(context, stream, capacity)
  ret.subscribe()
  return ret
}

private class ChannelReadStream<T>(val context: Context,
                                   val stream : ReadStream<T>,
                                   capacity : Int) : ArrayChannel<T>(capacity) {

  @Volatile
  private var size = 0;

  fun subscribe() {
    stream.endHandler { _ ->
      close()
    }
    stream.exceptionHandler { err ->
      close(err)
    }
    stream.handler { event ->
      context.runCoroutine {
        send(event)
      }
    }
  }

  override fun offerInternal(element: T): Any {
    val ret = super.offerInternal(element)
    if (ret == OFFER_SUCCESS) {
      size++;
      if (isFull) {
        stream.pause();
      }
    }
    return ret
  }

  override fun pollInternal(): Any? {
    val ret = super.pollInternal()
    if (ret != POLL_FAILED && !(ret is Closed<*>)) {
      if (--size < capacity / 2) {
        stream.resume()
      }
    }
    return ret
  }
}

fun <T> toChannel(vertx : Vertx, stream : WriteStream<T>, capacity : Int = 256) : SendChannel<T> {
  return toChannel(vertx.getOrCreateContext(), stream, capacity)
}

fun <T> toChannel(context : Context, stream : WriteStream<T>, capacity : Int = 256) : SendChannel<T> {
  val ret = ChannelWriteStream(context, stream, capacity)
  ret.subscribe()
  return ret
}

private class ChannelWriteStream<T>(val context: Context,
                                   val stream : WriteStream<T>,
                                   capacity : Int) : ArrayChannel<T>(capacity) {

  fun subscribe() {
    context.runCoroutine {
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
            break;
          }
        }
      }
    }
  }

  fun dispatch(elt : T?) : Boolean {
    if (elt != null) {
      stream.write(elt)
      return true
    } else {
      stream.end()
      return false
    }
  }
}

/**
 * Convert a standard handler to a handler which runs on a coroutine.
 * This is necessary if you want to do fiber blocking synchronous operation in your handler
 */
fun Context.runCoroutine(block: suspend CoroutineScope.() -> Unit) {
  launch(coroutineContext()) {
    try {
      block()
    } catch (e: CancellationException) {
      //skip this exception for coroutine cancel
    }
  }
}

fun Context.coroutineContext() : CoroutineContext {
  require(!isMultiThreadedWorkerContext, { "Must not be a multithreaded worker verticle." })
  return VertxCoroutineDispatcher(this, Thread.currentThread()).asCoroutineDispatcher()
}

private class VertxScheduledFuture(
    val vertxContext: Context,
    val task : Runnable,
    val delay: Long,
    val unit: TimeUnit,
    val periodic : Boolean) : ScheduledFuture<Any>, Handler<Long> {

  val done = AtomicInteger(0)
  var id : Long? = null

  fun schedule() {
    val owner = vertxContext.owner()
    if (periodic) {
      id = owner.setTimer(unit.toMillis(delay), this)
    } else {
      id = owner.setPeriodic(unit.toMillis(delay), this)
    }
  }

  override fun get(): Any? {
    return null
  }

  override fun get(timeout: Long, unit: TimeUnit?): Any? {
    return null
  }

  override fun isCancelled(): Boolean {
    return done.get() == 1
  }

  override fun handle(event: Long?) {
    if (done.compareAndSet(0, 2)) {
      task.run()
    }
  }

  override fun cancel(mayInterruptIfRunning: Boolean): Boolean {
    if (done.compareAndSet(0, 1)) {
      return vertxContext.owner().cancelTimer(id!!)
    } else {
      return false;
    }
  }

  override fun isDone(): Boolean {
    return done.get() == 2
  }

  override fun getDelay(unit: TimeUnit?): Long {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun compareTo(other: Delayed?): Int {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}

private class VertxCoroutineDispatcher(val vertxContext: Context, val eventLoop: Thread) : AbstractExecutorService(), ScheduledExecutorService {

  override fun execute(command: Runnable) {
    if (Thread.currentThread() !== eventLoop) {
      vertxContext.runOnContext { command.run() }
    } else {
      command.run()
    }
  }

  override fun schedule(command: Runnable, delay: Long, unit: TimeUnit): ScheduledFuture<*> {
    val t = VertxScheduledFuture(vertxContext, command, delay, unit, false)
    t.schedule()
    return t
  }

  override fun scheduleAtFixedRate(command: Runnable, initialDelay: Long, period: Long, unit: TimeUnit?): ScheduledFuture<*> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun <V : Any?> schedule(callable: Callable<V>?, delay: Long, unit: TimeUnit?): ScheduledFuture<V> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun scheduleWithFixedDelay(command: Runnable?, initialDelay: Long, delay: Long, unit: TimeUnit?): ScheduledFuture<*> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun isTerminated(): Boolean {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun shutdown() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun shutdownNow(): MutableList<Runnable> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun isShutdown(): Boolean {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }

  override fun awaitTermination(timeout: Long, unit: TimeUnit?): Boolean {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}
