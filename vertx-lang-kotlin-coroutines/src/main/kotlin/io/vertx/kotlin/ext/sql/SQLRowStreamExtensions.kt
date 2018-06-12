package io.vertx.kotlin.ext.sql

import io.vertx.ext.sql.SQLRowStream
import io.vertx.kotlin.coroutines.awaitResult

suspend fun SQLRowStream.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}
