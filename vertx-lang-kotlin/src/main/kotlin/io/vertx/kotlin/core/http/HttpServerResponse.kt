package io.vertx.kotlin.core.http

import io.vertx.core.MultiMap
import io.vertx.core.http.HttpMethod
import io.vertx.core.http.HttpServerResponse
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.http.HttpServerResponse.sendFile]
 *
 * @param filename path to the file to serve
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpServerResponse] using Vert.x codegen.
 */
suspend fun HttpServerResponse.sendFileAwait(filename: String): Unit {
  return awaitResult {
    this.sendFile(filename) { ar -> it.handle(ar.mapEmpty()) }
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
    this.sendFile(filename, offset) { ar -> it.handle(ar.mapEmpty()) }
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
    this.sendFile(filename, offset, length) { ar -> it.handle(ar.mapEmpty()) }
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

