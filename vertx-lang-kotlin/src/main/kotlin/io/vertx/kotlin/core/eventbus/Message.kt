package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.DeliveryOptions
import io.vertx.core.eventbus.Message
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.eventbus.Message.reply]
 *
 * @param message the message to reply with.
 * @return [Message<R>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.eventbus.Message] using Vert.x codegen.
 */
suspend fun <R,T> Message<T>.replyAwait(message: Any): Message<R> {
  return awaitResult {
    this.reply(message, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.eventbus.Message.reply]
 *
 * @param message the reply message
 * @param options the delivery options
 * @return [Message<R>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.eventbus.Message] using Vert.x codegen.
 */
suspend fun <R,T> Message<T>.replyAwait(message: Any, options: DeliveryOptions): Message<R> {
  return awaitResult {
    this.reply(message, options, it)
  }
}

