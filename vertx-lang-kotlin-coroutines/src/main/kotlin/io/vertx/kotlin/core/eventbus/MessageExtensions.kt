package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.DeliveryOptions
import io.vertx.core.eventbus.Message
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any

/**
 *  The same as `reply(R message)` but you can specify handler for the reply - i.e.
 *  to receive the reply to the reply.
 * @param message  the message to reply with. */
suspend fun <T : Any, R : Any> Message<T>.replySuspending(message: Any): Message<R> {
  return awaitResult { this.reply(message, it) }
}

/**
 *  The same as `reply(R message, DeliveryOptions)` but you can specify handler for the reply - i.e.
 *  to receive the reply to the reply.
 * @param message  the reply message
 * @param options  the delivery options */
suspend fun <T : Any, R : Any> Message<T>.replySuspending(message: Any, options: DeliveryOptions): Message<R> {
  return awaitResult { this.reply(message, options, it) }
}
