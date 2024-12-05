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

import io.vertx.core.http.HttpServer
import io.vertx.core.net.SSLOptions
import io.vertx.core.net.SocketAddress
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.http.HttpServer.updateSSLOptions]
 *
 * @param options the new SSL options
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use updateSSLOptions returning a future and chain with coAwait()", replaceWith = ReplaceWith("updateSSLOptions(options).coAwait()"))
suspend fun HttpServer.updateSSLOptionsAwait(options: SSLOptions): Boolean {
  return awaitResult {
    this.updateSSLOptions(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServer.updateSSLOptions]
 *
 * @param options the new SSL options
 * @param force force the update when options are equals
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use updateSSLOptions returning a future and chain with coAwait()", replaceWith = ReplaceWith("updateSSLOptions(options, force).coAwait()"))
suspend fun HttpServer.updateSSLOptionsAwait(options: SSLOptions, force: Boolean): Boolean {
  return awaitResult {
    this.updateSSLOptions(options, force, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServer.listen]
 *
 * @param port the port to listen on
 * @param host the host to listen on
 * @return [HttpServer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use listen returning a future and chain with coAwait()", replaceWith = ReplaceWith("listen(port, host).coAwait()"))
suspend fun HttpServer.listenAwait(port: Int, host: String): HttpServer {
  return awaitResult {
    this.listen(port, host, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServer.listen]
 *
 * @param address the address to listen on
 * @return [HttpServer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use listen returning a future and chain with coAwait()", replaceWith = ReplaceWith("listen(address).coAwait()"))
suspend fun HttpServer.listenAwait(address: SocketAddress): HttpServer {
  return awaitResult {
    this.listen(address, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServer.listen]
 *
 * @param port the port to listen on
 * @return [HttpServer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use listen returning a future and chain with coAwait()", replaceWith = ReplaceWith("listen(port).coAwait()"))
suspend fun HttpServer.listenAwait(port: Int): HttpServer {
  return awaitResult {
    this.listen(port, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServer.listen]
 *
 * @return [HttpServer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use listen returning a future and chain with coAwait()", replaceWith = ReplaceWith("listen().coAwait()"))
suspend fun HttpServer.listenAwait(): HttpServer {
  return awaitResult {
    this.listen(it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServer.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with coAwait()", replaceWith = ReplaceWith("close().coAwait()"))
suspend fun HttpServer.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

