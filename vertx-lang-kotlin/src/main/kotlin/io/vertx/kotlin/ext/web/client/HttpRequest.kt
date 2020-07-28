/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
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
@Deprecated(message = "Instead use sendStream returning a future that can yield a result ", replaceWith = ReplaceWith("sendStream(body).await()"))
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
@Deprecated(message = "Instead use sendBuffer returning a future that can yield a result ", replaceWith = ReplaceWith("sendBuffer(body).await()"))
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
@Deprecated(message = "Instead use sendJsonObject returning a future that can yield a result ", replaceWith = ReplaceWith("sendJsonObject(body).await()"))
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
@Deprecated(message = "Instead use sendJson returning a future that can yield a result ", replaceWith = ReplaceWith("sendJson(body).await()"))
suspend fun <T> HttpRequest<T>.sendJsonAwait(body: Any?): HttpResponse<T> {
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
@Deprecated(message = "Instead use sendForm returning a future that can yield a result ", replaceWith = ReplaceWith("sendForm(body).await()"))
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
@Deprecated(message = "Instead use sendMultipartForm returning a future that can yield a result ", replaceWith = ReplaceWith("sendMultipartForm(body).await()"))
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
@Deprecated(message = "Instead use send returning a future that can yield a result ", replaceWith = ReplaceWith("send().await()"))
suspend fun <T> HttpRequest<T>.sendAwait(): HttpResponse<T> {
  return awaitResult {
    this.send(it)
  }
}

