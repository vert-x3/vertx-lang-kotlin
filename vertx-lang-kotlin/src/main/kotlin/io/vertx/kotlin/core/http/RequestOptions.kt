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
 * Options describing how an [io.vertx.core.http.HttpClient] will connect to make a request.
 *
 * @param absoluteURI  Parse an absolute URI to use, this will update the <code>ssl</code>, <code>host</code>, <code>port</code> and <code>uri</code> fields.
 * @param followRedirects  Set whether to follow HTTP redirect
 * @param headers  Add a request header.
 * @param host  Set the host name to be used by the client request.
 * @param method  Set the HTTP method to be used by the client request.
 * @param port  Set the port to be used by the client request.
 * @param ssl  Set whether SSL/TLS is enabled
 * @param timeout  Sets the amount of time after which if the request does not return any data within the timeout period an [java.util.concurrent.TimeoutException] will be passed to the exception handler and the request will be closed.
 * @param uri  Set the request relative URI
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.RequestOptions original] using Vert.x codegen.
 */
fun requestOptionsOf(
  absoluteURI: String? = null,
  followRedirects: Boolean? = null,
  headers: Map<String, String>? = null,
  host: String? = null,
  method: io.vertx.core.http.HttpMethod? = null,
  port: Int? = null,
  ssl: Boolean? = null,
  timeout: Long? = null,
  uri: String? = null): RequestOptions = io.vertx.core.http.RequestOptions().apply {

  if (absoluteURI != null) {
    this.setAbsoluteURI(absoluteURI)
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
  if (method != null) {
    this.setMethod(method)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (timeout != null) {
    this.setTimeout(timeout)
  }
  if (uri != null) {
    this.setURI(uri)
  }
}

/**
 * A function providing a DSL for building [io.vertx.core.http.RequestOptions] objects.
 *
 * Options describing how an [io.vertx.core.http.HttpClient] will connect to make a request.
 *
 * @param absoluteURI  Parse an absolute URI to use, this will update the <code>ssl</code>, <code>host</code>, <code>port</code> and <code>uri</code> fields.
 * @param followRedirects  Set whether to follow HTTP redirect
 * @param headers  Add a request header.
 * @param host  Set the host name to be used by the client request.
 * @param method  Set the HTTP method to be used by the client request.
 * @param port  Set the port to be used by the client request.
 * @param ssl  Set whether SSL/TLS is enabled
 * @param timeout  Sets the amount of time after which if the request does not return any data within the timeout period an [java.util.concurrent.TimeoutException] will be passed to the exception handler and the request will be closed.
 * @param uri  Set the request relative URI
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.RequestOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("requestOptionsOf(absoluteURI, followRedirects, headers, host, method, port, ssl, timeout, uri)")
)
fun RequestOptions(
  absoluteURI: String? = null,
  followRedirects: Boolean? = null,
  headers: Map<String, String>? = null,
  host: String? = null,
  method: io.vertx.core.http.HttpMethod? = null,
  port: Int? = null,
  ssl: Boolean? = null,
  timeout: Long? = null,
  uri: String? = null): RequestOptions = io.vertx.core.http.RequestOptions().apply {

  if (absoluteURI != null) {
    this.setAbsoluteURI(absoluteURI)
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
  if (method != null) {
    this.setMethod(method)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (timeout != null) {
    this.setTimeout(timeout)
  }
  if (uri != null) {
    this.setURI(uri)
  }
}

