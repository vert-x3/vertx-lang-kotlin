package io.vertx.kotlin.ext.healthchecks

import io.vertx.core.json.JsonObject
import io.vertx.ext.healthchecks.HealthChecks
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.healthchecks.HealthChecks.invoke]
 *
 * @param name 
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.healthchecks.HealthChecks] using Vert.x codegen.
 */
suspend fun HealthChecks.invokeAwait(name: String): JsonObject {
  return awaitResult {
    this.invoke(name, it)
  }
}

