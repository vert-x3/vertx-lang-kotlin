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
 * Suspending version of method [io.vertx.ext.shell.ShellServer.listen]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.shell.ShellServer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use listen returning a future and chain with await()", replaceWith = ReplaceWith("listen().await()"))
suspend fun ShellServer.listenAwait(): Unit {
  return awaitResult {
    this.listen(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.shell.ShellServer.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.shell.ShellServer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with await()", replaceWith = ReplaceWith("close().await()"))
suspend fun ShellServer.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

