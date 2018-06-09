package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.ServerWebSocket
import io.vertx.core.http.WebSocketFrame
import io.vertx.kotlin.coroutines.awaitEvent
import java.lang.Void

suspend fun ServerWebSocket.textMessageHandlerAwait() : String? {
    return awaitEvent{
        this.textMessageHandler(it)
    }
}

suspend fun ServerWebSocket.binaryMessageHandlerAwait() : Buffer? {
    return awaitEvent{
        this.binaryMessageHandler(it)
    }
}

suspend fun ServerWebSocket.pongHandlerAwait() : Buffer? {
    return awaitEvent{
        this.pongHandler(it)
    }
}

suspend fun ServerWebSocket.exceptionHandlerAwait() : Throwable? {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun ServerWebSocket.handlerAwait() : Buffer? {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun ServerWebSocket.endHandlerAwait() : Void? {
    return awaitEvent{
        this.endHandler(it)
    }
}

suspend fun ServerWebSocket.drainHandlerAwait() : Void? {
    return awaitEvent{
        this.drainHandler(it)
    }
}

suspend fun ServerWebSocket.closeHandlerAwait() : Void? {
    return awaitEvent{
        this.closeHandler(it)
    }
}

suspend fun ServerWebSocket.frameHandlerAwait() : WebSocketFrame? {
    return awaitEvent{
        this.frameHandler(it)
    }
}

