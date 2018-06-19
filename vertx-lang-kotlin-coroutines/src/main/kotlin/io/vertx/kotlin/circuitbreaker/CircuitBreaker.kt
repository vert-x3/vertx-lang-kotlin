package io.vertx.kotlin.circuitbreaker

import io.vertx.circuitbreaker.CircuitBreaker
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import java.util.function.Function

suspend fun CircuitBreaker.openHandlerAwait() : Void? {
    return awaitEvent{
        this.openHandler(it)
    }
}

suspend fun CircuitBreaker.halfOpenHandlerAwait() : Void? {
    return awaitEvent{
        this.halfOpenHandler(it)
    }
}

suspend fun CircuitBreaker.closeHandlerAwait() : Void? {
    return awaitEvent{
        this.closeHandler(it)
    }
}

suspend fun <T> CircuitBreaker.executeCommandWithFallbackAwait(command : Handler<Future<T>>, fallback : Function<Throwable,T>) : T? {
    return awaitResult{
        this.executeCommandWithFallback(command, fallback, it)
    }
}

suspend fun <T> CircuitBreaker.executeCommandAwait(command : Handler<Future<T>>) : T? {
    return awaitResult{
        this.executeCommand(command, it)
    }
}

suspend fun <T> CircuitBreaker.executeAndReportAwait(resultFuture : Future<T>) : Future<T>? {
    return awaitEvent{
        this.executeAndReport(resultFuture, it)
    }
}

