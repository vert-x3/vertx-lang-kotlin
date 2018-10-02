package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.DeliveryOptions
import io.vertx.core.eventbus.EventBus
import io.vertx.core.eventbus.Message
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Like [io.vertx.core.eventbus.EventBus] but specifying a <code>replyHandler</code> that will be called if the recipient
 * subsequently replies to the message.
 *
 * @param address the address to send it to
 * @param message the message, may be <code>null</code>
 * @param replyHandler reply handler will be called when any reply from the recipient is received, may be <code>null</code>
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.eventbus.EventBus original] using Vert.x codegen.
 */
suspend fun <T> EventBus.sendAwait(address : String, message : Any) : Message<T> {
  return awaitResult{
    this.send(address, message, it)
  }
}

/**
 * Like [io.vertx.core.eventbus.EventBus] but specifying a <code>replyHandler</code> that will be called if the recipient
 * subsequently replies to the message.
 *
 * @param address the address to send it to
 * @param message the message, may be <code>null</code>
 * @param options delivery options
 * @param replyHandler reply handler will be called when any reply from the recipient is received, may be <code>null</code>
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.eventbus.EventBus original] using Vert.x codegen.
 */
suspend fun <T> EventBus.sendAwait(address : String, message : Any, options : DeliveryOptions) : Message<T> {
  return awaitResult{
    this.send(address, message, options, it)
  }
}

