package io.vertx.kotlin.ext.auth.oauth2

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.HttpMethod
import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.oauth2.AccessToken
import io.vertx.ext.auth.oauth2.OAuth2Response
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.String

/**
 *  Refresh the access token */
suspend fun AccessToken.refresh() {
  awaitResult<Void?> { this.refresh(it) }
}

/**
 *  Revoke access or refresh token
 * @param token_type - A String containing the type of token to revoke. Should be either "access_token" or "refresh_token". */
suspend fun AccessToken.revoke(token_type: String) {
  awaitResult<Void?> { this.revoke(token_type, it) }
}

/**
 *  Revoke refresh token and calls the logout endpoint. This is a openid-connect extension and might not be
 *  available on all providers. */
suspend fun AccessToken.logout() {
  awaitResult<Void?> { this.logout(it) }
}

/**
 *  Introspect access token. This is an OAuth2 extension that allow to verify if an access token is still valid. */
suspend fun AccessToken.introspect() {
  awaitResult<Void?> { this.introspect(it) }
}

/**
 *  Introspect access token. This is an OAuth2 extension that allow to verify if an access token is still valid.
 * @param tokenType - A String containing the type of token to revoke. Should be either "access_token" or "refresh_token". */
suspend fun AccessToken.introspect(tokenType: String) {
  awaitResult<Void?> { this.introspect(tokenType, it) }
}

/**
 *  Load the user info as per OIDC spec. */
suspend fun AccessToken.userInfo(): JsonObject {
  return awaitResult { this.userInfo(it) }
}

/**
 *  Fetches a JSON resource using this Access Token.
 * @param resource - the resource to fetch. */
suspend fun AccessToken.fetch(resource: String): OAuth2Response {
  return awaitResult { this.fetch(resource, it) }
}

/**
 *  Fetches a JSON resource using this Access Token.
 * @param method - the HTTP method to user.
 * @param resource - the resource to fetch.
 * @param headers - extra headers to pass to the request.
 * @param payload - payload to send to the server. */
suspend fun AccessToken.fetch(
  method: HttpMethod,
  resource: String,
  headers: JsonObject,
  payload: Buffer
): OAuth2Response {
  return awaitResult { this.fetch(method, resource, headers, payload, it) }
}
