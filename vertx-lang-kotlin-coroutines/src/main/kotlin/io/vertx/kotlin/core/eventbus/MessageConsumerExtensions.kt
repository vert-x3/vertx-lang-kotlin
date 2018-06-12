package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.MessageConsumer
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any

suspend fun <T : Any> MessageConsumer<T>.completionHandler() {
  awaitResult<Void?> { this.completionHandler(it) }
}

suspend fun <T : Any> MessageConsumer<T>.unregisterSuspending() {
  awaitResult<Void?> { this.unregister(it) }
}
