package io.vertx.kotlin.ext.auth

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.AuthProvider
import io.vertx.ext.auth.User
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Authenticate a user.
 * <p>
 * The first argument is a JSON object containing information for authenticating the user. What this actually contains
 * depends on the specific implementation. In the case of a simple username/password based
 * authentication it is likely to contain a JSON object with the following structure:
 * <pre>
 *   {
 *     "username": "tim",
 *     "password": "mypassword"
 *   }
 * </pre>
 * For other types of authentication it contain different information - for example a JWT token or OAuth bearer token.
 * <p>
 * If the user is successfully authenticated a [io.vertx.ext.auth.User] object is passed to the handler in an [io.vertx.core.AsyncResult].
 * The user object can then be used for authorisation.
 *
 * @param authInfo The auth information
 * @param resultHandler The result handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.AuthProvider original] using Vert.x codegen.
 */
suspend fun AuthProvider.authenticateAwait(authInfo : JsonObject) : User {
  return awaitResult{
    this.authenticate(authInfo, it)
  }
}

