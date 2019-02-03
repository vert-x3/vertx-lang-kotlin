package io.vertx.kotlin.ext.auth.oauth2

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.HttpMethod
import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.oauth2.AccessToken
import io.vertx.ext.auth.oauth2.OAuth2Response
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.AccessToken.refresh]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.AccessToken] using Vert.x codegen.
 */
suspend fun AccessToken.refreshAwait(): Unit {
  return awaitResult {
    this.refresh { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.AccessToken.revoke]
 *
 * @param token_type - A String containing the type of token to revoke. Should be either "access_token" or "refresh_token".
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.AccessToken] using Vert.x codegen.
 */
suspend fun AccessToken.revokeAwait(token_type: String): Unit {
  return awaitResult {
    this.revoke(token_type) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.AccessToken.logout]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.AccessToken] using Vert.x codegen.
 */
suspend fun AccessToken.logoutAwait(): Unit {
  return awaitResult {
    this.logout { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.AccessToken.introspect]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.AccessToken] using Vert.x codegen.
 */
suspend fun AccessToken.introspectAwait(): Unit {
  return awaitResult {
    this.introspect { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.AccessToken.introspect]
 *
 * @param tokenType - A String containing the type of token to revoke. Should be either "access_token" or "refresh_token".
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.AccessToken] using Vert.x codegen.
 */
suspend fun AccessToken.introspectAwait(tokenType: String): Unit {
  return awaitResult {
    this.introspect(tokenType) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.AccessToken.userInfo]
 *
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.AccessToken] using Vert.x codegen.
 */
suspend fun AccessToken.userInfoAwait(): JsonObject {
  return awaitResult {
    this.userInfo(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.AccessToken.fetch]
 *
 * @param resource - the resource to fetch.
 * @return [OAuth2Response]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.AccessToken] using Vert.x codegen.
 */
suspend fun AccessToken.fetchAwait(resource: String): OAuth2Response {
  return awaitResult {
    this.fetch(resource, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.AccessToken.fetch]
 *
 * @param method - the HTTP method to user.
 * @param resource - the resource to fetch.
 * @param headers - extra headers to pass to the request.
 * @param payload - payload to send to the server.
 * @return [OAuth2Response]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.AccessToken] using Vert.x codegen.
 */
suspend fun AccessToken.fetchAwait(method: HttpMethod, resource: String, headers: JsonObject, payload: Buffer): OAuth2Response {
  return awaitResult {
    this.fetch(method, resource, headers, payload, it)
  }
}

