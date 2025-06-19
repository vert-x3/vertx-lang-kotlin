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
 * @param aaguid 
 * @param attestationCertificates 
 * @param counter 
 * @param credID 
 * @param flags 
 * @param fmt 
 * @param publicKey 
 * @param type 
 * @param userName 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.webauthn.Authenticator original] using Vert.x codegen.
 */
fun authenticatorOf(
  aaguid: String? = null,
  attestationCertificates: io.vertx.ext.auth.webauthn.AttestationCertificates? = null,
  counter: Long? = null,
  credID: String? = null,
  flags: Int? = null,
  fmt: String? = null,
  publicKey: String? = null,
  type: String? = null,
  userName: String? = null): Authenticator = io.vertx.ext.auth.webauthn.Authenticator().apply {

  if (aaguid != null) {
    this.setAaguid(aaguid)
  }
  if (attestationCertificates != null) {
    this.setAttestationCertificates(attestationCertificates)
  }
  if (counter != null) {
    this.setCounter(counter)
  }
  if (credID != null) {
    this.setCredID(credID)
  }
  if (flags != null) {
    this.setFlags(flags)
  }
  if (fmt != null) {
    this.setFmt(fmt)
  }
  if (publicKey != null) {
    this.setPublicKey(publicKey)
  }
  if (type != null) {
    this.setType(type)
  }
  if (userName != null) {
    this.setUserName(userName)
  }
}

