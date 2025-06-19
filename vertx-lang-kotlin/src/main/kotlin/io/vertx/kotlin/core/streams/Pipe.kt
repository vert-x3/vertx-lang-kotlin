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
package io.vertx.kotlin.core.streams

import io.vertx.core.streams.Pipe
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.streams.Pipe.to]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.streams.Pipe] using Vert.x codegen.
 */
@Deprecated(message = "Instead use to returning a future and chain with coAwait()", replaceWith = ReplaceWith("to(dst).coAwait()"))
suspend fun <T> Pipe<T>.toAwait(dst: WriteStream<T>): Unit {
  return awaitResult {
    this.to(dst, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

