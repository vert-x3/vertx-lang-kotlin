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
 * @param handler the completion handler receiving either the operation result or the fallback result. The parameter is an  because if the fallback is not called, the error is passed to the handler.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.circuitbreaker.CircuitBreaker original] using Vert.x codegen.
 */
suspend fun <T> CircuitBreaker.executeCommandWithFallbackAwait(command : Handler<Future<T>>, fallback : Function<Throwable,T>) : T {
  return awaitResult{
    this.executeCommandWithFallback(command, fallback, it)
  }
}

/**
 * Same as [io.vertx.circuitbreaker.CircuitBreaker] but using the circuit breaker default fallback.
 *
 * @param command the operation
 * @param handler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.circuitbreaker.CircuitBreaker original] using Vert.x codegen.
 */
suspend fun <T> CircuitBreaker.executeCommandAwait(command : Handler<Future<T>>) : T {
  return awaitResult{
    this.executeCommand(command, it)
  }
}

