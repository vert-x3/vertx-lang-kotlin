package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.TestCompletion
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.unit.TestCompletion.handler]
 *
 * @return [Unit?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.unit.TestCompletion] using Vert.x codegen.
 */
suspend fun TestCompletion.handlerAwait(): Unit? {
  return awaitResult {
    this.handler { ar -> it.handle(ar.mapEmpty()) }
  }
}

