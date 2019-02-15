package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.Completion
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.unit.Completion.handler]
 *
 * @return [T?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.unit.Completion] using Vert.x codegen.
 */
suspend fun <T> Completion<T>.handlerAwait(): T? {
  return awaitResult {
    this.handler(it)
  }
}

