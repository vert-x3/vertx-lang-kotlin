package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.HttpClientResponse
import io.vertx.core.http.HttpFrame
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun HttpClientResponse.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun HttpClientResponse.handlerAwait() : Buffer {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun HttpClientResponse.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

suspend fun HttpClientResponse.bodyHandlerAwait() : Buffer {
    return awaitEvent{
        this.bodyHandler(it)
    }
}

suspend fun HttpClientResponse.customFrameHandlerAwait() : HttpFrame {
    return awaitEvent{
        this.customFrameHandler(it)
    }
}

