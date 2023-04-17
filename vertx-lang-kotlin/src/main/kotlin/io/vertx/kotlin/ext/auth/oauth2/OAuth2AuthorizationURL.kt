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

import io.vertx.ext.auth.oauth2.OAuth2AuthorizationURL

/**
 * A function providing a DSL for building [io.vertx.ext.auth.oauth2.OAuth2AuthorizationURL] objects.
 *
 * TypeSafe DataObject for passing needed parameters for [io.vertx.ext.auth.oauth2.OAuth2Auth]
 *
 * @param additionalParameters  Set the additional parameters
 * @param codeChallenge  PKCE code challenge
 * @param codeChallengeMethod  PKCE code challenge method
 * @param loginHint  Hint on login name for IdP UI
 * @param prompt  Hint on kind of IdP prompt
 * @param redirectUri  Set the redirect URI
 * @param scopes  Set the scopes
 * @param state  Set the state
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.OAuth2AuthorizationURL original] using Vert.x codegen.
 */
fun oAuth2AuthorizationURLOf(
  additionalParameters: Map<String, String>? = null,
  codeChallenge: String? = null,
  codeChallengeMethod: String? = null,
  loginHint: String? = null,
  prompt: String? = null,
  redirectUri: String? = null,
  scopes: Iterable<String>? = null,
  state: String? = null): OAuth2AuthorizationURL = io.vertx.ext.auth.oauth2.OAuth2AuthorizationURL().apply {

  if (additionalParameters != null) {
    this.setAdditionalParameters(additionalParameters)
  }
  if (codeChallenge != null) {
    this.setCodeChallenge(codeChallenge)
  }
  if (codeChallengeMethod != null) {
    this.setCodeChallengeMethod(codeChallengeMethod)
  }
  if (loginHint != null) {
    this.setLoginHint(loginHint)
  }
  if (prompt != null) {
    this.setPrompt(prompt)
  }
  if (redirectUri != null) {
    this.setRedirectUri(redirectUri)
  }
  if (scopes != null) {
    this.setScopes(scopes.toList())
  }
  if (state != null) {
    this.setState(state)
  }
}

