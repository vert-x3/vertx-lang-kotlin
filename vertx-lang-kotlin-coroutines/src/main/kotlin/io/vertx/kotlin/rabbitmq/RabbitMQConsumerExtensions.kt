package io.vertx.kotlin.rabbitmq

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.rabbitmq.RabbitMQConsumer

/**
 *  Stop message consumption from a queue.
 *  <p>
 *  The operation is asynchronous. When consumption will be stopped, you can by notified via [RabbitMQConsumer.endHandler] */
suspend fun RabbitMQConsumer.cancelSuspending() {
  awaitResult<Void?> { this.cancel(it) }
}
