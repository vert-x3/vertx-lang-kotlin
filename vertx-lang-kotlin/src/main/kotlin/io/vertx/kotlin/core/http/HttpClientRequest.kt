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
package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.HttpClientRequest
import io.vertx.core.http.HttpClientResponse
import io.vertx.core.net.NetSocket
import io.vertx.core.streams.ReadStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.write]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
@Deprecated(message = "Instead use write returning a future and chain with await()", replaceWith = ReplaceWith("write(data).await()"))
suspend fun HttpClientRequest.writeAwait(data: Buffer): Unit {
  return awaitResult {
    this.write(data, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.write]
 *
 * @param chunk 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
@Deprecated(message = "Instead use write returning a future and chain with await()", replaceWith = ReplaceWith("write(chunk).await()"))
suspend fun HttpClientRequest.writeAwait(chunk: String): Unit {
  return awaitResult {
    this.write(chunk, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.write]
 *
 * @param chunk 
 * @param enc 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
@Deprecated(message = "Instead use write returning a future and chain with await()", replaceWith = ReplaceWith("write(chunk, enc).await()"))
suspend fun HttpClientRequest.writeAwait(chunk: String, enc: String): Unit {
  return awaitResult {
    this.write(chunk, enc, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.sendHead]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
@Deprecated(message = "Instead use sendHead returning a future and chain with await()", replaceWith = ReplaceWith("sendHead().await()"))
suspend fun HttpClientRequest.sendHeadAwait(): Unit {
  return awaitResult {
    this.sendHead(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.send]
 *
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
@Deprecated(message = "Instead use send returning a future and chain with await()", replaceWith = ReplaceWith("send().await()"))
suspend fun HttpClientRequest.sendAwait(): HttpClientResponse {
  return awaitResult {
    this.send(it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.send]
 *
 * @param body 
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
@Deprecated(message = "Instead use send returning a future and chain with await()", replaceWith = ReplaceWith("send(body).await()"))
suspend fun HttpClientRequest.sendAwait(body: String): HttpClientResponse {
  return awaitResult {
    this.send(body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.send]
 *
 * @param body 
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
@Deprecated(message = "Instead use send returning a future and chain with await()", replaceWith = ReplaceWith("send(body).await()"))
suspend fun HttpClientRequest.sendAwait(body: Buffer): HttpClientResponse {
  return awaitResult {
    this.send(body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.send]
 *
 * @param body 
 * @return [HttpClientResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
@Deprecated(message = "Instead use send returning a future and chain with await()", replaceWith = ReplaceWith("send(body).await()"))
suspend fun HttpClientRequest.sendAwait(body: ReadStream<Buffer>): HttpClientResponse {
  return awaitResult {
    this.send(body, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.end]
 *
 * @param chunk 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
@Deprecated(message = "Instead use end returning a future and chain with await()", replaceWith = ReplaceWith("end(chunk).await()"))
suspend fun HttpClientRequest.endAwait(chunk: String): Unit {
  return awaitResult {
    this.end(chunk, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.end]
 *
 * @param chunk 
 * @param enc 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
@Deprecated(message = "Instead use end returning a future and chain with await()", replaceWith = ReplaceWith("end(chunk, enc).await()"))
suspend fun HttpClientRequest.endAwait(chunk: String, enc: String): Unit {
  return awaitResult {
    this.end(chunk, enc, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.end]
 *
 * @param chunk 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
@Deprecated(message = "Instead use end returning a future and chain with await()", replaceWith = ReplaceWith("end(chunk).await()"))
suspend fun HttpClientRequest.endAwait(chunk: Buffer): Unit {
  return awaitResult {
    this.end(chunk, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.end]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
@Deprecated(message = "Instead use end returning a future and chain with await()", replaceWith = ReplaceWith("end().await()"))
suspend fun HttpClientRequest.endAwait(): Unit {
  return awaitResult {
    this.end(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.HttpClientRequest.netSocket]
 *
 * @return [NetSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.HttpClientRequest] using Vert.x codegen.
 */
@Deprecated(message = "Instead use netSocket returning a future and chain with await()", replaceWith = ReplaceWith("netSocket().await()"))
suspend fun HttpClientRequest.netSocketAwait(): NetSocket {
  return awaitResult {
    this.netSocket(it)
  }
}

@Deprecated(message = "Instead use onComplete returning a future and chain with await()", replaceWith = ReplaceWith("onComplete().await()"))
suspend fun HttpClientRequest.onCompleteAwait(): HttpClientResponse {
  return awaitResult {
    this.onComplete(it)
  }
}

