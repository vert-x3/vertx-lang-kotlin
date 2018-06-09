package io.vertx.kotlin.ext.shell.system

import io.vertx.ext.shell.system.JobController
import io.vertx.kotlin.coroutines.awaitEvent
import java.lang.Void

suspend fun JobController.closeAwait() : Void {
    return awaitEvent{
        this.close(it)
    }
}

