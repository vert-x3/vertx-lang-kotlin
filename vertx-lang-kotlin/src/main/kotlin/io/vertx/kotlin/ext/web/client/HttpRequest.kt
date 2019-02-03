package io.vertx.kotlin.ext.web.client

import io.vertx.core.MultiMap
import io.vertx.core.buffer.Buffer
import io.vertx.core.json.JsonObject
import io.vertx.core.streams.ReadStream
import io.vertx.ext.web.client.HttpRequest
import io.vertx.ext.web.client.HttpResponse
import io.vertx.ext.web.multipart.MultipartForm
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.web.client.HttpRequest.sendStream]
 *
 * @param body the body
 * @return [HttpResponse<T>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.client.HttpRequest] using Vert.x codegen.
 */
suspend fun <T> HttpRequest<T>.sendStreamAwait(body: ReadStream<Buffer>): HttpResponse<T> {
  return awaitResult {
    this.sendStream(body, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.client.HttpRequest.sendBuffer]
 *
 * @param body the body
 * @return [HttpResponse<T>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.client.HttpRequest] using Vert.x codegen.
 */
suspend fun <T> HttpRequest<T>.sendBufferAwait(body: Buffer): HttpResponse<T> {
  return awaitResult {
    this.sendBuffer(body, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.client.HttpRequest.sendJsonObject]
 *
 * @param body the body
 * @return [HttpResponse<T>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.client.HttpRequest] using Vert.x codegen.
 */
suspend fun <T> HttpRequest<T>.sendJsonObjectAwait(body: JsonObject): HttpResponse<T> {
  return awaitResult {
    this.sendJsonObject(body, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.client.HttpRequest.sendJson]
 *
 * @param body the body
 * @return [HttpResponse<T>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.client.HttpRequest] using Vert.x codegen.
 */
suspend fun <T> HttpRequest<T>.sendJsonAwait(body: Any): HttpResponse<T> {
  return awaitResult {
    this.sendJson(body, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.client.HttpRequest.sendForm]
 *
 * @param body the body
 * @return [HttpResponse<T>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.client.HttpRequest] using Vert.x codegen.
 */
suspend fun <T> HttpRequest<T>.sendFormAwait(body: MultiMap): HttpResponse<T> {
  return awaitResult {
    this.sendForm(body, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.client.HttpRequest.sendMultipartForm]
 *
 * @param body the body
 * @return [HttpResponse<T>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.client.HttpRequest] using Vert.x codegen.
 */
suspend fun <T> HttpRequest<T>.sendMultipartFormAwait(body: MultipartForm): HttpResponse<T> {
  return awaitResult {
    this.sendMultipartForm(body, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.client.HttpRequest.send]
 *
 * @return [HttpResponse<T>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.client.HttpRequest] using Vert.x codegen.
 */
suspend fun <T> HttpRequest<T>.sendAwait(): HttpResponse<T> {
  return awaitResult {
    this.send(it)
  }
}

