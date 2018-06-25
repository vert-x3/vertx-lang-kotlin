package io.vertx.kotlin.ext.web.handler

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.User
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.handler.BasicAuthHandler
import io.vertx.kotlin.coroutines.awaitResult

suspend fun BasicAuthHandler.parseCredentialsAwait(context : RoutingContext) : JsonObject {
    return awaitResult{
        this.parseCredentials(context, it)
    }
}

suspend fun BasicAuthHandler.authorizeAwait(user : User) : Unit {
    return awaitResult{
        this.authorize(user, { ar -> it.handle(ar.mapEmpty()) })}
}

