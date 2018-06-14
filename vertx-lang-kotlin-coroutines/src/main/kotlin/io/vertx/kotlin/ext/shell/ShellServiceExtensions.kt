package io.vertx.kotlin.ext.shell

import io.vertx.ext.shell.ShellService
import io.vertx.kotlin.coroutines.awaitResult

/**
 *  Start the shell service, this is an asynchronous start. */
suspend fun ShellService.startSuspending() {
  awaitResult<Void?> { this.start(it) }
}

/**
 *  Stop the shell service, this is an asynchronous start. */
suspend fun ShellService.stopSuspending() {
  awaitResult<Void?> { this.stop(it) }
}
