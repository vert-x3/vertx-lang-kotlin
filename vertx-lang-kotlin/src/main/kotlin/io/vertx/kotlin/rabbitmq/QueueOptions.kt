package io.vertx.kotlin.rabbitmq

import io.vertx.rabbitmq.QueueOptions

/**
 * A function providing a DSL for building [io.vertx.rabbitmq.QueueOptions] objects.
 *
 * Aimed to specify queue consumer settings when calling [io.vertx.rabbitmq.RabbitMQClient]
 *
 * @param autoAck 
 * @param buffer 
 * @param keepMostRecent 
 * @param maxInternalQueueSize 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.QueueOptions original] using Vert.x codegen.
 */
fun QueueOptions(
  autoAck: Boolean? = null,
  buffer: Boolean? = null,
  keepMostRecent: Boolean? = null,
  maxInternalQueueSize: Int? = null): QueueOptions = io.vertx.rabbitmq.QueueOptions().apply {

  if (autoAck != null) {
    this.setAutoAck(autoAck)
  }
  if (buffer != null) {
    this.setBuffer(buffer)
  }
  if (keepMostRecent != null) {
    this.setKeepMostRecent(keepMostRecent)
  }
  if (maxInternalQueueSize != null) {
    this.setMaxInternalQueueSize(maxInternalQueueSize)
  }
}

