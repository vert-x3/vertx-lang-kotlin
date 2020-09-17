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
package io.vertx.kotlin.core.net

import io.vertx.core.net.PemTrustOptions

/**
 * A function providing a DSL for building [io.vertx.core.net.PemTrustOptions] objects.
 *
 * Certificate Authority options configuring certificates based on
 * <i>Privacy-enhanced Electronic Email</i> (PEM) files. The options is configured with a list of
 * validating certificates.
 * <p>
 * Validating certificates must contain X.509 certificates wrapped in a PEM block:<p>
 *
 * <pre>
 * -----BEGIN CERTIFICATE-----
 * MIIDezCCAmOgAwIBAgIEVmLkwTANBgkqhkiG9w0BAQsFADBuMRAwDgYDVQQGEwdV
 * ...
 * z5+DuODBJUQst141Jmgq8bS543IU/5apcKQeGNxEyQ==
 * -----END CERTIFICATE-----
 * </pre>
 *
 * The certificates can either be loaded by Vert.x from the filesystem:
 * <p>
 * <pre>
 * HttpServerOptions options = new HttpServerOptions();
 * options.setPemTrustOptions(new PemTrustOptions().addCertPath("/cert.pem"));
 * </pre>
 *
 * Or directly provided as a buffer:
 * <p>
 *
 * <pre>
 * Buffer cert = vertx.fileSystem().readFileBlocking("/cert.pem");
 * HttpServerOptions options = new HttpServerOptions();
 * options.setPemTrustOptions(new PemTrustOptions().addCertValue(cert));
 * </pre>
 *
 * @param certPaths  Add a certificate path
 * @param certValues  Add a certificate value
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.PemTrustOptions original] using Vert.x codegen.
 */
fun pemTrustOptionsOf(
  certPaths: Iterable<String>? = null,
  certValues: Iterable<io.vertx.core.buffer.Buffer>? = null): PemTrustOptions = io.vertx.core.net.PemTrustOptions().apply {

  if (certPaths != null) {
    for (item in certPaths) {
      this.addCertPath(item)
    }
  }
  if (certValues != null) {
    for (item in certValues) {
      this.addCertValue(item)
    }
  }
}

/**
 * A function providing a DSL for building [io.vertx.core.net.PemTrustOptions] objects.
 *
 * Certificate Authority options configuring certificates based on
 * <i>Privacy-enhanced Electronic Email</i> (PEM) files. The options is configured with a list of
 * validating certificates.
 * <p>
 * Validating certificates must contain X.509 certificates wrapped in a PEM block:<p>
 *
 * <pre>
 * -----BEGIN CERTIFICATE-----
 * MIIDezCCAmOgAwIBAgIEVmLkwTANBgkqhkiG9w0BAQsFADBuMRAwDgYDVQQGEwdV
 * ...
 * z5+DuODBJUQst141Jmgq8bS543IU/5apcKQeGNxEyQ==
 * -----END CERTIFICATE-----
 * </pre>
 *
 * The certificates can either be loaded by Vert.x from the filesystem:
 * <p>
 * <pre>
 * HttpServerOptions options = new HttpServerOptions();
 * options.setPemTrustOptions(new PemTrustOptions().addCertPath("/cert.pem"));
 * </pre>
 *
 * Or directly provided as a buffer:
 * <p>
 *
 * <pre>
 * Buffer cert = vertx.fileSystem().readFileBlocking("/cert.pem");
 * HttpServerOptions options = new HttpServerOptions();
 * options.setPemTrustOptions(new PemTrustOptions().addCertValue(cert));
 * </pre>
 *
 * @param certPaths  Add a certificate path
 * @param certValues  Add a certificate value
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.PemTrustOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("pemTrustOptionsOf(certPaths, certValues)")
)
fun PemTrustOptions(
  certPaths: Iterable<String>? = null,
  certValues: Iterable<io.vertx.core.buffer.Buffer>? = null): PemTrustOptions = io.vertx.core.net.PemTrustOptions().apply {

  if (certPaths != null) {
    for (item in certPaths) {
      this.addCertPath(item)
    }
  }
  if (certValues != null) {
    for (item in certValues) {
      this.addCertValue(item)
    }
  }
}

