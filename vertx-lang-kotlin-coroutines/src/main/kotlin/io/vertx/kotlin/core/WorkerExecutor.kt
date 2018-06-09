package io.vertx.kotlin.core

import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.core.WorkerExecutor
import io.vertx.kotlin.coroutines.awaitResult

suspend fun <T> WorkerExecutor.executeBlockingAwait(blockingCodeHandler : Handler<Future<T>>, ordered : Boolean) : T {
    return awaitResult{
        this.executeBlocking(blockingCodeHandler, ordered, it)
    }
}

suspend fun <T> WorkerExecutor.executeBlockingAwait(blockingCodeHandler : Handler<Future<T>>) : T {
    return awaitResult{
        this.executeBlocking(blockingCodeHandler, it)
    }
}

