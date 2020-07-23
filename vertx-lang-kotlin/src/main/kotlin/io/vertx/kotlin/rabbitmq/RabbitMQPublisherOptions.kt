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

import io.vertx.rabbitmq.RabbitMQPublisherOptions

/**
 * A function providing a DSL for building [io.vertx.rabbitmq.RabbitMQPublisherOptions] objects.
 *
 * RabbitMQ client options, most
 *
 * @param maxInternalQueueSize 
 * @param reconnectAttempts  Set the number of reconnect attempts to attempt when connecting, the <code>null</code> value disables it.
 * @param reconnectInterval  Set the delay in milliseconds between connection retries.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQPublisherOptions original] using Vert.x codegen.
 */
fun rabbitMQPublisherOptionsOf(
  maxInternalQueueSize: Int? = null,
  reconnectAttempts: Int? = null,
  reconnectInterval: Long? = null): RabbitMQPublisherOptions = io.vertx.rabbitmq.RabbitMQPublisherOptions().apply {

  if (maxInternalQueueSize != null) {
    this.setMaxInternalQueueSize(maxInternalQueueSize)
  }
  if (reconnectAttempts != null) {
    this.setReconnectAttempts(reconnectAttempts)
  }
  if (reconnectInterval != null) {
    this.setReconnectInterval(reconnectInterval)
  }
}

/**
 * A function providing a DSL for building [io.vertx.rabbitmq.RabbitMQPublisherOptions] objects.
 *
 * RabbitMQ client options, most
 *
 * @param maxInternalQueueSize 
 * @param reconnectAttempts  Set the number of reconnect attempts to attempt when connecting, the <code>null</code> value disables it.
 * @param reconnectInterval  Set the delay in milliseconds between connection retries.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQPublisherOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("rabbitMQPublisherOptionsOf(maxInternalQueueSize, reconnectAttempts, reconnectInterval)")
)
fun RabbitMQPublisherOptions(
  maxInternalQueueSize: Int? = null,
  reconnectAttempts: Int? = null,
  reconnectInterval: Long? = null): RabbitMQPublisherOptions = io.vertx.rabbitmq.RabbitMQPublisherOptions().apply {

  if (maxInternalQueueSize != null) {
    this.setMaxInternalQueueSize(maxInternalQueueSize)
  }
  if (reconnectAttempts != null) {
    this.setReconnectAttempts(reconnectAttempts)
  }
  if (reconnectInterval != null) {
    this.setReconnectInterval(reconnectInterval)
  }
}

