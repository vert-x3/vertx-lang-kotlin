package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.WebSocketBase
import io.vertx.core.http.WebSocketFrame
import io.vertx.kotlin.coroutines.awaitEvent
import java.lang.Void

suspend fun WebSocketBase.exceptionHandlerAwait() : Throwable? {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun WebSocketBase.handlerAwait() : Buffer? {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun WebSocketBase.endHandlerAwait() : Void? {
    return awaitEvent{
        this.endHandler(it)
    }
}

suspend fun WebSocketBase.drainHandlerAwait() : Void? {
    return awaitEvent{
        this.drainHandler(it)
    }
}

suspend fun WebSocketBase.closeHandlerAwait() : Void? {
    return awaitEvent{
        this.closeHandler(it)
    }
}

suspend fun WebSocketBase.frameHandlerAwait() : WebSocketFrame? {
    return awaitEvent{
        this.frameHandler(it)
    }
}

suspend fun WebSocketBase.textMessageHandlerAwait() : String? {
    return awaitEvent{
        this.textMessageHandler(it)
    }
}

suspend fun WebSocketBase.binaryMessageHandlerAwait() : Buffer? {
    return awaitEvent{
        this.binaryMessageHandler(it)
    }
}

suspend fun WebSocketBase.pongHandlerAwait() : Buffer? {
    return awaitEvent{
        this.pongHandler(it)
    }
}

