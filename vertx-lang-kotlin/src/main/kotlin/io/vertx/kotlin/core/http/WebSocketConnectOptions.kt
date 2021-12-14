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

import io.vertx.core.http.WebSocketConnectOptions
import io.vertx.core.http.WebsocketVersion
import io.vertx.core.net.ProxyOptions

/**
 * A function providing a DSL for building [io.vertx.core.http.WebSocketConnectOptions] objects.
 *
 * Options describing how an [io.vertx.core.http.HttpClient] connect a [io.vertx.core.http.WebSocket].
 *
 * @param absoluteURI  Parse an absolute URI to use, this will update the <code>ssl</code>, <code>host</code>, <code>port</code> and <code>uri</code> fields.
 * @param allowOriginHeader  Set whether to add the <code>origin</code> header to the WebSocket handshake request, enabled by default. <p> Set to <code>false</code> when a server does not accept WebSocket with an origin header.
 * @param followRedirects  Set whether to follow HTTP redirect
 * @param headers  Add a request header.
 * @param host  Set the host name to be used by the client request.
 * @param port  Set the port to be used by the client request.
 * @param proxyOptions  Override the [io.vertx.core.http.HttpClientOptions] proxy options for connections.
 * @param server  Set the server address to be used by the client request. <p> When the server address is <code>null</code>, the address will be resolved after the <code>host</code> property by the Vert.x resolver. <p> Use this when you want to connect to a specific server address without name resolution.
 * @param ssl  Set whether SSL/TLS is enabled.
 * @param subProtocols  Set the WebSocket sub protocols to use.
 * @param timeout  Sets the amount of time after which if the request does not return any data within the timeout period an [java.util.concurrent.TimeoutException] will be passed to the exception handler and the request will be closed.
 * @param traceOperation  Override the operation the tracer use for this request. When no operation is set, the HTTP method is used instead.
 * @param uri  Set the request relative URI.
 * @param version  Set the WebSocket version.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.WebSocketConnectOptions original] using Vert.x codegen.
 */
fun webSocketConnectOptionsOf(
  absoluteURI: String? = null,
  allowOriginHeader: Boolean? = null,
  followRedirects: Boolean? = null,
  headers: Map<String, String>? = null,
  host: String? = null,
  port: Int? = null,
  proxyOptions: io.vertx.core.net.ProxyOptions? = null,
  server: io.vertx.core.net.SocketAddress? = null,
  ssl: Boolean? = null,
  subProtocols: Iterable<String>? = null,
  timeout: Long? = null,
  traceOperation: String? = null,
  uri: String? = null,
  version: WebsocketVersion? = null): WebSocketConnectOptions = io.vertx.core.http.WebSocketConnectOptions().apply {

  if (absoluteURI != null) {
    this.setAbsoluteURI(absoluteURI)
  }
  if (allowOriginHeader != null) {
    this.setAllowOriginHeader(allowOriginHeader)
  }
  if (followRedirects != null) {
    this.setFollowRedirects(followRedirects)
  }
  if (headers != null) {
    for (item in headers) {
      this.addHeader(item.key, item.value)
    }
  }
  if (host != null) {
    this.setHost(host)
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
  if (subProtocols != null) {
    this.setSubProtocols(subProtocols.toList())
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
  if (version != null) {
    this.setVersion(version)
  }
}

