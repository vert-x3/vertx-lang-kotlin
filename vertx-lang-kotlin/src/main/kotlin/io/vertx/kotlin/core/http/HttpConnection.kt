package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.Http2Settings
import io.vertx.core.http.HttpConnection
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Send to the remote endpoint an update of this endpoint settings
 * <p/>
 * The <code>completionHandler</code> will be notified when the remote endpoint has acknowledged the settings.
 * <p/>
 * This is not implemented for HTTP/1.x.
 *
 * @param settings the new settings
 * @param completionHandler the handler notified when the settings have been acknowledged by the remote endpoint
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpConnection original] using Vert.x codegen.
 */
suspend fun HttpConnection.updateSettingsAwait(settings : Http2Settings) : Unit {
  return awaitResult{
    this.updateSettings(settings, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Send a  frame to the remote endpoint.
 * <p/>
 * This is not implemented for HTTP/1.x.
 *
 * @param data the 8 bytes data of the frame
 * @param pongHandler an async result handler notified with pong reply or the failure
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpConnection original] using Vert.x codegen.
 */
suspend fun HttpConnection.pingAwait(data : Buffer) : Buffer {
  return awaitResult{
    this.ping(data, it)
  }
}

