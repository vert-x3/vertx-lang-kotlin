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

import io.vertx.core.http.RequestOptions
import io.vertx.core.net.ProxyOptions

/**
 * A function providing a DSL for building [io.vertx.core.http.RequestOptions] objects.
 *
 * Options describing how an [io.vertx.core.http.HttpClient] will connect to make a request.
 *
 * @param absoluteURI  Parse an absolute URI to use, this will update the <code>ssl</code>, <code>host</code>, <code>port</code> and <code>uri</code> fields.
 * @param connectTimeout  Sets the amount of time after which, if the request is not obtained from the client within the timeout period, the <code>Future<HttpClientRequest></code> obtained from the client is failed with a [java.util.concurrent.TimeoutException]. Note this is not related to the TCP [io.vertx.core.http.HttpClientOptions] option, when a request is made against a pooled HTTP client, the timeout applies to the duration to obtain a connection from the pool to serve the request, the timeout might fire because the server does not respond in time or the pool is too busy to serve a request.
 * @param followRedirects  Set whether to follow HTTP redirect
 * @param host  Set the host name to be used by the client request.
 * @param idleTimeout  Sets the amount of time after which, if the request does not return any data within the timeout period, the request/response is closed and the related futures are failed with a [java.util.concurrent.TimeoutException], e.g. <code>Future<HttpClientResponse></code> or <code>Future<Buffer></code> response body. <p/>The timeout starts after a connection is obtained from the client, similar to calling [io.vertx.core.http.HttpClientRequest].
 * @param port  Set the port to be used by the client request.
 * @param proxyOptions  Override the [io.vertx.core.http.HttpClientOptions] proxy options for connections.
 * @param server  Set the server address to be used by the client request. <p> When the server address is <code>null</code>, the address will be resolved after the <code>host</code> property by the Vert.x resolver. <p> Use this when you want to connect to a specific server address without name resolution.
 * @param ssl  Set whether SSL/TLS is enabled.
 * @param timeout  Sets both connect and idle timeouts for the request <ul>   <li><i>connect timeout</i>: if the request is not obtained from the client within the timeout period, the <code>Future<HttpClientRequest></code>   obtained from the client is failed with a [java.util.concurrent.TimeoutException].</li>   <li><i>idle timeout</i>: if the request does not return any data within the timeout period, the request/response is closed and the   related futures are failed with a [java.util.concurrent.TimeoutException], e.g. <code>Future<HttpClientResponse></code>   or <code>Future<Buffer></code> response body.</li> </ul> The connect and idle timeouts can be set separately using [io.vertx.core.http.RequestOptions] and [io.vertx.core.http.RequestOptions]
 * @param traceOperation  Override the operation the tracer use for this request. When no operation is set, the HTTP method is used instead.
 * @param uri  Set the request relative URI.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.RequestOptions original] using Vert.x codegen.
 */
fun requestOptionsOf(
  absoluteURI: String? = null,
  connectTimeout: Long? = null,
  followRedirects: Boolean? = null,
  host: String? = null,
  idleTimeout: Long? = null,
  port: Int? = null,
  proxyOptions: io.vertx.core.net.ProxyOptions? = null,
  server: io.vertx.core.net.SocketAddress? = null,
  ssl: Boolean? = null,
  timeout: Long? = null,
  traceOperation: String? = null,
  uri: String? = null): RequestOptions = io.vertx.core.http.RequestOptions().apply {

  if (absoluteURI != null) {
    this.setAbsoluteURI(absoluteURI)
  }
  if (connectTimeout != null) {
    this.setConnectTimeout(connectTimeout)
  }
  if (followRedirects != null) {
    this.setFollowRedirects(followRedirects)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (idleTimeout != null) {
    this.setIdleTimeout(idleTimeout)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (proxyOptions != null) {
    this.setProxyOptions(proxyOptions)
  }
  if (server != null) {
    this.setServer(server)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (timeout != null) {
    this.setTimeout(timeout)
  }
  if (traceOperation != null) {
    this.setTraceOperation(traceOperation)
  }
  if (uri != null) {
    this.setURI(uri)
  }
}

