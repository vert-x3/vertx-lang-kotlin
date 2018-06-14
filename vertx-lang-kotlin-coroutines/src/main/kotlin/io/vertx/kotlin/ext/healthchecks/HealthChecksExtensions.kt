package io.vertx.kotlin.ext.healthchecks

import io.vertx.core.json.JsonObject
import io.vertx.ext.healthchecks.HealthChecks
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.String

/**
 *  Invokes the registered procedure with the given name and sub-procedures. It computes the overall
 *  outcome.
 * @return the current [HealthChecks]
 */
suspend fun HealthChecks.invoke(name: String): JsonObject {
  return awaitResult { this.invoke(name, it) }
}
