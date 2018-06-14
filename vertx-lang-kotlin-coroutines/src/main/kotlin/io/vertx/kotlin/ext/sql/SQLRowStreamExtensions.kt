package io.vertx.kotlin.ext.sql

import io.vertx.ext.sql.SQLRowStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 *  Closes the stream/underlying cursor(s). The actual close happens asynchronously. */
suspend fun SQLRowStream.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}
