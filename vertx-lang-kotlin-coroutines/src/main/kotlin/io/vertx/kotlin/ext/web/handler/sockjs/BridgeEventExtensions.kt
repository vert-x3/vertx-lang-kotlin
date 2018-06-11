package io.vertx.kotlin.ext.web.handler.sockjs

import io.vertx.ext.web.handler.sockjs.BridgeEvent
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Boolean

suspend fun BridgeEvent.setHandler(): Boolean {
  return awaitResult { this.setHandler(it) }
}
