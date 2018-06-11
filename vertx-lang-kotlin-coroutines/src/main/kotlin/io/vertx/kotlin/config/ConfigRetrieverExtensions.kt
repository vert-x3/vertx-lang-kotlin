package io.vertx.kotlin.config

import io.vertx.config.ConfigRetriever
import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult

suspend fun ConfigRetriever.getConfig(): JsonObject {
  return awaitResult { this.getConfig(it) }
}
