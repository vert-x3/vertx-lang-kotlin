package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.ServerWebSocket
import io.vertx.core.http.WebSocketFrame
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun ServerWebSocket.textMessageHandlerAwait() : String {
    return awaitEvent{
        this.textMessageHandler(it)
    }
}

suspend fun ServerWebSocket.binaryMessageHandlerAwait() : Buffer {
    return awaitEvent{
        this.binaryMessageHandler(it)
    }
}

suspend fun ServerWebSocket.pongHandlerAwait() : Buffer {
    return awaitEvent{
        this.pongHandler(it)
    }
}

suspend fun ServerWebSocket.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun ServerWebSocket.handlerAwait() : Buffer {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun ServerWebSocket.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

suspend fun ServerWebSocket.drainHandlerAwait() : Unit {
    return awaitEvent{
        this.drainHandler({ v -> it.handle(null) })}
}

suspend fun ServerWebSocket.closeHandlerAwait() : Unit {
    return awaitEvent{
        this.closeHandler({ v -> it.handle(null) })}
}

suspend fun ServerWebSocket.frameHandlerAwait() : WebSocketFrame {
    return awaitEvent{
        this.frameHandler(it)
    }
}

