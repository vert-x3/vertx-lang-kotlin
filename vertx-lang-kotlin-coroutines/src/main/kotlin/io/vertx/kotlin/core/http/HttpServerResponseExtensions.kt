package io.vertx.kotlin.core.http

import io.vertx.core.MultiMap
import io.vertx.core.http.HttpMethod
import io.vertx.core.http.HttpServerResponse
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Long
import kotlin.String

suspend fun HttpServerResponse.sendFile(filename: String) {
  awaitResult<Void?> { this.sendFile(filename, it) }
}

suspend fun HttpServerResponse.sendFile(filename: String, offset: Long) {
  awaitResult<Void?> { this.sendFile(filename, offset, it) }
}

suspend fun HttpServerResponse.sendFile(
    filename: String,
    offset: Long,
    length: Long
) {
  awaitResult<Void?> { this.sendFile(filename, offset, length, it) }
}

suspend fun HttpServerResponse.push(method: HttpMethod, path: String): HttpServerResponse = awaitResult { this.push(method, path, it) }

suspend fun HttpServerResponse.push(
    method: HttpMethod,
    host: String,
    path: String,
    headers: MultiMap
): HttpServerResponse = awaitResult { this.push(method, host, path, headers, it) }
