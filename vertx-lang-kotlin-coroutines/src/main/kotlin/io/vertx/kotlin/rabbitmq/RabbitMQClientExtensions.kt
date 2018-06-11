package io.vertx.kotlin.rabbitmq

import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.rabbitmq.QueueOptions
import io.vertx.rabbitmq.RabbitMQClient
import io.vertx.rabbitmq.RabbitMQConsumer
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int
import kotlin.Long
import kotlin.String

suspend fun RabbitMQClient.basicAck(deliveryTag: Long, multiple: Boolean): JsonObject = awaitResult { this.basicAck(deliveryTag, multiple, it) }

suspend fun RabbitMQClient.basicNack(
    deliveryTag: Long,
    multiple: Boolean,
    requeue: Boolean
): JsonObject = awaitResult { this.basicNack(deliveryTag, multiple, requeue, it) }

suspend fun RabbitMQClient.basicGet(queue: String, autoAck: Boolean): JsonObject = awaitResult { this.basicGet(queue, autoAck, it) }

@Deprecated("")
suspend fun RabbitMQClient.basicConsume(queue: String, address: String) {
  awaitResult<Void?> { this.basicConsume(queue, address, it) }
}

@Deprecated("")
suspend fun RabbitMQClient.basicConsume(
    queue: String,
    address: String,
    autoAck: Boolean
) {
  awaitResult<Void?> { this.basicConsume(queue, address, autoAck, it) }
}

suspend fun RabbitMQClient.basicConsumer(queue: String): RabbitMQConsumer = awaitResult { this.basicConsumer(queue, it) }

suspend fun RabbitMQClient.basicConsumer(queue: String, options: QueueOptions): RabbitMQConsumer = awaitResult { this.basicConsumer(queue, options, it) }

suspend fun RabbitMQClient.basicPublish(
    exchange: String,
    routingKey: String,
    message: JsonObject
) {
  awaitResult<Void?> { this.basicPublish(exchange, routingKey, message, it) }
}

suspend fun RabbitMQClient.confirmSelect() {
  awaitResult<Void?> { this.confirmSelect(it) }
}

suspend fun RabbitMQClient.waitForConfirms() {
  awaitResult<Void?> { this.waitForConfirms(it) }
}

suspend fun RabbitMQClient.waitForConfirms(timeout: Long) {
  awaitResult<Void?> { this.waitForConfirms(timeout, it) }
}

suspend fun RabbitMQClient.basicQos(prefetchCount: Int) {
  awaitResult<Void?> { this.basicQos(prefetchCount, it) }
}

suspend fun RabbitMQClient.basicQos(prefetchCount: Int, global: Boolean) {
  awaitResult<Void?> { this.basicQos(prefetchCount, global, it) }
}

suspend fun RabbitMQClient.basicQos(
    prefetchSize: Int,
    prefetchCount: Int,
    global: Boolean
) {
  awaitResult<Void?> { this.basicQos(prefetchSize, prefetchCount, global, it) }
}

suspend fun RabbitMQClient.exchangeDeclare(
    exchange: String,
    type: String,
    durable: Boolean,
    autoDelete: Boolean
) {
  awaitResult<Void?> { this.exchangeDeclare(exchange, type, durable, autoDelete, it) }
}

suspend fun RabbitMQClient.exchangeDeclare(
    exchange: String,
    type: String,
    durable: Boolean,
    autoDelete: Boolean,
    config: JsonObject
) {
  awaitResult<Void?> { this.exchangeDeclare(exchange, type, durable, autoDelete, config, it) }
}

suspend fun RabbitMQClient.exchangeDelete(exchange: String) {
  awaitResult<Void?> { this.exchangeDelete(exchange, it) }
}

suspend fun RabbitMQClient.exchangeBind(
    destination: String,
    source: String,
    routingKey: String
) {
  awaitResult<Void?> { this.exchangeBind(destination, source, routingKey, it) }
}

suspend fun RabbitMQClient.exchangeUnbind(
    destination: String,
    source: String,
    routingKey: String
) {
  awaitResult<Void?> { this.exchangeUnbind(destination, source, routingKey, it) }
}

suspend fun RabbitMQClient.queueDeclareAuto(): JsonObject = awaitResult { this.queueDeclareAuto(it) }

suspend fun RabbitMQClient.queueDeclare(
    queue: String,
    durable: Boolean,
    exclusive: Boolean,
    autoDelete: Boolean
): JsonObject = awaitResult { this.queueDeclare(queue, durable, exclusive, autoDelete, it) }

suspend fun RabbitMQClient.queueDeclare(
    queue: String,
    durable: Boolean,
    exclusive: Boolean,
    autoDelete: Boolean,
    config: JsonObject
): JsonObject = awaitResult { this.queueDeclare(queue, durable, exclusive, autoDelete, config, it) }

suspend fun RabbitMQClient.queueDelete(queue: String): JsonObject = awaitResult { this.queueDelete(queue, it) }

suspend fun RabbitMQClient.queueDeleteIf(
    queue: String,
    ifUnused: Boolean,
    ifEmpty: Boolean
): JsonObject = awaitResult { this.queueDeleteIf(queue, ifUnused, ifEmpty, it) }

suspend fun RabbitMQClient.queueBind(
    queue: String,
    exchange: String,
    routingKey: String
) {
  awaitResult<Void?> { this.queueBind(queue, exchange, routingKey, it) }
}

suspend fun RabbitMQClient.messageCount(queue: String): Long = awaitResult { this.messageCount(queue, it) }

suspend fun RabbitMQClient.start() {
  awaitResult<Void?> { this.start(it) }
}

suspend fun RabbitMQClient.stop() {
  awaitResult<Void?> { this.stop(it) }
}
