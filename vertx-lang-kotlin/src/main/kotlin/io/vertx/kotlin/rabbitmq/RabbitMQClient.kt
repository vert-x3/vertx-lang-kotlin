package io.vertx.kotlin.rabbitmq

import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.rabbitmq.QueueOptions
import io.vertx.rabbitmq.RabbitMQClient
import io.vertx.rabbitmq.RabbitMQConsumer

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.basicAck]
 *
 * @param deliveryTag 
 * @param multiple 
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicAckAwait(deliveryTag: Long, multiple: Boolean): JsonObject {
  return awaitResult {
    this.basicAck(deliveryTag, multiple, it)
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.basicNack]
 *
 * @param deliveryTag 
 * @param multiple 
 * @param requeue 
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicNackAwait(deliveryTag: Long, multiple: Boolean, requeue: Boolean): JsonObject {
  return awaitResult {
    this.basicNack(deliveryTag, multiple, requeue, it)
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.basicGet]
 *
 * @param queue 
 * @param autoAck 
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicGetAwait(queue: String, autoAck: Boolean): JsonObject {
  return awaitResult {
    this.basicGet(queue, autoAck, it)
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.basicConsumer]
 *
 * @param queue 
 * @return [RabbitMQConsumer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicConsumerAwait(queue: String): RabbitMQConsumer {
  return awaitResult {
    this.basicConsumer(queue, it)
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.basicConsumer]
 *
 * @param queue the name of a queue
 * @param options options for queue
 * @return [RabbitMQConsumer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicConsumerAwait(queue: String, options: QueueOptions): RabbitMQConsumer {
  return awaitResult {
    this.basicConsumer(queue, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.basicPublish]
 *
 * @param exchange 
 * @param routingKey 
 * @param message 
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicPublishAwait(exchange: String, routingKey: String, message: JsonObject): Unit {
  return awaitResult {
    this.basicPublish(exchange, routingKey, message) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.confirmSelect]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.confirmSelectAwait(): Unit {
  return awaitResult {
    this.confirmSelect { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.waitForConfirms]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.waitForConfirmsAwait(): Unit {
  return awaitResult {
    this.waitForConfirms { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.waitForConfirms]
 *
 * @param timeout 
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.waitForConfirmsAwait(timeout: Long): Unit {
  return awaitResult {
    this.waitForConfirms(timeout) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.basicQos]
 *
 * @param prefetchCount maximum number of messages that the server will deliver, 0 if unlimited
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicQosAwait(prefetchCount: Int): Unit {
  return awaitResult {
    this.basicQos(prefetchCount) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.basicQos]
 *
 * @param prefetchCount maximum number of messages that the server will deliver, 0 if unlimited
 * @param global true if the settings should be applied to the entire channel rather than each consumer
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicQosAwait(prefetchCount: Int, global: Boolean): Unit {
  return awaitResult {
    this.basicQos(prefetchCount, global) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.basicQos]
 *
 * @param prefetchSize maximum amount of content (measured in octets) that the server will deliver, 0 if unlimited
 * @param prefetchCount maximum number of messages that the server will deliver, 0 if unlimited
 * @param global true if the settings should be applied to the entire channel rather than each consumer
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicQosAwait(prefetchSize: Int, prefetchCount: Int, global: Boolean): Unit {
  return awaitResult {
    this.basicQos(prefetchSize, prefetchCount, global) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.exchangeDeclare]
 *
 * @param exchange 
 * @param type 
 * @param durable 
 * @param autoDelete 
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.exchangeDeclareAwait(exchange: String, type: String, durable: Boolean, autoDelete: Boolean): Unit {
  return awaitResult {
    this.exchangeDeclare(exchange, type, durable, autoDelete) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.exchangeDeclare]
 *
 * @param exchange 
 * @param type 
 * @param durable 
 * @param autoDelete 
 * @param config 
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.exchangeDeclareAwait(exchange: String, type: String, durable: Boolean, autoDelete: Boolean, config: JsonObject): Unit {
  return awaitResult {
    this.exchangeDeclare(exchange, type, durable, autoDelete, config) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.exchangeDelete]
 *
 * @param exchange 
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.exchangeDeleteAwait(exchange: String): Unit {
  return awaitResult {
    this.exchangeDelete(exchange) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.exchangeBind]
 *
 * @param destination 
 * @param source 
 * @param routingKey 
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.exchangeBindAwait(destination: String, source: String, routingKey: String): Unit {
  return awaitResult {
    this.exchangeBind(destination, source, routingKey) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.exchangeUnbind]
 *
 * @param destination 
 * @param source 
 * @param routingKey 
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.exchangeUnbindAwait(destination: String, source: String, routingKey: String): Unit {
  return awaitResult {
    this.exchangeUnbind(destination, source, routingKey) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.queueDeclareAuto]
 *
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueDeclareAutoAwait(): JsonObject {
  return awaitResult {
    this.queueDeclareAuto(it)
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.queueDeclare]
 *
 * @param queue 
 * @param durable 
 * @param exclusive 
 * @param autoDelete 
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueDeclareAwait(queue: String, durable: Boolean, exclusive: Boolean, autoDelete: Boolean): JsonObject {
  return awaitResult {
    this.queueDeclare(queue, durable, exclusive, autoDelete, it)
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.queueDeclare]
 *
 * @param queue 
 * @param durable 
 * @param exclusive 
 * @param autoDelete 
 * @param config 
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueDeclareAwait(queue: String, durable: Boolean, exclusive: Boolean, autoDelete: Boolean, config: JsonObject): JsonObject {
  return awaitResult {
    this.queueDeclare(queue, durable, exclusive, autoDelete, config, it)
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.queueDelete]
 *
 * @param queue 
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueDeleteAwait(queue: String): JsonObject {
  return awaitResult {
    this.queueDelete(queue, it)
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.queueDeleteIf]
 *
 * @param queue 
 * @param ifUnused 
 * @param ifEmpty 
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueDeleteIfAwait(queue: String, ifUnused: Boolean, ifEmpty: Boolean): JsonObject {
  return awaitResult {
    this.queueDeleteIf(queue, ifUnused, ifEmpty, it)
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.queueBind]
 *
 * @param queue 
 * @param exchange 
 * @param routingKey 
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueBindAwait(queue: String, exchange: String, routingKey: String): Unit {
  return awaitResult {
    this.queueBind(queue, exchange, routingKey) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.messageCount]
 *
 * @param queue 
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.messageCountAwait(queue: String): Long {
  return awaitResult {
    this.messageCount(queue, it)
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.start]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.startAwait(): Unit {
  return awaitResult {
    this.start { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.stop]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.stopAwait(): Unit {
  return awaitResult {
    this.stop { ar -> it.handle(ar.mapEmpty()) }
  }
}

