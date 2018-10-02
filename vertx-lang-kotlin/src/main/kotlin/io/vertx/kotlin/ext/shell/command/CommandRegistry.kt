package io.vertx.kotlin.ext.shell.command

import io.vertx.ext.shell.command.Command
import io.vertx.ext.shell.command.CommandRegistry
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Register a command
 *
 * @param command the command to register
 * @param completionHandler notified when the command is registered
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.command.CommandRegistry original] using Vert.x codegen.
 */
suspend fun CommandRegistry.registerCommandAwait(command : Command) : Command {
  return awaitResult{
    this.registerCommand(command, it)
  }
}

/**
 * Register a list of commands.
 *
 * @param commands the commands to register
 * @param completionHandler notified when the command is registered
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.command.CommandRegistry original] using Vert.x codegen.
 */
suspend fun CommandRegistry.registerCommandsAwait(commands : List<Command>) : List<Command> {
  return awaitResult{
    this.registerCommands(commands, it)
  }
}

/**
 * Unregister a command.
 *
 * @param commandName the command name
 * @param completionHandler notified when the command is unregistered
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.command.CommandRegistry original] using Vert.x codegen.
 */
suspend fun CommandRegistry.unregisterCommandAwait(commandName : String) : Unit {
  return awaitResult{
    this.unregisterCommand(commandName, { ar -> it.handle(ar.mapEmpty()) })}
}

