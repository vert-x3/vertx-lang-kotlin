package io.vertx.kotlin.core

import io.vertx.core.Context
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Safely execute some blocking code.
 * <p>
 * Executes the blocking code in the handler <code>blockingCodeHandler</code> using a thread from the worker pool.
 * <p>
 * When the code is complete the handler <code>resultHandler</code> will be called with the result on the original context
 * (e.g. on the original event loop of the caller).
 * <p>
 * A <code>Future</code> instance is passed into <code>blockingCodeHandler</code>. When the blocking code successfully completes,
 * the handler should call the [io.vertx.core.Future] or [io.vertx.core.Future] method, or the [io.vertx.core.Future]
 * method if it failed.
 *
 * @param blockingCodeHandler handler representing the blocking code to run
 * @param ordered if true then if executeBlocking is called several times on the same context, the executions for that context will be executed serially, not in parallel. if false then they will be no ordering guarantees
 * @param resultHandler handler that will be called when the blocking code is complete
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.Context original] using Vert.x codegen.
 */
suspend fun <T> Context.executeBlockingAwait(blockingCodeHandler : Handler<Future<T>>, ordered : Boolean) : T? {
  return awaitResult{
    this.executeBlocking(blockingCodeHandler, ordered, it)
  }
}

/**
 * Invoke [io.vertx.core.Context] with order = true.
 *
 * @param blockingCodeHandler handler representing the blocking code to run
 * @param resultHandler handler that will be called when the blocking code is complete
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.Context original] using Vert.x codegen.
 */
suspend fun <T> Context.executeBlockingAwait(blockingCodeHandler : Handler<Future<T>>) : T? {
  return awaitResult{
    this.executeBlocking(blockingCodeHandler, it)
  }
}

