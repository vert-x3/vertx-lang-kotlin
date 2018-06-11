package io.vertx.kotlin.ext.shell.command

import io.vertx.ext.shell.command.Command
import io.vertx.ext.shell.command.CommandRegistry
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.String
import kotlin.collections.MutableList

suspend fun CommandRegistry.registerCommand(command: Command): Command {
  return awaitResult { this.registerCommand(command, it) }
}

suspend fun CommandRegistry.registerCommands(commands: MutableList<Command>): MutableList<Command> {
  return awaitResult { this.registerCommands(commands, it) }
}

suspend fun CommandRegistry.unregisterCommand(commandName: String) {
  awaitResult<Void?> { this.unregisterCommand(commandName, it) }
}
