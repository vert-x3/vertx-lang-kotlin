package io.vertx.kotlin.circuitbreaker

import io.vertx.circuitbreaker.CircuitBreaker
import io.vertx.core.Future
import io.vertx.kotlin.coroutines.awaitResult
import java.util.function.Function

/**
 * Suspending version of method [io.vertx.circuitbreaker.CircuitBreaker.executeCommandWithFallback]
 *
 * @param command the operation
 * @param fallback the fallback
 * @return [T]
 *
 * NOTE: This function has been automatically generated from [io.vertx.circuitbreaker.CircuitBreaker] using Vert.x codegen.
 */
suspend fun <T> CircuitBreaker.executeCommandWithFallbackAwait(command: (Future<T>) -> Unit, fallback: (Throwable) -> T): T {
  return awaitResult {
    this.executeCommandWithFallback(command, fallback, it::handle)
  }
}

/**
 * Suspending version of method [io.vertx.circuitbreaker.CircuitBreaker.executeCommand]
 *
 * @param command the operation
 * @return [T]
 *
 * NOTE: This function has been automatically generated from [io.vertx.circuitbreaker.CircuitBreaker] using Vert.x codegen.
 */
suspend fun <T> CircuitBreaker.executeCommandAwait(command: (Future<T>) -> Unit): T {
  return awaitResult {
    this.executeCommand(command, it::handle)
  }
}

