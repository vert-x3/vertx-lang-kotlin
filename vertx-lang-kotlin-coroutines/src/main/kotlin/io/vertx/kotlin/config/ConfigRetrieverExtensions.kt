package io.vertx.kotlin.config

import io.vertx.config.ConfigRetriever
import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult

/**
 *  Reads the configuration from the different [ConfigStore]
 *  and computes the final configuration. */
suspend fun ConfigRetriever.getConfig(): JsonObject {
  return awaitResult { this.getConfig(it) }
}
