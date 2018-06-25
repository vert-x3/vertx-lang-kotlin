package io.vertx.kotlin.ext.shell

import io.vertx.ext.shell.ShellServer
import io.vertx.kotlin.coroutines.awaitResult

suspend fun ShellServer.listenAwait() : Unit {
    return awaitResult{
        this.listen({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ShellServer.closeAwait() : Unit {
    return awaitResult{
        this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

