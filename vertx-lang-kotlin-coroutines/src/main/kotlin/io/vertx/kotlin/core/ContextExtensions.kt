package io.vertx.kotlin.core

import io.vertx.core.Context
import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any
import kotlin.Boolean

suspend fun <T : Any> Context.executeBlocking(blockingCodeHandler: Handler<Future<T>>, ordered: Boolean): T {
  return awaitResult { this.executeBlocking(blockingCodeHandler, ordered, it) }
}

suspend fun <T : Any> Context.executeBlocking(blockingCodeHandler: Handler<Future<T>>): T {
  return awaitResult { this.executeBlocking(blockingCodeHandler, it) }
}
