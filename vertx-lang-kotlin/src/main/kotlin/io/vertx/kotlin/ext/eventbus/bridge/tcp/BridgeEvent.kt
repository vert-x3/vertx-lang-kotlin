package io.vertx.kotlin.ext.eventbus.bridge.tcp

import io.vertx.ext.eventbus.bridge.tcp.BridgeEvent
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.eventbus.bridge.tcp.BridgeEvent.setHandler]
 *
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.eventbus.bridge.tcp.BridgeEvent] using Vert.x codegen.
 */
suspend fun BridgeEvent.setHandlerAwait(): Boolean {
  return awaitResult {
    this.setHandler(it)
  }
}

