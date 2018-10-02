package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.DeliveryOptions
import io.vertx.core.eventbus.Message
import io.vertx.kotlin.coroutines.awaitResult

/**
 * The same as <code>reply(R message)</code> but you can specify handler for the reply - i.e.
 * to receive the reply to the reply.
 *
 * @param message the message to reply with.
 * @param replyHandler the reply handler for the reply.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.eventbus.Message original] using Vert.x codegen.
 */
suspend fun <R,T> Message<T>.replyAwait(message : Any) : Message<R> {
  return awaitResult{
    this.reply(message, it)
  }
}

/**
 * The same as <code>reply(R message, DeliveryOptions)</code> but you can specify handler for the reply - i.e.
 * to receive the reply to the reply.
 *
 * @param message the reply message
 * @param options the delivery options
 * @param replyHandler the reply handler for the reply.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.eventbus.Message original] using Vert.x codegen.
 */
suspend fun <R,T> Message<T>.replyAwait(message : Any, options : DeliveryOptions) : Message<R> {
  return awaitResult{
    this.reply(message, options, it)
  }
}

