package io.vertx.kotlin.core.http

import io.vertx.core.MultiMap
import io.vertx.core.http.HttpMethod
import io.vertx.core.http.HttpServerResponse
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun HttpServerResponse.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun HttpServerResponse.drainHandlerAwait() : Unit {
    return awaitEvent{
        this.drainHandler({ v -> it.handle(null) })}
}

suspend fun HttpServerResponse.closeHandlerAwait() : Unit {
    return awaitEvent{
        this.closeHandler({ v -> it.handle(null) })}
}

suspend fun HttpServerResponse.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

suspend fun HttpServerResponse.sendFileAwait(filename : String) : Unit {
    return awaitResult{
        this.sendFile(filename, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun HttpServerResponse.sendFileAwait(filename : String, offset : Long) : Unit {
    return awaitResult{
        this.sendFile(filename, offset, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun HttpServerResponse.sendFileAwait(filename : String, offset : Long, length : Long) : Unit {
    return awaitResult{
        this.sendFile(filename, offset, length, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun HttpServerResponse.headersEndHandlerAwait() : Unit {
    return awaitEvent{
        this.headersEndHandler({ v -> it.handle(null) })}
}

suspend fun HttpServerResponse.bodyEndHandlerAwait() : Unit {
    return awaitEvent{
        this.bodyEndHandler({ v -> it.handle(null) })}
}

suspend fun HttpServerResponse.pushAwait(method : HttpMethod, path : String) : HttpServerResponse {
    return awaitResult{
        this.push(method, path, it)
    }
}

suspend fun HttpServerResponse.pushAwait(method : HttpMethod, host : String, path : String, headers : MultiMap) : HttpServerResponse {
    return awaitResult{
        this.push(method, host, path, headers, it)
    }
}

