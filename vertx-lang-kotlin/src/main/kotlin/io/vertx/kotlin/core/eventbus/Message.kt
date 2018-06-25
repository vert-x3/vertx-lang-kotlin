package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.DeliveryOptions
import io.vertx.core.eventbus.Message
import io.vertx.kotlin.coroutines.awaitResult

suspend fun <R,T> Message<T>.replyAwait(message : Any) : Message<R> {
    return awaitResult{
        this.reply(message, it)
    }
}

suspend fun <R,T> Message<T>.replyAwait(message : Any, options : DeliveryOptions) : Message<R> {
    return awaitResult{
        this.reply(message, options, it)
    }
}

