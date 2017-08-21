package io.vertx.kotlin.coroutines

import io.vertx.core.*
import io.vertx.core.streams.ReadStream
import io.vertx.core.streams.WriteStream
import kotlinx.coroutines.experimental.*
import kotlinx.coroutines.experimental.channels.*
import java.util.concurrent.TimeUnit
import kotlin.coroutines.experimental.Continuation
import kotlin.coroutines.experimental.CoroutineContext
import kotlin.coroutines.experimental.suspendCoroutine
import java.util.concurrent.TimeoutException

/**
 * Created by stream.
 */

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
 * Receive a single event from a handler synchronously  by specific timeout.
 * The coroutine will be blocked until the event occurs or timeout, this action do not block vertx's eventLoop.
 * @param timeout
 * @return object or null if timeout
 */
suspend fun <T> asyncEvent(timeout: Long, unit: TimeUnit = TimeUnit.MILLISECONDS, block: (h: Handler<T>) -> Unit) : T {
  return asyncResult(timeout, unit) { f ->
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
  return suspendCoroutine { cont: Continuation<T> ->
    block(Handler { asyncResult ->
      if (asyncResult.succeeded()) cont.resume(asyncResult.result())
      else cont.resumeWithException(asyncResult.cause())
    })
  }
}

/**
 * Invoke an asynchronous operation and obtain the result synchronous by specific timeout.
 * The coroutine will be blocked until the event occurs or timeout, this action do not block vertx's eventLoop.
 * @param timeout
 * @return object or null if timeout
 */
suspend fun <T> asyncResult(timeout: Long, unit: TimeUnit = TimeUnit.MILLISECONDS, block: (h: Handler<AsyncResult<T>>) -> Unit) : T {
  return suspendCancellableCoroutine { cont: CancellableContinuation<T> ->
    val context = cont.context
    val ctx : VertxCoroutineDispatcher = context[VertxCoroutineDispatcher] as VertxCoroutineDispatcher
    val vertx = ctx.vertxContext.owner();
    block(Handler { asyncResult ->
      if (asyncResult.succeeded()) cont.resume(asyncResult.result())
      else cont.resumeWithException(asyncResult.cause())
    })
    val id = vertx.setTimer(unit.toMillis(timeout)) {
      cont.cancel(TimeoutException())
    }
    cont.invokeOnCompletion {
      vertx.cancelTimer(id)
    }
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
 * Create an adaptor that converts a stream of events from a handler into a receiver which allows the events to be
 * received synchronously.
 */
fun <T> streamAdaptor() = HandlerReceiverAdaptorImpl<T>(vertxCoroutineContext())

/**
 * Like {@link #streamAdaptor()} but using the specified `Channel` instance. This is useful if you want to
 * fine-tune the behaviour of the adaptor.
 */
fun <T> streamAdaptor(channel: Channel<T>) = HandlerReceiverAdaptorImpl(vertxCoroutineContext(), channel)


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

/**
 * Convert a standard handler to a handler which runs on a coroutine.
 * This is necessary if you want to do fiber blocking synchronous operation in your handler
 */
fun runVertxCoroutine(block: suspend CoroutineScope.() -> Unit) {
  launch(vertxCoroutineContext()) {
    try {
      block()
    } catch (e: CancellationException) {
      //skip this exception for coroutine cancel
    }
  }
}

fun <T> toChannel(stream : ReadStream<T>, capacity : Int = 256) : ReceiveChannel<T> {
  val ret = ChannelReadStream(vertxCoroutineContext(), stream, capacity)
  ret.subscribe()
  return ret
}

private class ChannelReadStream<T>(val coroutineContext: CoroutineContext,
                                   val stream : ReadStream<T>,
                                   capacity : Int) : ArrayChannel<T>(capacity) {

  @Volatile
  private var size = 0;

  fun subscribe() {
    stream.endHandler { v ->
      close()
    }
    stream.exceptionHandler { err ->
      close(err)
    }
    stream.handler { event ->
      launch(coroutineContext) {
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

fun <T> toChannel(stream : WriteStream<T>, capacity : Int = 256) : SendChannel<T> {
  val ret = ChannelWriteStream(vertxCoroutineContext(), stream, capacity)
  ret.subscribe()
  return ret
}

private class ChannelWriteStream<T>(val coroutineContext: CoroutineContext,
                                   val stream : WriteStream<T>,
                                   capacity : Int) : ArrayChannel<T>(capacity) {

  fun subscribe() {
    launch(coroutineContext) {
      while (true) {
        val elt = receiveOrNull()
        if (stream.writeQueueFull()) {
          stream.drainHandler { v ->
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

interface ReceiverAdaptor<out T> {
  /**
   * Receive a object from channel.
   */
  suspend fun receive(): T

  /**
   * Receive a object from channel with specific timeout.
   * @param timeout
   * @return object or null if timeout
   */
  suspend fun receive(timeout: Long, unit: TimeUnit = TimeUnit.MILLISECONDS): T?
}

class HandlerReceiverAdaptorImpl<T>(val coroutineContext: CoroutineContext, val channel: Channel<T> = Channel()) : Handler<T>, ReceiverAdaptor<T> {

  override fun handle(event: T) {
    launch(coroutineContext) { channel.send(event) }
  }

  override suspend fun receive(): T = channel.receive()

  override suspend fun receive(timeout: Long, unit: TimeUnit): T? {
    val future: Future<T?> = Future.future()
    withTimeout(timeout, unit) {
      try {
        future.complete(channel.receive())
      } catch (e: CancellationException) {
        future.complete(null)
      } catch (t: Throwable) {
        future.fail(VertxException(t))
      }
    }
    return future.await()
  }
}

private const val VERTX_COROUTINE_DISPATCHER = "__vertx-kotlin-coroutine:dispatcher"
private var vertx: Vertx? = null

//you can init vertx instance if you running Vert.x by embed style.
fun attachVertxToCoroutine(v: Vertx) {
  vertx = v
}

/**
 * Get Kotlin CoroutineContext, this coroutine should be one instance for per context.
 * @return CoroutineContext
 */
fun vertxCoroutineContext(): CoroutineContext {
  val vertxContext = vertx?.orCreateContext ?: Vertx.currentContext()
  requireNotNull(vertxContext, { "Do not in the vertx context" })
  require(vertxContext.isEventLoopContext, { "Not on the vertx eventLoop." })
  var dispatcher = vertxContext.get<VertxCoroutineDispatcher>(VERTX_COROUTINE_DISPATCHER)
  if (dispatcher == null) {
    dispatcher = VertxCoroutineDispatcher(vertxContext, Thread.currentThread())
    vertxContext.put(VERTX_COROUTINE_DISPATCHER, dispatcher)
  }
  return dispatcher
}

class VertxCoroutineDispatcher(val vertxContext: Context, val eventLoop: Thread) : CoroutineDispatcher() {

  companion object Key : CoroutineContext.Key<VertxCoroutineDispatcher>

  override val key: CoroutineContext.Key<*>
    get() = Key

  override fun dispatch(context: CoroutineContext, block: Runnable) {
    if (Thread.currentThread() !== eventLoop) vertxContext.runOnContext { _ -> block.run() }
    else block.run()
  }
}

/**
 * Remove the scheduler for the current context
 */
fun removeVertxCoroutineContext() {
  val vertxContext = vertx?.orCreateContext ?: Vertx.currentContext()
  vertxContext?.remove(VERTX_COROUTINE_DISPATCHER)
}
