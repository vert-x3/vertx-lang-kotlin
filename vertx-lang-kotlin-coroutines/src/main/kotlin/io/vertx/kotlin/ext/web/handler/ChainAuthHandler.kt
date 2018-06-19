package io.vertx.kotlin.ext.web.handler

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.User
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.handler.ChainAuthHandler
import io.vertx.kotlin.coroutines.awaitResult

suspend fun ChainAuthHandler.parseCredentialsAwait(context : RoutingContext) : JsonObject? {
    return awaitResult{
        this.parseCredentials(context, it)
    }
}

suspend fun ChainAuthHandler.authorizeAwait(user : User) : Void? {
    return awaitResult{
        this.authorize(user, it)
    }
}

