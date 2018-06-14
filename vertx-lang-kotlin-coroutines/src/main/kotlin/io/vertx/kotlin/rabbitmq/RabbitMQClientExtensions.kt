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

/**
 *  Acknowledge one or several received messages. Supply the deliveryTag from the AMQP.Basic.GetOk or AMQP.Basic.Deliver
 *  method containing the received message being acknowledged.
 * @see com.rabbitmq.client.Channel#basicAck(long, boolean)
 */
suspend fun RabbitMQClient.basicAck(deliveryTag: Long, multiple: Boolean): JsonObject {
  return awaitResult { this.basicAck(deliveryTag, multiple, it) }
}

/**
 *  Reject one or several received messages.
 * @see com.rabbitmq.client.Channel#basicNack(long, boolean, boolean)
 */
suspend fun RabbitMQClient.basicNack(
  deliveryTag: Long,
  multiple: Boolean,
  requeue: Boolean
): JsonObject {
  return awaitResult { this.basicNack(deliveryTag, multiple, requeue, it) }
}

/**
 *  Retrieve a message from a queue using AMQP.Basic.Get
 * @see com.rabbitmq.client.Channel#basicGet(String, boolean)
 */
suspend fun RabbitMQClient.basicGet(queue: String, autoAck: Boolean): JsonObject {
  return awaitResult { this.basicGet(queue, autoAck, it) }
}

/**
 *  Use [RabbitMQClient.basicConsumer] instead
 *  <p>
 *  Start a non-nolocal, non-exclusive consumer, with auto acknowledgement and a server-generated consumerTag.
 * @see com.rabbitmq.client.Channel#basicConsume(String, Consumer)
 */
@Deprecated("")
suspend fun RabbitMQClient.basicConsume(queue: String, address: String) {
  awaitResult<Void?> { this.basicConsume(queue, address, it) }
}

/**
 *  Use [RabbitMQClient.basicConsumer] instead
 *  <p>
 *  Start a non-nolocal, non-exclusive consumer, with a server-generated consumerTag.
 * @see com.rabbitmq.client.Channel#basicConsume(String, boolean, String, Consumer)
 */
@Deprecated("")
suspend fun RabbitMQClient.basicConsume(
  queue: String,
  address: String,
  autoAck: Boolean
) {
  awaitResult<Void?> { this.basicConsume(queue, address, autoAck, it) }
}

/**
 *
 * @see com.rabbitmq.client.Channel#basicConsume(String, Consumer)
 * @see RabbitMQClient#basicConsumer(String, Handler)
 */
suspend fun RabbitMQClient.basicConsumer(queue: String): RabbitMQConsumer {
  return awaitResult { this.basicConsumer(queue, it) }
}

/**
 *  Create a consumer with the given `options`.
 * @param queue          the name of a queue
 * @param options        options for queue
 * @see com.rabbitmq.client.Channel#basicConsume(String, boolean, String, Consumer)
 */
suspend fun RabbitMQClient.basicConsumer(queue: String, options: QueueOptions): RabbitMQConsumer {
  return awaitResult { this.basicConsumer(queue, options, it) }
}

/**
 *  Publish a message. Publishing to a non-existent exchange will result in a channel-level protocol exception,
 *  which closes the channel. Invocations of Channel#basicPublish will eventually block if a resource-driven alarm is in effect.
 * @see com.rabbitmq.client.Channel#basicPublish(String, String, AMQP.BasicProperties, byte[])
 */
suspend fun RabbitMQClient.basicPublish(
  exchange: String,
  routingKey: String,
  message: JsonObject
) {
  awaitResult<Void?> { this.basicPublish(exchange, routingKey, message, it) }
}

/**
 *  Enables publisher acknowledgements on this channel. Can be called once during client initialisation. Calls to basicPublish()
 *  will have to be confirmed.
 * @see Channel#confirmSelect()
 * @see http://www.rabbitmq.com/confirms.html
 */
