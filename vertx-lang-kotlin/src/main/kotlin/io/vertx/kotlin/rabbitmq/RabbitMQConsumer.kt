package io.vertx.kotlin.rabbitmq

import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.rabbitmq.RabbitMQConsumer
import io.vertx.rabbitmq.RabbitMQMessage

suspend fun RabbitMQConsumer.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun RabbitMQConsumer.handlerAwait() : RabbitMQMessage {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun RabbitMQConsumer.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

suspend fun RabbitMQConsumer.cancelAwait() : Unit {
    return awaitResult{
        this.cancel({ ar -> it.handle(ar.mapEmpty()) })}
}

