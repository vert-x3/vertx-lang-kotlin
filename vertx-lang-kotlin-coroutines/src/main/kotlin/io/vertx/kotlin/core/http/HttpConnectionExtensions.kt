package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.Http2Settings
import io.vertx.core.http.HttpConnection
import io.vertx.kotlin.coroutines.awaitResult

suspend fun HttpConnection.updateSettings(settings: Http2Settings) {
  awaitResult<Void?> { this.updateSettings(settings, it) }
}

suspend fun HttpConnection.ping(data: Buffer): Buffer {
  return awaitResult { this.ping(data, it) }
}