suspend fun RabbitMQClient.confirmSelect() {
  awaitResult<Void?> { this.confirmSelect(it) }
}

/**
 *  Wait until all messages published since the last call have been either ack'd or nack'd by the broker.
 *  This will incur slight performance loss at the expense of higher write consistency.
 *  If desired, multiple calls to basicPublish() can be batched before confirming.
 * @see Channel#waitForConfirms()
 * @see http://www.rabbitmq.com/confirms.html
 * @throws java.io.IOException Throws an IOException if the message was not written to the queue.
 */
suspend fun RabbitMQClient.waitForConfirms() {
  awaitResult<Void?> { this.waitForConfirms(it) }
}

/**
 *  Wait until all messages published since the last call have been either ack'd or nack'd by the broker; or until timeout elapses. If the timeout expires a TimeoutException is thrown.
 * @param timeout
 * @see io.vertx.rabbitmq.impl.RabbitMQClientImpl#waitForConfirms(Handler)
 * @see http://www.rabbitmq.com/confirms.html
 * @throws java.io.IOException Throws an IOException if the message was not written to the queue.
 */
suspend fun RabbitMQClient.waitForConfirms(timeout: Long) {
  awaitResult<Void?> { this.waitForConfirms(timeout, it) }
}

/**
 *  Request a specific prefetchCount "quality of service" settings
 *  for this channel.
 * @see #basicQos(int, int, boolean, Handler)
 * @param prefetchCount maximum number of messages that the server
 *  will deliver, 0 if unlimited */
suspend fun RabbitMQClient.basicQos(prefetchCount: Int) {
  awaitResult<Void?> { this.basicQos(prefetchCount, it) }
}

/**
 *  Request a specific prefetchCount "quality of service" settings
 *  for this channel.
 * @see #basicQos(int, int, boolean, Handler)
 * @param prefetchCount maximum number of messages that the server
 *  will deliver, 0 if unlimited
 * @param global true if the settings should be applied to the
 *  entire channel rather than each consumer */
suspend fun RabbitMQClient.basicQos(prefetchCount: Int, global: Boolean) {
  awaitResult<Void?> { this.basicQos(prefetchCount, global, it) }
}

/**
 *  Request specific "quality of service" settings.
 *  These settings impose limits on the amount of data the server
 *  will deliver to consumers before requiring acknowledgements.
 *  Thus they provide a means of consumer-initiated flow control.
 *
 * @see com.rabbitmq.client.AMQP.Basic.Qos
 * @param prefetchSize maximum amount of content (measured in
 *  octets) that the server will deliver, 0 if unlimited
 * @param prefetchCount maximum number of messages that the server
 *  will deliver, 0 if unlimited
 * @param global true if the settings should be applied to the
 *  entire channel rather than each consumer */
suspend fun RabbitMQClient.basicQos(
  prefetchSize: Int,
  prefetchCount: Int,
  global: Boolean
) {
  awaitResult<Void?> { this.basicQos(prefetchSize, prefetchCount, global, it) }
}

/**
 *  Declare an exchange.
 * @see com.rabbitmq.client.Channel#exchangeDeclare(String, String, boolean, boolean, Map)
 */
suspend fun RabbitMQClient.exchangeDeclare(
  exchange: String,
  type: String,
  durable: Boolean,
  autoDelete: Boolean
) {
  awaitResult<Void?> { this.exchangeDeclare(exchange, type, durable, autoDelete, it) }
}

/**
 *  Declare an exchange with additional parameters such as dead lettering, an alternate exchange or TTL.
 * @see com.rabbitmq.client.Channel#exchangeDeclare(String, String, boolean, boolean, Map)
 */
suspend fun RabbitMQClient.exchangeDeclare(
  exchange: String,
  type: String,
  durable: Boolean,
  autoDelete: Boolean,
  config: JsonObject
) {
  awaitResult<Void?> { this.exchangeDeclare(exchange, type, durable, autoDelete, config, it) }
}

/**
 *  Delete an exchange, without regard for whether it is in use or not.
 * @see com.rabbitmq.client.Channel#exchangeDelete(String)
 */
