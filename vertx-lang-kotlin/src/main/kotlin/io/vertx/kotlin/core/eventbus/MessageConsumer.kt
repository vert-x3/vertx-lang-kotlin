package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.Message
import io.vertx.core.eventbus.MessageConsumer
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun <T> MessageConsumer<T>.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun <T> MessageConsumer<T>.handlerAwait() : Message<T> {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun <T> MessageConsumer<T>.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

suspend fun <T> MessageConsumer<T>.completionHandlerAwait() : Unit {
    return awaitResult{
        this.completionHandler({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <T> MessageConsumer<T>.unregisterAwait() : Unit {
    return awaitResult{
        this.unregister({ ar -> it.handle(ar.mapEmpty()) })}
}

