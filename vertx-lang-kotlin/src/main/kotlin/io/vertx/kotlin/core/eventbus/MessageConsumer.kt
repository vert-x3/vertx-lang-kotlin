package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.MessageConsumer
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Optional method which can be called to indicate when the registration has been propagated across the cluster.
 *
 * @param completionHandler the completion handler
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
 * @param completionHandler the handler called when the unregister is done. For example in a cluster when all nodes of the event bus have been unregistered.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.eventbus.MessageConsumer original] using Vert.x codegen.
 */
suspend fun <T> MessageConsumer<T>.unregisterAwait() : Unit {
  return awaitResult{
    this.unregister({ ar -> it.handle(ar.mapEmpty()) })}
}

