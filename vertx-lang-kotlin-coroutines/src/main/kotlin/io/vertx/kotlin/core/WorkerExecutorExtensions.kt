package io.vertx.kotlin.core

import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.core.WorkerExecutor
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any
import kotlin.Boolean

/**
 *  Safely execute some blocking code.
 *  <p>
 *  Executes the blocking code in the handler `blockingCodeHandler` using a thread from the worker pool.
 *  <p>
 *  When the code is complete the handler `resultHandler` will be called with the result on the original context
 *  (i.e. on the original event loop of the caller).
 *  <p>
 *  A `Future` instance is passed into `blockingCodeHandler`. When the blocking code successfully completes,
 *  the handler should call the [Future.complete] or [Future.complete] method, or the [Future.fail]
 *  method if it failed.
 *  <p>
 *  In the `blockingCodeHandler` the current context remains the original context and therefore any task
 *  scheduled in the `blockingCodeHandler` will be executed on the this context and not on the worker thread.
 * @param blockingCodeHandler  handler representing the blocking code to run
 * @param ordered  if true then if executeBlocking is called several times on the same context, the executions
 *                  for that context will be executed serially, not in parallel. if false then they will be no ordering
 *                  guarantees
 * @param <T> the type of the result
 */
suspend fun <T : Any> WorkerExecutor.executeBlocking(blockingCodeHandler: Handler<Future<T>>, ordered: Boolean): T {
  return awaitResult { this.executeBlocking(blockingCodeHandler, ordered, it) }
}

/**
 *  Like [WorkerExecutor.executeBlocking] called with ordered = true.
 */
suspend fun <T : Any> WorkerExecutor.executeBlocking(blockingCodeHandler: Handler<Future<T>>): T {
  return awaitResult { this.executeBlocking(blockingCodeHandler, it) }
}
