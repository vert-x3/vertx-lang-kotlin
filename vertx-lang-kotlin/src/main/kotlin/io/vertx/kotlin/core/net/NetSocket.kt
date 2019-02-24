package io.vertx.kotlin.core.net

import io.vertx.core.buffer.Buffer
import io.vertx.core.net.NetSocket
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

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

