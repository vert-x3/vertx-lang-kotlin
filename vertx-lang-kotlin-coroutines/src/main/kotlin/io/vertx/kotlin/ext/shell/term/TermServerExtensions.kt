package io.vertx.kotlin.ext.shell.term

import io.vertx.ext.shell.term.TermServer
import io.vertx.kotlin.coroutines.awaitResult

suspend fun TermServer.listenSuspending(): TermServer {
  return awaitResult { this.listen(it) }
}

suspend fun TermServer.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}
