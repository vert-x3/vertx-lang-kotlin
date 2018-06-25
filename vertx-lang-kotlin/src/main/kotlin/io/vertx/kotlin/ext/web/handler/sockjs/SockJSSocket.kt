package io.vertx.kotlin.ext.web.handler.sockjs

import io.vertx.core.buffer.Buffer
import io.vertx.ext.web.handler.sockjs.SockJSSocket
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun SockJSSocket.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun SockJSSocket.handlerAwait() : Buffer {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun SockJSSocket.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

suspend fun SockJSSocket.drainHandlerAwait() : Unit {
    return awaitEvent{
        this.drainHandler({ v -> it.handle(null) })}
}

