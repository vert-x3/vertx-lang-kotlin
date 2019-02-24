package io.vertx.kotlin.core.streams

import io.vertx.core.streams.Pipe
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Start to pipe the elements to the destination <code>WriteStream</code>.
 * <p>
 * When the operation fails with a write error, the source stream is resumed.
 *
 * @param dst the destination write stream
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.streams.Pipe original] using Vert.x codegen.
 */
suspend fun <T> Pipe<T>.toAwait(dst : WriteStream<T>) : Unit {
  return awaitResult{
    this.to(dst, { ar -> it.handle(ar.mapEmpty()) })}
}

