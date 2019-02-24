package io.vertx.kotlin.core.file

import io.vertx.core.buffer.Buffer
import io.vertx.core.file.AsyncFile
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

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

