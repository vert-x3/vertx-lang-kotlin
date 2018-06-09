package io.vertx.kotlin.ext.shell.term

import io.vertx.core.Handler
import io.vertx.ext.shell.cli.Completion
import io.vertx.ext.shell.term.Term
import io.vertx.kotlin.coroutines.awaitEvent
import java.lang.Void

suspend fun Term.resizehandlerAwait() : Void {
    return awaitEvent{
        this.resizehandler(it)
    }
}

suspend fun Term.stdinHandlerAwait() : String {
    return awaitEvent{
        this.stdinHandler(it)
    }
}

suspend fun Term.readlineAwait(prompt : String) : String {
    return awaitEvent{
        this.readline(prompt, it)
    }
}

suspend fun Term.readlineAwait(prompt : String, lineHandler : Handler<String>) : Completion {
    return awaitEvent{
        this.readline(prompt, lineHandler, it)
    }
}

suspend fun Term.closeHandlerAwait() : Void {
    return awaitEvent{
        this.closeHandler(it)
    }
}

