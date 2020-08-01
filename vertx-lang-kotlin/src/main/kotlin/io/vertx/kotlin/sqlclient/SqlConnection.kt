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
import io.vertx.sqlclient.PreparedStatement
import io.vertx.sqlclient.SqlConnection
import io.vertx.sqlclient.Transaction

/**
 * Suspending version of method [io.vertx.sqlclient.SqlConnection.prepare]
 *
 * @param sql the sql
 * @return [PreparedStatement]
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.SqlConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use prepare returning a future and chain with await()", replaceWith = ReplaceWith("prepare(sql).await()"))
suspend fun SqlConnection.prepareAwait(sql: String): PreparedStatement {
  return awaitResult {
    this.prepare(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.sqlclient.SqlConnection.begin]
 *
 * @return [Transaction]
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.SqlConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use begin returning a future and chain with await()", replaceWith = ReplaceWith("begin().await()"))
suspend fun SqlConnection.beginAwait(): Transaction {
  return awaitResult {
    this.begin(it)
  }
}

/**
 * Suspending version of method [io.vertx.sqlclient.SqlConnection.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.SqlConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with await()", replaceWith = ReplaceWith("close().await()"))
suspend fun SqlConnection.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

