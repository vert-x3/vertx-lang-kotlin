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

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.sqlclient.PreparedQuery
import io.vertx.sqlclient.Tuple

/**
 * Suspending version of method [io.vertx.sqlclient.PreparedQuery.execute]
 *
 * @return [T]
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.PreparedQuery] using Vert.x codegen.
 */
@Deprecated(message = "Instead use execute returning a future and chain with coAwait()", replaceWith = ReplaceWith("execute().coAwait()"))
suspend fun <T> PreparedQuery<T>.executeAwait(): T {
  return awaitResult {
    this.execute(it)
  }
}

/**
 * Suspending version of method [io.vertx.sqlclient.PreparedQuery.execute]
 *
 * @param tuple 
 * @return [T]
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.PreparedQuery] using Vert.x codegen.
 */
@Deprecated(message = "Instead use execute returning a future and chain with coAwait()", replaceWith = ReplaceWith("execute(tuple).coAwait()"))
suspend fun <T> PreparedQuery<T>.executeAwait(tuple: Tuple): T {
  return awaitResult {
    this.execute(tuple, it)
  }
}

/**
 * Suspending version of method [io.vertx.sqlclient.PreparedQuery.executeBatch]
 *
 * @param batch the batch of tuples
 * @return [T]
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.PreparedQuery] using Vert.x codegen.
 */
@Deprecated(message = "Instead use executeBatch returning a future and chain with coAwait()", replaceWith = ReplaceWith("executeBatch(batch).coAwait()"))
suspend fun <T> PreparedQuery<T>.executeBatchAwait(batch: List<Tuple>): T {
  return awaitResult {
    this.executeBatch(batch, it)
  }
}

