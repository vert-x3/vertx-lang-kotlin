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
 * Bind the term server, the [io.vertx.ext.shell.term.TermServer] must be set before.
 *
 * @return this object *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.term.TermServer original] using Vert.x codegen.
 */
suspend fun TermServer.listenAwait() : TermServer {
  return awaitResult{
    this.listen(it)
  }
}

/**
 * Like [io.vertx.ext.shell.term.TermServer] but supplying a handler that will be notified when close is complete.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.term.TermServer original] using Vert.x codegen.
 */
suspend fun TermServer.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

