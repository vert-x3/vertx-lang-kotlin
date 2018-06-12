package io.vertx.kotlin.ext.shell

import io.vertx.ext.shell.ShellService
import io.vertx.kotlin.coroutines.awaitResult

suspend fun ShellService.startSuspending() {
  awaitResult<Void?> { this.start(it) }
}

suspend fun ShellService.stopSuspending() {
  awaitResult<Void?> { this.stop(it) }
}
