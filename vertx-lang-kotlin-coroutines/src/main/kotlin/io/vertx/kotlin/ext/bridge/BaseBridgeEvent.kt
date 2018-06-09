package io.vertx.kotlin.ext.bridge

import io.vertx.ext.bridge.BaseBridgeEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun BaseBridgeEvent.setHandlerAwait() : Boolean {
    return awaitResult{
        this.setHandler(it)
    }
}

