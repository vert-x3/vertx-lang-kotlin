package io.vertx.kotlin.circuitbreaker

import io.vertx.circuitbreaker.CircuitBreaker
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.kotlin.coroutines.awaitResult
import java.util.function.Function
import kotlin.Any
import kotlin.Throwable

/**
 *  Same as [CircuitBreaker.executeWithFallback] but using a callback.
 * @param command  the operation
 * @param fallback the fallback
 * @param <T>      the type of result
 * @return a future object completed when the operation or its fallback completes
 */
suspend fun <T : Any> CircuitBreaker.executeCommandWithFallback(command: Handler<Future<T>>, fallback: Function<Throwable, T>): T {
  return awaitResult { this.executeCommandWithFallback(command, fallback, it) }
}

/**
 *  Same as [CircuitBreaker.executeWithFallback] but using the circuit breaker default fallback.
 * @param command the operation
 * @param <T>     the type of result
 * @return a future object completed when the operation or its fallback completes
 */
suspend fun <T : Any> CircuitBreaker.executeCommand(command: Handler<Future<T>>): T {
  return awaitResult { this.executeCommand(command, it) }
}
