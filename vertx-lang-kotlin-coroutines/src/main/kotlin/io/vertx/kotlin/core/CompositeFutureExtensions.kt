package io.vertx.kotlin.core

import io.vertx.core.CompositeFuture
import io.vertx.kotlin.coroutines.awaitResult

suspend fun CompositeFuture.setHandler(): CompositeFuture = awaitResult { this.setHandler(it) }
