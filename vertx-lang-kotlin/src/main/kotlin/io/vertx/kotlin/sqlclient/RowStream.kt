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
package io.vertx.kotlin.sqlclient

import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.sqlclient.RowStream

/**
 * Suspending version of method [io.vertx.sqlclient.RowStream.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.RowStream] using Vert.x codegen.
 */
@Deprecated(message = "Instead use pipeTo returning a future that can yield a result ", replaceWith = ReplaceWith("pipeTo(dst).await()"))
suspend fun <T> RowStream<T>.pipeToAwait(dst: WriteStream<T>): Unit {
  return awaitResult {
    this.pipeTo(dst, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.sqlclient.RowStream.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.RowStream] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future that can yield a result ", replaceWith = ReplaceWith("close().await()"))
suspend fun <T> RowStream<T>.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

