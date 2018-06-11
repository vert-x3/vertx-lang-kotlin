package io.vertx.kotlin.rabbitmq

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.rabbitmq.RabbitMQConsumer

suspend fun RabbitMQConsumer.cancel() {
  awaitResult<Void?> { this.cancel(it) }
}
