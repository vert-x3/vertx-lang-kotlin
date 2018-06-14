package io.vertx.kotlin.ext.bridge

import io.vertx.ext.bridge.BaseBridgeEvent
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Boolean

/**
 *  Set a handler for the result.
 *  <p>
 *  If the future has already been completed it will be called immediately. Otherwise it will be called when the
 *  future is completed.
 * @return a reference to this, so it can be used fluently
 *
 */
suspend fun BaseBridgeEvent.setHandler(): Boolean {
  return awaitResult { this.setHandler(it) }
}
