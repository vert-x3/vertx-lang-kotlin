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
import io.vertx.core.http.WebSocket
import io.vertx.core.http.WebSocketFrame
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.http.WebSocket.write]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocket] using Vert.x codegen.
 */
suspend fun WebSocket.writeAwait(data: Buffer): Unit {
  return awaitResult {
    this.write(data) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocket.end]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocket] using Vert.x codegen.
 */
suspend fun WebSocket.endAwait(data: Buffer): Unit {
  return awaitResult {
    this.end(data) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocket.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocket] using Vert.x codegen.
 */
suspend fun WebSocket.pipeToAwait(dst: WriteStream<Buffer>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocket.end]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocket] using Vert.x codegen.
 */
suspend fun WebSocket.endAwait(): Unit {
  return awaitResult {
    this.end { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocket.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocket] using Vert.x codegen.
 */
suspend fun WebSocket.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocket.close]
 *
 * @param statusCode 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocket] using Vert.x codegen.
 */
suspend fun WebSocket.closeAwait(statusCode: Short): Unit {
  return awaitResult {
    this.close(statusCode) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.http.WebSocket.close]
 *
 * @param statusCode 
 * @param reason 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.WebSocket] using Vert.x codegen.
 */
suspend fun WebSocket.closeAwait(statusCode: Short, reason: String?): Unit {
  return awaitResult {
    this.close(statusCode, reason) { ar -> it.handle(ar.mapEmpty()) }
  }
}

suspend fun WebSocket.writeFrameAwait(frame: WebSocketFrame): Unit {
  return awaitResult {
    this.writeFrame(frame) { ar -> it.handle(ar.mapEmpty()) }
  }
}

suspend fun WebSocket.writeFinalTextFrameAwait(text: String): Unit {
  return awaitResult {
    this.writeFinalTextFrame(text) { ar -> it.handle(ar.mapEmpty()) }
  }
}

suspend fun WebSocket.writeFinalBinaryFrameAwait(data: Buffer): Unit {
  return awaitResult {
    this.writeFinalBinaryFrame(data) { ar -> it.handle(ar.mapEmpty()) }
  }
}

suspend fun WebSocket.writeBinaryMessageAwait(data: Buffer): Unit {
  return awaitResult {
    this.writeBinaryMessage(data) { ar -> it.handle(ar.mapEmpty()) }
  }
}

suspend fun WebSocket.writeTextMessageAwait(text: String): Unit {
  return awaitResult {
    this.writeTextMessage(text) { ar -> it.handle(ar.mapEmpty()) }
  }
}

