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
 * @param redirectUri  Set the redirect URI
 * @param scopes  Set the scopes
 * @param state  Set the state
 * @param codeChallenge  PKCE code challenge
 * @param codeChallengeMethod  PKCE code challenge method
 * @param prompt  Hint on kind of IdP prompt
 * @param loginHint  Hint on login name for IdP UI
 * @param additionalParameters  Set the additional parameters
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.OAuth2AuthorizationURL original] using Vert.x codegen.
 */
fun oAuth2AuthorizationURLOf(
  redirectUri: String? = null,
  scopes: Iterable<String>? = null,
  state: String? = null,
  codeChallenge: String? = null,
  codeChallengeMethod: String? = null,
  prompt: String? = null,
  loginHint: String? = null,
  additionalParameters: Map<String, String>? = null): OAuth2AuthorizationURL = io.vertx.ext.auth.oauth2.OAuth2AuthorizationURL().apply {

  if (redirectUri != null) {
    this.setRedirectUri(redirectUri)
  }
  if (scopes != null) {
    this.setScopes(scopes.toList())
  }
  if (state != null) {
    this.setState(state)
  }
  if (codeChallenge != null) {
    this.setCodeChallenge(codeChallenge)
  }
  if (codeChallengeMethod != null) {
    this.setCodeChallengeMethod(codeChallengeMethod)
  }
  if (prompt != null) {
    this.setPrompt(prompt)
  }
  if (loginHint != null) {
    this.setLoginHint(loginHint)
  }
  if (additionalParameters != null) {
    this.setAdditionalParameters(additionalParameters)
  }
}

