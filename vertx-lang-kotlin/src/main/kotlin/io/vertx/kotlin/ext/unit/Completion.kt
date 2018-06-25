package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.Completion
import io.vertx.kotlin.coroutines.awaitResult

suspend fun <T> Completion<T>.handlerAwait() : T? {
    return awaitResult{
        this.handler(it)
    }
}

