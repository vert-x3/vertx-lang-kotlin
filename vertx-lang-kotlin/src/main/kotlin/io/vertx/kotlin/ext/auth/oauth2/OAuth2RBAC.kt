package io.vertx.kotlin.ext.auth.oauth2

import io.vertx.ext.auth.oauth2.AccessToken
import io.vertx.ext.auth.oauth2.OAuth2RBAC
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.OAuth2RBAC.isAuthorized]
 *
 * @param user the given user to assert on
 * @param authority the authority to lookup
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.OAuth2RBAC] using Vert.x codegen.
 */
suspend fun OAuth2RBAC.isAuthorizedAwait(user: AccessToken, authority: String): Boolean {
  return awaitResult {
    this.isAuthorized(user, authority, it)
  }
}

