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
package io.vertx.kotlin.ext.stomp

import io.vertx.core.net.NetClient
import io.vertx.ext.stomp.StompClient
import io.vertx.ext.stomp.StompClientConnection
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClient.connect]
 *
 * @param port the server port
 * @param host the server host
 * @return [StompClientConnection]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use connect returning a future and chain with coAwait()", replaceWith = ReplaceWith("connect(port, host).coAwait()"))
suspend fun StompClient.connectAwait(port: Int, host: String): StompClientConnection {
  return awaitResult {
    this.connect(port, host, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClient.connect]
 *
 * @param net the NET client to use
 * @return [StompClientConnection]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use connect returning a future and chain with coAwait()", replaceWith = ReplaceWith("connect(net).coAwait()"))
suspend fun StompClient.connectAwait(net: NetClient): StompClientConnection {
  return awaitResult {
    this.connect(net, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClient.connect]
 *
 * @param port the server port
 * @param host the server host
 * @param net the NET client to use
 * @return [StompClientConnection]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use connect returning a future and chain with coAwait()", replaceWith = ReplaceWith("connect(port, host, net).coAwait()"))
suspend fun StompClient.connectAwait(port: Int, host: String, net: NetClient): StompClientConnection {
  return awaitResult {
    this.connect(port, host, net, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClient.connect]
 *
 * @return [StompClientConnection]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use connect returning a future and chain with coAwait()", replaceWith = ReplaceWith("connect().coAwait()"))
suspend fun StompClient.connectAwait(): StompClientConnection {
  return awaitResult {
    this.connect(it)
  }
}

