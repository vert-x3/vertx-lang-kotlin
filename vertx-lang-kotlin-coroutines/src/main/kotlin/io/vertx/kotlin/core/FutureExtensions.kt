package io.vertx.kotlin.core

import io.vertx.core.Future
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any

/**
 *  Set a handler for the result.
 *  <p>
 *  If the future has already been completed it will be called immediately. Otherwise it will be called when the
 *  future is completed.
 * @return a reference to this, so it can be used fluently
 *
 */
suspend fun <T : Any> Future<T>.setHandler(): T {
  return awaitResult { this.setHandler(it) }
}
