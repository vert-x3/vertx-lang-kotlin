package io.vertx.kotlin.ext.web.handler

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.User
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.handler.BasicAuthHandler
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Parses the credentials from the request into a JsonObject. The implementation should
 * be able to extract the required info for the auth provider in the format the provider
 * expects.
 *
 * @param context the routing context
 * @param handler the handler to be called once the information is available.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.BasicAuthHandler original] using Vert.x codegen.
 */
suspend fun BasicAuthHandler.parseCredentialsAwait(context : RoutingContext) : JsonObject {
  return awaitResult{
    this.parseCredentials(context, it)
  }
}

/**
 * Authorizes the given user against all added authorities.
 *
 * @param user a user.
 * @param handler the handler for the result.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.BasicAuthHandler original] using Vert.x codegen.
 */
suspend fun BasicAuthHandler.authorizeAwait(user : User) : Unit {
  return awaitResult{
    this.authorize(user, { ar -> it.handle(ar.mapEmpty()) })}
}

