package io.vertx.kotlin.ext.sql

import io.vertx.core.json.JsonArray
import io.vertx.ext.sql.SQLRowStream
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import java.lang.Void

suspend fun SQLRowStream.exceptionHandlerAwait() : Throwable? {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun SQLRowStream.handlerAwait() : JsonArray? {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun SQLRowStream.endHandlerAwait() : Void? {
    return awaitEvent{
        this.endHandler(it)
    }
}

suspend fun SQLRowStream.resultSetClosedHandlerAwait() : Void? {
    return awaitEvent{
        this.resultSetClosedHandler(it)
    }
}

suspend fun SQLRowStream.closeAwait() : Void? {
    return awaitResult{
        this.close(it)
    }
}

