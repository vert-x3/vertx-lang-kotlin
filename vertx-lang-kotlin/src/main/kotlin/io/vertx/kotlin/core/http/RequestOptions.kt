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

/**
 * A function providing a DSL for building [io.vertx.core.http.RequestOptions] objects.
 *
 * Options describing how an [io.vertx.core.http.HttpClient] will make connect to make a request.
 *
 * @param host  Set the host name to be used by the client request.
 * @param port  Set the port to be used by the client request.
 * @param ssl  Set whether SSL/TLS is enabled
 * @param uri  Set the request relative URI
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.RequestOptions original] using Vert.x codegen.
 */
fun requestOptionsOf(
  host: String? = null,
  port: Int? = null,
  ssl: Boolean? = null,
  uri: String? = null): RequestOptions = io.vertx.core.http.RequestOptions().apply {

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
}

/**
 * A function providing a DSL for building [io.vertx.core.http.RequestOptions] objects.
 *
 * Options describing how an [io.vertx.core.http.HttpClient] will make connect to make a request.
 *
 * @param host  Set the host name to be used by the client request.
 * @param port  Set the port to be used by the client request.
 * @param ssl  Set whether SSL/TLS is enabled
 * @param uri  Set the request relative URI
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.RequestOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("requestOptionsOf(host, port, ssl, uri)")
)
fun RequestOptions(
  host: String? = null,
  port: Int? = null,
  ssl: Boolean? = null,
  uri: String? = null): RequestOptions = io.vertx.core.http.RequestOptions().apply {

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
}

