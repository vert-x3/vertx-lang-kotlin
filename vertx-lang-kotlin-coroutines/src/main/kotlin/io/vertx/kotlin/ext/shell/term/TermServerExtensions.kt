package io.vertx.kotlin.ext.shell.term

import io.vertx.ext.shell.term.TermServer
import io.vertx.kotlin.coroutines.awaitResult

suspend fun TermServer.listen(): TermServer {
  return awaitResult { this.listen(it) }
}

suspend fun TermServer.close() {
  awaitResult<Void?> { this.close(it) }
}
