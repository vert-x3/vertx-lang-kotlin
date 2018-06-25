package io.vertx.kotlin.ext.web

import io.vertx.ext.web.Route
import io.vertx.ext.web.RoutingContext
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun Route.handlerAwait() : RoutingContext {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun Route.blockingHandlerAwait() : RoutingContext {
    return awaitEvent{
        this.blockingHandler(it)
    }
}

suspend fun Route.failureHandlerAwait() : RoutingContext {
    return awaitEvent{
        this.failureHandler(it)
    }
}

