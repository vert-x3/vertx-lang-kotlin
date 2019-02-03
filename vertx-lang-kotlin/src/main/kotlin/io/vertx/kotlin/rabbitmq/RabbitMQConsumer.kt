package io.vertx.kotlin.rabbitmq

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.rabbitmq.RabbitMQConsumer

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

