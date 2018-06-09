package io.vertx.kotlin.core

import io.vertx.core.Future
import io.vertx.kotlin.coroutines.awaitResult

suspend fun <T> Future<T>.setHandlerAwait() : T {
    return awaitResult{
        this.setHandler(it)
    }
}

