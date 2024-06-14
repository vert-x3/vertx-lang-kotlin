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
package io.vertx.kotlin.core.http

import io.vertx.core.http.HttpConnectOptions
import io.vertx.core.net.Address
import io.vertx.core.net.ClientSSLOptions
import io.vertx.core.net.ProxyOptions

/**
 * A function providing a DSL for building [io.vertx.core.http.HttpConnectOptions] objects.
 *
 * Options describing how an [io.vertx.core.http.HttpClient] will connect to a server.
 *
 * @param proxyOptions  Override the [io.vertx.core.http.HttpClientOptions] proxy options for connections.
 * @param server  Set the server address to be used by the client request. <p> When the server address is <code>null</code>, the address will be resolved after the <code>host</code> property by the Vert.x resolver. <p> Use this when you want to connect to a specific server address without name resolution.
 * @param host  Set the host name to be used by the client request.
 * @param port  Set the port to be used by the client request.
 * @param ssl  Set whether SSL/TLS is enabled.
 * @param sslOptions  Set the SSL options to use. <p> When none is provided, the client SSL options will be used instead.
 * @param connectTimeout  Sets the amount of time after which, if the request is not obtained from the client within the timeout period, the <code>Future<HttpClientRequest></code> obtained from the client is failed with a [java.util.concurrent.TimeoutException]. Note this is not related to the TCP [io.vertx.core.http.HttpClientOptions] option, when a request is made against a pooled HTTP client, the timeout applies to the duration to obtain a connection from the pool to serve the request, the timeout might fire because the server does not respond in time or the pool is too busy to serve a request.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpConnectOptions original] using Vert.x codegen.
 */
fun httpConnectOptionsOf(
  proxyOptions: io.vertx.core.net.ProxyOptions? = null,
  server: io.vertx.core.net.Address? = null,
  host: String? = null,
  port: Int? = null,
  ssl: Boolean? = null,
  sslOptions: io.vertx.core.net.ClientSSLOptions? = null,
  connectTimeout: Long? = null): HttpConnectOptions = io.vertx.core.http.HttpConnectOptions().apply {

  if (proxyOptions != null) {
    this.setProxyOptions(proxyOptions)
  }
  if (server != null) {
    this.setServer(server)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (sslOptions != null) {
    this.setSslOptions(sslOptions)
  }
  if (connectTimeout != null) {
    this.setConnectTimeout(connectTimeout)
  }
}

