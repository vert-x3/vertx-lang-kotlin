package io.vertx.kotlin.ext.sql

import io.vertx.ext.sql.SQLRowStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.sql.SQLRowStream.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLRowStream] using Vert.x codegen.
 */
suspend fun SQLRowStream.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

