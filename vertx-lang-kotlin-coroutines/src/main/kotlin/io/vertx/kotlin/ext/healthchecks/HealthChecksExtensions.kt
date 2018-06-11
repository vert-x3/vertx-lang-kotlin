package io.vertx.kotlin.ext.healthchecks

import io.vertx.core.json.JsonObject
import io.vertx.ext.healthchecks.HealthChecks
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.String

suspend fun HealthChecks.invoke(name: String): JsonObject = awaitResult { this.invoke(name, it) }
