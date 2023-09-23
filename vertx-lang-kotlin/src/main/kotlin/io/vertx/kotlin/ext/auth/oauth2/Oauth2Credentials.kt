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
import io.vertx.ext.auth.oauth2.OAuth2FlowType

/**
 * A function providing a DSL for building [io.vertx.ext.auth.oauth2.Oauth2Credentials] objects.
 *
 * Credentials specific to the [io.vertx.ext.auth.oauth2.OAuth2Auth] provider
 *
 * @param code 
 * @param redirectUri 
 * @param codeVerifier 
 * @param scopes 
 * @param jwt 
 * @param assertion 
 * @param password 
 * @param username 
 * @param flow 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.Oauth2Credentials original] using Vert.x codegen.
 */
fun oauth2CredentialsOf(
  code: String? = null,
  redirectUri: String? = null,
  codeVerifier: String? = null,
  scopes: Iterable<String>? = null,
  jwt: io.vertx.core.json.JsonObject? = null,
  assertion: String? = null,
  password: String? = null,
  username: String? = null,
  flow: OAuth2FlowType? = null): Oauth2Credentials = io.vertx.ext.auth.oauth2.Oauth2Credentials().apply {

  if (code != null) {
    this.setCode(code)
  }
  if (redirectUri != null) {
    this.setRedirectUri(redirectUri)
  }
  if (codeVerifier != null) {
    this.setCodeVerifier(codeVerifier)
  }
  if (scopes != null) {
    this.setScopes(scopes.toList())
  }
  if (jwt != null) {
    this.setJwt(jwt)
  }
  if (assertion != null) {
    this.setAssertion(assertion)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (username != null) {
    this.setUsername(username)
  }
  if (flow != null) {
    this.setFlow(flow)
  }
}

