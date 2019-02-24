package io.vertx.kotlin.core

import io.vertx.core.TimeoutStream
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.TimeoutStream.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.TimeoutStream] using Vert.x codegen.
 */
suspend fun TimeoutStream.pipeToAwait(dst: WriteStream<Long>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

