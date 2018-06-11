package io.vertx.kotlin.core

import io.vertx.core.Future
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any

suspend fun <T : Any> Future<T>.setHandler(): T {
  return awaitResult { this.setHandler(it) }
}
