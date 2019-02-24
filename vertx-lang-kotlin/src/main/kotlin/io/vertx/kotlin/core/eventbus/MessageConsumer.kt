package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.Message
import io.vertx.core.eventbus.MessageConsumer
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

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
 * NOTE: This function has been automatically generated from the [io.vertx.core.eventbus.MessageConsumer original] using Vert.x codegen.
 */
suspend fun <T> MessageConsumer<T>.pipeToAwait(dst : WriteStream<Message<T>>) : Unit {
  return awaitResult{
    this.pipeTo(dst, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Optional method which can be called to indicate when the registration has been propagated across the cluster.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.eventbus.MessageConsumer original] using Vert.x codegen.
 */
suspend fun <T> MessageConsumer<T>.completionHandlerAwait() : Unit {
  return awaitResult{
    this.completionHandler({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Unregisters the handler which created this registration
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.eventbus.MessageConsumer original] using Vert.x codegen.
 */
suspend fun <T> MessageConsumer<T>.unregisterAwait() : Unit {
  return awaitResult{
    this.unregister({ ar -> it.handle(ar.mapEmpty()) })}
}

