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

/**
 * A function providing a DSL for building [io.vertx.core.http.WebSocketConnectOptions] objects.
 *
 * Options describing how an [io.vertx.core.http.HttpClient] connect a [io.vertx.core.http.WebSocket].
 *
 * @param headers  Add a request header.
 * @param host  Set the host name to be used by the client request.
 * @param port  Set the port to be used by the client request.
 * @param ssl  Set whether SSL/TLS is enabled
 * @param subProtocols  Set the WebSocket sub protocols to use.
 * @param uri  Set the request relative URI
 * @param version  Set the WebSocket version.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.WebSocketConnectOptions original] using Vert.x codegen.
 */
fun webSocketConnectOptionsOf(
  headers: Map<String, String>? = null,
  host: String? = null,
  port: Int? = null,
  ssl: Boolean? = null,
  subProtocols: Iterable<String>? = null,
  uri: String? = null,
  version: WebsocketVersion? = null): WebSocketConnectOptions = io.vertx.core.http.WebSocketConnectOptions().apply {

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
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (subProtocols != null) {
    this.setSubProtocols(subProtocols.toList())
  }
  if (uri != null) {
    this.setURI(uri)
  }
  if (version != null) {
    this.setVersion(version)
  }
}

/**
 * A function providing a DSL for building [io.vertx.core.http.WebSocketConnectOptions] objects.
 *
 * Options describing how an [io.vertx.core.http.HttpClient] connect a [io.vertx.core.http.WebSocket].
 *
 * @param headers  Add a request header.
 * @param host  Set the host name to be used by the client request.
 * @param port  Set the port to be used by the client request.
 * @param ssl  Set whether SSL/TLS is enabled
 * @param subProtocols  Set the WebSocket sub protocols to use.
 * @param uri  Set the request relative URI
 * @param version  Set the WebSocket version.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.WebSocketConnectOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("webSocketConnectOptionsOf(headers, host, port, ssl, subProtocols, uri, version)")
)
fun WebSocketConnectOptions(
  headers: Map<String, String>? = null,
  host: String? = null,
  port: Int? = null,
  ssl: Boolean? = null,
  subProtocols: Iterable<String>? = null,
  uri: String? = null,
  version: WebsocketVersion? = null): WebSocketConnectOptions = io.vertx.core.http.WebSocketConnectOptions().apply {

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
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (subProtocols != null) {
    this.setSubProtocols(subProtocols.toList())
  }
  if (uri != null) {
    this.setURI(uri)
  }
  if (version != null) {
    this.setVersion(version)
  }
}

