package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.Message
import io.vertx.core.eventbus.MessageConsumer
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import java.lang.Void

suspend fun <T> MessageConsumer<T>.exceptionHandlerAwait() : Throwable? {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun <T> MessageConsumer<T>.handlerAwait() : Message<T>? {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun <T> MessageConsumer<T>.endHandlerAwait() : Void? {
    return awaitEvent{
        this.endHandler(it)
    }
}

suspend fun <T> MessageConsumer<T>.completionHandlerAwait() : Void? {
    return awaitResult{
        this.completionHandler(it)
    }
}

suspend fun <T> MessageConsumer<T>.unregisterAwait() : Void? {
    return awaitResult{
        this.unregister(it)
    }
}

