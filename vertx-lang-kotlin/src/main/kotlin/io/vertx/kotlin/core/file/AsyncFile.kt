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
package io.vertx.kotlin.core.file

import io.vertx.core.buffer.Buffer
import io.vertx.core.file.AsyncFile
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.file.AsyncFile.write]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.AsyncFile] using Vert.x codegen.
 */
suspend fun AsyncFile.writeAwait(data: Buffer): Unit {
  return awaitResult {
    this.write(data) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.file.AsyncFile.end]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.AsyncFile] using Vert.x codegen.
 */
suspend fun AsyncFile.endAwait(): Unit {
  return awaitResult {
    this.end { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.file.AsyncFile.end]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.AsyncFile] using Vert.x codegen.
 */
suspend fun AsyncFile.endAwait(data: Buffer): Unit {
  return awaitResult {
    this.end(data) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.file.AsyncFile.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.AsyncFile] using Vert.x codegen.
 */
suspend fun AsyncFile.pipeToAwait(dst: WriteStream<Buffer>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.file.AsyncFile.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.AsyncFile] using Vert.x codegen.
 */
suspend fun AsyncFile.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.file.AsyncFile.write]
 *
 * @param buffer the buffer to write
 * @param position the position in the file to write it at
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.AsyncFile] using Vert.x codegen.
 */
suspend fun AsyncFile.writeAwait(buffer: Buffer, position: Long): Unit {
  return awaitResult {
    this.write(buffer, position) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.file.AsyncFile.read]
 *
 * @param buffer the buffer to read into
 * @param offset the offset into the buffer where the data will be read
 * @param position the position in the file where to start reading
 * @param length the number of bytes to read
 * @return [Buffer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.AsyncFile] using Vert.x codegen.
 */
suspend fun AsyncFile.readAwait(buffer: Buffer, offset: Int, position: Long, length: Int): Buffer {
  return awaitResult {
    this.read(buffer, offset, position, length, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.file.AsyncFile.flush]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.AsyncFile] using Vert.x codegen.
 */
suspend fun AsyncFile.flushAwait(): Unit {
  return awaitResult {
    this.flush { ar -> it.handle(ar.mapEmpty()) }
  }
}

