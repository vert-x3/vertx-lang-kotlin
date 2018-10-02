package io.vertx.kotlin.ext.auth.oauth2

import io.vertx.ext.auth.oauth2.AccessToken
import io.vertx.ext.auth.oauth2.OAuth2Auth
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Query an OAuth 2.0 authorization server to determine the active state of an OAuth 2.0 token and to determine
 * meta-information about this token.
 *
 * @param token the access token (base64 string)
 * @param handler A handler to receive the event
 * @returnself *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.OAuth2Auth original] using Vert.x codegen.
 */
suspend fun OAuth2Auth.introspectTokenAwait(token : String) : AccessToken {
  return awaitResult{
    this.introspectToken(token, it)
  }
}

/**
 * Query an OAuth 2.0 authorization server to determine the active state of an OAuth 2.0 token and to determine
 * meta-information about this token.
 *
 * @param token the access token (base64 string)
 * @param tokenType hint to the token type e.g.: `access_token`
 * @param handler A handler to receive the event
 * @returnself *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.OAuth2Auth original] using Vert.x codegen.
 */
suspend fun OAuth2Auth.introspectTokenAwait(token : String, tokenType : String) : AccessToken {
  return awaitResult{
    this.introspectToken(token, tokenType, it)
  }
}

/**
 * Loads a JWK Set from the remote provider.
 *
 * When calling this method several times, the loaded JWKs are updated in the underlying JWT object.
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.OAuth2Auth original] using Vert.x codegen.
 */
suspend fun OAuth2Auth.loadJWKAwait() : Unit {
  return awaitResult{
    this.loadJWK({ ar -> it.handle(ar.mapEmpty()) })}
}

