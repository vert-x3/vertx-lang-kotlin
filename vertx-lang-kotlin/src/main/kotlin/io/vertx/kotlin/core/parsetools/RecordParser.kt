package io.vertx.kotlin.core.parsetools

import io.vertx.core.buffer.Buffer
import io.vertx.core.parsetools.RecordParser
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.parsetools.RecordParser.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.parsetools.RecordParser] using Vert.x codegen.
 */
suspend fun RecordParser.pipeToAwait(dst: WriteStream<Buffer>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

