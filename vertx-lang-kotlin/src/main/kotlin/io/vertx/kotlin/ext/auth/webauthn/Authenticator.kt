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

import io.vertx.ext.auth.webauthn.Authenticator
import io.vertx.ext.auth.webauthn.AttestationCertificates

/**
 * A function providing a DSL for building [io.vertx.ext.auth.webauthn.Authenticator] objects.
 *
 * Data Object representing an authenticator at rest.
 *
 * @param userName 
 * @param type 
 * @param credID 
 * @param publicKey 
 * @param counter 
 * @param attestationCertificates 
 * @param flags 
 * @param fmt 
 * @param aaguid 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.webauthn.Authenticator original] using Vert.x codegen.
 */
fun authenticatorOf(
  userName: String? = null,
  type: String? = null,
  credID: String? = null,
  publicKey: String? = null,
  counter: Long? = null,
  attestationCertificates: io.vertx.ext.auth.webauthn.AttestationCertificates? = null,
  flags: Int? = null,
  fmt: String? = null,
  aaguid: String? = null): Authenticator = io.vertx.ext.auth.webauthn.Authenticator().apply {

  if (userName != null) {
    this.setUserName(userName)
  }
  if (type != null) {
    this.setType(type)
  }
  if (credID != null) {
    this.setCredID(credID)
  }
  if (publicKey != null) {
    this.setPublicKey(publicKey)
  }
  if (counter != null) {
    this.setCounter(counter)
  }
  if (attestationCertificates != null) {
    this.setAttestationCertificates(attestationCertificates)
  }
  if (flags != null) {
    this.setFlags(flags)
  }
  if (fmt != null) {
    this.setFmt(fmt)
  }
  if (aaguid != null) {
    this.setAaguid(aaguid)
  }
}

