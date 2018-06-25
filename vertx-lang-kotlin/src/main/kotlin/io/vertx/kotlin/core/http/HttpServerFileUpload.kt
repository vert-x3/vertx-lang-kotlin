package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.HttpServerFileUpload
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun HttpServerFileUpload.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun HttpServerFileUpload.handlerAwait() : Buffer {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun HttpServerFileUpload.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

