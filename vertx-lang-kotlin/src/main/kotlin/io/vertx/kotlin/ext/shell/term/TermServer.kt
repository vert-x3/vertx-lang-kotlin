package io.vertx.kotlin.ext.shell.term

import io.vertx.ext.shell.term.TermServer
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Bind the term server, the [io.vertx.ext.shell.term.TermServer] must be set before.
 *
 * @param listenHandler the listen handler
 * @returnthis object *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.term.TermServer original] using Vert.x codegen.
 */
suspend fun TermServer.listenAwait() : TermServer {
  return awaitResult{
    this.listen(it)
  }
}

/**
 * Like [io.vertx.ext.shell.term.TermServer] but supplying a handler that will be notified when close is complete.
 *
 * @param completionHandler the handler to be notified when the term server is closed
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.term.TermServer original] using Vert.x codegen.
 */
suspend fun TermServer.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

