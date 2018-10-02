package io.vertx.kotlin.config

import io.vertx.config.ConfigRetriever
import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Reads the configuration from the different 
 * and computes the final configuration.
 *
 * @param completionHandler handler receiving the computed configuration, or a failure if the configuration cannot be retrieved
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.config.ConfigRetriever original] using Vert.x codegen.
 */
suspend fun ConfigRetriever.getConfigAwait() : JsonObject {
  return awaitResult{
    this.getConfig(it)
  }
}

