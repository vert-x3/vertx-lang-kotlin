package io.vertx.kotlin.ext.web.handler.sockjs

import io.vertx.ext.web.handler.sockjs.BridgeEvent
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
suspend fun BridgeEvent.setHandler(): Boolean {
  return awaitResult { this.setHandler(it) }
}
