package io.vertx.kotlin.ext.sql

import io.vertx.core.json.JsonArray
import io.vertx.core.streams.WriteStream
import io.vertx.ext.sql.SQLRowStream
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
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLRowStream original] using Vert.x codegen.
 */
suspend fun SQLRowStream.pipeToAwait(dst : WriteStream<JsonArray>) : Unit {
  return awaitResult{
    this.pipeTo(dst, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Closes the stream/underlying cursor(s). The actual close happens asynchronously.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLRowStream original] using Vert.x codegen.
 */
suspend fun SQLRowStream.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

