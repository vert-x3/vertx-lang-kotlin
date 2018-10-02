package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.Completion
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Completion handler to receive a completion signal when this completions completes.
 *
 * @param completionHandler the completion handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.unit.Completion original] using Vert.x codegen.
 */
suspend fun <T> Completion<T>.handlerAwait() : T? {
  return awaitResult{
    this.handler(it)
  }
}

