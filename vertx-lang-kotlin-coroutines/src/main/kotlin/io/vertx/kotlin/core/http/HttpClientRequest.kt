package io.vertx.kotlin.core.http

import io.vertx.core.http.HttpClientRequest
import io.vertx.core.http.HttpClientResponse
import io.vertx.core.http.HttpConnection
import io.vertx.core.http.HttpVersion
import io.vertx.kotlin.coroutines.awaitEvent
import java.lang.Void

suspend fun HttpClientRequest.exceptionHandlerAwait() : Throwable? {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun HttpClientRequest.drainHandlerAwait() : Void? {
    return awaitEvent{
        this.drainHandler(it)
    }
}

suspend fun HttpClientRequest.handlerAwait() : HttpClientResponse? {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun HttpClientRequest.endHandlerAwait() : Void? {
    return awaitEvent{
        this.endHandler(it)
    }
}

suspend fun HttpClientRequest.continueHandlerAwait() : Void? {
    return awaitEvent{
        this.continueHandler(it)
    }
}

suspend fun HttpClientRequest.sendHeadAwait() : HttpVersion? {
    return awaitEvent{
        this.sendHead(it)
    }
}

suspend fun HttpClientRequest.pushHandlerAwait() : HttpClientRequest? {
    return awaitEvent{
        this.pushHandler(it)
    }
}

suspend fun HttpClientRequest.connectionHandlerAwait() : HttpConnection? {
    return awaitEvent{
        this.connectionHandler(it)
    }
}

