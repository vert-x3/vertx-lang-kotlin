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
import io.vertx.core.buffer.Buffer
import io.vertx.core.http.HttpClient
import io.vertx.core.http.HttpClientResponse
import io.vertx.core.http.HttpMethod
import io.vertx.core.http.RequestOptions
import io.vertx.core.http.WebSocket
import io.vertx.core.http.WebSocketConnectOptions
import io.vertx.core.http.WebsocketVersion
import io.vertx.core.streams.ReadStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param options the request options
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(options: RequestOptions): HttpClientResponse {
  return awaitResult {
    this.send(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param options the request options
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(options: RequestOptions, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.send(options, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param options the request options
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(options: RequestOptions, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.send(options, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param method the HTTP method
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(method: HttpMethod, port: Int, host: String, requestURI: String, headers: MultiMap): HttpClientResponse {
  return awaitResult {
    this.send(method, port, host, requestURI, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param method the HTTP method
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(method: HttpMethod, port: Int, host: String, requestURI: String, headers: MultiMap, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.send(method, port, host, requestURI, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param method the HTTP method
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(method: HttpMethod, port: Int, host: String, requestURI: String, headers: MultiMap, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.send(method, port, host, requestURI, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param method the HTTP method
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(method: HttpMethod, port: Int, host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.send(method, port, host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param method the HTTP method
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(method: HttpMethod, port: Int, host: String, requestURI: String, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.send(method, port, host, requestURI, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param method the HTTP method
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(method: HttpMethod, port: Int, host: String, requestURI: String, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.send(method, port, host, requestURI, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param method the HTTP method
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(method: HttpMethod, host: String, requestURI: String, headers: MultiMap): HttpClientResponse {
  return awaitResult {
    this.send(method, host, requestURI, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param method the HTTP method
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(method: HttpMethod, host: String, requestURI: String, headers: MultiMap, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.send(method, host, requestURI, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param method the HTTP method
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(method: HttpMethod, host: String, requestURI: String, headers: MultiMap, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.send(method, host, requestURI, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param method the HTTP method
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(method: HttpMethod, host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.send(method, host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param method the HTTP method
 * @param host the host
 * @param requestURI the relative URI
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(method: HttpMethod, host: String, requestURI: String, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.send(method, host, requestURI, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param method the HTTP method
 * @param host the host
 * @param requestURI the relative URI
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(method: HttpMethod, host: String, requestURI: String, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.send(method, host, requestURI, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param method the HTTP method
 * @param requestURI the relative URI
 * @param headers the headers
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(method: HttpMethod, requestURI: String, headers: MultiMap): HttpClientResponse {
  return awaitResult {
    this.send(method, requestURI, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param method the HTTP method
 * @param requestURI the relative URI
 * @param headers the headers
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(method: HttpMethod, requestURI: String, headers: MultiMap, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.send(method, requestURI, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param method the HTTP method
 * @param requestURI the relative URI
 * @param headers the headers
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(method: HttpMethod, requestURI: String, headers: MultiMap, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.send(method, requestURI, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param method the HTTP method
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(method: HttpMethod, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.send(method, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param method the HTTP method
 * @param requestURI the relative URI
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(method: HttpMethod, requestURI: String, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.send(method, requestURI, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.send]
 *
 * @param method the HTTP method
 * @param requestURI the relative URI
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.sendAwait(method: HttpMethod, requestURI: String, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.send(method, requestURI, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.get]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.getAwait(port: Int, host: String, requestURI: String, headers: MultiMap): HttpClientResponse {
  return awaitResult {
    this.get(port, host, requestURI, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.get]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.getAwait(host: String, requestURI: String, headers: MultiMap): HttpClientResponse {
  return awaitResult {
    this.get(host, requestURI, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.get]
 *
 * @param requestURI the relative URI
 * @param headers the headers
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.getAwait(requestURI: String, headers: MultiMap): HttpClientResponse {
  return awaitResult {
    this.get(requestURI, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.get]
 *
 * @param options the request options
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.getAwait(options: RequestOptions): HttpClientResponse {
  return awaitResult {
    this.get(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.get]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.getAwait(port: Int, host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.get(port, host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.get]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.getAwait(host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.get(host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.get]
 *
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.getAwait(requestURI: String): HttpClientResponse {
  return awaitResult {
    this.get(requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.post]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.postAwait(port: Int, host: String, requestURI: String, headers: MultiMap, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.post(port, host, requestURI, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.post]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.postAwait(port: Int, host: String, requestURI: String, headers: MultiMap, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.post(port, host, requestURI, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.post]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.postAwait(host: String, requestURI: String, headers: MultiMap, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.post(host, requestURI, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.post]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.postAwait(host: String, requestURI: String, headers: MultiMap, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.post(host, requestURI, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.post]
 *
 * @param requestURI the relative URI
 * @param headers the headers
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.postAwait(requestURI: String, headers: MultiMap, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.post(requestURI, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.post]
 *
 * @param requestURI the relative URI
 * @param headers the headers
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.postAwait(requestURI: String, headers: MultiMap, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.post(requestURI, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.post]
 *
 * @param options the request options
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.postAwait(options: RequestOptions, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.post(options, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.post]
 *
 * @param options the request options
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.postAwait(options: RequestOptions, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.post(options, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.post]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.postAwait(port: Int, host: String, requestURI: String, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.post(port, host, requestURI, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.post]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.postAwait(port: Int, host: String, requestURI: String, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.post(port, host, requestURI, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.post]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.postAwait(host: String, requestURI: String, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.post(host, requestURI, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.post]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.postAwait(host: String, requestURI: String, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.post(host, requestURI, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.post]
 *
 * @param requestURI the relative URI
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.postAwait(requestURI: String, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.post(requestURI, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.post]
 *
 * @param requestURI the relative URI
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.postAwait(requestURI: String, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.post(requestURI, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.put]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.putAwait(port: Int, host: String, requestURI: String, headers: MultiMap, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.put(port, host, requestURI, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.put]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.putAwait(port: Int, host: String, requestURI: String, headers: MultiMap, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.put(port, host, requestURI, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.put]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.putAwait(host: String, requestURI: String, headers: MultiMap, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.put(host, requestURI, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.put]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.putAwait(host: String, requestURI: String, headers: MultiMap, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.put(host, requestURI, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.put]
 *
 * @param requestURI the relative URI
 * @param headers the headers
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.putAwait(requestURI: String, headers: MultiMap, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.put(requestURI, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.put]
 *
 * @param requestURI the relative URI
 * @param headers the headers
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.putAwait(requestURI: String, headers: MultiMap, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.put(requestURI, headers, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.put]
 *
 * @param options the request options
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.putAwait(options: RequestOptions, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.put(options, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.put]
 *
 * @param options the request options
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.putAwait(options: RequestOptions, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.put(options, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.put]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.putAwait(port: Int, host: String, requestURI: String, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.put(port, host, requestURI, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.put]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.putAwait(port: Int, host: String, requestURI: String, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.put(port, host, requestURI, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.put]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.putAwait(host: String, requestURI: String, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.put(host, requestURI, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.put]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.putAwait(host: String, requestURI: String, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.put(host, requestURI, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.put]
 *
 * @param requestURI the relative URI
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.putAwait(requestURI: String, body: Buffer): HttpClientResponse {
  return awaitResult {
    this.put(requestURI, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.put]
 *
 * @param requestURI the relative URI
 * @param body the request body
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.putAwait(requestURI: String, body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.put(requestURI, body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.head]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.headAwait(port: Int, host: String, requestURI: String, headers: MultiMap): HttpClientResponse {
  return awaitResult {
    this.head(port, host, requestURI, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.head]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.headAwait(host: String, requestURI: String, headers: MultiMap): HttpClientResponse {
  return awaitResult {
    this.head(host, requestURI, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.head]
 *
 * @param requestURI the relative URI
 * @param headers the headers
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.headAwait(requestURI: String, headers: MultiMap): HttpClientResponse {
  return awaitResult {
    this.head(requestURI, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.head]
 *
 * @param options the request options
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.headAwait(options: RequestOptions): HttpClientResponse {
  return awaitResult {
    this.head(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.head]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.headAwait(port: Int, host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.head(port, host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.head]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.headAwait(host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.head(host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.head]
 *
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.headAwait(requestURI: String): HttpClientResponse {
  return awaitResult {
    this.head(requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.options]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.optionsAwait(port: Int, host: String, requestURI: String, headers: MultiMap): HttpClientResponse {
  return awaitResult {
    this.options(port, host, requestURI, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.options]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.optionsAwait(host: String, requestURI: String, headers: MultiMap): HttpClientResponse {
  return awaitResult {
    this.options(host, requestURI, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.options]
 *
 * @param requestURI the relative URI
 * @param headers the headers
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.optionsAwait(requestURI: String, headers: MultiMap): HttpClientResponse {
  return awaitResult {
    this.options(requestURI, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.options]
 *
 * @param options the request options
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.optionsAwait(options: RequestOptions): HttpClientResponse {
  return awaitResult {
    this.options(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.options]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.optionsAwait(port: Int, host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.options(port, host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.options]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.optionsAwait(host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.options(host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.options]
 *
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.optionsAwait(requestURI: String): HttpClientResponse {
  return awaitResult {
    this.options(requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.delete]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.deleteAwait(port: Int, host: String, requestURI: String, headers: MultiMap): HttpClientResponse {
  return awaitResult {
    this.delete(port, host, requestURI, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.delete]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @param headers the headers
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.deleteAwait(host: String, requestURI: String, headers: MultiMap): HttpClientResponse {
  return awaitResult {
    this.delete(host, requestURI, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.delete]
 *
 * @param requestURI the relative URI
 * @param headers the headers
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.deleteAwait(requestURI: String, headers: MultiMap): HttpClientResponse {
  return awaitResult {
    this.delete(requestURI, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.delete]
 *
 * @param options the request options
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.deleteAwait(options: RequestOptions): HttpClientResponse {
  return awaitResult {
    this.delete(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.delete]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.deleteAwait(port: Int, host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.delete(port, host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.delete]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.deleteAwait(host: String, requestURI: String): HttpClientResponse {
  return awaitResult {
    this.delete(host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClient.delete]
 *
 * @param requestURI the relative URI
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClient] using Vert.x codegen.
 */
suspend fun HttpClient.deleteAwait(requestURI: String): HttpClientResponse {
  return awaitResult {
    this.delete(requestURI, it)
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

