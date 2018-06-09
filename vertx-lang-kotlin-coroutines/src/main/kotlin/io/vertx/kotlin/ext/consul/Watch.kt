package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Watch
import io.vertx.ext.consul.WatchResult
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun <T> Watch<T>.setHandlerAwait() : WatchResult<T> {
    return awaitEvent{
        this.setHandler(it)
    }
}

