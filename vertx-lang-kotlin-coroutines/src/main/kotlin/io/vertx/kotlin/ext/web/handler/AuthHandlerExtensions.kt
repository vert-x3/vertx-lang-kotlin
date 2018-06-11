package io.vertx.kotlin.ext.web.handler

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.User
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.handler.AuthHandler
import io.vertx.kotlin.coroutines.awaitResult

suspend fun AuthHandler.parseCredentials(context: RoutingContext): JsonObject = awaitResult { this.parseCredentials(context, it) }

suspend fun AuthHandler.authorize(user: User) {
  awaitResult<Void?> { this.authorize(user, it) }
}
