package io.vertx.kotlin.core.streams

import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitEvent
import java.lang.Void

suspend fun <T> WriteStream<T>.exceptionHandlerAwait() : Throwable? {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun <T> WriteStream<T>.drainHandlerAwait() : Void? {
    return awaitEvent{
        this.drainHandler(it)
    }
}

