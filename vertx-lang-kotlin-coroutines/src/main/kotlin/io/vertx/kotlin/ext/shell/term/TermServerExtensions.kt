package io.vertx.kotlin.ext.shell.term

import io.vertx.ext.shell.term.TermServer
import io.vertx.kotlin.coroutines.awaitResult

/**
 *  Bind the term server, the [TermServer.termHandler] must be set before.
 * @return this object
 */
suspend fun TermServer.listenSuspending(): TermServer {
  return awaitResult { this.listen(it) }
}

/**
 *  Like [TermServer.close] but supplying a handler that will be notified when close is complete. */
suspend fun TermServer.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}
