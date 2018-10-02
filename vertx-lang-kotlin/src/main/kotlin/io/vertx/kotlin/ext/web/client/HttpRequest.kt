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
 * Like [io.vertx.ext.web.client.HttpRequest] but with an HTTP request <code>body</code> stream.
 *
 * @param body the body
 * @param handler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.client.HttpRequest original] using Vert.x codegen.
 */
suspend fun <T> HttpRequest<T>.sendStreamAwait(body : ReadStream<Buffer>) : HttpResponse<T> {
  return awaitResult{
    this.sendStream(body, it)
  }
}

/**
 * Like [io.vertx.ext.web.client.HttpRequest] but with an HTTP request <code>body</code> buffer.
 *
 * @param body the body
 * @param handler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.client.HttpRequest original] using Vert.x codegen.
 */
suspend fun <T> HttpRequest<T>.sendBufferAwait(body : Buffer) : HttpResponse<T> {
  return awaitResult{
    this.sendBuffer(body, it)
  }
}

/**
 * Like [io.vertx.ext.web.client.HttpRequest] but with an HTTP request <code>body</code> object encoded as json and the content type
 * set to <code>application/json</code>.
 *
 * @param body the body
 * @param handler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.client.HttpRequest original] using Vert.x codegen.
 */
suspend fun <T> HttpRequest<T>.sendJsonObjectAwait(body : JsonObject) : HttpResponse<T> {
  return awaitResult{
    this.sendJsonObject(body, it)
  }
}

/**
 * Like [io.vertx.ext.web.client.HttpRequest] but with an HTTP request <code>body</code> object encoded as json and the content type
 * set to <code>application/json</code>.
 *
 * @param body the body
 * @param handler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.client.HttpRequest original] using Vert.x codegen.
 */
suspend fun <T> HttpRequest<T>.sendJsonAwait(body : Any) : HttpResponse<T> {
  return awaitResult{
    this.sendJson(body, it)
  }
}

/**
 * Like [io.vertx.ext.web.client.HttpRequest] but with an HTTP request <code>body</code> multimap encoded as form and the content type
 * set to <code>application/x-www-form-urlencoded</code>.
 * <p>
 * When the content type header is previously set to <code>multipart/form-data</code> it will be used instead.
 *
 * @param body the body
 * @param handler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.client.HttpRequest original] using Vert.x codegen.
 */
suspend fun <T> HttpRequest<T>.sendFormAwait(body : MultiMap) : HttpResponse<T> {
  return awaitResult{
    this.sendForm(body, it)
  }
}

/**
 * Like [io.vertx.ext.web.client.HttpRequest] but with an HTTP request <code>body</code> multimap encoded as form and the content type
 * set to <code>multipart/form-data</code>. You may use this method to send attributes and upload files.
 *
 * @param body the body
 * @param handler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.client.HttpRequest original] using Vert.x codegen.
 */
suspend fun <T> HttpRequest<T>.sendMultipartFormAwait(body : MultipartForm) : HttpResponse<T> {
  return awaitResult{
    this.sendMultipartForm(body, it)
  }
}

/**
 * Send a request, the <code>handler</code> will receive the response as an [io.vertx.ext.web.client.HttpResponse].
 *
 * @param handler 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.client.HttpRequest original] using Vert.x codegen.
 */
suspend fun <T> HttpRequest<T>.sendAwait() : HttpResponse<T> {
  return awaitResult{
    this.send(it)
  }
}

