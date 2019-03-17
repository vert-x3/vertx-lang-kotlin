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
 * Query an OAuth 2.0 authorization server to determine the active state of an OAuth 2.0 token and to determine
 * meta-information about this token.
 *
 * @param token the access token (base64 string)
 * @return self *
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
 * @return self *
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
 * @return  *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.OAuth2Auth original] using Vert.x codegen.
 */
suspend fun OAuth2Auth.loadJWKAwait() : Unit {
  return awaitResult{
    this.loadJWK({ ar -> it.handle(ar.mapEmpty()) })}
}

