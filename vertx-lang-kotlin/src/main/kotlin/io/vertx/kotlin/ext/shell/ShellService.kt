package io.vertx.kotlin.ext.shell

import io.vertx.ext.shell.ShellService
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Start the shell service, this is an asynchronous start.
 *
 * @param startHandler handler for getting notified when service is started
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.ShellService original] using Vert.x codegen.
 */
suspend fun ShellService.startAwait() : Unit {
  return awaitResult{
    this.start({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Stop the shell service, this is an asynchronous start.
 *
 * @param stopHandler handler for getting notified when service is stopped
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.ShellService original] using Vert.x codegen.
 */
suspend fun ShellService.stopAwait() : Unit {
  return awaitResult{
    this.stop({ ar -> it.handle(ar.mapEmpty()) })}
}

