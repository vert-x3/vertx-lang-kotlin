package io.vertx.kotlin.ext.auth.oauth2

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.HttpMethod
import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.oauth2.AccessToken
import io.vertx.ext.auth.oauth2.OAuth2Response
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.String

suspend fun AccessToken.refresh() {
  awaitResult<Void?> { this.refresh(it) }
}

suspend fun AccessToken.revoke(token_type: String) {
  awaitResult<Void?> { this.revoke(token_type, it) }
}

suspend fun AccessToken.logout() {
  awaitResult<Void?> { this.logout(it) }
}

suspend fun AccessToken.introspect() {
  awaitResult<Void?> { this.introspect(it) }
}

suspend fun AccessToken.introspect(tokenType: String) {
  awaitResult<Void?> { this.introspect(tokenType, it) }
}

suspend fun AccessToken.userInfo(): JsonObject = awaitResult { this.userInfo(it) }

suspend fun AccessToken.fetch(resource: String): OAuth2Response = awaitResult { this.fetch(resource, it) }

suspend fun AccessToken.fetch(
    method: HttpMethod,
    resource: String,
    headers: JsonObject,
    payload: Buffer
): OAuth2Response = awaitResult { this.fetch(method, resource, headers, payload, it) }
