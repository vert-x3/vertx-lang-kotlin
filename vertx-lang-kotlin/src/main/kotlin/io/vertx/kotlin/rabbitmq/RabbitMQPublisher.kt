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

import com.rabbitmq.client.BasicProperties
import io.vertx.core.buffer.Buffer
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.rabbitmq.RabbitMQPublisher

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQPublisher.start]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQPublisher] using Vert.x codegen.
 */
suspend fun RabbitMQPublisher.startAwait(): Unit {
  return awaitResult {
    this.start(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQPublisher.stop]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQPublisher] using Vert.x codegen.
 */
suspend fun RabbitMQPublisher.stopAwait(): Unit {
  return awaitResult {
    this.stop(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQPublisher.publish]
 *
 * @param exchange 
 * @param routingKey 
 * @param properties 
 * @param body 
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQPublisher] using Vert.x codegen.
 */
suspend fun RabbitMQPublisher.publishAwait(exchange: String, routingKey: String, properties: BasicProperties, body: Buffer): Unit {
  return awaitResult {
    this.publish(exchange, routingKey, properties, body, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

