package io.vertx.kotlin.rabbitmq

import io.vertx.core.AsyncResult
import io.vertx.core.Handler
import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.rabbitmq.QueueOptions
import io.vertx.rabbitmq.RabbitMQClient
import io.vertx.rabbitmq.RabbitMQConsumer
import java.lang.Void

suspend fun RabbitMQClient.basicAckAwait(deliveryTag : Long, multiple : Boolean) : JsonObject? {
    return awaitResult{
        this.basicAck(deliveryTag, multiple, it)
    }
}

suspend fun RabbitMQClient.basicNackAwait(deliveryTag : Long, multiple : Boolean, requeue : Boolean) : JsonObject? {
    return awaitResult{
        this.basicNack(deliveryTag, multiple, requeue, it)
    }
}

suspend fun RabbitMQClient.basicGetAwait(queue : String, autoAck : Boolean) : JsonObject? {
    return awaitResult{
        this.basicGet(queue, autoAck, it)
    }
}

suspend fun RabbitMQClient.basicConsumeAwait(queue : String, address : String) : Void? {
    return awaitResult{
        this.basicConsume(queue, address, it)
    }
}

suspend fun RabbitMQClient.basicConsumeAwait(queue : String, address : String, autoAck : Boolean) : Void? {
    return awaitResult{
        this.basicConsume(queue, address, autoAck, it)
    }
}

suspend fun RabbitMQClient.basicConsumeAwait(queue : String, address : String, autoAck : Boolean, resultHandler : Handler<AsyncResult<Void>>) : Throwable? {
    return awaitEvent{
        this.basicConsume(queue, address, autoAck, resultHandler, it)
    }
}

suspend fun RabbitMQClient.basicConsumerAwait(queue : String) : RabbitMQConsumer? {
    return awaitResult{
        this.basicConsumer(queue, it)
    }
}

suspend fun RabbitMQClient.basicConsumerAwait(queue : String, options : QueueOptions) : RabbitMQConsumer? {
    return awaitResult{
        this.basicConsumer(queue, options, it)
    }
}

suspend fun RabbitMQClient.basicPublishAwait(exchange : String, routingKey : String, message : JsonObject) : Void? {
    return awaitResult{
        this.basicPublish(exchange, routingKey, message, it)
    }
}

suspend fun RabbitMQClient.confirmSelectAwait() : Void? {
    return awaitResult{
        this.confirmSelect(it)
    }
}

suspend fun RabbitMQClient.waitForConfirmsAwait() : Void? {
    return awaitResult{
        this.waitForConfirms(it)
    }
}

suspend fun RabbitMQClient.waitForConfirmsAwait(timeout : Long) : Void? {
    return awaitResult{
        this.waitForConfirms(timeout, it)
    }
}

suspend fun RabbitMQClient.basicQosAwait(prefetchCount : Int) : Void? {
    return awaitResult{
        this.basicQos(prefetchCount, it)
    }
}

suspend fun RabbitMQClient.basicQosAwait(prefetchCount : Int, global : Boolean) : Void? {
    return awaitResult{
        this.basicQos(prefetchCount, global, it)
    }
}

suspend fun RabbitMQClient.basicQosAwait(prefetchSize : Int, prefetchCount : Int, global : Boolean) : Void? {
    return awaitResult{
        this.basicQos(prefetchSize, prefetchCount, global, it)
    }
}

suspend fun RabbitMQClient.exchangeDeclareAwait(exchange : String, type : String, durable : Boolean, autoDelete : Boolean) : Void? {
    return awaitResult{
        this.exchangeDeclare(exchange, type, durable, autoDelete, it)
    }
}

suspend fun RabbitMQClient.exchangeDeclareAwait(exchange : String, type : String, durable : Boolean, autoDelete : Boolean, config : JsonObject) : Void? {
    return awaitResult{
        this.exchangeDeclare(exchange, type, durable, autoDelete, config, it)
    }
}

suspend fun RabbitMQClient.exchangeDeleteAwait(exchange : String) : Void? {
    return awaitResult{
        this.exchangeDelete(exchange, it)
    }
}

suspend fun RabbitMQClient.exchangeBindAwait(destination : String, source : String, routingKey : String) : Void? {
    return awaitResult{
        this.exchangeBind(destination, source, routingKey, it)
    }
}

suspend fun RabbitMQClient.exchangeUnbindAwait(destination : String, source : String, routingKey : String) : Void? {
    return awaitResult{
        this.exchangeUnbind(destination, source, routingKey, it)
    }
}

suspend fun RabbitMQClient.queueDeclareAutoAwait() : JsonObject? {
    return awaitResult{
        this.queueDeclareAuto(it)
    }
}

suspend fun RabbitMQClient.queueDeclareAwait(queue : String, durable : Boolean, exclusive : Boolean, autoDelete : Boolean) : JsonObject? {
    return awaitResult{
        this.queueDeclare(queue, durable, exclusive, autoDelete, it)
    }
}

suspend fun RabbitMQClient.queueDeclareAwait(queue : String, durable : Boolean, exclusive : Boolean, autoDelete : Boolean, config : JsonObject) : JsonObject? {
    return awaitResult{
        this.queueDeclare(queue, durable, exclusive, autoDelete, config, it)
    }
}

suspend fun RabbitMQClient.queueDeleteAwait(queue : String) : JsonObject? {
    return awaitResult{
        this.queueDelete(queue, it)
    }
}

suspend fun RabbitMQClient.queueDeleteIfAwait(queue : String, ifUnused : Boolean, ifEmpty : Boolean) : JsonObject? {
    return awaitResult{
        this.queueDeleteIf(queue, ifUnused, ifEmpty, it)
    }
}

suspend fun RabbitMQClient.queueBindAwait(queue : String, exchange : String, routingKey : String) : Void? {
    return awaitResult{
        this.queueBind(queue, exchange, routingKey, it)
    }
}

suspend fun RabbitMQClient.messageCountAwait(queue : String) : Long? {
    return awaitResult{
        this.messageCount(queue, it)
    }
}

suspend fun RabbitMQClient.startAwait() : Void? {
    return awaitResult{
        this.start(it)
    }
}

suspend fun RabbitMQClient.stopAwait() : Void? {
    return awaitResult{
        this.stop(it)
    }
}

