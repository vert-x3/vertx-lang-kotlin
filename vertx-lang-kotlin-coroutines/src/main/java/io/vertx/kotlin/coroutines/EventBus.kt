package io.vertx.kotlin.coroutines

import io.vertx.core.eventbus.EventBus
import io.vertx.core.eventbus.Message
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun <T> EventBus.consumerAwait(address: String, function: suspend (Message<T>) -> Unit) {
  // Ideally we'd like to use here vertx.dispatcher(). But currently, it's not available on the EventBus
  // There are a few ways to deal with that:
  // 1. Pass a reference to Vertx on EventBus
  // 2. Pass Vertx as a first argument to this extension method
  // 3. Wrap EventBus instead of a single method
  val scope = GlobalScope
  this.consumer<T>(address) { message ->
    scope.launch {
      function(message)
    }
  }
}
