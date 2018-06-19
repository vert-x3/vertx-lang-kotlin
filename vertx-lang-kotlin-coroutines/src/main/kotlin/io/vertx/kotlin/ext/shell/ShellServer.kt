package io.vertx.kotlin.ext.shell

import io.vertx.ext.shell.ShellServer
import io.vertx.kotlin.coroutines.awaitResult

suspend fun ShellServer.listenAwait() : Void? {
    return awaitResult{
        this.listen(it)
    }
}

suspend fun ShellServer.closeAwait() : Void? {
    return awaitResult{
        this.close(it)
    }
}

