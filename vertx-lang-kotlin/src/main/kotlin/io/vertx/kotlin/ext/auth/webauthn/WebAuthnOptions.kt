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

import io.vertx.ext.auth.webauthn.WebAuthnOptions
import io.vertx.ext.auth.webauthn.Attestation
import io.vertx.ext.auth.webauthn.AuthenticatorAttachment
import io.vertx.ext.auth.webauthn.UserVerification

fun webAuthnOptionsOf(
  attestation: Attestation? = null,
  authenticatorAttachment: AuthenticatorAttachment? = null,
  challengeLength: Int? = null,
  origin: String? = null,
  pubKeyCredParams: Iterable<String>? = null,
  requireResidentKey: Boolean? = null,
  rpIcon: String? = null,
  rpId: String? = null,
  rpName: String? = null,
  timeout: Int? = null,
  transports: Iterable<String>? = null,
  userVerification: UserVerification? = null): WebAuthnOptions = io.vertx.ext.auth.webauthn.WebAuthnOptions().apply {

  if (attestation != null) {
    this.setAttestation(attestation)
  }
  if (authenticatorAttachment != null) {
    this.setAuthenticatorAttachment(authenticatorAttachment)
  }
  if (challengeLength != null) {
    this.setChallengeLength(challengeLength)
  }
  if (origin != null) {
    this.setOrigin(origin)
  }
  if (pubKeyCredParams != null) {
    this.setPubKeyCredParams(pubKeyCredParams.toSet())
  }
  if (requireResidentKey != null) {
    this.setRequireResidentKey(requireResidentKey)
  }
  if (rpIcon != null) {
    this.setRpIcon(rpIcon)
  }
  if (rpId != null) {
    this.setRpId(rpId)
  }
  if (rpName != null) {
    this.setRpName(rpName)
  }
  if (timeout != null) {
    this.setTimeout(timeout)
  }
  if (transports != null) {
    this.setTransports(transports.toSet())
  }
  if (userVerification != null) {
    this.setUserVerification(userVerification)
  }
}

@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("webAuthnOptionsOf(attestation, authenticatorAttachment, challengeLength, origin, pubKeyCredParams, requireResidentKey, rpIcon, rpId, rpName, timeout, transports, userVerification)")
)
fun WebAuthnOptions(
  attestation: Attestation? = null,
  authenticatorAttachment: AuthenticatorAttachment? = null,
  challengeLength: Int? = null,
  origin: String? = null,
  pubKeyCredParams: Iterable<String>? = null,
  requireResidentKey: Boolean? = null,
  rpIcon: String? = null,
  rpId: String? = null,
  rpName: String? = null,
  timeout: Int? = null,
  transports: Iterable<String>? = null,
  userVerification: UserVerification? = null): WebAuthnOptions = io.vertx.ext.auth.webauthn.WebAuthnOptions().apply {

  if (attestation != null) {
    this.setAttestation(attestation)
  }
  if (authenticatorAttachment != null) {
    this.setAuthenticatorAttachment(authenticatorAttachment)
  }
  if (challengeLength != null) {
    this.setChallengeLength(challengeLength)
  }
  if (origin != null) {
    this.setOrigin(origin)
  }
  if (pubKeyCredParams != null) {
    this.setPubKeyCredParams(pubKeyCredParams.toSet())
  }
  if (requireResidentKey != null) {
    this.setRequireResidentKey(requireResidentKey)
  }
  if (rpIcon != null) {
    this.setRpIcon(rpIcon)
  }
  if (rpId != null) {
    this.setRpId(rpId)
  }
  if (rpName != null) {
    this.setRpName(rpName)
  }
  if (timeout != null) {
    this.setTimeout(timeout)
  }
  if (transports != null) {
    this.setTransports(transports.toSet())
  }
  if (userVerification != null) {
    this.setUserVerification(userVerification)
  }
}

