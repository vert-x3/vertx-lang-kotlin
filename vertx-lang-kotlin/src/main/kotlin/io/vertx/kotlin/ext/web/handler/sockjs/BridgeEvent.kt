package io.vertx.kotlin.ext.web.handler.sockjs

import io.vertx.ext.web.handler.sockjs.BridgeEvent
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
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.sockjs.BridgeEvent original] using Vert.x codegen.
 */
suspend fun BridgeEvent.setHandlerAwait() : Boolean {
  return awaitResult{
    this.setHandler(it)
  }
}

