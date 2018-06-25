package io.vertx.kotlin.ext.web.handler.sockjs

import io.vertx.ext.web.handler.sockjs.BridgeEvent
import io.vertx.ext.web.handler.sockjs.BridgeOptions
import io.vertx.ext.web.handler.sockjs.SockJSHandler
import io.vertx.ext.web.handler.sockjs.SockJSSocket
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun SockJSHandler.socketHandlerAwait() : SockJSSocket {
    return awaitEvent{
        this.socketHandler(it)
    }
}

suspend fun SockJSHandler.bridgeAwait(bridgeOptions : BridgeOptions) : BridgeEvent {
    return awaitEvent{
        this.bridge(bridgeOptions, it)
    }
}

