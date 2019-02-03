package io.vertx.kotlin.ext.shell

import io.vertx.ext.shell.ShellServer
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.shell.ShellServer.listen]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.shell.ShellServer] using Vert.x codegen.
 */
suspend fun ShellServer.listenAwait(): Unit {
  return awaitResult {
    this.listen { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.shell.ShellServer.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.shell.ShellServer] using Vert.x codegen.
 */
suspend fun ShellServer.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

