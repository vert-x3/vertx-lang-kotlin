package io.vertx.kotlin.ext.shell

import io.vertx.ext.shell.ShellService
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.shell.ShellService.start]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.shell.ShellService] using Vert.x codegen.
 */
suspend fun ShellService.startAwait(): Unit {
  return awaitResult {
    this.start { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.shell.ShellService.stop]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.shell.ShellService] using Vert.x codegen.
 */
suspend fun ShellService.stopAwait(): Unit {
  return awaitResult {
    this.stop { ar -> it.handle(ar.mapEmpty()) }
  }
}

