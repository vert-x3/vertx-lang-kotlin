package io.vertx.ext.kotlin.eventbus.bridge.tcp

import io.vertx.ext.eventbus.bridge.tcp.BridgeEvent
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Set a handler for the result.
 * <p>
 * If the future has already been completed it will be called immediately. Otherwise it will be called when the
 * future is completed.
 *
 * @returna reference to this, so it can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.eventbus.bridge.tcp.BridgeEvent original] using Vert.x codegen.
 */
suspend fun BridgeEvent.setHandlerAwait() : Boolean {
  return awaitResult{
    this.setHandler(it)
  }
}

