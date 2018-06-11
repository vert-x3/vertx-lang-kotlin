package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.TestCompletion
import io.vertx.kotlin.coroutines.awaitResult

suspend fun TestCompletion.handler() {
  awaitResult<Void?> { this.handler(it) }
}
