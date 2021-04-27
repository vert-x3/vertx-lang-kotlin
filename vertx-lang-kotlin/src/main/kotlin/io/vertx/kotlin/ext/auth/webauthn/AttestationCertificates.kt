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

import io.vertx.ext.auth.webauthn.AttestationCertificates
import io.vertx.ext.auth.webauthn.PublicKeyCredential

/**
 * A function providing a DSL for building [io.vertx.ext.auth.webauthn.AttestationCertificates] objects.
 *
 * Data Object containing the list of certificates used during the attestation of this authenticator.
 *
 * @param alg 
 * @param x5c 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.webauthn.AttestationCertificates original] using Vert.x codegen.
 */
fun attestationCertificatesOf(
  alg: PublicKeyCredential? = null,
  x5c: Iterable<String>? = null): AttestationCertificates = io.vertx.ext.auth.webauthn.AttestationCertificates().apply {

  if (alg != null) {
    this.setAlg(alg)
  }
  if (x5c != null) {
    this.setX5c(x5c.toList())
  }
}

