package io.vertx.kotlin.ext.shell.system

import io.vertx.ext.shell.system.JobController
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun JobController.closeAwait() : Unit {
    return awaitEvent{
        this.close({ v -> it.handle(null) })}
}

