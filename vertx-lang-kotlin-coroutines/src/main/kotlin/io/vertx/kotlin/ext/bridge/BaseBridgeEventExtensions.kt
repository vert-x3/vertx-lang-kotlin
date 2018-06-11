package io.vertx.kotlin.ext.bridge

import io.vertx.ext.bridge.BaseBridgeEvent
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Boolean

suspend fun BaseBridgeEvent.setHandler(): Boolean {
  return awaitResult { this.setHandler(it) }
}
