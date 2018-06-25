package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.MessageProducer
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun <T> MessageProducer<T>.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun <T> MessageProducer<T>.drainHandlerAwait() : Unit {
    return awaitEvent{
        this.drainHandler({ v -> it.handle(null) })}
}

