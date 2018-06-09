package io.vertx.kotlin.ext.web.handler.sockjs

import io.vertx.core.buffer.Buffer
import io.vertx.ext.web.handler.sockjs.SockJSSocket
import io.vertx.kotlin.coroutines.awaitEvent
import java.lang.Void

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

suspend fun SockJSSocket.endHandlerAwait() : Void {
    return awaitEvent{
        this.endHandler(it)
    }
}

suspend fun SockJSSocket.drainHandlerAwait() : Void {
    return awaitEvent{
        this.drainHandler(it)
    }
}

