package io.vertx.kotlin.circuitbreaker

import io.vertx.circuitbreaker.CircuitBreaker
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.kotlin.coroutines.awaitResult
import java.util.function.Function

/**
 * Same as [io.vertx.circuitbreaker.CircuitBreaker] but using a callback.
 *
 * @param command the operation
 * @param fallback the fallback
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.circuitbreaker.CircuitBreaker original] using Vert.x codegen.
 */
suspend fun <T> CircuitBreaker.executeCommandWithFallbackAwait(command : (Future<T>) -> Unit, fallback : (Throwable) -> T) : T {
  return awaitResult{
    this.executeCommandWithFallback(command, fallback, it::handle)
  }
}

/**
 * Same as [io.vertx.circuitbreaker.CircuitBreaker] but using the circuit breaker default fallback.
 *
 * @param command the operation
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.circuitbreaker.CircuitBreaker original] using Vert.x codegen.
 */
suspend fun <T> CircuitBreaker.executeCommandAwait(command : (Future<T>) -> Unit) : T {
  return awaitResult{
    this.executeCommand(command, it::handle)
  }
}

