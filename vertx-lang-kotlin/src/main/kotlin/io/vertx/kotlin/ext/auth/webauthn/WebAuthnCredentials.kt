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
package io.vertx.kotlin.ext.auth.webauthn

import io.vertx.ext.auth.webauthn.WebAuthnCredentials

fun webAuthnCredentialsOf(
  challenge: String? = null,
  domain: String? = null,
  origin: String? = null,
  username: String? = null,
  webauthn: io.vertx.core.json.JsonObject? = null): WebAuthnCredentials = io.vertx.ext.auth.webauthn.WebAuthnCredentials().apply {

  if (challenge != null) {
    this.setChallenge(challenge)
  }
  if (domain != null) {
    this.setDomain(domain)
  }
  if (origin != null) {
    this.setOrigin(origin)
  }
  if (username != null) {
    this.setUsername(username)
  }
  if (webauthn != null) {
    this.setWebauthn(webauthn)
  }
}

@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("webAuthnCredentialsOf(challenge, domain, origin, username, webauthn)")
)
fun WebAuthnCredentials(
  challenge: String? = null,
  domain: String? = null,
  origin: String? = null,
  username: String? = null,
  webauthn: io.vertx.core.json.JsonObject? = null): WebAuthnCredentials = io.vertx.ext.auth.webauthn.WebAuthnCredentials().apply {

  if (challenge != null) {
    this.setChallenge(challenge)
  }
  if (domain != null) {
    this.setDomain(domain)
  }
  if (origin != null) {
    this.setOrigin(origin)
  }
  if (username != null) {
    this.setUsername(username)
  }
  if (webauthn != null) {
    this.setWebauthn(webauthn)
  }
}

