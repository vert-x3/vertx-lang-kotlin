package io.vertx.kotlin.ext.shell.system

import io.vertx.ext.shell.system.ExecStatus
import io.vertx.ext.shell.system.Job
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun Job.statusUpdateHandlerAwait() : ExecStatus {
    return awaitEvent{
        this.statusUpdateHandler(it)
    }
}

