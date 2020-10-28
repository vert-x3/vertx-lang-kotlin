package io.vertx.kotlin.coroutines

import io.vertx.core.AsyncResult
import io.vertx.core.eventbus.Message
import io.vertx.core.eventbus.MessageConsumer
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


abstract class CoroutineMessageConsumer<T>(consumer: MessageConsumer<T>) : MessageConsumer<T> by consumer {
  abstract fun handler(function: suspend (Message<T>) -> Unit): CoroutineMessageConsumer<T>
  abstract fun completionHandler(function: suspend (AsyncResult<Void>) -> Unit)
  abstract fun exceptionHandler(function: suspend (Throwable) -> Unit): CoroutineMessageConsumer<T>
}

class CoroutineMessageConsumerImpl<T>(private val scope: CoroutineScope,
                                      private val consumer: MessageConsumer<T>) : CoroutineMessageConsumer<T>(consumer) {
  override fun handler(function: suspend (Message<T>) -> Unit) = apply {
    consumer.handler { message ->
      scope.launch {
        function(message)
      }
    }
  }

  override fun completionHandler(function: suspend (AsyncResult<Void>) -> Unit) {
    consumer.completionHandler { result ->
      scope.launch {
        function(result)
      }
    }
  }

  override fun exceptionHandler(function: suspend (Throwable) -> Unit) = apply {
    consumer.exceptionHandler { exception ->
      scope.launch {
        function(exception)
      }
    }
  }
}
