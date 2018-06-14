package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.TestCompletion
import io.vertx.kotlin.coroutines.awaitResult

/**
 *  Completion handler to receive a completion signal when this completions completes. */
suspend fun TestCompletion.handler() {
  awaitResult<Void?> { this.handler(it) }
}
