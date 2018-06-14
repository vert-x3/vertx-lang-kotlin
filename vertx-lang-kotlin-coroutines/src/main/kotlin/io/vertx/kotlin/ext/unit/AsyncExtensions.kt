package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.Async
import io.vertx.kotlin.coroutines.awaitResult

/**
 *  Completion handler to receive a completion signal when this completions completes. */
suspend fun Async.handler() {
  awaitResult<Void?> { this.handler(it) }
}
