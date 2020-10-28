package io.vertx.kotlin.coroutines

import io.vertx.core.Vertx
import io.vertx.core.eventbus.EventBus
import io.vertx.core.eventbus.Message
import io.vertx.core.eventbus.MessageConsumer
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


fun Vertx.coEventBus(): CoroutineEventBus {
  return CoroutineEventBusImpl(this)
}

abstract class CoroutineEventBus(protected val eventBus: EventBus) : EventBus by eventBus {
  abstract fun <T> consumer(address: String, function: suspend (Message<T>) -> Unit): MessageConsumer<T>
}

class CoroutineEventBusImpl(vertx: Vertx) : CoroutineEventBus(vertx.eventBus()) {

  private val scope = CoroutineScope(vertx.dispatcher())

  override fun <T> consumer(address: String, function: suspend (Message<T>) -> Unit): MessageConsumer<T> {
    return eventBus.consumer(address) {
      scope.launch {
        function(it)
      }
    }
  }
}
