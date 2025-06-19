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
import io.vertx.ext.auth.webauthn.AuthenticatorTransport
import io.vertx.ext.auth.webauthn.PublicKeyCredential
import io.vertx.ext.auth.webauthn.RelyingParty
import io.vertx.ext.auth.webauthn.UserVerification

/**
 * A function providing a DSL for building [io.vertx.ext.auth.webauthn.WebAuthnOptions] objects.
 *
 * Configuration for the webauthn object
 *
 * @param attestation 
 * @param authenticatorAttachment 
 * @param challengeLength 
 * @param extensions 
 * @param pubKeyCredParams 
 * @param relyingParty 
 * @param requireResidentKey 
 * @param rootCertificates 
 * @param rootCrls  Load a CRL, for example MDS3 certificate should use http://crl.globalsign.net/Root.crl
 * @param timeoutInMilliseconds 
 * @param transports 
 * @param userVerification 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.webauthn.WebAuthnOptions original] using Vert.x codegen.
 */
fun webAuthnOptionsOf(
  attestation: Attestation? = null,
  authenticatorAttachment: AuthenticatorAttachment? = null,
  challengeLength: Int? = null,
  extensions: io.vertx.core.json.JsonObject? = null,
  pubKeyCredParams: Iterable<PublicKeyCredential>? = null,
  relyingParty: io.vertx.ext.auth.webauthn.RelyingParty? = null,
  requireResidentKey: Boolean? = null,
  rootCertificates: Map<String, String>? = null,
  rootCrls: Iterable<String>? = null,
  timeoutInMilliseconds: Long? = null,
  transports: Iterable<AuthenticatorTransport>? = null,
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
  if (extensions != null) {
    this.setExtensions(extensions)
  }
  if (pubKeyCredParams != null) {
    this.setPubKeyCredParams(pubKeyCredParams.toList())
  }
  if (relyingParty != null) {
    this.setRelyingParty(relyingParty)
  }
  if (requireResidentKey != null) {
    this.setRequireResidentKey(requireResidentKey)
  }
  if (rootCertificates != null) {
    this.setRootCertificates(rootCertificates)
  }
  if (rootCrls != null) {
    this.setRootCrls(rootCrls.toList())
  }
  if (timeoutInMilliseconds != null) {
    this.setTimeoutInMilliseconds(timeoutInMilliseconds)
  }
  if (transports != null) {
    this.setTransports(transports.toList())
  }
  if (userVerification != null) {
    this.setUserVerification(userVerification)
  }
}

