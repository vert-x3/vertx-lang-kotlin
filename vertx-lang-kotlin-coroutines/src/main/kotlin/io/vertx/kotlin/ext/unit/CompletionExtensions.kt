package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.Completion
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any

suspend fun <T : Any> Completion<T>.handler(): T? {
  return awaitResult { this.handler(it) }
}
