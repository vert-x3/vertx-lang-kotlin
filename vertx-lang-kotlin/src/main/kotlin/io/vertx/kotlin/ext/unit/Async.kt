package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.Async
import io.vertx.kotlin.coroutines.awaitResult

suspend fun Async.handlerAwait() : Unit? {
    return awaitResult{
        this.handler({ ar -> it.handle(ar.mapEmpty()) })}
}

