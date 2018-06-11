package io.vertx.kotlin.ext.shell

import io.vertx.ext.shell.ShellServer
import io.vertx.kotlin.coroutines.awaitResult

suspend fun ShellServer.listen() {
  awaitResult<Void?> { this.listen(it) }
}

suspend fun ShellServer.close() {
  awaitResult<Void?> { this.close(it) }
}
