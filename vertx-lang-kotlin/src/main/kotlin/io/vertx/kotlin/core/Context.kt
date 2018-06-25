package io.vertx.kotlin.core

import io.vertx.core.Context
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun Context.runOnContextAwait() : Unit {
    return awaitEvent{
        this.runOnContext({ v -> it.handle(null) })}
}

suspend fun <T> Context.executeBlockingAwait(blockingCodeHandler : Handler<Future<T>>, ordered : Boolean) : T {
    return awaitResult{
        this.executeBlocking(blockingCodeHandler, ordered, it)
    }
}

suspend fun <T> Context.executeBlockingAwait(blockingCodeHandler : Handler<Future<T>>) : T {
    return awaitResult{
        this.executeBlocking(blockingCodeHandler, it)
    }
}

suspend fun Context.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

