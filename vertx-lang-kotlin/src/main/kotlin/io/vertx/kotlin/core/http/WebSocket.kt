package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.WebSocket
import io.vertx.core.http.WebSocketFrame
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun WebSocket.textMessageHandlerAwait() : String {
    return awaitEvent{
        this.textMessageHandler(it)
    }
}

suspend fun WebSocket.binaryMessageHandlerAwait() : Buffer {
    return awaitEvent{
        this.binaryMessageHandler(it)
    }
}

suspend fun WebSocket.pongHandlerAwait() : Buffer {
    return awaitEvent{
        this.pongHandler(it)
    }
}

suspend fun WebSocket.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun WebSocket.handlerAwait() : Buffer {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun WebSocket.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

suspend fun WebSocket.drainHandlerAwait() : Unit {
    return awaitEvent{
        this.drainHandler({ v -> it.handle(null) })}
}

suspend fun WebSocket.closeHandlerAwait() : Unit {
    return awaitEvent{
        this.closeHandler({ v -> it.handle(null) })}
}

suspend fun WebSocket.frameHandlerAwait() : WebSocketFrame {
    return awaitEvent{
        this.frameHandler(it)
    }
}

