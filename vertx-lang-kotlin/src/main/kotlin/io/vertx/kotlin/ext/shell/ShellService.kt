package io.vertx.kotlin.ext.shell

import io.vertx.ext.shell.ShellService
import io.vertx.kotlin.coroutines.awaitResult

suspend fun ShellService.startAwait() : Unit {
    return awaitResult{
        this.start({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ShellService.stopAwait() : Unit {
    return awaitResult{
        this.stop({ ar -> it.handle(ar.mapEmpty()) })}
}

