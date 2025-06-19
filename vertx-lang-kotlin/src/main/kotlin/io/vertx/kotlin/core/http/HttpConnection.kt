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

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.Http2Settings
import io.vertx.core.http.HttpConnection
import io.vertx.kotlin.coroutines.awaitResult
import java.util.concurrent.TimeUnit

/**
 * Suspending version of method [io.vertx.core.http.HttpConnection.shutdown]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use shutdown returning a future and chain with coAwait()", replaceWith = ReplaceWith("shutdown().coAwait()"))
suspend fun HttpConnection.shutdownAwait(): Unit {
  return awaitResult {
    this.shutdown(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpConnection.shutdown]
 *
 * @param timeout the amount of time after which all resources are forcibly closed
 * @param unit the of the timeout
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use shutdown returning a future and chain with coAwait()", replaceWith = ReplaceWith("shutdown(timeout, unit).coAwait()"))
suspend fun HttpConnection.shutdownAwait(timeout: Long, unit: TimeUnit): Unit {
  return awaitResult {
    this.shutdown(timeout, unit, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpConnection.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with coAwait()", replaceWith = ReplaceWith("close().coAwait()"))
suspend fun HttpConnection.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpConnection.updateSettings]
 *
 * @param settings the new settings
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use updateSettings returning a future and chain with coAwait()", replaceWith = ReplaceWith("updateSettings(settings).coAwait()"))
suspend fun HttpConnection.updateSettingsAwait(settings: Http2Settings): Unit {
  return awaitResult {
    this.updateSettings(settings, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpConnection.ping]
 *
 * @param data the 8 bytes data of the frame
 * @return [Buffer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ping returning a future and chain with coAwait()", replaceWith = ReplaceWith("ping(data).coAwait()"))
suspend fun HttpConnection.pingAwait(data: Buffer): Buffer {
  return awaitResult {
    this.ping(data, it)
  }
}

