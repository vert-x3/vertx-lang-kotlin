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

import io.vertx.ext.auth.oauth2.Oauth2Credentials

/**
 * A function providing a DSL for building [io.vertx.ext.auth.oauth2.Oauth2Credentials] objects.
 *
 * Credentials specific to the [io.vertx.ext.auth.oauth2.OAuth2Auth] provider
 *
 * @param assertion 
 * @param code 
 * @param codeVerifier 
 * @param jwt 
 * @param password 
 * @param redirectUri 
 * @param scopes 
 * @param username 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.Oauth2Credentials original] using Vert.x codegen.
 */
fun oauth2CredentialsOf(
  assertion: String? = null,
  code: String? = null,
  codeVerifier: String? = null,
  jwt: io.vertx.core.json.JsonObject? = null,
  password: String? = null,
  redirectUri: String? = null,
  scopes: Iterable<String>? = null,
  username: String? = null): Oauth2Credentials = io.vertx.ext.auth.oauth2.Oauth2Credentials().apply {

  if (assertion != null) {
    this.setAssertion(assertion)
  }
  if (code != null) {
    this.setCode(code)
  }
  if (codeVerifier != null) {
    this.setCodeVerifier(codeVerifier)
  }
  if (jwt != null) {
    this.setJwt(jwt)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (redirectUri != null) {
    this.setRedirectUri(redirectUri)
  }
  if (scopes != null) {
    this.setScopes(scopes.toList())
  }
  if (username != null) {
    this.setUsername(username)
  }
}

