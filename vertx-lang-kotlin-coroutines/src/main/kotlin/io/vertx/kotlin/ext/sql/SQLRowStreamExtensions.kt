package io.vertx.kotlin.ext.sql

import io.vertx.ext.sql.SQLRowStream
import io.vertx.kotlin.coroutines.awaitResult

suspend fun SQLRowStream.close() {
  awaitResult<Void?> { this.close(it) }
}
