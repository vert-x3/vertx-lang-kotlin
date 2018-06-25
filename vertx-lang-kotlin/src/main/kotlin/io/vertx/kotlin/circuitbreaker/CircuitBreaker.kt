package io.vertx.kotlin.circuitbreaker

import io.vertx.circuitbreaker.CircuitBreaker
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import java.util.function.Function

suspend fun CircuitBreaker.openHandlerAwait() : Unit {
    return awaitEvent{
        this.openHandler({ v -> it.handle(null) })}
}

suspend fun CircuitBreaker.halfOpenHandlerAwait() : Unit {
    return awaitEvent{
        this.halfOpenHandler({ v -> it.handle(null) })}
}

suspend fun CircuitBreaker.closeHandlerAwait() : Unit {
    return awaitEvent{
        this.closeHandler({ v -> it.handle(null) })}
}

suspend fun <T> CircuitBreaker.executeCommandWithFallbackAwait(command : Handler<Future<T>>, fallback : Function<Throwable,T>) : T {
    return awaitResult{
        this.executeCommandWithFallback(command, fallback, it)
    }
}

suspend fun <T> CircuitBreaker.executeCommandAwait(command : Handler<Future<T>>) : T {
    return awaitResult{
        this.executeCommand(command, it)
    }
}

suspend fun <T> CircuitBreaker.executeAndReportAwait(resultFuture : Future<T>) : Future<T> {
    return awaitEvent{
        this.executeAndReport(resultFuture, it)
    }
}

