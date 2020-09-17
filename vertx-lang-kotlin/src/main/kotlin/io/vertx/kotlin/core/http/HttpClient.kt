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
import io.vertx.core.http.HttpClientRequest
import io.vertx.core.http.HttpMethod
import io.vertx.core.http.RequestOptions
import io.vertx.core.http.WebSocket
import io.vertx.core.http.WebSocketConnectOptions
import io.vertx.core.http.WebsocketVersion
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.request]
 *
 * @param options the request options
 * @return [HttpClientRequest]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use request returning a future and chain with await()", replaceWith = ReplaceWith("request(options).await()"))
suspend fun HttpClient.requestAwait(options: RequestOptions): HttpClientRequest {
  return awaitResult {
    this.request(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.request]
 *
 * @param method the HTTP method
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientRequest]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use request returning a future and chain with await()", replaceWith = ReplaceWith("request(method, port, host, requestURI).await()"))
suspend fun HttpClient.requestAwait(method: HttpMethod, port: Int, host: String, requestURI: String): HttpClientRequest {
  return awaitResult {
    this.request(method, port, host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.request]
 *
 * @param method the HTTP method
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientRequest]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use request returning a future and chain with await()", replaceWith = ReplaceWith("request(method, host, requestURI).await()"))
suspend fun HttpClient.requestAwait(method: HttpMethod, host: String, requestURI: String): HttpClientRequest {
  return awaitResult {
    this.request(method, host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.request]
 *
 * @param method the HTTP method
 * @param requestURI the relative URI
 * @return [HttpClientRequest]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use request returning a future and chain with await()", replaceWith = ReplaceWith("request(method, requestURI).await()"))
suspend fun HttpClient.requestAwait(method: HttpMethod, requestURI: String): HttpClientRequest {
  return awaitResult {
    this.request(method, requestURI, it)
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
@Deprecated(message = "Instead use webSocket returning a future and chain with await()", replaceWith = ReplaceWith("webSocket(port, host, requestURI).await()"))
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
@Deprecated(message = "Instead use webSocket returning a future and chain with await()", replaceWith = ReplaceWith("webSocket(host, requestURI).await()"))
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
@Deprecated(message = "Instead use webSocket returning a future and chain with await()", replaceWith = ReplaceWith("webSocket(requestURI).await()"))
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
@Deprecated(message = "Instead use webSocket returning a future and chain with await()", replaceWith = ReplaceWith("webSocket(options).await()"))
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
@Deprecated(message = "Instead use webSocketAbs returning a future and chain with await()", replaceWith = ReplaceWith("webSocketAbs(url, headers, version, subProtocols).await()"))
suspend fun HttpClient.webSocketAbsAwait(url: String, headers: MultiMap, version: WebsocketVersion, subProtocols: List<String>): WebSocket {
  return awaitResult {
    this.webSocketAbs(url, headers, version, subProtocols, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with await()", replaceWith = ReplaceWith("close().await()"))
suspend fun HttpClient.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

