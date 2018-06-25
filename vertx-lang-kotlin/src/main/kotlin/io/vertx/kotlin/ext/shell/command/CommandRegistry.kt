package io.vertx.kotlin.ext.shell.command

import io.vertx.ext.shell.command.Command
import io.vertx.ext.shell.command.CommandRegistry
import io.vertx.kotlin.coroutines.awaitResult

suspend fun CommandRegistry.registerCommandAwait(command : Command) : Command {
    return awaitResult{
        this.registerCommand(command, it)
    }
}

suspend fun CommandRegistry.registerCommandsAwait(commands : List<Command>) : List<Command> {
    return awaitResult{
        this.registerCommands(commands, it)
    }
}

suspend fun CommandRegistry.unregisterCommandAwait(commandName : String) : Unit {
    return awaitResult{
        this.unregisterCommand(commandName, { ar -> it.handle(ar.mapEmpty()) })}
}

