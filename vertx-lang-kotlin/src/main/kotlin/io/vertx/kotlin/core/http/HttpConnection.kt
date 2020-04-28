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

/**
 * Suspending version of method [io.vertx.core.http.HttpConnection.shutdown]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpConnection] using Vert.x codegen.
 */
suspend fun HttpConnection.shutdownAwait(): Unit {
  return awaitResult {
    this.shutdown(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpConnection.shutdown]
 *
 * @param timeout 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpConnection] using Vert.x codegen.
 */
suspend fun HttpConnection.shutdownAwait(timeout: Long): Unit {
  return awaitResult {
    this.shutdown(timeout, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpConnection.updateSettings]
 *
 * @param settings the new settings
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpConnection] using Vert.x codegen.
 */
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
suspend fun HttpConnection.pingAwait(data: Buffer): Buffer {
  return awaitResult {
    this.ping(data, it)
  }
}

