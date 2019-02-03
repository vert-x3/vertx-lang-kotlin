package io.vertx.kotlin.config

import io.vertx.config.ConfigRetriever
import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.config.ConfigRetriever.getConfig]
 *
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.config.ConfigRetriever] using Vert.x codegen.
 */
suspend fun ConfigRetriever.getConfigAwait(): JsonObject {
  return awaitResult {
    this.getConfig(it)
  }
}

