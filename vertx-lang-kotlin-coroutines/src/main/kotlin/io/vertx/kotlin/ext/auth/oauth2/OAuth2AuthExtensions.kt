package io.vertx.kotlin.ext.auth.oauth2

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.oauth2.AccessToken
import io.vertx.ext.auth.oauth2.OAuth2Auth
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Deprecated
import kotlin.String

@Deprecated("")
suspend fun OAuth2Auth.getToken(params: JsonObject): AccessToken {
  return awaitResult { this.getToken(params, it) }
}

suspend fun OAuth2Auth.decodeToken(token: String): AccessToken {
  return awaitResult { this.decodeToken(token, it) }
}

suspend fun OAuth2Auth.introspectToken(token: String): AccessToken {
  return awaitResult { this.introspectToken(token, it) }
}

suspend fun OAuth2Auth.introspectToken(token: String, tokenType: String): AccessToken {
  return awaitResult { this.introspectToken(token, tokenType, it) }
}

suspend fun OAuth2Auth.loadJWK() {
  awaitResult<Void?> { this.loadJWK(it) }
}
