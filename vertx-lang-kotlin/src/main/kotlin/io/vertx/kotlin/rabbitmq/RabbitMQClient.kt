package io.vertx.kotlin.rabbitmq

import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.rabbitmq.QueueOptions
import io.vertx.rabbitmq.RabbitMQClient
import io.vertx.rabbitmq.RabbitMQConsumer

suspend fun RabbitMQClient.basicAckAwait(deliveryTag : Long, multiple : Boolean) : JsonObject {
    return awaitResult{
        this.basicAck(deliveryTag, multiple, it)
    }
}

suspend fun RabbitMQClient.basicNackAwait(deliveryTag : Long, multiple : Boolean, requeue : Boolean) : JsonObject {
    return awaitResult{
        this.basicNack(deliveryTag, multiple, requeue, it)
    }
}

suspend fun RabbitMQClient.basicGetAwait(queue : String, autoAck : Boolean) : JsonObject {
    return awaitResult{
        this.basicGet(queue, autoAck, it)
    }
}

suspend fun RabbitMQClient.basicConsumerAwait(queue : String) : RabbitMQConsumer {
    return awaitResult{
        this.basicConsumer(queue, it)
    }
}

suspend fun RabbitMQClient.basicConsumerAwait(queue : String, options : QueueOptions) : RabbitMQConsumer {
    return awaitResult{
        this.basicConsumer(queue, options, it)
    }
}

suspend fun RabbitMQClient.basicPublishAwait(exchange : String, routingKey : String, message : JsonObject) : Unit {
    return awaitResult{
        this.basicPublish(exchange, routingKey, message, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RabbitMQClient.confirmSelectAwait() : Unit {
    return awaitResult{
        this.confirmSelect({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RabbitMQClient.waitForConfirmsAwait() : Unit {
    return awaitResult{
        this.waitForConfirms({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RabbitMQClient.waitForConfirmsAwait(timeout : Long) : Unit {
    return awaitResult{
        this.waitForConfirms(timeout, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RabbitMQClient.basicQosAwait(prefetchCount : Int) : Unit {
    return awaitResult{
        this.basicQos(prefetchCount, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RabbitMQClient.basicQosAwait(prefetchCount : Int, global : Boolean) : Unit {
    return awaitResult{
        this.basicQos(prefetchCount, global, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RabbitMQClient.basicQosAwait(prefetchSize : Int, prefetchCount : Int, global : Boolean) : Unit {
    return awaitResult{
        this.basicQos(prefetchSize, prefetchCount, global, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RabbitMQClient.exchangeDeclareAwait(exchange : String, type : String, durable : Boolean, autoDelete : Boolean) : Unit {
    return awaitResult{
        this.exchangeDeclare(exchange, type, durable, autoDelete, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RabbitMQClient.exchangeDeclareAwait(exchange : String, type : String, durable : Boolean, autoDelete : Boolean, config : JsonObject) : Unit {
    return awaitResult{
        this.exchangeDeclare(exchange, type, durable, autoDelete, config, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RabbitMQClient.exchangeDeleteAwait(exchange : String) : Unit {
    return awaitResult{
        this.exchangeDelete(exchange, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RabbitMQClient.exchangeBindAwait(destination : String, source : String, routingKey : String) : Unit {
    return awaitResult{
        this.exchangeBind(destination, source, routingKey, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RabbitMQClient.exchangeUnbindAwait(destination : String, source : String, routingKey : String) : Unit {
    return awaitResult{
        this.exchangeUnbind(destination, source, routingKey, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RabbitMQClient.queueDeclareAutoAwait() : JsonObject {
    return awaitResult{
        this.queueDeclareAuto(it)
    }
}

suspend fun RabbitMQClient.queueDeclareAwait(queue : String, durable : Boolean, exclusive : Boolean, autoDelete : Boolean) : JsonObject {
    return awaitResult{
        this.queueDeclare(queue, durable, exclusive, autoDelete, it)
    }
}

suspend fun RabbitMQClient.queueDeclareAwait(queue : String, durable : Boolean, exclusive : Boolean, autoDelete : Boolean, config : JsonObject) : JsonObject {
    return awaitResult{
        this.queueDeclare(queue, durable, exclusive, autoDelete, config, it)
    }
}

suspend fun RabbitMQClient.queueDeleteAwait(queue : String) : JsonObject {
    return awaitResult{
        this.queueDelete(queue, it)
    }
}

suspend fun RabbitMQClient.queueDeleteIfAwait(queue : String, ifUnused : Boolean, ifEmpty : Boolean) : JsonObject {
    return awaitResult{
        this.queueDeleteIf(queue, ifUnused, ifEmpty, it)
    }
}

suspend fun RabbitMQClient.queueBindAwait(queue : String, exchange : String, routingKey : String) : Unit {
    return awaitResult{
        this.queueBind(queue, exchange, routingKey, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RabbitMQClient.messageCountAwait(queue : String) : Long {
    return awaitResult{
        this.messageCount(queue, it)
    }
}

suspend fun RabbitMQClient.startAwait() : Unit {
    return awaitResult{
        this.start({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RabbitMQClient.stopAwait() : Unit {
    return awaitResult{
        this.stop({ ar -> it.handle(ar.mapEmpty()) })}
}

