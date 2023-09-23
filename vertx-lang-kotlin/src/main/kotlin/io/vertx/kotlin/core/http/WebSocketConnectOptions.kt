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
import io.vertx.core.http.HttpMethod
import io.vertx.core.http.WebsocketVersion
import io.vertx.core.net.ProxyOptions

/**
 * A function providing a DSL for building [io.vertx.core.http.WebSocketConnectOptions] objects.
 *
 * Options describing how an [io.vertx.core.http.HttpClient] connect a [io.vertx.core.http.WebSocket].
 *
 * @param server  Set the server address to be used by the client request. <p> When the server address is <code>null</code>, the address will be resolved after the <code>host</code> property by the Vert.x resolver. <p> Use this when you want to connect to a specific server address without name resolution.
 * @param host  Set the host name to be used by the client request.
 * @param port  Set the port to be used by the client request.
 * @param ssl  Set whether SSL/TLS is enabled.
 * @param uri  Set the request relative URI.
 * @param followRedirects  Set whether to follow HTTP redirect
 * @param timeout  Sets the amount of time after which if the WebSocket handshake does not happen within the timeout period an  will be passed to the exception handler and the connection will be closed.
 * @param traceOperation  Override the operation the tracer use for this request. When no operation is set, the HTTP method is used instead.
 * @param version  Set the WebSocket version.
 * @param subProtocols  Set the WebSocket sub protocols to use.
 * @param proxyOptions  Override the [io.vertx.core.http.HttpClientOptions] proxy options for connections.
 * @param allowOriginHeader  Set whether to add the <code>origin</code> header to the WebSocket handshake request, enabled by default. <p> Set to <code>false</code> when a server does not accept WebSocket with an origin header.
 * @param headers  Add a request header.
 * @param method  Set the HTTP method to be used by the client request.
 * @param absoluteURI  Like [io.vertx.core.http.WebSocketConnectOptions] but using an  parameter.
 * @param registerWriteHandlers  Whether write-handlers should be registered on the [io.vertx.core.eventbus.EventBus]. <p> Defaults to <code>false</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.WebSocketConnectOptions original] using Vert.x codegen.
 */
fun webSocketConnectOptionsOf(
  server: io.vertx.core.net.SocketAddress? = null,
  host: String? = null,
  port: Int? = null,
  ssl: Boolean? = null,
  uri: String? = null,
  followRedirects: Boolean? = null,
  timeout: Long? = null,
  traceOperation: String? = null,
  version: WebsocketVersion? = null,
  subProtocols: Iterable<String>? = null,
  proxyOptions: io.vertx.core.net.ProxyOptions? = null,
  allowOriginHeader: Boolean? = null,
  headers: Map<String, String>? = null,
  method: io.vertx.core.http.HttpMethod? = null,
  absoluteURI: java.net.URL? = null,
  registerWriteHandlers: Boolean? = null): WebSocketConnectOptions = io.vertx.core.http.WebSocketConnectOptions().apply {

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
  if (uri != null) {
    this.setURI(uri)
  }
  if (followRedirects != null) {
    this.setFollowRedirects(followRedirects)
  }
  if (timeout != null) {
    this.setTimeout(timeout)
  }
  if (traceOperation != null) {
    this.setTraceOperation(traceOperation)
  }
  if (version != null) {
    this.setVersion(version)
  }
  if (subProtocols != null) {
    this.setSubProtocols(subProtocols.toList())
  }
  if (proxyOptions != null) {
    this.setProxyOptions(proxyOptions)
  }
  if (allowOriginHeader != null) {
    this.setAllowOriginHeader(allowOriginHeader)
  }
  if (headers != null) {
    for (item in headers) {
      this.addHeader(item.key, item.value)
    }
  }
  if (method != null) {
    this.setMethod(method)
  }
  if (absoluteURI != null) {
    this.setAbsoluteURI(absoluteURI)
  }
  if (registerWriteHandlers != null) {
    this.setRegisterWriteHandlers(registerWriteHandlers)
  }
}

