package io.vertx.kotlin.ext.sql

import io.vertx.core.json.JsonArray
import io.vertx.ext.sql.SQLRowStream
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun SQLRowStream.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun SQLRowStream.handlerAwait() : JsonArray {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun SQLRowStream.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

suspend fun SQLRowStream.resultSetClosedHandlerAwait() : Unit {
    return awaitEvent{
        this.resultSetClosedHandler({ v -> it.handle(null) })}
}

suspend fun SQLRowStream.closeAwait() : Unit {
    return awaitResult{
        this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

