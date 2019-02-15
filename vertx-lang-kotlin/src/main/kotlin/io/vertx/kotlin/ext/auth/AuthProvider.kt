package io.vertx.kotlin.ext.auth

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.AuthProvider
import io.vertx.ext.auth.User
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.auth.AuthProvider.authenticate]
 *
 * @param authInfo The auth information
 * @return [User]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.AuthProvider] using Vert.x codegen.
 */
suspend fun AuthProvider.authenticateAwait(authInfo: JsonObject): User {
  return awaitResult {
    this.authenticate(authInfo, it)
  }
}

