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

import io.vertx.core.net.ConnectOptions
import io.vertx.core.net.ClientSSLOptions
import io.vertx.core.net.ProxyOptions

/**
 * A function providing a DSL for building [io.vertx.core.net.ConnectOptions] objects.
 *
 * Options for configuring how to connect to a TCP server.
 *
 * @param host  Set the host name to be used by the client connection.
 * @param port  Set the port to be used by the client connection.
 * @param remoteAddress  Set the remote address to be used by the client connection. <p> When the server address is <code>null</code>, the address will be resolved after the [io.vertx.core.net.ConnectOptions] property by the Vert.x resolver and the [io.vertx.core.net.ConnectOptions] will be used. <p> Use this when you want to connect to a specific server address without name resolution or use a domain socket.
 * @param sniServerName  Set the SNI server name to use.
 * @param proxyOptions  Set proxy options for connections via CONNECT proxy (e.g. Squid) or a SOCKS proxy. <p> When none is provided, the [io.vertx.core.net.NetClientOptions] proxy options will be used instead.
 * @param ssl  Set whether SSL/TLS is enabled.
 * @param sslOptions  Set the SSL options to use. <p> When none is provided, the [io.vertx.core.net.NetClientOptions] SSL options will be used instead.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.ConnectOptions original] using Vert.x codegen.
 */
fun connectOptionsOf(
  host: String? = null,
  port: Int? = null,
  remoteAddress: io.vertx.core.net.SocketAddress? = null,
  sniServerName: String? = null,
  proxyOptions: io.vertx.core.net.ProxyOptions? = null,
  ssl: Boolean? = null,
  sslOptions: io.vertx.core.net.ClientSSLOptions? = null): ConnectOptions = io.vertx.core.net.ConnectOptions().apply {

  if (host != null) {
    this.setHost(host)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (remoteAddress != null) {
    this.setRemoteAddress(remoteAddress)
  }
  if (sniServerName != null) {
    this.setSniServerName(sniServerName)
  }
  if (proxyOptions != null) {
    this.setProxyOptions(proxyOptions)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (sslOptions != null) {
    this.setSslOptions(sslOptions)
  }
}

