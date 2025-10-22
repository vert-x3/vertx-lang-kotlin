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
import io.vertx.core.http.ClientWebSocket
import io.vertx.core.http.WebSocket
import io.vertx.core.http.WebSocketConnectOptions
import io.vertx.core.http.WebSocketFrame
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.http.ClientWebSocket.write]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ClientWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use write returning a future and chain with coAwait()", replaceWith = ReplaceWith("write(data).coAwait()"))
suspend fun ClientWebSocket.writeAwait(data: Buffer): Unit {
  return awaitResult {
    this.write(data, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.ClientWebSocket.end]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ClientWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use end returning a future and chain with coAwait()", replaceWith = ReplaceWith("end(data).coAwait()"))
suspend fun ClientWebSocket.endAwait(data: Buffer): Unit {
  return awaitResult {
    this.end(data, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.ClientWebSocket.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ClientWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use pipeTo returning a future and chain with coAwait()", replaceWith = ReplaceWith("pipeTo(dst).coAwait()"))
suspend fun ClientWebSocket.pipeToAwait(dst: WriteStream<Buffer>): Unit {
  return awaitResult {
    this.pipeTo(dst, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.ClientWebSocket.end]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ClientWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use end returning a future and chain with coAwait()", replaceWith = ReplaceWith("end().coAwait()"))
suspend fun ClientWebSocket.endAwait(): Unit {
  return awaitResult {
    this.end(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.ClientWebSocket.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ClientWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with coAwait()", replaceWith = ReplaceWith("close().coAwait()"))
suspend fun ClientWebSocket.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.ClientWebSocket.close]
 *
 * @param statusCode 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ClientWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with coAwait()", replaceWith = ReplaceWith("close(statusCode).coAwait()"))
suspend fun ClientWebSocket.closeAwait(statusCode: Short): Unit {
  return awaitResult {
    this.close(statusCode, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.ClientWebSocket.close]
 *
 * @param statusCode 
 * @param reason 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ClientWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with coAwait()", replaceWith = ReplaceWith("close(statusCode, reason).coAwait()"))
suspend fun ClientWebSocket.closeAwait(statusCode: Short, reason: String?): Unit {
  return awaitResult {
    this.close(statusCode, reason, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.http.ClientWebSocket.connect]
 *
 * @param port the port
 * @param host the host
 * @param requestURI the relative URI
 * @return [WebSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ClientWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use connect returning a future and chain with coAwait()", replaceWith = ReplaceWith("connect(port, host, requestURI).coAwait()"))
suspend fun ClientWebSocket.connectAwait(port: Int, host: String, requestURI: String): WebSocket {
  return awaitResult {
    this.connect(port, host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.ClientWebSocket.connect]
 *
 * @param options the request options
 * @return [WebSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ClientWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use connect returning a future and chain with coAwait()", replaceWith = ReplaceWith("connect(options).coAwait()"))
suspend fun ClientWebSocket.connectAwait(options: WebSocketConnectOptions): WebSocket {
  return awaitResult {
    this.connect(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.ClientWebSocket.connect]
 *
 * @param host the host
 * @param requestURI the relative URI
 * @return [WebSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ClientWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use connect returning a future and chain with coAwait()", replaceWith = ReplaceWith("connect(host, requestURI).coAwait()"))
suspend fun ClientWebSocket.connectAwait(host: String, requestURI: String): WebSocket {
  return awaitResult {
    this.connect(host, requestURI, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.http.ClientWebSocket.connect]
 *
 * @param requestURI the relative URI
 * @return [WebSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.http.ClientWebSocket] using Vert.x codegen.
 */
@Deprecated(message = "Instead use connect returning a future and chain with coAwait()", replaceWith = ReplaceWith("connect(requestURI).coAwait()"))
suspend fun ClientWebSocket.connectAwait(requestURI: String): WebSocket {
  return awaitResult {
    this.connect(requestURI, it)
  }
}

@Deprecated(message = "Instead use writeFrame returning a future and chain with coAwait()", replaceWith = ReplaceWith("writeFrame(frame).coAwait()"))
suspend fun ClientWebSocket.writeFrameAwait(frame: WebSocketFrame): Unit {
  return awaitResult {
    this.writeFrame(frame, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use writeFinalTextFrame returning a future and chain with coAwait()", replaceWith = ReplaceWith("writeFinalTextFrame(text).coAwait()"))
suspend fun ClientWebSocket.writeFinalTextFrameAwait(text: String): Unit {
  return awaitResult {
    this.writeFinalTextFrame(text, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use writeFinalBinaryFrame returning a future and chain with coAwait()", replaceWith = ReplaceWith("writeFinalBinaryFrame(data).coAwait()"))
suspend fun ClientWebSocket.writeFinalBinaryFrameAwait(data: Buffer): Unit {
  return awaitResult {
    this.writeFinalBinaryFrame(data, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use writeBinaryMessage returning a future and chain with coAwait()", replaceWith = ReplaceWith("writeBinaryMessage(data).coAwait()"))
suspend fun ClientWebSocket.writeBinaryMessageAwait(data: Buffer): Unit {
  return awaitResult {
    this.writeBinaryMessage(data, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use writeTextMessage returning a future and chain with coAwait()", replaceWith = ReplaceWith("writeTextMessage(text).coAwait()"))
suspend fun ClientWebSocket.writeTextMessageAwait(text: String): Unit {
  return awaitResult {
    this.writeTextMessage(text, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use writePing returning a future and chain with coAwait()", replaceWith = ReplaceWith("writePing(data).coAwait()"))
suspend fun ClientWebSocket.writePingAwait(data: Buffer): Unit {
  return awaitResult {
    this.writePing(data, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use writePong returning a future and chain with coAwait()", replaceWith = ReplaceWith("writePong(data).coAwait()"))
suspend fun ClientWebSocket.writePongAwait(data: Buffer): Unit {
  return awaitResult {
    this.writePong(data, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

