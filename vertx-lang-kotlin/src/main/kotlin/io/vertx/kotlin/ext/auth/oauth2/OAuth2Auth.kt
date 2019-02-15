package io.vertx.kotlin.ext.auth.oauth2

import io.vertx.ext.auth.oauth2.AccessToken
import io.vertx.ext.auth.oauth2.OAuth2Auth
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.OAuth2Auth.introspectToken]
 *
 * @param token the access token (base64 string)
 * @return [AccessToken]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.OAuth2Auth] using Vert.x codegen.
 */
suspend fun OAuth2Auth.introspectTokenAwait(token: String): AccessToken {
  return awaitResult {
    this.introspectToken(token, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.OAuth2Auth.introspectToken]
 *
 * @param token the access token (base64 string)
 * @param tokenType hint to the token type e.g.: `access_token`
 * @return [AccessToken]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.OAuth2Auth] using Vert.x codegen.
 */
suspend fun OAuth2Auth.introspectTokenAwait(token: String, tokenType: String): AccessToken {
  return awaitResult {
    this.introspectToken(token, tokenType, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.OAuth2Auth.loadJWK]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.OAuth2Auth] using Vert.x codegen.
 */
suspend fun OAuth2Auth.loadJWKAwait(): Unit {
  return awaitResult {
    this.loadJWK { ar -> it.handle(ar.mapEmpty()) }
  }
}

