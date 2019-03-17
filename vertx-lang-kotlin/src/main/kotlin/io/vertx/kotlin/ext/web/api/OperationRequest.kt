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
package io.vertx.kotlin.ext.web.api

import io.vertx.ext.web.api.OperationRequest

fun operationRequestOf(
  extra: io.vertx.core.json.JsonObject? = null,
  headers: io.vertx.core.MultiMap? = null,
  params: io.vertx.core.json.JsonObject? = null,
  user: io.vertx.core.json.JsonObject? = null): OperationRequest = io.vertx.ext.web.api.OperationRequest().apply {

  if (extra != null) {
    this.setExtra(extra)
  }
  if (headers != null) {
    this.setHeaders(headers)
  }
  if (params != null) {
    this.setParams(params)
  }
  if (user != null) {
    this.setUser(user)
  }
}

@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("operationRequestOf(extra, headers, params, user)")
)
fun OperationRequest(
  extra: io.vertx.core.json.JsonObject? = null,
  headers: io.vertx.core.MultiMap? = null,
  params: io.vertx.core.json.JsonObject? = null,
  user: io.vertx.core.json.JsonObject? = null): OperationRequest = io.vertx.ext.web.api.OperationRequest().apply {

  if (extra != null) {
    this.setExtra(extra)
  }
  if (headers != null) {
    this.setHeaders(headers)
  }
  if (params != null) {
    this.setParams(params)
  }
  if (user != null) {
    this.setUser(user)
  }
}

