package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.MessageConsumer
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.eventbus.MessageConsumer.completionHandler]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.eventbus.MessageConsumer] using Vert.x codegen.
 */
suspend fun <T> MessageConsumer<T>.completionHandlerAwait(): Unit {
  return awaitResult {
    this.completionHandler { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.eventbus.MessageConsumer.unregister]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.eventbus.MessageConsumer] using Vert.x codegen.
 */
suspend fun <T> MessageConsumer<T>.unregisterAwait(): Unit {
  return awaitResult {
    this.unregister { ar -> it.handle(ar.mapEmpty()) }
  }
}

