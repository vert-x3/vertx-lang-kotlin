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

import io.vertx.core.Future
import io.vertx.core.buffer.Buffer
import io.vertx.core.http.ServerWebSocket
import io.vertx.core.http.WebSocketFrame
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.http.ServerWebSocket.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ServerWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use pipeTo returning a future and chain with await()", replaceWith = ReplaceWith("pipeTo(dst).await()"))
suspend fun ServerWebSocket.pipeToAwait(dst: WriteStream<Buffer>): Unit {
  return awaitResult {
    this.pipeTo(dst, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.ServerWebSocket.write]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ServerWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use write returning a future and chain with await()", replaceWith = ReplaceWith("write(data).await()"))
suspend fun ServerWebSocket.writeAwait(data: Buffer): Unit {
  return awaitResult {
    this.write(data, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.ServerWebSocket.end]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ServerWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use end returning a future and chain with await()", replaceWith = ReplaceWith("end(data).await()"))
suspend fun ServerWebSocket.endAwait(data: Buffer): Unit {
  return awaitResult {
    this.end(data, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.ServerWebSocket.end]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ServerWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use end returning a future and chain with await()", replaceWith = ReplaceWith("end().await()"))
suspend fun ServerWebSocket.endAwait(): Unit {
  return awaitResult {
    this.end(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.ServerWebSocket.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ServerWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with await()", replaceWith = ReplaceWith("close().await()"))
suspend fun ServerWebSocket.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.ServerWebSocket.close]
 *
 * @param statusCode 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ServerWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with await()", replaceWith = ReplaceWith("close(statusCode).await()"))
suspend fun ServerWebSocket.closeAwait(statusCode: Short): Unit {
  return awaitResult {
    this.close(statusCode, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.ServerWebSocket.close]
 *
 * @param statusCode 
 * @param reason 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ServerWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with await()", replaceWith = ReplaceWith("close(statusCode, reason).await()"))
suspend fun ServerWebSocket.closeAwait(statusCode: Short, reason: String?): Unit {
  return awaitResult {
    this.close(statusCode, reason, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use writeFrame returning a future and chain with await()", replaceWith = ReplaceWith("writeFrame(frame).await()"))
suspend fun ServerWebSocket.writeFrameAwait(frame: WebSocketFrame): Unit {
  return awaitResult {
    this.writeFrame(frame, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use writeFinalTextFrame returning a future and chain with await()", replaceWith = ReplaceWith("writeFinalTextFrame(text).await()"))
suspend fun ServerWebSocket.writeFinalTextFrameAwait(text: String): Unit {
  return awaitResult {
    this.writeFinalTextFrame(text, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use writeFinalBinaryFrame returning a future and chain with await()", replaceWith = ReplaceWith("writeFinalBinaryFrame(data).await()"))
suspend fun ServerWebSocket.writeFinalBinaryFrameAwait(data: Buffer): Unit {
  return awaitResult {
    this.writeFinalBinaryFrame(data, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use writeBinaryMessage returning a future and chain with await()", replaceWith = ReplaceWith("writeBinaryMessage(data).await()"))
suspend fun ServerWebSocket.writeBinaryMessageAwait(data: Buffer): Unit {
  return awaitResult {
    this.writeBinaryMessage(data, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use writeTextMessage returning a future and chain with await()", replaceWith = ReplaceWith("writeTextMessage(text).await()"))
suspend fun ServerWebSocket.writeTextMessageAwait(text: String): Unit {
  return awaitResult {
    this.writeTextMessage(text, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use writePing returning a future and chain with await()", replaceWith = ReplaceWith("writePing(data).await()"))
suspend fun ServerWebSocket.writePingAwait(data: Buffer): Unit {
  return awaitResult {
    this.writePing(data, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use writePong returning a future and chain with await()", replaceWith = ReplaceWith("writePong(data).await()"))
suspend fun ServerWebSocket.writePongAwait(data: Buffer): Unit {
  return awaitResult {
    this.writePong(data, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.ServerWebSocket.setHandshake]
 *
 * @param future the future to complete with
 * @return [Int]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ServerWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use setHandshake returning a future and chain with await()", replaceWith = ReplaceWith("setHandshake(future).await()"))
suspend fun ServerWebSocket.setHandshakeAwait(future: Future<Int>): Int {
  return awaitResult {
    this.setHandshake(future, it)
  }
}

