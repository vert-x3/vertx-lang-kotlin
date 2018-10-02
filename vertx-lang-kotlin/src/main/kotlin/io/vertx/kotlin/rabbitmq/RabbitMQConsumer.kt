package io.vertx.kotlin.rabbitmq

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.rabbitmq.RabbitMQConsumer

/**
 * Stop message consumption from a queue.
 * <p>
 * The operation is asynchronous. When consumption will be stopped, you can by notified via [io.vertx.rabbitmq.RabbitMQConsumer]
 *
 * @param cancelResult contains information about operation status: success/fail.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQConsumer original] using Vert.x codegen.
 */
suspend fun RabbitMQConsumer.cancelAwait() : Unit {
  return awaitResult{
    this.cancel({ ar -> it.handle(ar.mapEmpty()) })}
}

