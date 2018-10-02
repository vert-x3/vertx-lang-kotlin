package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.Async
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Completion handler to receive a completion signal when this completions completes.
 *
 * @param completionHandler the completion handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.unit.Async original] using Vert.x codegen.
 */
suspend fun Async.handlerAwait() : Unit? {
  return awaitResult{
    this.handler({ ar -> it.handle(ar.mapEmpty()) })}
}

