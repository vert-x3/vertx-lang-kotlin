package io.vertx.kotlin.ext.web.handler

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.User
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.handler.RedirectAuthHandler
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.web.handler.RedirectAuthHandler.parseCredentials]
 *
 * @param context the routing context
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.handler.RedirectAuthHandler] using Vert.x codegen.
 */
suspend fun RedirectAuthHandler.parseCredentialsAwait(context: RoutingContext): JsonObject {
  return awaitResult {
    this.parseCredentials(context, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.handler.RedirectAuthHandler.authorize]
 *
 * @param user a user.
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.handler.RedirectAuthHandler] using Vert.x codegen.
 */
suspend fun RedirectAuthHandler.authorizeAwait(user: User): Unit {
  return awaitResult {
    this.authorize(user) { ar -> it.handle(ar.mapEmpty()) }
  }
}

