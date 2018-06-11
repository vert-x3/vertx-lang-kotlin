package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.Async
import io.vertx.kotlin.coroutines.awaitResult

suspend fun Async.handler() {
  awaitResult<Void?> { this.handler(it) }
}
