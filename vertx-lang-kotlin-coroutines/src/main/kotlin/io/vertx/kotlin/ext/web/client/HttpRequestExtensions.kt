package io.vertx.kotlin.ext.web.client

import io.vertx.core.MultiMap
import io.vertx.core.buffer.Buffer
import io.vertx.core.json.JsonObject
import io.vertx.core.streams.ReadStream
import io.vertx.ext.web.client.HttpRequest
import io.vertx.ext.web.client.HttpResponse
import io.vertx.ext.web.multipart.MultipartForm
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any

/**
 *  Like [HttpRequest.send] but with an HTTP request `body` stream.
 * @param body the body
 */
suspend fun <T : Any> HttpRequest<T>.sendStream(body: ReadStream<Buffer>): HttpResponse<T> {
  return awaitResult { this.sendStream(body, it) }
}

/**
 *  Like [HttpRequest.send] but with an HTTP request `body` buffer.
 * @param body the body
 */
suspend fun <T : Any> HttpRequest<T>.sendBuffer(body: Buffer): HttpResponse<T> {
  return awaitResult { this.sendBuffer(body, it) }
}

/**
 *  Like [HttpRequest.send] but with an HTTP request `body` object encoded as json and the content type
 *  set to `application/json`.
 * @param body the body
 */
suspend fun <T : Any> HttpRequest<T>.sendJsonObject(body: JsonObject): HttpResponse<T> {
  return awaitResult { this.sendJsonObject(body, it) }
}

/**
 *  Like [HttpRequest.send] but with an HTTP request `body` object encoded as json and the content type
 *  set to `application/json`.
 * @param body the body
 */
suspend fun <T : Any> HttpRequest<T>.sendJson(body: Any): HttpResponse<T> {
  return awaitResult { this.sendJson(body, it) }
}

/**
 *  Like [HttpRequest.send] but with an HTTP request `body` multimap encoded as form and the content type
 *  set to `application/x-www-form-urlencoded`.
 *  <p>
 *  When the content type header is previously set to `multipart/form-data` it will be used instead.
 * @param body the body
 */
suspend fun <T : Any> HttpRequest<T>.sendForm(body: MultiMap): HttpResponse<T> {
  return awaitResult { this.sendForm(body, it) }
}

/**
 *  Like [HttpRequest.send] but with an HTTP request `body` multimap encoded as form and the content type
 *  set to `multipart/form-data`. You may use this method to send attributes and upload files.
 * @param body the body
 */
suspend fun <T : Any> HttpRequest<T>.sendMultipartForm(body: MultipartForm): HttpResponse<T> {
  return awaitResult { this.sendMultipartForm(body, it) }
}

/**
 *  Send a request, the `handler` will receive the response as an [HttpResponse].
 */
suspend fun <T : Any> HttpRequest<T>.send(): HttpResponse<T> {
  return awaitResult { this.send(it) }
}
