package io.vertx.kotlin.core.http

import io.vertx.core.MultiMap
import io.vertx.core.http.HttpMethod
import io.vertx.core.http.HttpServerResponse
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import java.lang.Void

suspend fun HttpServerResponse.exceptionHandlerAwait() : Throwable? {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun HttpServerResponse.drainHandlerAwait() : Void? {
    return awaitEvent{
        this.drainHandler(it)
    }
}

suspend fun HttpServerResponse.closeHandlerAwait() : Void? {
    return awaitEvent{
        this.closeHandler(it)
    }
}

suspend fun HttpServerResponse.endHandlerAwait() : Void? {
    return awaitEvent{
        this.endHandler(it)
    }
}

suspend fun HttpServerResponse.sendFileAwait(filename : String) : Void? {
    return awaitResult{
        this.sendFile(filename, it)
    }
}

suspend fun HttpServerResponse.sendFileAwait(filename : String, offset : Long) : Void? {
    return awaitResult{
        this.sendFile(filename, offset, it)
    }
}

suspend fun HttpServerResponse.sendFileAwait(filename : String, offset : Long, length : Long) : Void? {
    return awaitResult{
        this.sendFile(filename, offset, length, it)
    }
}

suspend fun HttpServerResponse.headersEndHandlerAwait() : Void? {
    return awaitEvent{
        this.headersEndHandler(it)
    }
}

suspend fun HttpServerResponse.bodyEndHandlerAwait() : Void? {
    return awaitEvent{
        this.bodyEndHandler(it)
    }
}

suspend fun HttpServerResponse.pushAwait(method : HttpMethod, path : String) : HttpServerResponse? {
    return awaitResult{
        this.push(method, path, it)
    }
}

suspend fun HttpServerResponse.pushAwait(method : HttpMethod, host : String, path : String, headers : MultiMap) : HttpServerResponse? {
    return awaitResult{
        this.push(method, host, path, headers, it)
    }
}

