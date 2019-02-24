package io.vertx.kotlin.rabbitmq

import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.rabbitmq.RabbitMQConsumer
import io.vertx.rabbitmq.RabbitMQMessage

/**
 * Pipe this <code>ReadStream</code> to the <code>WriteStream</code>.
 * <p>
 * Elements emitted by this stream will be written to the write stream until this stream ends or fails.
 * <p>
 * Once this stream has ended or failed, the write stream will be ended and the <code>handler</code> will be
 * called with the result.
 *
 * @param dst the destination write stream
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQConsumer original] using Vert.x codegen.
 */
suspend fun RabbitMQConsumer.pipeToAwait(dst : WriteStream<RabbitMQMessage>) : Unit {
  return awaitResult{
    this.pipeTo(dst, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Stop message consumption from a queue.
 * <p>
 * The operation is asynchronous. When consumption will be stopped, you can by notified via [io.vertx.rabbitmq.RabbitMQConsumer]
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.rabbitmq.RabbitMQConsumer original] using Vert.x codegen.
 */
suspend fun RabbitMQConsumer.cancelAwait() : Unit {
  return awaitResult{
    this.cancel({ ar -> it.handle(ar.mapEmpty()) })}
}

