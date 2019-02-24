package io.vertx.kotlin.core.streams

import io.vertx.core.streams.ReadStream
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.streams.ReadStream.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.streams.ReadStream] using Vert.x codegen.
 */
suspend fun <T> ReadStream<T>.pipeToAwait(dst: WriteStream<T>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

