package io.vertx.kotlin.coroutines

import io.vertx.core.Vertx
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Set a periodic timer to fire every {@code delay} milliseconds, at which point a suspending function will be invoked
 *
 * @param delay  the delay in milliseconds, after which the timer will fire
 * @param handler  the handler that will be called with the timer ID when the timer fires
 * @return the unique ID of the timer
 */
fun Vertx.setPeriodicAwait(delay: Long, handler: suspend (Long) -> Unit): Long {
  val coroutineScope = CoroutineScope(Dispatchers.Default)
  return this.setPeriodic(delay) { timerId ->
    coroutineScope.launch {
      handler(timerId)
    }
  }
}
