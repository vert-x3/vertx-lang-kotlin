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
import io.vertx.ext.auth.webauthn.ResidentKey
import io.vertx.ext.auth.webauthn.UserVerification

/**
 * A function providing a DSL for building [io.vertx.ext.auth.webauthn.WebAuthnOptions] objects.
 *
 * Configuration for the webauthn object
 *
 * @param relyingParty 
 * @param transports 
 * @param attestation 
 * @param residentKey 
 * @param pubKeyCredParams 
 * @param authenticatorAttachment 
 * @param requireResidentKey 
 * @param userVerification 
 * @param timeoutInMilliseconds 
 * @param challengeLength 
 * @param extensions 
 * @param rootCertificates 
 * @param rootCrls  Load a CRL, for example MDS3 certificate should use http://crl.globalsign.net/Root.crl
 * @param relaxedSafetyNetIntegrityVeridict  Set to true to allow SafetyNet attestation with a relaxed integrity veridict. When the relaxed value is <code>true</code>, the SafetyNet attestation will be accepted even if: <ul>   <li>Certified, genuine device that passes CTS</li>   <li>Certified device with unlocked bootloader</li>   <li>Genuine but uncertified device, such as when the manufacturer doesn't apply for certification</li>   <li>Device with custom ROM (not rooted)</li> </ul>
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.webauthn.WebAuthnOptions original] using Vert.x codegen.
 */
fun webAuthnOptionsOf(
  relyingParty: io.vertx.ext.auth.webauthn.RelyingParty? = null,
  transports: Iterable<AuthenticatorTransport>? = null,
  attestation: Attestation? = null,
  residentKey: ResidentKey? = null,
  pubKeyCredParams: Iterable<PublicKeyCredential>? = null,
  authenticatorAttachment: AuthenticatorAttachment? = null,
  requireResidentKey: Boolean? = null,
  userVerification: UserVerification? = null,
  timeoutInMilliseconds: Long? = null,
  challengeLength: Int? = null,
  extensions: io.vertx.core.json.JsonObject? = null,
  rootCertificates: Map<String, String>? = null,
  rootCrls: Iterable<String>? = null,
  relaxedSafetyNetIntegrityVeridict: Boolean? = null): WebAuthnOptions = io.vertx.ext.auth.webauthn.WebAuthnOptions().apply {

  if (relyingParty != null) {
    this.setRelyingParty(relyingParty)
  }
  if (transports != null) {
    this.setTransports(transports.toList())
  }
  if (attestation != null) {
    this.setAttestation(attestation)
  }
  if (residentKey != null) {
    this.setResidentKey(residentKey)
  }
  if (pubKeyCredParams != null) {
    this.setPubKeyCredParams(pubKeyCredParams.toList())
  }
  if (authenticatorAttachment != null) {
    this.setAuthenticatorAttachment(authenticatorAttachment)
  }
  if (requireResidentKey != null) {
    this.setRequireResidentKey(requireResidentKey)
  }
  if (userVerification != null) {
    this.setUserVerification(userVerification)
  }
  if (timeoutInMilliseconds != null) {
    this.setTimeoutInMilliseconds(timeoutInMilliseconds)
  }
  if (challengeLength != null) {
    this.setChallengeLength(challengeLength)
  }
  if (extensions != null) {
    this.setExtensions(extensions)
  }
  if (rootCertificates != null) {
    this.setRootCertificates(rootCertificates)
  }
  if (rootCrls != null) {
    this.setRootCrls(rootCrls.toList())
  }
  if (relaxedSafetyNetIntegrityVeridict != null) {
    this.setRelaxedSafetyNetIntegrityVeridict(relaxedSafetyNetIntegrityVeridict)
  }
}

