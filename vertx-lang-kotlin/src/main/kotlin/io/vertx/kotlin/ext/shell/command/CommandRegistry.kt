package io.vertx.kotlin.ext.shell.command

import io.vertx.ext.shell.command.Command
import io.vertx.ext.shell.command.CommandRegistry
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.shell.command.CommandRegistry.registerCommand]
 *
 * @param command the command to register
 * @return [Command]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.shell.command.CommandRegistry] using Vert.x codegen.
 */
suspend fun CommandRegistry.registerCommandAwait(command: Command): Command {
  return awaitResult {
    this.registerCommand(command, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.shell.command.CommandRegistry.registerCommands]
 *
 * @param commands the commands to register
 * @return [List<Command>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.shell.command.CommandRegistry] using Vert.x codegen.
 */
suspend fun CommandRegistry.registerCommandsAwait(commands: List<Command>): List<Command> {
  return awaitResult {
    this.registerCommands(commands, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.shell.command.CommandRegistry.unregisterCommand]
 *
 * @param commandName the command name
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.shell.command.CommandRegistry] using Vert.x codegen.
 */
suspend fun CommandRegistry.unregisterCommandAwait(commandName: String): Unit {
  return awaitResult {
    this.unregisterCommand(commandName) { ar -> it.handle(ar.mapEmpty()) }
  }
}

