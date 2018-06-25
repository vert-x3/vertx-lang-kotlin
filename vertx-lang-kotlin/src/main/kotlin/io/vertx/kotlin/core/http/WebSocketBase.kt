package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.WebSocketBase
import io.vertx.core.http.WebSocketFrame
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun WebSocketBase.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun WebSocketBase.handlerAwait() : Buffer {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun WebSocketBase.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

suspend fun WebSocketBase.drainHandlerAwait() : Unit {
    return awaitEvent{
        this.drainHandler({ v -> it.handle(null) })}
}

suspend fun WebSocketBase.closeHandlerAwait() : Unit {
    return awaitEvent{
        this.closeHandler({ v -> it.handle(null) })}
}

suspend fun WebSocketBase.frameHandlerAwait() : WebSocketFrame {
    return awaitEvent{
        this.frameHandler(it)
    }
}

suspend fun WebSocketBase.textMessageHandlerAwait() : String {
    return awaitEvent{
        this.textMessageHandler(it)
    }
}

suspend fun WebSocketBase.binaryMessageHandlerAwait() : Buffer {
    return awaitEvent{
        this.binaryMessageHandler(it)
    }
}

suspend fun WebSocketBase.pongHandlerAwait() : Buffer {
    return awaitEvent{
        this.pongHandler(it)
    }
}

