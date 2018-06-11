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

suspend fun <T : Any> HttpRequest<T>.sendStream(body: ReadStream<Buffer>): HttpResponse<T> {
  return awaitResult { this.sendStream(body, it) }
}

suspend fun <T : Any> HttpRequest<T>.sendBuffer(body: Buffer): HttpResponse<T> {
  return awaitResult { this.sendBuffer(body, it) }
}

suspend fun <T : Any> HttpRequest<T>.sendJsonObject(body: JsonObject): HttpResponse<T> {
  return awaitResult { this.sendJsonObject(body, it) }
}

suspend fun <T : Any> HttpRequest<T>.sendJson(body: Any): HttpResponse<T> {
  return awaitResult { this.sendJson(body, it) }
}

suspend fun <T : Any> HttpRequest<T>.sendForm(body: MultiMap): HttpResponse<T> {
  return awaitResult { this.sendForm(body, it) }
}

suspend fun <T : Any> HttpRequest<T>.sendMultipartForm(body: MultipartForm): HttpResponse<T> {
  return awaitResult { this.sendMultipartForm(body, it) }
}

suspend fun <T : Any> HttpRequest<T>.send(): HttpResponse<T> {
  return awaitResult { this.send(it) }
}
