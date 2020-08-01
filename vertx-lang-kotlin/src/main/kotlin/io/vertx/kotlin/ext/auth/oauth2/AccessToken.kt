/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
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
@Deprecated(message = "Instead use refresh returning a future and chain with await()", replaceWith = ReplaceWith("refresh().await()"))
suspend fun AccessToken.refreshAwait(): Unit {
  return awaitResult {
    this.refresh(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.AccessToken.revoke]
 *
 * @param token_type - A String containing the type of token to revoke. Should be either "access_token" or "refresh_token".
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.AccessToken] using Vert.x codegen.
 */
@Deprecated(message = "Instead use revoke returning a future and chain with await()", replaceWith = ReplaceWith("revoke(token_type).await()"))
suspend fun AccessToken.revokeAwait(token_type: String): Unit {
  return awaitResult {
    this.revoke(token_type, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.AccessToken.logout]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.AccessToken] using Vert.x codegen.
 */
@Deprecated(message = "Instead use logout returning a future and chain with await()", replaceWith = ReplaceWith("logout().await()"))
suspend fun AccessToken.logoutAwait(): Unit {
  return awaitResult {
    this.logout(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.AccessToken.introspect]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.AccessToken] using Vert.x codegen.
 */
@Deprecated(message = "Instead use introspect returning a future and chain with await()", replaceWith = ReplaceWith("introspect().await()"))
suspend fun AccessToken.introspectAwait(): Unit {
  return awaitResult {
    this.introspect(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.AccessToken.introspect]
 *
 * @param tokenType - A String containing the type of token to revoke. Should be either "access_token" or "refresh_token".
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.AccessToken] using Vert.x codegen.
 */
@Deprecated(message = "Instead use introspect returning a future and chain with await()", replaceWith = ReplaceWith("introspect(tokenType).await()"))
suspend fun AccessToken.introspectAwait(tokenType: String): Unit {
  return awaitResult {
    this.introspect(tokenType, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.AccessToken.userInfo]
 *
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.AccessToken] using Vert.x codegen.
 */
@Deprecated(message = "Instead use userInfo returning a future and chain with await()", replaceWith = ReplaceWith("userInfo().await()"))
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
@Deprecated(message = "Instead use fetch returning a future and chain with await()", replaceWith = ReplaceWith("fetch(resource).await()"))
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
@Deprecated(message = "Instead use fetch returning a future and chain with await()", replaceWith = ReplaceWith("fetch(method, resource, headers, payload).await()"))
suspend fun AccessToken.fetchAwait(method: HttpMethod, resource: String, headers: JsonObject, payload: Buffer): OAuth2Response {
  return awaitResult {
    this.fetch(method, resource, headers, payload, it)
  }
}

