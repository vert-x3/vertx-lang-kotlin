package io.vertx.kotlin.ext.shell

import io.vertx.ext.shell.ShellServer
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Start the shell service, this is an asynchronous start.
 *
 * @param listenHandler handler for getting notified when service is started
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.ShellServer original] using Vert.x codegen.
 */
suspend fun ShellServer.listenAwait() : Unit {
  return awaitResult{
    this.listen({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Close the shell server, this is an asynchronous close.
 *
 * @param completionHandler handler for getting notified when service is stopped
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.ShellServer original] using Vert.x codegen.
 */
suspend fun ShellServer.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

