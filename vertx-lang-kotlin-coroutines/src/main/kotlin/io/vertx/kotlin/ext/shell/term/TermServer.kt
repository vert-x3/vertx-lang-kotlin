package io.vertx.kotlin.ext.shell.term

import io.vertx.ext.shell.term.Term
import io.vertx.ext.shell.term.TermServer
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import java.lang.Void

suspend fun TermServer.termHandlerAwait() : Term {
    return awaitEvent{
        this.termHandler(it)
    }
}

suspend fun TermServer.listenAwait() : TermServer {
    return awaitResult{
        this.listen(it)
    }
}

suspend fun TermServer.closeAwait() : Void {
    return awaitResult{
        this.close(it)
    }
}

