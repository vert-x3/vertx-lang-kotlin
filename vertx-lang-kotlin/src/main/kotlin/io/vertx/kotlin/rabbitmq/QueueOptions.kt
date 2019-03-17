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

import io.vertx.rabbitmq.QueueOptions

/**
 * A function providing a DSL for building [io.vertx.rabbitmq.QueueOptions] objects.
 *
 * Aimed to specify queue consumer settings when calling [io.vertx.rabbitmq.RabbitMQClient]
 *
 * @param autoAck 
 * @param keepMostRecent 
 * @param maxInternalQueueSize 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.QueueOptions original] using Vert.x codegen.
 */
fun queueOptionsOf(
  autoAck: Boolean? = null,
  keepMostRecent: Boolean? = null,
  maxInternalQueueSize: Int? = null): QueueOptions = io.vertx.rabbitmq.QueueOptions().apply {

  if (autoAck != null) {
    this.setAutoAck(autoAck)
  }
  if (keepMostRecent != null) {
    this.setKeepMostRecent(keepMostRecent)
  }
  if (maxInternalQueueSize != null) {
    this.setMaxInternalQueueSize(maxInternalQueueSize)
  }
}

/**
 * A function providing a DSL for building [io.vertx.rabbitmq.QueueOptions] objects.
 *
 * Aimed to specify queue consumer settings when calling [io.vertx.rabbitmq.RabbitMQClient]
 *
 * @param autoAck 
 * @param keepMostRecent 
 * @param maxInternalQueueSize 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.QueueOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("queueOptionsOf(autoAck, keepMostRecent, maxInternalQueueSize)")
)
fun QueueOptions(
  autoAck: Boolean? = null,
  keepMostRecent: Boolean? = null,
  maxInternalQueueSize: Int? = null): QueueOptions = io.vertx.rabbitmq.QueueOptions().apply {

  if (autoAck != null) {
    this.setAutoAck(autoAck)
  }
  if (keepMostRecent != null) {
    this.setKeepMostRecent(keepMostRecent)
  }
  if (maxInternalQueueSize != null) {
    this.setMaxInternalQueueSize(maxInternalQueueSize)
  }
}

