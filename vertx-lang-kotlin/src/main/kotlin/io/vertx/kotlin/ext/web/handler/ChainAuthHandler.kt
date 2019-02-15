package io.vertx.kotlin.ext.web.handler

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.User
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.handler.ChainAuthHandler
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.web.handler.ChainAuthHandler.parseCredentials]
 *
 * @param context the routing context
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.handler.ChainAuthHandler] using Vert.x codegen.
 */
suspend fun ChainAuthHandler.parseCredentialsAwait(context: RoutingContext): JsonObject {
  return awaitResult {
    this.parseCredentials(context, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.handler.ChainAuthHandler.authorize]
 *
 * @param user a user.
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.handler.ChainAuthHandler] using Vert.x codegen.
 */
suspend fun ChainAuthHandler.authorizeAwait(user: User): Unit {
  return awaitResult {
    this.authorize(user) { ar -> it.handle(ar.mapEmpty()) }
  }
}

