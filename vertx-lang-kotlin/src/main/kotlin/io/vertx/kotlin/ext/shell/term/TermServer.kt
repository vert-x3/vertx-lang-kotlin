package io.vertx.kotlin.ext.shell.term

import io.vertx.ext.shell.term.TermServer
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.shell.term.TermServer.listen]
 *
 * @return [TermServer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.shell.term.TermServer] using Vert.x codegen.
 */
suspend fun TermServer.listenAwait(): TermServer {
  return awaitResult {
    this.listen(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.shell.term.TermServer.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.shell.term.TermServer] using Vert.x codegen.
 */
suspend fun TermServer.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

