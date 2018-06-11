package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.DeliveryOptions
import io.vertx.core.eventbus.Message
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any

suspend fun <T : Any, R : Any> Message<T>.reply(message: Any): Message<R> {
  return awaitResult { this.reply(message, it) }
}

suspend fun <T : Any, R : Any> Message<T>.reply(message: Any, options: DeliveryOptions): Message<R> {
  return awaitResult { this.reply(message, options, it) }
}
