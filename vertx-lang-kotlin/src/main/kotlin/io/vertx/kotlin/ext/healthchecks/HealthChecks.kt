package io.vertx.kotlin.ext.healthchecks

import io.vertx.core.json.JsonObject
import io.vertx.ext.healthchecks.HealthChecks
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Invokes the registered procedure with the given name and sub-procedures. It computes the overall
 * outcome.
 *
 * @param name 
 * @return the current [io.vertx.ext.healthchecks.HealthChecks] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.healthchecks.HealthChecks original] using Vert.x codegen.
 */
suspend fun HealthChecks.invokeAwait(name : String) : JsonObject {
  return awaitResult{
    this.invoke(name, it)
  }
}

