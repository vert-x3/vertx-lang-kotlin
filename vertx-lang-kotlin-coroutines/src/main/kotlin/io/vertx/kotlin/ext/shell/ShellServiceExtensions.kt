package io.vertx.kotlin.ext.shell

import io.vertx.ext.shell.ShellService
import io.vertx.kotlin.coroutines.awaitResult

suspend fun ShellService.start() {
  awaitResult<Void?> { this.start(it) }
}

suspend fun ShellService.stop() {
  awaitResult<Void?> { this.stop(it) }
}
