package io.vertx.kotlin.ext.web

import io.vertx.ext.web.Router
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun Router.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

