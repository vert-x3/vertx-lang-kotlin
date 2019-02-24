package io.vertx.kotlin.rabbitmq

import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.rabbitmq.RabbitMQConsumer
import io.vertx.rabbitmq.RabbitMQMessage

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQConsumer.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQConsumer] using Vert.x codegen.
 */
suspend fun RabbitMQConsumer.pipeToAwait(dst: WriteStream<RabbitMQMessage>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.rabbitmq.RabbitMQConsumer.cancel]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.rabbitmq.RabbitMQConsumer] using Vert.x codegen.
 */
suspend fun RabbitMQConsumer.cancelAwait(): Unit {
  return awaitResult {
    this.cancel { ar -> it.handle(ar.mapEmpty()) }
  }
}

