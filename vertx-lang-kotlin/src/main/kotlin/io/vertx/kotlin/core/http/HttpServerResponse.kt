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
import io.vertx.core.http.HttpMethod
import io.vertx.core.http.HttpServerResponse
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.http.HttpServerResponse.end]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerResponse] using Vert.x codegen.
 */
suspend fun HttpServerResponse.endAwait(): Unit {
  return awaitResult {
    this.end(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServerResponse.write]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerResponse] using Vert.x codegen.
 */
suspend fun HttpServerResponse.writeAwait(data: Buffer): Unit {
  return awaitResult {
    this.write(data, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServerResponse.write]
 *
 * @param chunk 
 * @param enc 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerResponse] using Vert.x codegen.
 */
suspend fun HttpServerResponse.writeAwait(chunk: String, enc: String): Unit {
  return awaitResult {
    this.write(chunk, enc, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServerResponse.write]
 *
 * @param chunk 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerResponse] using Vert.x codegen.
 */
suspend fun HttpServerResponse.writeAwait(chunk: String): Unit {
  return awaitResult {
    this.write(chunk, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServerResponse.end]
 *
 * @param chunk 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerResponse] using Vert.x codegen.
 */
suspend fun HttpServerResponse.endAwait(chunk: String): Unit {
  return awaitResult {
    this.end(chunk, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServerResponse.end]
 *
 * @param chunk 
 * @param enc 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerResponse] using Vert.x codegen.
 */
suspend fun HttpServerResponse.endAwait(chunk: String, enc: String): Unit {
  return awaitResult {
    this.end(chunk, enc, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServerResponse.end]
 *
 * @param chunk 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerResponse] using Vert.x codegen.
 */
suspend fun HttpServerResponse.endAwait(chunk: Buffer): Unit {
  return awaitResult {
    this.end(chunk, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServerResponse.sendFile]
 *
 * @param filename path to the file to serve
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerResponse] using Vert.x codegen.
 */
suspend fun HttpServerResponse.sendFileAwait(filename: String): Unit {
  return awaitResult {
    this.sendFile(filename, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServerResponse.sendFile]
 *
 * @param filename path to the file to serve
 * @param offset the offset to serve from
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerResponse] using Vert.x codegen.
 */
suspend fun HttpServerResponse.sendFileAwait(filename: String, offset: Long): Unit {
  return awaitResult {
    this.sendFile(filename, offset, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServerResponse.sendFile]
 *
 * @param filename path to the file to serve
 * @param offset the offset to serve from
 * @param length the length to serve to
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerResponse] using Vert.x codegen.
 */
suspend fun HttpServerResponse.sendFileAwait(filename: String, offset: Long, length: Long): Unit {
  return awaitResult {
    this.sendFile(filename, offset, length, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServerResponse.push]
 *
 * @param method 
 * @param host 
 * @param path 
 * @return [HttpServerResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerResponse] using Vert.x codegen.
 */
suspend fun HttpServerResponse.pushAwait(method: HttpMethod, host: String, path: String): HttpServerResponse {
  return awaitResult {
    this.push(method, host, path, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServerResponse.push]
 *
 * @param method 
 * @param path 
 * @param headers 
 * @return [HttpServerResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerResponse] using Vert.x codegen.
 */
suspend fun HttpServerResponse.pushAwait(method: HttpMethod, path: String, headers: MultiMap): HttpServerResponse {
  return awaitResult {
    this.push(method, path, headers, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServerResponse.push]
 *
 * @param method 
 * @param path 
 * @return [HttpServerResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerResponse] using Vert.x codegen.
 */
suspend fun HttpServerResponse.pushAwait(method: HttpMethod, path: String): HttpServerResponse {
  return awaitResult {
    this.push(method, path, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpServerResponse.push]
 *
 * @param method the method of the promised request
 * @param host the host of the promised request
 * @param path the path of the promised request
 * @param headers the headers of the promised request
 * @return [HttpServerResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerResponse] using Vert.x codegen.
 */
suspend fun HttpServerResponse.pushAwait(method: HttpMethod, host: String, path: String, headers: MultiMap): HttpServerResponse {
  return awaitResult {
    this.push(method, host, path, headers, it)
  }
}

