package io.vertx.kotlin.rabbitmq

import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.rabbitmq.QueueOptions
import io.vertx.rabbitmq.RabbitMQClient
import io.vertx.rabbitmq.RabbitMQConsumer

/**
 * Acknowledge one or several received messages. Supply the deliveryTag from the AMQP.Basic.GetOk or AMQP.Basic.Deliver
 * method containing the received message being acknowledged.
 *
 * @param deliveryTag 
 * @param multiple 
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicAckAwait(deliveryTag : Long, multiple : Boolean) : JsonObject {
  return awaitResult{
    this.basicAck(deliveryTag, multiple, it)
  }
}

/**
 * Reject one or several received messages.
 *
 * @param deliveryTag 
 * @param multiple 
 * @param requeue 
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicNackAwait(deliveryTag : Long, multiple : Boolean, requeue : Boolean) : JsonObject {
  return awaitResult{
    this.basicNack(deliveryTag, multiple, requeue, it)
  }
}

/**
 * Retrieve a message from a queue using AMQP.Basic.Get
 *
 * @param queue 
 * @param autoAck 
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicGetAwait(queue : String, autoAck : Boolean) : JsonObject {
  return awaitResult{
    this.basicGet(queue, autoAck, it)
  }
}

/**
 *
 * @param queue 
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicConsumerAwait(queue : String) : RabbitMQConsumer {
  return awaitResult{
    this.basicConsumer(queue, it)
  }
}

/**
 * Create a consumer with the given <code>options</code>.
 *
 * @param queue the name of a queue
 * @param options options for queue
 * @param resultHandler a handler through which you can find out the operation status; if the operation succeeds you can begin to receive messages through an instance of [io.vertx.rabbitmq.RabbitMQConsumer]
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicConsumerAwait(queue : String, options : QueueOptions) : RabbitMQConsumer {
  return awaitResult{
    this.basicConsumer(queue, options, it)
  }
}

/**
 * Publish a message. Publishing to a non-existent exchange will result in a channel-level protocol exception,
 * which closes the channel. Invocations of Channel#basicPublish will eventually block if a resource-driven alarm is in effect.
 *
 * @param exchange 
 * @param routingKey 
 * @param message 
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicPublishAwait(exchange : String, routingKey : String, message : JsonObject) : Unit {
  return awaitResult{
    this.basicPublish(exchange, routingKey, message, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Enables publisher acknowledgements on this channel. Can be called once during client initialisation. Calls to basicPublish()
 * will have to be confirmed.
 *
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.confirmSelectAwait() : Unit {
  return awaitResult{
    this.confirmSelect({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Wait until all messages published since the last call have been either ack'd or nack'd by the broker.
 * This will incur slight performance loss at the expense of higher write consistency.
 * If desired, multiple calls to basicPublish() can be batched before confirming.
 *
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.waitForConfirmsAwait() : Unit {
  return awaitResult{
    this.waitForConfirms({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Wait until all messages published since the last call have been either ack'd or nack'd by the broker; or until timeout elapses. If the timeout expires a TimeoutException is thrown.
 *
 * @param timeout 
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.waitForConfirmsAwait(timeout : Long) : Unit {
  return awaitResult{
    this.waitForConfirms(timeout, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Request a specific prefetchCount "quality of service" settings
 * for this channel.
 *
 * @param prefetchCount maximum number of messages that the server will deliver, 0 if unlimited
 * @param resultHandler handler called when operation is done with a result of the operation
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicQosAwait(prefetchCount : Int) : Unit {
  return awaitResult{
    this.basicQos(prefetchCount, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Request a specific prefetchCount "quality of service" settings
 * for this channel.
 *
 * @param prefetchCount maximum number of messages that the server will deliver, 0 if unlimited
 * @param global true if the settings should be applied to the entire channel rather than each consumer
 * @param resultHandler handler called when operation is done with a result of the operation
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicQosAwait(prefetchCount : Int, global : Boolean) : Unit {
  return awaitResult{
    this.basicQos(prefetchCount, global, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Request specific "quality of service" settings.
 *
 * These settings impose limits on the amount of data the server
 * will deliver to consumers before requiring acknowledgements.
 * Thus they provide a means of consumer-initiated flow control.
 *
 * @param prefetchSize maximum amount of content (measured in octets) that the server will deliver, 0 if unlimited
 * @param prefetchCount maximum number of messages that the server will deliver, 0 if unlimited
 * @param global true if the settings should be applied to the entire channel rather than each consumer
 * @param resultHandler handler called when operation is done with a result of the operation
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.basicQosAwait(prefetchSize : Int, prefetchCount : Int, global : Boolean) : Unit {
  return awaitResult{
    this.basicQos(prefetchSize, prefetchCount, global, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Declare an exchange.
 *
 * @param exchange 
 * @param type 
 * @param durable 
 * @param autoDelete 
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.exchangeDeclareAwait(exchange : String, type : String, durable : Boolean, autoDelete : Boolean) : Unit {
  return awaitResult{
    this.exchangeDeclare(exchange, type, durable, autoDelete, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Declare an exchange with additional parameters such as dead lettering, an alternate exchange or TTL.
 *
 * @param exchange 
 * @param type 
 * @param durable 
 * @param autoDelete 
 * @param config 
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.exchangeDeclareAwait(exchange : String, type : String, durable : Boolean, autoDelete : Boolean, config : JsonObject) : Unit {
  return awaitResult{
    this.exchangeDeclare(exchange, type, durable, autoDelete, config, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Delete an exchange, without regard for whether it is in use or not.
 *
 * @param exchange 
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.exchangeDeleteAwait(exchange : String) : Unit {
  return awaitResult{
    this.exchangeDelete(exchange, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Bind an exchange to an exchange.
 *
 * @param destination 
 * @param source 
 * @param routingKey 
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.exchangeBindAwait(destination : String, source : String, routingKey : String) : Unit {
  return awaitResult{
    this.exchangeBind(destination, source, routingKey, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Unbind an exchange from an exchange.
 *
 * @param destination 
 * @param source 
 * @param routingKey 
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.exchangeUnbindAwait(destination : String, source : String, routingKey : String) : Unit {
  return awaitResult{
    this.exchangeUnbind(destination, source, routingKey, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Actively declare a server-named exclusive, autodelete, non-durable queue.
 *
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueDeclareAutoAwait() : JsonObject {
  return awaitResult{
    this.queueDeclareAuto(it)
  }
}

/**
 * Declare a queue
 *
 * @param queue 
 * @param durable 
 * @param exclusive 
 * @param autoDelete 
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueDeclareAwait(queue : String, durable : Boolean, exclusive : Boolean, autoDelete : Boolean) : JsonObject {
  return awaitResult{
    this.queueDeclare(queue, durable, exclusive, autoDelete, it)
  }
}

/**
 * Declare a queue with config options
 *
 * @param queue 
 * @param durable 
 * @param exclusive 
 * @param autoDelete 
 * @param config 
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueDeclareAwait(queue : String, durable : Boolean, exclusive : Boolean, autoDelete : Boolean, config : JsonObject) : JsonObject {
  return awaitResult{
    this.queueDeclare(queue, durable, exclusive, autoDelete, config, it)
  }
}

/**
 * Delete a queue, without regard for whether it is in use or has messages on it
 *
 * @param queue 
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueDeleteAwait(queue : String) : JsonObject {
  return awaitResult{
    this.queueDelete(queue, it)
  }
}

/**
 * Delete a queue
 *
 * @param queue 
 * @param ifUnused 
 * @param ifEmpty 
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueDeleteIfAwait(queue : String, ifUnused : Boolean, ifEmpty : Boolean) : JsonObject {
  return awaitResult{
    this.queueDeleteIf(queue, ifUnused, ifEmpty, it)
  }
}

/**
 * Bind a queue to an exchange
 *
 * @param queue 
 * @param exchange 
 * @param routingKey 
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.queueBindAwait(queue : String, exchange : String, routingKey : String) : Unit {
  return awaitResult{
    this.queueBind(queue, exchange, routingKey, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Returns the number of messages in a queue ready to be delivered.
 *
 * @param queue 
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.messageCountAwait(queue : String) : Long {
  return awaitResult{
    this.messageCount(queue, it)
  }
}

/**
 * Start the rabbitMQ client. Create the connection and the chanel.
 *
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.startAwait() : Unit {
  return awaitResult{
    this.start({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Stop the rabbitMQ client. Close the connection and its chanel.
 *
 * @param resultHandler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQClient original] using Vert.x codegen.
 */
suspend fun RabbitMQClient.stopAwait() : Unit {
  return awaitResult{
    this.stop({ ar -> it.handle(ar.mapEmpty()) })}
}

