package io.vertx.kotlin.ext.web.handler.sockjs

import io.vertx.ext.web.handler.sockjs.BridgeEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun BridgeEvent.setHandlerAwait() : Boolean {
    return awaitResult{
        this.setHandler(it)
    }
}

