package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.MessageConsumer
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any

/**
 *  Optional method which can be called to indicate when the registration has been propagated across the cluster. */
suspend fun <T : Any> MessageConsumer<T>.completionHandler() {
  awaitResult<Void?> { this.completionHandler(it) }
}

/**
 *  Unregisters the handler which created this registration */
suspend fun <T : Any> MessageConsumer<T>.unregisterSuspending() {
  awaitResult<Void?> { this.unregister(it) }
}
