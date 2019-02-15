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

