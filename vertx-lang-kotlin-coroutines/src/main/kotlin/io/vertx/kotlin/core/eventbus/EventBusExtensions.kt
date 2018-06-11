package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.DeliveryOptions
import io.vertx.core.eventbus.EventBus
import io.vertx.core.eventbus.Message
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any
import kotlin.String

suspend fun <T : Any> EventBus.send(address: String, message: Any): Message<T> {
  return awaitResult { this.send(address, message, it) }
}

suspend fun <T : Any> EventBus.send(
  address: String,
  message: Any,
  options: DeliveryOptions
): Message<T> {
  return awaitResult { this.send(address, message, options, it) }
}
