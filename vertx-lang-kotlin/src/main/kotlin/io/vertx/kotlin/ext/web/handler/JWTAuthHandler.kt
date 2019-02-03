package io.vertx.kotlin.ext.web.handler

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.User
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.handler.JWTAuthHandler
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.web.handler.JWTAuthHandler.parseCredentials]
 *
 * @param context the routing context
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.handler.JWTAuthHandler] using Vert.x codegen.
 */
suspend fun JWTAuthHandler.parseCredentialsAwait(context: RoutingContext): JsonObject {
  return awaitResult {
    this.parseCredentials(context, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.handler.JWTAuthHandler.authorize]
 *
 * @param user a user.
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.handler.JWTAuthHandler] using Vert.x codegen.
 */
suspend fun JWTAuthHandler.authorizeAwait(user: User): Unit {
  return awaitResult {
    this.authorize(user) { ar -> it.handle(ar.mapEmpty()) }
  }
}

