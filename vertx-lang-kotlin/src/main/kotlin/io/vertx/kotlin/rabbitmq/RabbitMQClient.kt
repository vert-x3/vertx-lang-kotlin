/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.rabbitmq

import com.rabbitmq.client.AMQP.Queue.DeclareOk
import com.rabbitmq.client.AMQP.Queue.DeleteOk
import com.rabbitmq.client.BasicProperties
import io.vertx.core.buffer.Buffer
import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.rabbitmq.QueueOptions
import io.vertx.rabbitmq.RabbitMQClient
import io.vertx.rabbitmq.RabbitMQConsumer
import io.vertx.rabbitmq.RabbitMQMessage

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.basicAck]
 *
 * @param deliveryTag 
 * @param multiple 
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicAckAwait(deliveryTag: Long, multiple: Boolean): Unit {
  return awaitResult {
    this.basicAck(deliveryTag, multiple, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.basicNack]
 *
 * @param deliveryTag 
 * @param multiple 
 * @param requeue 
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicNackAwait(deliveryTag: Long, multiple: Boolean, requeue: Boolean): Unit {
  return awaitResult {
    this.basicNack(deliveryTag, multiple, requeue, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.basicGet]
 *
 * @param queue 
 * @param autoAck 
 * @return [RabbitMQMessage]
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicGetAwait(queue: String, autoAck: Boolean): RabbitMQMessage {
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
 * @param body 
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicPublishAwait(exchange: String, routingKey: String, body: Buffer): Unit {
  return awaitResult {
    this.basicPublish(exchange, routingKey, body, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
    this.confirmSelect(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
    this.waitForConfirms(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
    this.waitForConfirms(timeout, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
    this.basicQos(prefetchCount, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
    this.basicQos(prefetchCount, global, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
    this.basicQos(prefetchSize, prefetchCount, global, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
    this.exchangeDeclare(exchange, type, durable, autoDelete, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
    this.exchangeDeclare(exchange, type, durable, autoDelete, config, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
    this.exchangeDelete(exchange, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
    this.exchangeBind(destination, source, routingKey, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.exchangeBind]
 *
 * @param destination 
 * @param source 
 * @param routingKey 
 * @param arguments 
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.exchangeBindAwait(destination: String, source: String, routingKey: String, arguments: Map<String,Any>): Unit {
  return awaitResult {
    this.exchangeBind(destination, source, routingKey, arguments, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
    this.exchangeUnbind(destination, source, routingKey, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.exchangeUnbind]
 *
 * @param destination 
 * @param source 
 * @param routingKey 
 * @param arguments 
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.exchangeUnbindAwait(destination: String, source: String, routingKey: String, arguments: Map<String,Any>): Unit {
  return awaitResult {
    this.exchangeUnbind(destination, source, routingKey, arguments, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
    this.queueBind(queue, exchange, routingKey, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.queueBind]
 *
 * @param queue 
 * @param exchange 
 * @param routingKey 
 * @param arguments 
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueBindAwait(queue: String, exchange: String, routingKey: String, arguments: Map<String,Any>): Unit {
  return awaitResult {
    this.queueBind(queue, exchange, routingKey, arguments, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.queueUnbind]
 *
 * @param queue 
 * @param exchange 
 * @param routingKey 
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueUnbindAwait(queue: String, exchange: String, routingKey: String): Unit {
  return awaitResult {
    this.queueUnbind(queue, exchange, routingKey, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.queueUnbind]
 *
 * @param queue 
 * @param exchange 
 * @param routingKey 
 * @param arguments 
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueUnbindAwait(queue: String, exchange: String, routingKey: String, arguments: Map<String,Any>): Unit {
  return awaitResult {
    this.queueUnbind(queue, exchange, routingKey, arguments, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
    this.start(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
    this.stop(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.basicPublish]
 *
 * @param exchange 
 * @param routingKey 
 * @param properties 
 * @param body 
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicPublishAwait(exchange: String, routingKey: String, properties: BasicProperties, body: Buffer): Unit {
  return awaitResult {
    this.basicPublish(exchange, routingKey, properties, body, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.queueDeclare]
 *
 * @param queue 
 * @param durable 
 * @param exclusive 
 * @param autoDelete 
 * @return [DeclareOk]
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueDeclareAwait(queue: String, durable: Boolean, exclusive: Boolean, autoDelete: Boolean): DeclareOk {
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
 * @return [DeclareOk]
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueDeclareAwait(queue: String, durable: Boolean, exclusive: Boolean, autoDelete: Boolean, config: JsonObject): DeclareOk {
  return awaitResult {
    this.queueDeclare(queue, durable, exclusive, autoDelete, config, it)
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQClient.queueDelete]
 *
 * @param queue 
 * @return [DeleteOk]
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueDeleteAwait(queue: String): DeleteOk {
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
 * @return [DeleteOk]
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQClient] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueDeleteIfAwait(queue: String, ifUnused: Boolean, ifEmpty: Boolean): DeleteOk {
  return awaitResult {
    this.queueDeleteIf(queue, ifUnused, ifEmpty, it)
  }
}

