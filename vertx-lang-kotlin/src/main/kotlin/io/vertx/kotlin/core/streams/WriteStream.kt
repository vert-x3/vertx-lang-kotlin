package io.vertx.kotlin.core.streams

import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun <T> WriteStream<T>.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun <T> WriteStream<T>.drainHandlerAwait() : Unit {
    return awaitEvent{
        this.drainHandler({ v -> it.handle(null) })}
}

