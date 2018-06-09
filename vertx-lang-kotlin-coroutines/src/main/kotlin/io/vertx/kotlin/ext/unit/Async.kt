package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.Async
import io.vertx.kotlin.coroutines.awaitResult
import java.lang.Void

suspend fun Async.handlerAwait() : Void? {
    return awaitResult{
        this.handler(it)
    }
}

