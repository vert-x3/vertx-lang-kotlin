package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.TestCompletion
import io.vertx.kotlin.coroutines.awaitResult

suspend fun TestCompletion.handlerAwait() : Void? {
    return awaitResult{
        this.handler(it)
    }
}

