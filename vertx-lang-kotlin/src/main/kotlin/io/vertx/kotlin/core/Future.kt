package io.vertx.kotlin.core

import io.vertx.core.Future
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.Future.setHandler]
 *
 * @return [T]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.Future] using Vert.x codegen.
 */
suspend fun <T> Future<T>.setHandlerAwait(): T {
  return awaitResult {
    this.setHandler(it)
  }
}

