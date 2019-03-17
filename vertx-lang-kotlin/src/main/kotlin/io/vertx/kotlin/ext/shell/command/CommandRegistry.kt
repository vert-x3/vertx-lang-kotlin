/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.ext.shell.command

import io.vertx.ext.shell.command.Command
import io.vertx.ext.shell.command.CommandRegistry
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Register a command
 *
 * @param command the command to register
 * @return a reference to this, so the API can be used fluently *
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
 * @return a reference to this, so the API can be used fluently *
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
 * @return a reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.command.CommandRegistry original] using Vert.x codegen.
 */
suspend fun CommandRegistry.unregisterCommandAwait(commandName : String) : Unit {
  return awaitResult{
    this.unregisterCommand(commandName, { ar -> it.handle(ar.mapEmpty()) })}
}

