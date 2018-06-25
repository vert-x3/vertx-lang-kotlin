package io.vertx.kotlin.ext.web.handler

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.User
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.handler.OAuth2AuthHandler
import io.vertx.kotlin.coroutines.awaitResult

suspend fun OAuth2AuthHandler.parseCredentialsAwait(context : RoutingContext) : JsonObject {
    return awaitResult{
        this.parseCredentials(context, it)
    }
}

suspend fun OAuth2AuthHandler.authorizeAwait(user : User) : Unit {
    return awaitResult{
        this.authorize(user, { ar -> it.handle(ar.mapEmpty()) })}
}

