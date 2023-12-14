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

import io.vertx.core.net.ServerSSLOptions
import io.vertx.core.buffer.Buffer
import io.vertx.core.http.ClientAuth
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.core.net.ServerSSLOptions] objects.
 *
 * Server SSL options.
 *
 * @param trustOptions  Set the trust options.
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param useAlpn  Set the ALPN usage.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param sslHandshakeTimeout  Set the SSL handshake timeout, default time unit is seconds.
 * @param sslHandshakeTimeoutUnit  Set the SSL handshake timeout unit. If not specified, default is seconds.
 * @param applicationLayerProtocols  Set the list of application-layer protocols to provide to the server during the Application-Layer Protocol Negotiation.
 * @param clientAuth  Set whether client auth is required
 * @param sni  Set whether the server supports Server Name Indiciation
 * @param keyCertOptions  Set the key/cert options.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.ServerSSLOptions original] using Vert.x codegen.
 */
fun serverSSLOptionsOf(
  trustOptions: io.vertx.core.net.TrustOptions? = null,
  enabledCipherSuites: Iterable<String>? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  useAlpn: Boolean? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  sslHandshakeTimeout: Long? = null,
  sslHandshakeTimeoutUnit: TimeUnit? = null,
  applicationLayerProtocols: Iterable<String>? = null,
  clientAuth: ClientAuth? = null,
  sni: Boolean? = null,
  keyCertOptions: io.vertx.core.net.KeyCertOptions? = null): ServerSSLOptions = io.vertx.core.net.ServerSSLOptions().apply {

  if (trustOptions != null) {
    this.setTrustOptions(trustOptions)
  }
  if (enabledCipherSuites != null) {
    for (item in enabledCipherSuites) {
      this.addEnabledCipherSuite(item)
    }
  }
  if (crlPaths != null) {
    for (item in crlPaths) {
      this.addCrlPath(item)
    }
  }
  if (crlValues != null) {
    for (item in crlValues) {
      this.addCrlValue(item)
    }
  }
  if (useAlpn != null) {
    this.setUseAlpn(useAlpn)
  }
  if (enabledSecureTransportProtocols != null) {
    this.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols.toSet())
  }
  if (sslHandshakeTimeout != null) {
    this.setSslHandshakeTimeout(sslHandshakeTimeout)
  }
  if (sslHandshakeTimeoutUnit != null) {
    this.setSslHandshakeTimeoutUnit(sslHandshakeTimeoutUnit)
  }
  if (applicationLayerProtocols != null) {
    this.setApplicationLayerProtocols(applicationLayerProtocols.toList())
  }
  if (clientAuth != null) {
    this.setClientAuth(clientAuth)
  }
  if (sni != null) {
    this.setSni(sni)
  }
  if (keyCertOptions != null) {
    this.setKeyCertOptions(keyCertOptions)
  }
}

