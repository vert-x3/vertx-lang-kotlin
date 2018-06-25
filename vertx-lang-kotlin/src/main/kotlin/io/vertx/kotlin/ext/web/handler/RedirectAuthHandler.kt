package io.vertx.kotlin.ext.web.handler

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.User
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.handler.RedirectAuthHandler
import io.vertx.kotlin.coroutines.awaitResult

suspend fun RedirectAuthHandler.parseCredentialsAwait(context : RoutingContext) : JsonObject {
    return awaitResult{
        this.parseCredentials(context, it)
    }
}

suspend fun RedirectAuthHandler.authorizeAwait(user : User) : Unit {
    return awaitResult{
        this.authorize(user, { ar -> it.handle(ar.mapEmpty()) })}
}

