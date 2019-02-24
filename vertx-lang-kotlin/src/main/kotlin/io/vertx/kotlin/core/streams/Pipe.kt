package io.vertx.kotlin.core.streams

import io.vertx.core.streams.Pipe
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.streams.Pipe.to]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.streams.Pipe] using Vert.x codegen.
 */
suspend fun <T> Pipe<T>.toAwait(dst: WriteStream<T>): Unit {
  return awaitResult {
    this.to(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

