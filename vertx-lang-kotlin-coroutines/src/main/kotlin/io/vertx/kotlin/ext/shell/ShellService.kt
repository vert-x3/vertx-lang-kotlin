package io.vertx.kotlin.ext.shell

import io.vertx.ext.shell.ShellService
import io.vertx.kotlin.coroutines.awaitResult
import java.lang.Void

suspend fun ShellService.startAwait() : Void {
    return awaitResult{
        this.start(it)
    }
}

suspend fun ShellService.stopAwait() : Void {
    return awaitResult{
        this.stop(it)
    }
}

