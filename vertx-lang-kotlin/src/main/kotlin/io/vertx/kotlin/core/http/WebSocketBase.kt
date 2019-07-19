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
import io.vertx.core.http.WebSocketBase
import io.vertx.core.http.WebSocketFrame
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.http.WebSocketBase.end]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocketBase] using Vert.x codegen.
 */
suspend fun WebSocketBase.endAwait(data: Buffer): Unit {
  return awaitResult {
    this.end(data) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocketBase.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocketBase] using Vert.x codegen.
 */
suspend fun WebSocketBase.pipeToAwait(dst: WriteStream<Buffer>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

suspend fun WebSocketBase.writeAwait(data: Buffer): Unit {
  return awaitResult {
    this.write(data) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocketBase.writeFrame]
 *
 * @param frame 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocketBase] using Vert.x codegen.
 */
suspend fun WebSocketBase.writeFrameAwait(frame: WebSocketFrame): Unit {
  return awaitResult {
    this.writeFrame(frame) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocketBase.writeFinalTextFrame]
 *
 * @param text 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocketBase] using Vert.x codegen.
 */
suspend fun WebSocketBase.writeFinalTextFrameAwait(text: String): Unit {
  return awaitResult {
    this.writeFinalTextFrame(text) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocketBase.writeFinalBinaryFrame]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocketBase] using Vert.x codegen.
 */
suspend fun WebSocketBase.writeFinalBinaryFrameAwait(data: Buffer): Unit {
  return awaitResult {
    this.writeFinalBinaryFrame(data) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocketBase.writeBinaryMessage]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocketBase] using Vert.x codegen.
 */
suspend fun WebSocketBase.writeBinaryMessageAwait(data: Buffer): Unit {
  return awaitResult {
    this.writeBinaryMessage(data) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocketBase.writeTextMessage]
 *
 * @param text 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocketBase] using Vert.x codegen.
 */
suspend fun WebSocketBase.writeTextMessageAwait(text: String): Unit {
  return awaitResult {
    this.writeTextMessage(text) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocketBase.end]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocketBase] using Vert.x codegen.
 */
suspend fun WebSocketBase.endAwait(): Unit {
  return awaitResult {
    this.end { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocketBase.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocketBase] using Vert.x codegen.
 */
suspend fun WebSocketBase.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocketBase.close]
 *
 * @param statusCode 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocketBase] using Vert.x codegen.
 */
suspend fun WebSocketBase.closeAwait(statusCode: Short): Unit {
  return awaitResult {
    this.close(statusCode) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocketBase.close]
 *
 * @param statusCode 
 * @param reason 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocketBase] using Vert.x codegen.
 */
suspend fun WebSocketBase.closeAwait(statusCode: Short, reason: String?): Unit {
  return awaitResult {
    this.close(statusCode, reason) { ar -> it.handle(ar.mapEmpty()) }
  }
}

