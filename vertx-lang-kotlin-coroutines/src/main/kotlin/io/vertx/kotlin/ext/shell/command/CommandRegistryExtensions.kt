package io.vertx.kotlin.ext.shell.command

import io.vertx.ext.shell.command.Command
import io.vertx.ext.shell.command.CommandRegistry
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.String
import kotlin.collections.MutableList

/**
 *  Register a command
 * @param command the command to register
 * @return a reference to this, so the API can be used fluently
 */
suspend fun CommandRegistry.registerCommandSuspending(command: Command): Command {
  return awaitResult { this.registerCommand(command, it) }
}

/**
 *  Register a list of commands.
 * @param commands the commands to register
 * @return a reference to this, so the API can be used fluently
 */
suspend fun CommandRegistry.registerCommandsSuspending(commands: MutableList<Command>): MutableList<Command> {
  return awaitResult { this.registerCommands(commands, it) }
}

/**
 *  Unregister a command.
 * @param commandName the command name
 * @return a reference to this, so the API can be used fluently
 */
suspend fun CommandRegistry.unregisterCommandSuspending(commandName: String) {
  awaitResult<Void?> { this.unregisterCommand(commandName, it) }
}
