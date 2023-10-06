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

import io.vertx.core.http.WebSocket
import io.vertx.core.http.WebSocketClient
import io.vertx.core.http.WebSocketConnectOptions
import io.vertx.core.net.SSLOptions
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.http.WebSocketClient.connect]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @return [WebSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocketClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use connect returning a future and chain with await()", replaceWith = ReplaceWith("connect(port, host, requestURI).await()"))
suspend fun WebSocketClient.connectAwait(port: Int, host: String, requestURI: String): WebSocket {
  return awaitResult {
    this.connect(port, host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocketClient.connect]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @return [WebSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocketClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use connect returning a future and chain with await()", replaceWith = ReplaceWith("connect(host, requestURI).await()"))
suspend fun WebSocketClient.connectAwait(host: String, requestURI: String): WebSocket {
  return awaitResult {
    this.connect(host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocketClient.connect]
 *
 * @param requestURI the relative URI
 * @return [WebSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocketClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use connect returning a future and chain with await()", replaceWith = ReplaceWith("connect(requestURI).await()"))
suspend fun WebSocketClient.connectAwait(requestURI: String): WebSocket {
  return awaitResult {
    this.connect(requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocketClient.connect]
 *
 * @param options the request options
 * @return [WebSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocketClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use connect returning a future and chain with await()", replaceWith = ReplaceWith("connect(options).await()"))
suspend fun WebSocketClient.connectAwait(options: WebSocketConnectOptions): WebSocket {
  return awaitResult {
    this.connect(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocketClient.updateSSLOptions]
 *
 * @param options the new SSL options
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocketClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use updateSSLOptions returning a future and chain with await()", replaceWith = ReplaceWith("updateSSLOptions(options).await()"))
suspend fun WebSocketClient.updateSSLOptionsAwait(options: SSLOptions): Unit {
  return awaitResult {
    this.updateSSLOptions(options, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocketClient.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocketClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with await()", replaceWith = ReplaceWith("close().await()"))
suspend fun WebSocketClient.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

