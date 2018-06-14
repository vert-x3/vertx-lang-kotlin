package io.vertx.kotlin.ext.auth.oauth2

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.oauth2.AccessToken
import io.vertx.ext.auth.oauth2.OAuth2Auth
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Deprecated
import kotlin.String

/**
 *  Returns the Access Token object.
 * @deprecated use [AuthProvider.authenticate] instead.
 * @param params - JSON with the options, each flow requires different options. */
@Deprecated("")
suspend fun OAuth2Auth.getToken(params: JsonObject): AccessToken {
  return awaitResult { this.getToken(params, it) }
}

/**
 *  Decode a token to a [AccessToken] object. This is useful to handle bearer JWT tokens.
 * @param token the access token (base64 string)
 * @return self
 */
suspend fun OAuth2Auth.decodeToken(token: String): AccessToken {
  return awaitResult { this.decodeToken(token, it) }
}

/**
 *  Query an OAuth 2.0 authorization server to determine the active state of an OAuth 2.0 token and to determine
 *  meta-information about this token.
 * @param token the access token (base64 string)
 * @return self
 */
suspend fun OAuth2Auth.introspectToken(token: String): AccessToken {
  return awaitResult { this.introspectToken(token, it) }
}

/**
 *  Query an OAuth 2.0 authorization server to determine the active state of an OAuth 2.0 token and to determine
 *  meta-information about this token.
 * @param token the access token (base64 string)
 * @param tokenType hint to the token type e.g.: `access_token`
 * @return self
 */
suspend fun OAuth2Auth.introspectToken(token: String, tokenType: String): AccessToken {
  return awaitResult { this.introspectToken(token, tokenType, it) }
}

/**
 *  Loads a JWK Set from the remote provider.
 *  When calling this method several times, the loaded JWKs are updated in the underlying JWT object.
 *
 */
suspend fun OAuth2Auth.loadJWK() {
  awaitResult<Void?> { this.loadJWK(it) }
}
