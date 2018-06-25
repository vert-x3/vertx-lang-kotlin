package io.vertx.kotlin.core.parsetools

import io.vertx.core.parsetools.JsonEvent
import io.vertx.core.parsetools.JsonParser
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun JsonParser.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

suspend fun JsonParser.handlerAwait() : JsonEvent {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun JsonParser.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

