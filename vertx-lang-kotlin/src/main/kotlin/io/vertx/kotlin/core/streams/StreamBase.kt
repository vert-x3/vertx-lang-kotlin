package io.vertx.kotlin.core.streams

import io.vertx.core.streams.StreamBase
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun StreamBase.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

