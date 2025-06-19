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
package io.vertx.kotlin.ext.shell.term

import io.vertx.ext.shell.term.TermServer
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.shell.term.TermServer.listen]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.shell.term.TermServer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use listen returning a future and chain with coAwait()", replaceWith = ReplaceWith("listen().coAwait()"))
suspend fun TermServer.listenAwait(): Unit {
  return awaitResult {
    this.listen(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.shell.term.TermServer.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.shell.term.TermServer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with coAwait()", replaceWith = ReplaceWith("close().coAwait()"))
suspend fun TermServer.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

