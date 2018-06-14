package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.Http2Settings
import io.vertx.core.http.HttpConnection
import io.vertx.kotlin.coroutines.awaitResult

/**
 *  Send to the remote endpoint an update of this endpoint settings
 *  <p/>
 *  The `completionHandler` will be notified when the remote endpoint has acknowledged the settings.
 *  <p/>
 *  This is not implemented for HTTP/1.x.
 * @param settings the new settings
 * @return a reference to this, so the API can be used fluently
 */
suspend fun HttpConnection.updateSettingsSuspending(settings: Http2Settings) {
  awaitResult<Void?> { this.updateSettings(settings, it) }
}

/**
 *  Send a {@literal PING} frame to the remote endpoint.
 *  <p/>
 *  This is not implemented for HTTP/1.x.
 * @param data the 8 bytes data of the frame
 * @return a reference to this, so the API can be used fluently
 */
suspend fun HttpConnection.ping(data: Buffer): Buffer {
  return awaitResult { this.ping(data, it) }
}
