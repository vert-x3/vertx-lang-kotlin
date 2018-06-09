package io.vertx.kotlin.ext.shell.term

import io.vertx.ext.shell.term.SockJSTermHandler
import io.vertx.ext.shell.term.Term
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun SockJSTermHandler.termHandlerAwait() : Term {
    return awaitEvent{
        this.termHandler(it)
    }
}

