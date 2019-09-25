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

import io.vertx.core.net.NetServer
import io.vertx.core.net.SocketAddress
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.net.NetServer.listen]
 *
 * @return [NetServer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetServer] using Vert.x codegen.
 */
suspend fun NetServer.listenAwait(): NetServer {
  return awaitResult {
    this.listen(it)
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetServer.listen]
 *
 * @param port the port to listen on
 * @param host the host to listen on
 * @return [NetServer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetServer] using Vert.x codegen.
 */
suspend fun NetServer.listenAwait(port: Int, host: String): NetServer {
  return awaitResult {
    this.listen(port, host, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetServer.listen]
 *
 * @param port the port to listen on
 * @return [NetServer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetServer] using Vert.x codegen.
 */
suspend fun NetServer.listenAwait(port: Int): NetServer {
  return awaitResult {
    this.listen(port, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetServer.listen]
 *
 * @param localAddress the local address to listen on
 * @return [NetServer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetServer] using Vert.x codegen.
 */
suspend fun NetServer.listenAwait(localAddress: SocketAddress): NetServer {
  return awaitResult {
    this.listen(localAddress, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetServer.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetServer] using Vert.x codegen.
 */
suspend fun NetServer.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

