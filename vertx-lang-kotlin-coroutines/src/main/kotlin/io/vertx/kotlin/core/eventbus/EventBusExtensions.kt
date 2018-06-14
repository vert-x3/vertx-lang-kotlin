package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.DeliveryOptions
import io.vertx.core.eventbus.EventBus
import io.vertx.core.eventbus.Message
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any
import kotlin.String

/**
 *  Like [EventBus.send] but specifying a `replyHandler` that will be called if the recipient
 *  subsequently replies to the message.
 * @param address  the address to send it to
 * @param message  the message, may be `null`
 * @return a reference to this, so the API can be used fluently
 */
suspend fun <T : Any> EventBus.sendSuspending(address: String, message: Any): Message<T> {
  return awaitResult { this.send(address, message, it) }
}

/**
 *  Like [EventBus.send] but specifying a `replyHandler` that will be called if the recipient
 *  subsequently replies to the message.
 * @param address  the address to send it to
 * @param message  the message, may be `null`
 * @param options  delivery options
 * @return a reference to this, so the API can be used fluently
 */
suspend fun <T : Any> EventBus.sendSuspending(
  address: String,
  message: Any,
  options: DeliveryOptions
): Message<T> {
  return awaitResult { this.send(address, message, options, it) }
}