suspend fun RabbitMQClient.exchangeDelete(exchange: String) {
  awaitResult<Void?> { this.exchangeDelete(exchange, it) }
}

/**
 *  Bind an exchange to an exchange.
 * @see com.rabbitmq.client.Channel#exchangeBind(String, String, String)
 */
suspend fun RabbitMQClient.exchangeBind(
  destination: String,
  source: String,
  routingKey: String
) {
  awaitResult<Void?> { this.exchangeBind(destination, source, routingKey, it) }
}

/**
 *  Unbind an exchange from an exchange.
 * @see com.rabbitmq.client.Channel#exchangeUnbind(String, String, String)
 */
suspend fun RabbitMQClient.exchangeUnbind(
  destination: String,
  source: String,
  routingKey: String
) {
  awaitResult<Void?> { this.exchangeUnbind(destination, source, routingKey, it) }
}

/**
 *  Actively declare a server-named exclusive, autodelete, non-durable queue.
 * @see com.rabbitmq.client.Channel#queueDeclare()
 */
suspend fun RabbitMQClient.queueDeclareAuto(): JsonObject {
  return awaitResult { this.queueDeclareAuto(it) }
}

/**
 *  Declare a queue
 * @see com.rabbitmq.client.Channel#queueDeclare(String, boolean, boolean, boolean, java.util.Map)
 */
suspend fun RabbitMQClient.queueDeclare(
  queue: String,
  durable: Boolean,
  exclusive: Boolean,
  autoDelete: Boolean
): JsonObject {
  return awaitResult { this.queueDeclare(queue, durable, exclusive, autoDelete, it) }
}

/**
 *  Declare a queue with config options
 * @see com.rabbitmq.client.Channel#queueDeclare(String, boolean, boolean, boolean, java.util.Map)
 */
suspend fun RabbitMQClient.queueDeclare(
  queue: String,
  durable: Boolean,
  exclusive: Boolean,
  autoDelete: Boolean,
  config: JsonObject
): JsonObject {
  return awaitResult { this.queueDeclare(queue, durable, exclusive, autoDelete, config, it) }
}

/**
 *  Delete a queue, without regard for whether it is in use or has messages on it
 * @see com.rabbitmq.client.Channel#queueDelete(String)
 */
suspend fun RabbitMQClient.queueDelete(queue: String): JsonObject {
  return awaitResult { this.queueDelete(queue, it) }
}

/**
 *  Delete a queue
 * @see com.rabbitmq.client.Channel#queueDelete(String, boolean, boolean)
 */
suspend fun RabbitMQClient.queueDeleteIf(
  queue: String,
  ifUnused: Boolean,
  ifEmpty: Boolean
): JsonObject {
  return awaitResult { this.queueDeleteIf(queue, ifUnused, ifEmpty, it) }
}

/**
 *  Bind a queue to an exchange
 * @see com.rabbitmq.client.Channel#queueBind(String, String, String)
 */
suspend fun RabbitMQClient.queueBind(
  queue: String,
  exchange: String,
  routingKey: String
) {
  awaitResult<Void?> { this.queueBind(queue, exchange, routingKey, it) }
}

/**
 *  Returns the number of messages in a queue ready to be delivered.
 * @see com.rabbitmq.client.Channel#messageCount(String)
 */
suspend fun RabbitMQClient.messageCount(queue: String): Long {
  return awaitResult { this.messageCount(queue, it) }
}

/**
 *  Start the rabbitMQ client. Create the connection and the chanel.
 * @see com.rabbitmq.client.Connection#createChannel()
 */
suspend fun RabbitMQClient.start() {
  awaitResult<Void?> { this.start(it) }
}

/**
 *  Stop the rabbitMQ client. Close the connection and its chanel.
 * @see com.rabbitmq.client.Connection#close()
 */
suspend fun RabbitMQClient.stop() {
  awaitResult<Void?> { this.stop(it) }
}
