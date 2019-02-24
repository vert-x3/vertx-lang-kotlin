package io.vertx.kotlin.core.parsetools

import io.vertx.core.parsetools.JsonEvent
import io.vertx.core.parsetools.JsonParser
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Pipe this <code>ReadStream</code> to the <code>WriteStream</code>.
 * <p>
 * Elements emitted by this stream will be written to the write stream until this stream ends or fails.
 * <p>
 * Once this stream has ended or failed, the write stream will be ended and the <code>handler</code> will be
 * called with the result.
 *
 * @param dst the destination write stream
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.parsetools.JsonParser original] using Vert.x codegen.
 */
suspend fun JsonParser.pipeToAwait(dst : WriteStream<JsonEvent>) : Unit {
  return awaitResult{
    this.pipeTo(dst, { ar -> it.handle(ar.mapEmpty()) })}
}

