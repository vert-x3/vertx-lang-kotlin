package io.vertx.kotlin.ext.shell.term

import io.vertx.ext.shell.term.Pty
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun Pty.stdoutHandlerAwait() : String {
    return awaitEvent{
        this.stdoutHandler(it)
    }
}

