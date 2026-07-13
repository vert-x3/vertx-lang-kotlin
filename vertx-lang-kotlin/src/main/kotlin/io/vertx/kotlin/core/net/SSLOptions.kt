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

import io.vertx.core.net.SSLOptions
import io.vertx.core.net.PqcEnforcementPolicy
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.core.net.SSLOptions] objects.
 *
 * SSL options
 *
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param keyExchangeGroups  Set the list of key exchange group names to use for TLS connections. <p> The effective groups used during the TLS handshake depend on the [io.vertx.core.net.SSLOptions]: <ul>   <li>: uses the specified groups as-is, or engine defaults if <code>null</code></li>   <li>: prepends <code>X25519MLKEM768</code> if not already present</li>   <li>: replaces the list with only <code>X25519MLKEM768</code></li> </ul>
 * @param pqcEnforcementPolicy  Set the post-quantum cryptography enforcement policy. <p> When set to  or , the SSL engine will be automatically switched to OpenSSL if not already configured.
 * @param sslHandshakeTimeout  Set the SSL handshake timeout, default time unit is seconds.
 * @param sslHandshakeTimeoutUnit  Set the SSL handshake timeout unit. If not specified, default is seconds.
 * @param trustOptions  Set the trust options.
 * @param useAlpn  Set the ALPN usage.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.SSLOptions original] using Vert.x codegen.
 */
fun sslOptionsOf(
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  keyExchangeGroups: Iterable<String>? = null,
  pqcEnforcementPolicy: PqcEnforcementPolicy? = null,
  sslHandshakeTimeout: Long? = null,
  sslHandshakeTimeoutUnit: TimeUnit? = null,
  trustOptions: io.vertx.core.net.TrustOptions? = null,
  useAlpn: Boolean? = null): SSLOptions = io.vertx.core.net.SSLOptions().apply {

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
  if (enabledCipherSuites != null) {
    for (item in enabledCipherSuites) {
      this.addEnabledCipherSuite(item)
    }
  }
  if (enabledSecureTransportProtocols != null) {
    this.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols.toSet())
  }
  if (keyExchangeGroups != null) {
    this.setKeyExchangeGroups(keyExchangeGroups.toList())
  }
  if (pqcEnforcementPolicy != null) {
    this.setPqcEnforcementPolicy(pqcEnforcementPolicy)
  }
  if (sslHandshakeTimeout != null) {
    this.setSslHandshakeTimeout(sslHandshakeTimeout)
  }
  if (sslHandshakeTimeoutUnit != null) {
    this.setSslHandshakeTimeoutUnit(sslHandshakeTimeoutUnit)
  }
  if (trustOptions != null) {
    this.setTrustOptions(trustOptions)
  }
  if (useAlpn != null) {
    this.setUseAlpn(useAlpn)
  }
}

