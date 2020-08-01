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
package io.vertx.kotlin.core.net

import io.vertx.core.net.NetClient
import io.vertx.core.net.NetSocket
import io.vertx.core.net.SocketAddress
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.net.NetClient.connect]
 *
 * @param port the port
 * @param host the host
 * @return [NetSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use connect returning a future and chain with await()", replaceWith = ReplaceWith("connect(port, host).await()"))
suspend fun NetClient.connectAwait(port: Int, host: String): NetSocket {
  return awaitResult {
    this.connect(port, host, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetClient.connect]
 *
 * @param port the port
 * @param host the host
 * @param serverName the SNI server name
 * @return [NetSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use connect returning a future and chain with await()", replaceWith = ReplaceWith("connect(port, host, serverName).await()"))
suspend fun NetClient.connectAwait(port: Int, host: String, serverName: String): NetSocket {
  return awaitResult {
    this.connect(port, host, serverName, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetClient.connect]
 *
 * @param remoteAddress the remote address
 * @return [NetSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use connect returning a future and chain with await()", replaceWith = ReplaceWith("connect(remoteAddress).await()"))
suspend fun NetClient.connectAwait(remoteAddress: SocketAddress): NetSocket {
  return awaitResult {
    this.connect(remoteAddress, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetClient.connect]
 *
 * @param remoteAddress the remote address
 * @param serverName the SNI server name
 * @return [NetSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use connect returning a future and chain with await()", replaceWith = ReplaceWith("connect(remoteAddress, serverName).await()"))
suspend fun NetClient.connectAwait(remoteAddress: SocketAddress, serverName: String): NetSocket {
  return awaitResult {
    this.connect(remoteAddress, serverName, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetClient.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with await()", replaceWith = ReplaceWith("close().await()"))
suspend fun NetClient.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

