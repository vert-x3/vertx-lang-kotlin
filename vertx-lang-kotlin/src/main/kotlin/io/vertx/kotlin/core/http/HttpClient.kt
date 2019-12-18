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

import io.vertx.core.MultiMap
import io.vertx.core.http.HttpClient
import io.vertx.core.http.HttpClientResponse
import io.vertx.core.http.RequestOptions
import io.vertx.core.http.WebSocket
import io.vertx.core.http.WebSocketConnectOptions
import io.vertx.core.http.WebsocketVersion
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.getNow]
 *
 * @param options the request options
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.getNowAwait(options: RequestOptions): HttpClientResponse {
  return awaitResult {
    this.getNow(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.getNow]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.getNowAwait(port: Int, host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.getNow(port, host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.getNow]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.getNowAwait(host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.getNow(host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.getNow]
 *
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.getNowAwait(requestURI: String): HttpClientResponse {
  return awaitResult {
    this.getNow(requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.headNow]
 *
 * @param options the request options
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.headNowAwait(options: RequestOptions): HttpClientResponse {
  return awaitResult {
    this.headNow(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.headNow]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.headNowAwait(port: Int, host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.headNow(port, host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.headNow]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.headNowAwait(host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.headNow(host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.headNow]
 *
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.headNowAwait(requestURI: String): HttpClientResponse {
  return awaitResult {
    this.headNow(requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.optionsNow]
 *
 * @param options the request options
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.optionsNowAwait(options: RequestOptions): HttpClientResponse {
  return awaitResult {
    this.optionsNow(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.optionsNow]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.optionsNowAwait(port: Int, host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.optionsNow(port, host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.optionsNow]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.optionsNowAwait(host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.optionsNow(host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.optionsNow]
 *
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.optionsNowAwait(requestURI: String): HttpClientResponse {
  return awaitResult {
    this.optionsNow(requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.webSocket]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @return [WebSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.webSocketAwait(port: Int, host: String, requestURI: String): WebSocket {
  return awaitResult {
    this.webSocket(port, host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.webSocket]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @return [WebSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.webSocketAwait(host: String, requestURI: String): WebSocket {
  return awaitResult {
    this.webSocket(host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.webSocket]
 *
 * @param requestURI the relative URI
 * @return [WebSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.webSocketAwait(requestURI: String): WebSocket {
  return awaitResult {
    this.webSocket(requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.webSocket]
 *
 * @param options the request options
 * @return [WebSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.webSocketAwait(options: WebSocketConnectOptions): WebSocket {
  return awaitResult {
    this.webSocket(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.webSocketAbs]
 *
 * @param url the absolute url
 * @param headers the headers
 * @param version the WebSocket version
 * @param subProtocols the subprotocols to use
 * @return [WebSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.webSocketAbsAwait(url: String, headers: MultiMap, version: WebsocketVersion, subProtocols: List<String>): WebSocket {
  return awaitResult {
    this.webSocketAbs(url, headers, version, subProtocols, it)
  }
}

