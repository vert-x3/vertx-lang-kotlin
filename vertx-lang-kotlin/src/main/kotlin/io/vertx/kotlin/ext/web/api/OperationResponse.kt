package io.vertx.kotlin.ext.web.api

import io.vertx.ext.web.api.OperationResponse

fun operationResponseOf(
  headers: io.vertx.core.MultiMap? = null,
  payload: io.vertx.core.buffer.Buffer? = null,
  statusCode: Int? = null,
  statusMessage: String? = null): OperationResponse = io.vertx.ext.web.api.OperationResponse().apply {

  if (headers != null) {
    this.setHeaders(headers)
  }
  if (payload != null) {
    this.setPayload(payload)
  }
  if (statusCode != null) {
    this.setStatusCode(statusCode)
  }
  if (statusMessage != null) {
    this.setStatusMessage(statusMessage)
  }
}

