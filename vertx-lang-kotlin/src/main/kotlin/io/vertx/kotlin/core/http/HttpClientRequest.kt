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
import io.vertx.core.http.HttpClientRequest
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.write]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
suspend fun HttpClientRequest.writeAwait(data: Buffer): Unit {
  return awaitResult {
    this.write(data) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.write]
 *
 * @param chunk 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
suspend fun HttpClientRequest.writeAwait(chunk: String): Unit {
  return awaitResult {
    this.write(chunk) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.write]
 *
 * @param chunk 
 * @param enc 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
suspend fun HttpClientRequest.writeAwait(chunk: String, enc: String): Unit {
  return awaitResult {
    this.write(chunk, enc) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.end]
 *
 * @param chunk 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
suspend fun HttpClientRequest.endAwait(chunk: String): Unit {
  return awaitResult {
    this.end(chunk) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.end]
 *
 * @param chunk 
 * @param enc 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
suspend fun HttpClientRequest.endAwait(chunk: String, enc: String): Unit {
  return awaitResult {
    this.end(chunk, enc) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.end]
 *
 * @param chunk 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
suspend fun HttpClientRequest.endAwait(chunk: Buffer): Unit {
  return awaitResult {
    this.end(chunk) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.end]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
suspend fun HttpClientRequest.endAwait(): Unit {
  return awaitResult {
    this.end { ar -> it.handle(ar.mapEmpty()) }
  }
}

