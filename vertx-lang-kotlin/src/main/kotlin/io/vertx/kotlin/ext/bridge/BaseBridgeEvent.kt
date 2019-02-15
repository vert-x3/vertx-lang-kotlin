package io.vertx.kotlin.ext.bridge

import io.vertx.ext.bridge.BaseBridgeEvent
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.bridge.BaseBridgeEvent.setHandler]
 *
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.bridge.BaseBridgeEvent] using Vert.x codegen.
 */
suspend fun BaseBridgeEvent.setHandlerAwait(): Boolean {
  return awaitResult {
    this.setHandler(it)
  }
}

