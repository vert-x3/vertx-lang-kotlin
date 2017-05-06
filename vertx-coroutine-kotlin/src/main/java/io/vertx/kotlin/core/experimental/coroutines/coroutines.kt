package io.vertx.kotlin.core.experimental.coroutines

import io.vertx.core.AsyncResult
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.core.Vertx
import kotlinx.coroutines.experimental.*
import kotlin.coroutines.experimental.Continuation
import kotlin.coroutines.experimental.CoroutineContext
import kotlin.coroutines.experimental.suspendCoroutine

/**
 * Execute callback and await asynchronous execution.
 */
suspend fun <T> vxAwait(callback: (Handler<T>) -> Unit): T =
        suspendCoroutine { cont: Continuation<T> ->
            try {
                callback(Handler { cont.resume(it) })
            } catch(exception: Throwable) {
                cont.resumeWithException(exception)
            }
        }

/**
 * Create a coroutine and put result in [Future]
 */
fun <T> vxFuture(context: CoroutineContext,
                 block: suspend CoroutineScope.() -> T): Future<T> {
    val future: Future<T> = Future.future()
    launch(context) {
        try {
            future.complete(block())
        } catch(throwable: Throwable) {
            future.fail(throwable)
        }
    }
    return future
}

/**
 * Execute callback and await for async result.
 */
suspend fun <T> vxResult(callback: (Handler<AsyncResult<T>>) -> Unit): T =
        vxAwait(callback).run {
            cause()?.let { throw it }
            result()
        }

/**
 * Convert [Deferred] to [Future].
 *
 * Future succeded when Deferred completes.
 */
fun <T> Deferred<T>.asVxFuture(): Future<T> =
        when {
            isCompletedExceptionally -> Future.failedFuture<T>(getCompletionException())
            isCompleted -> Future.succeededFuture(getCompleted())
            else -> vxFuture(Unconfined) { await() }
        }

/**
 * Register an `handler` for the Future and await termination.
 *
 * If future is completed then no suspension happens.
 */
suspend fun <T> Future<T>.await(): T =
        when {
            succeeded() -> result()
            failed() -> throw cause()
            else -> vxResult { setHandler(it) }
        }

/**
 * Create a coroutine dispatcher for a [Vertx] context.
 */
fun Vertx.asDispatcher(): CoroutineDispatcher = VertxDispatcher(this)
