package io.vertx.kotlin.ext.sql

import io.vertx.ext.sql.SQLRowStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Closes the stream/underlying cursor(s). The actual close happens asynchronously.
 *
 * @param handler called when the stream/underlying cursor(s) is(are) closed
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLRowStream original] using Vert.x codegen.
 */
suspend fun SQLRowStream.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

