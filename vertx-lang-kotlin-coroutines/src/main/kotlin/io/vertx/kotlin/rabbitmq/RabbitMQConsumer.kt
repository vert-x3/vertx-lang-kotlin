package io.vertx.kotlin.rabbitmq

import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.rabbitmq.RabbitMQConsumer
import io.vertx.rabbitmq.RabbitMQMessage

suspend fun RabbitMQConsumer.exceptionHandlerAwait() : Throwable? {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun RabbitMQConsumer.handlerAwait() : RabbitMQMessage? {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun RabbitMQConsumer.endHandlerAwait() : Void? {
    return awaitEvent{
        this.endHandler(it)
    }
}

suspend fun RabbitMQConsumer.cancelAwait() : Void? {
    return awaitResult{
        this.cancel(it)
    }
}

