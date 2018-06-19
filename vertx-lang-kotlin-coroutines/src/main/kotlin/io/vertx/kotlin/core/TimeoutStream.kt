package io.vertx.kotlin.core

import io.vertx.core.TimeoutStream
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun TimeoutStream.exceptionHandlerAwait() : Throwable? {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun TimeoutStream.handlerAwait() : Long? {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun TimeoutStream.endHandlerAwait() : Void? {
    return awaitEvent{
        this.endHandler(it)
    }
}

