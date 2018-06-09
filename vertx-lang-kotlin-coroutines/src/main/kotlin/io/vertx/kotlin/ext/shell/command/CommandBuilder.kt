package io.vertx.kotlin.ext.shell.command

import io.vertx.ext.shell.cli.Completion
import io.vertx.ext.shell.command.CommandBuilder
import io.vertx.ext.shell.command.CommandProcess
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun CommandBuilder.processHandlerAwait() : CommandProcess {
    return awaitEvent{
        this.processHandler(it)
    }
}

suspend fun CommandBuilder.completionHandlerAwait() : Completion {
    return awaitEvent{
        this.completionHandler(it)
    }
}

