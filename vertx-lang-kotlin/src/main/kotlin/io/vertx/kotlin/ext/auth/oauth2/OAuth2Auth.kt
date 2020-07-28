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

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.User
import io.vertx.ext.auth.oauth2.OAuth2Auth
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.OAuth2Auth.jWKSet]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.OAuth2Auth] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jWKSet returning a future that can yield a result ", replaceWith = ReplaceWith("jWKSet().await()"))
suspend fun OAuth2Auth.jWKSetAwait(): Unit {
  return awaitResult {
    this.jWKSet(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.OAuth2Auth.refresh]
 *
 * @param user the user (access token) to be refreshed.
 * @return [User]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.OAuth2Auth] using Vert.x codegen.
 */
@Deprecated(message = "Instead use refresh returning a future that can yield a result ", replaceWith = ReplaceWith("refresh(user).await()"))
suspend fun OAuth2Auth.refreshAwait(user: User): User {
  return awaitResult {
    this.refresh(user, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.OAuth2Auth.revoke]
 *
 * @param user the user (access token) to revoke.
 * @param tokenType the token type (either access_token or refresh_token).
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.OAuth2Auth] using Vert.x codegen.
 */
@Deprecated(message = "Instead use revoke returning a future that can yield a result ", replaceWith = ReplaceWith("revoke(user, tokenType).await()"))
suspend fun OAuth2Auth.revokeAwait(user: User, tokenType: String): Unit {
  return awaitResult {
    this.revoke(user, tokenType, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.OAuth2Auth.revoke]
 *
 * @param user the user (access token) to revoke.
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.OAuth2Auth] using Vert.x codegen.
 */
@Deprecated(message = "Instead use revoke returning a future that can yield a result ", replaceWith = ReplaceWith("revoke(user).await()"))
suspend fun OAuth2Auth.revokeAwait(user: User): Unit {
  return awaitResult {
    this.revoke(user, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.OAuth2Auth.userInfo]
 *
 * @param user the user (access token) to fetch the user info.
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.OAuth2Auth] using Vert.x codegen.
 */
@Deprecated(message = "Instead use userInfo returning a future that can yield a result ", replaceWith = ReplaceWith("userInfo(user).await()"))
suspend fun OAuth2Auth.userInfoAwait(user: User): JsonObject {
  return awaitResult {
    this.userInfo(user, it)
  }
}

