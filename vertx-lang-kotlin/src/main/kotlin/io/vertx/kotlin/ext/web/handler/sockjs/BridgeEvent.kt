package io.vertx.kotlin.ext.web.handler.sockjs

import io.vertx.ext.web.handler.sockjs.BridgeEvent
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.web.handler.sockjs.BridgeEvent.setHandler]
 *
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.handler.sockjs.BridgeEvent] using Vert.x codegen.
 */
suspend fun BridgeEvent.setHandlerAwait(): Boolean {
  return awaitResult {
    this.setHandler(it)
  }
}

