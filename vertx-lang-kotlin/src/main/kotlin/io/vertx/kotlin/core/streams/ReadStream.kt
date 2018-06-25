package io.vertx.kotlin.core.streams

import io.vertx.core.streams.ReadStream
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun <T> ReadStream<T>.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun <T> ReadStream<T>.handlerAwait() : T {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun <T> ReadStream<T>.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

