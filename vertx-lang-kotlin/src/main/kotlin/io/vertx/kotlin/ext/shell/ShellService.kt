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

import io.vertx.ext.shell.ShellService
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.shell.ShellService.start]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.shell.ShellService] using Vert.x codegen.
 */
@Deprecated(message = "Instead use start returning a future and chain with await()", replaceWith = ReplaceWith("start().await()"))
suspend fun ShellService.startAwait(): Unit {
  return awaitResult {
    this.start(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.shell.ShellService.stop]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.shell.ShellService] using Vert.x codegen.
 */
@Deprecated(message = "Instead use stop returning a future and chain with await()", replaceWith = ReplaceWith("stop().await()"))
suspend fun ShellService.stopAwait(): Unit {
  return awaitResult {
    this.stop(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

