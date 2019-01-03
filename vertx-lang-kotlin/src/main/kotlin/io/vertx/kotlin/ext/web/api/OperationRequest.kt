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

