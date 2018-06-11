package io.vertx.kotlin.circuitbreaker

import io.vertx.circuitbreaker.CircuitBreaker
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.kotlin.coroutines.awaitResult
import java.util.function.Function
import kotlin.Any
import kotlin.Throwable

suspend fun <T : Any> CircuitBreaker.executeCommandWithFallback(command: Handler<Future<T>>, fallback: Function<Throwable, T>): T = awaitResult { this.executeCommandWithFallback(command, fallback, it) }

suspend fun <T : Any> CircuitBreaker.executeCommand(command: Handler<Future<T>>): T = awaitResult { this.executeCommand(command, it) }
