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
 * <p>
 * The blocking code should block for a reasonable amount of time (i.e no more than a few seconds). Long blocking operations
 * or polling operations (i.e a thread that spin in a loop polling events in a blocking fashion) are precluded.
 * <p>
 * When the blocking operation lasts more than the 10 seconds, a message will be printed on the console by the
 * blocked thread checker.
 * <p>
 * Long blocking operations should use a dedicated thread managed by the application, which can interact with
 * verticles using the event-bus or [io.vertx.core.Context]
 *
 * @param blockingCodeHandler handler representing the blocking code to run
 * @param ordered if true then if executeBlocking is called several times on the same context, the executions for that context will be executed serially, not in parallel. if false then they will be no ordering guarantees
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.Context original] using Vert.x codegen.
 */
suspend fun <T> Context.executeBlockingAwait(blockingCodeHandler : (Future<T>) -> Unit, ordered : Boolean) : T? {
  return awaitResult{
    this.executeBlocking(blockingCodeHandler, ordered, it::handle)
  }
}

/**
 * Invoke [io.vertx.core.Context] with order = true.
 *
 * @param blockingCodeHandler handler representing the blocking code to run
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.Context original] using Vert.x codegen.
 */
suspend fun <T> Context.executeBlockingAwait(blockingCodeHandler : (Future<T>) -> Unit) : T? {
  return awaitResult{
    this.executeBlocking(blockingCodeHandler, it::handle)
  }
}

