package io.vertx.kotlin.core.parsetools

import io.vertx.core.parsetools.JsonEvent
import io.vertx.core.parsetools.JsonParser
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.parsetools.JsonParser.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.parsetools.JsonParser] using Vert.x codegen.
 */
suspend fun JsonParser.pipeToAwait(dst: WriteStream<JsonEvent>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

