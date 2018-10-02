package io.vertx.kotlin.core

import io.vertx.core.Future
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Set a handler for the result.
 * <p>
 * If the future has already been completed it will be called immediately. Otherwise it will be called when the
 * future is completed.
 *
 * @param handler the Handler that will be called with the result
 * @returna reference to this, so it can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.Future original] using Vert.x codegen.
 */
suspend fun <T> Future<T>.setHandlerAwait() : T {
  return awaitResult{
    this.setHandler(it)
  }
}

