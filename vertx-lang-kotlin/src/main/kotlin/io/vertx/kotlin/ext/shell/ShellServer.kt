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
package io.vertx.kotlin.ext.shell

import io.vertx.ext.shell.ShellServer
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Start the shell service, this is an asynchronous start.
 *
 * @return  *
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
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.ShellServer original] using Vert.x codegen.
 */
suspend fun ShellServer.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

