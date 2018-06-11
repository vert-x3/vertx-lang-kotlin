package io.vertx.kotlin.core.streams

import io.vertx.core.streams.ReadStream
import io.vertx.kotlin.coroutines.awaitEvent
import java.lang.Void

suspend fun <T> ReadStream<T>.exceptionHandlerAwait() : Throwable? {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun <T> ReadStream<T>.handlerAwait() : T? {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun <T> ReadStream<T>.endHandlerAwait() : Void? {
    return awaitEvent{
        this.endHandler(it)
    }
}

