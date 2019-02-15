package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.Http2Settings
import io.vertx.core.http.HttpConnection
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.http.HttpConnection.updateSettings]
 *
 * @param settings the new settings
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpConnection] using Vert.x codegen.
 */
suspend fun HttpConnection.updateSettingsAwait(settings: Http2Settings): Unit {
  return awaitResult {
    this.updateSettings(settings) { ar -> it.handle(ar.mapEmpty()) }
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

