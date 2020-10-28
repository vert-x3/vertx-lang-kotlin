package io.vertx.kotlin.coroutines

import io.vertx.core.Vertx
import io.vertx.core.eventbus.EventBus
import io.vertx.core.eventbus.Message
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


fun Vertx.coEventBus(): CoroutineEventBus {
  return CoroutineEventBusImpl(this)
}

abstract class CoroutineEventBus(protected val eventBus: EventBus) : EventBus by eventBus {
  abstract fun <T> consumer(address: String, function: suspend (Message<T>) -> Unit): CoroutineMessageConsumer<T>
  abstract override fun <T> consumer(address: String): CoroutineMessageConsumer<T>
}

class CoroutineEventBusImpl(vertx: Vertx) : CoroutineEventBus(vertx.eventBus()) {

  private val scope = CoroutineScope(vertx.dispatcher())

  override fun <T> consumer(address: String): CoroutineMessageConsumer<T> {
    return CoroutineMessageConsumerImpl(scope, eventBus.consumer(address))
  }

  override fun <T> consumer(address: String, function: suspend (Message<T>) -> Unit): CoroutineMessageConsumer<T> {
    return CoroutineMessageConsumerImpl(scope, eventBus.consumer(address) {
      scope.launch {
        function(it)
      }
    })
  }
}
