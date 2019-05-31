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
package io.vertx.kotlin.core.net

import io.vertx.core.buffer.Buffer
import io.vertx.core.net.NetSocket
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.net.NetSocket.end]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetSocket] using Vert.x codegen.
 */
suspend fun NetSocket.endAwait(data: Buffer): Unit {
  return awaitResult {
    this.end(data) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetSocket.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetSocket] using Vert.x codegen.
 */
suspend fun NetSocket.pipeToAwait(dst: WriteStream<Buffer>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetSocket.write]
 *
 * @param str 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetSocket] using Vert.x codegen.
 */
suspend fun NetSocket.writeAwait(str: String): Unit {
  return awaitResult {
    this.write(str) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetSocket.write]
 *
 * @param str 
 * @param enc 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetSocket] using Vert.x codegen.
 */
suspend fun NetSocket.writeAwait(str: String, enc: String): Unit {
  return awaitResult {
    this.write(str, enc) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetSocket.write]
 *
 * @param message 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetSocket] using Vert.x codegen.
 */
suspend fun NetSocket.writeAwait(message: Buffer): Unit {
  return awaitResult {
    this.write(message) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetSocket.sendFile]
 *
 * @param filename file name of the file to send
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetSocket] using Vert.x codegen.
 */
suspend fun NetSocket.sendFileAwait(filename: String): Unit {
  return awaitResult {
    this.sendFile(filename) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetSocket.sendFile]
 *
 * @param filename file name of the file to send
 * @param offset offset
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetSocket] using Vert.x codegen.
 */
suspend fun NetSocket.sendFileAwait(filename: String, offset: Long): Unit {
  return awaitResult {
    this.sendFile(filename, offset) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetSocket.sendFile]
 *
 * @param filename file name of the file to send
 * @param offset offset
 * @param length length
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetSocket] using Vert.x codegen.
 */
suspend fun NetSocket.sendFileAwait(filename: String, offset: Long, length: Long): Unit {
  return awaitResult {
    this.sendFile(filename, offset, length) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetSocket.end]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetSocket] using Vert.x codegen.
 */
suspend fun NetSocket.endAwait(): Unit {
  return awaitResult {
    this.end { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetSocket.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetSocket] using Vert.x codegen.
 */
suspend fun NetSocket.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

