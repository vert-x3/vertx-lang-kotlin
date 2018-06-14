package io.vertx.kotlin.ext.shell

import io.vertx.ext.shell.ShellServer
import io.vertx.kotlin.coroutines.awaitResult

/**
 *  Start the shell service, this is an asynchronous start. */
suspend fun ShellServer.listenSuspending() {
  awaitResult<Void?> { this.listen(it) }
}

/**
 *  Close the shell server, this is an asynchronous close. */
suspend fun ShellServer.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}
