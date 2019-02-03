package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.DeliveryOptions
import io.vertx.core.eventbus.EventBus
import io.vertx.core.eventbus.Message
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.eventbus.EventBus.send]
 *
 * @param address the address to send it to
 * @param message the message, may be <code>null</code>
 * @return [Message<T>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.eventbus.EventBus] using Vert.x codegen.
 */
suspend fun <T> EventBus.sendAwait(address: String, message: Any): Message<T> {
  return awaitResult {
    this.send(address, message, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.eventbus.EventBus.send]
 *
 * @param address the address to send it to
 * @param message the message, may be <code>null</code>
 * @param options delivery options
 * @return [Message<T>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.eventbus.EventBus] using Vert.x codegen.
 */
suspend fun <T> EventBus.sendAwait(address: String, message: Any, options: DeliveryOptions): Message<T> {
  return awaitResult {
    this.send(address, message, options, it)
  }
}

