package io.vertx.kotlin.ext.healthchecks

import io.vertx.core.Future
import io.vertx.core.json.JsonObject
import io.vertx.ext.healthchecks.HealthChecks
import io.vertx.ext.healthchecks.Status
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun HealthChecks.registerAwait(name : String) : Future<Status> {
    return awaitEvent{
        this.register(name, it)
    }
}

suspend fun HealthChecks.invokeAwait() : JsonObject {
    return awaitEvent{
        this.invoke(it)
    }
}

suspend fun HealthChecks.invokeAwait(name : String) : JsonObject {
    return awaitResult{
        this.invoke(name, it)
    }
}

