package io.vertx.kotlin.core

import io.vertx.core.Future
import io.vertx.core.WorkerExecutor
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.WorkerExecutor.executeBlocking]
 *
 * @param blockingCodeHandler handler representing the blocking code to run
 * @param ordered if true then if executeBlocking is called several times on the same context, the executions for that context will be executed serially, not in parallel. if false then they will be no ordering guarantees
 * @return [T?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.WorkerExecutor] using Vert.x codegen.
 */
suspend fun <T> WorkerExecutor.executeBlockingAwait(blockingCodeHandler: (Future<T>) -> Unit, ordered: Boolean): T? {
  return awaitResult {
    this.executeBlocking(blockingCodeHandler, ordered, it::handle)
  }
}

/**
 * Suspending version of method [io.vertx.core.WorkerExecutor.executeBlocking]
 *
 * @param blockingCodeHandler 
 * @return [T?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.WorkerExecutor] using Vert.x codegen.
 */
suspend fun <T> WorkerExecutor.executeBlockingAwait(blockingCodeHandler: (Future<T>) -> Unit): T? {
  return awaitResult {
    this.executeBlocking(blockingCodeHandler, it::handle)
  }
}

