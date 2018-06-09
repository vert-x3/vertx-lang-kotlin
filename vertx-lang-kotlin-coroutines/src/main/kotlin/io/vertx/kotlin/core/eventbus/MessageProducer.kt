package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.MessageProducer
import io.vertx.kotlin.coroutines.awaitEvent
import java.lang.Void

suspend fun <T> MessageProducer<T>.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun <T> MessageProducer<T>.drainHandlerAwait() : Void {
    return awaitEvent{
        this.drainHandler(it)
    }
}

