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
import io.vertx.sqlclient.Pool
import io.vertx.sqlclient.Row
import io.vertx.sqlclient.RowSet
import io.vertx.sqlclient.SqlConnection
import io.vertx.sqlclient.Transaction
import io.vertx.sqlclient.Tuple

/**
 * Suspending version of method [io.vertx.sqlclient.Pool.query]
 *
 * @param sql the query SQL
 * @return [RowSet<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.Pool] using Vert.x codegen.
 */
suspend fun Pool.queryAwait(sql: String): RowSet<Row> {
  return awaitResult {
    this.query(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.sqlclient.Pool.preparedQuery]
 *
 * @param sql the prepared query SQL
 * @return [RowSet<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.Pool] using Vert.x codegen.
 */
suspend fun Pool.preparedQueryAwait(sql: String): RowSet<Row> {
  return awaitResult {
    this.preparedQuery(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.sqlclient.Pool.preparedQuery]
 *
 * @param sql the prepared query SQL
 * @param arguments the list of arguments
 * @return [RowSet<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.Pool] using Vert.x codegen.
 */
suspend fun Pool.preparedQueryAwait(sql: String, arguments: Tuple): RowSet<Row> {
  return awaitResult {
    this.preparedQuery(sql, arguments, it)
  }
}

/**
 * Suspending version of method [io.vertx.sqlclient.Pool.preparedBatch]
 *
 * @param sql the prepared query SQL
 * @param batch the batch of tuples
 * @return [RowSet<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.Pool] using Vert.x codegen.
 */
suspend fun Pool.preparedBatchAwait(sql: String, batch: List<Tuple>): RowSet<Row> {
  return awaitResult {
    this.preparedBatch(sql, batch, it)
  }
}

/**
 * Suspending version of method [io.vertx.sqlclient.Pool.getConnection]
 *
 * @return [SqlConnection]
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.Pool] using Vert.x codegen.
 */
suspend fun Pool.getConnectionAwait(): SqlConnection {
  return awaitResult {
    this.getConnection(it)
  }
}

/**
 * Suspending version of method [io.vertx.sqlclient.Pool.begin]
 *
 * @return [Transaction]
 *
 * NOTE: This function has been automatically generated from [io.vertx.sqlclient.Pool] using Vert.x codegen.
 */
suspend fun Pool.beginAwait(): Transaction {
  return awaitResult {
    this.begin(it)
  }
}

