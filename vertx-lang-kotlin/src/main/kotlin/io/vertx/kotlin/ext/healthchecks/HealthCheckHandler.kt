package io.vertx.kotlin.ext.healthchecks

import io.vertx.core.Future
import io.vertx.ext.healthchecks.HealthCheckHandler
import io.vertx.ext.healthchecks.Status
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun HealthCheckHandler.registerAwait(name : String) : Future<Status> {
    return awaitEvent{
        this.register(name, it)
    }
}

suspend fun HealthCheckHandler.registerAwait(name : String, timeout : Long) : Future<Status> {
    return awaitEvent{
        this.register(name, timeout, it)
    }
}

