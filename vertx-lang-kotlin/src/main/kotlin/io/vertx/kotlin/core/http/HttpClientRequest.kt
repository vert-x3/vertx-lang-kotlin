package io.vertx.kotlin.core.http

import io.vertx.core.http.HttpClientRequest
import io.vertx.core.http.HttpClientResponse
import io.vertx.core.http.HttpConnection
import io.vertx.core.http.HttpVersion
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun HttpClientRequest.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun HttpClientRequest.drainHandlerAwait() : Unit {
    return awaitEvent{
        this.drainHandler({ v -> it.handle(null) })}
}

suspend fun HttpClientRequest.handlerAwait() : HttpClientResponse {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun HttpClientRequest.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

suspend fun HttpClientRequest.continueHandlerAwait() : Unit {
    return awaitEvent{
        this.continueHandler({ v -> it.handle(null) })}
}

suspend fun HttpClientRequest.sendHeadAwait() : HttpVersion {
    return awaitEvent{
        this.sendHead(it)
    }
}

suspend fun HttpClientRequest.pushHandlerAwait() : HttpClientRequest {
    return awaitEvent{
        this.pushHandler(it)
    }
}

suspend fun HttpClientRequest.connectionHandlerAwait() : HttpConnection {
    return awaitEvent{
        this.connectionHandler(it)
    }
}

