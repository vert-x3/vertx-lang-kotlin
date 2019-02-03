package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.Async
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.unit.Async.handler]
 *
 * @return [Unit?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.unit.Async] using Vert.x codegen.
 */
suspend fun Async.handlerAwait(): Unit? {
  return awaitResult {
    this.handler { ar -> it.handle(ar.mapEmpty()) }
  }
}

