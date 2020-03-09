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
package io.vertx.kotlin.mysqlclient

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mysqlclient.MySQLPool
import io.vertx.sqlclient.Row
import io.vertx.sqlclient.RowSet
import io.vertx.sqlclient.Tuple

/**
 * Suspending version of method [io.vertx.mysqlclient.MySQLPool.preparedQuery]
 *
 * @param sql 
 * @return [RowSet<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLPool] using Vert.x codegen.
 */
suspend fun MySQLPool.preparedQueryAwait(sql: String): RowSet<Row> {
  return awaitResult {
    this.preparedQuery(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.mysqlclient.MySQLPool.query]
 *
 * @param sql 
 * @return [RowSet<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLPool] using Vert.x codegen.
 */
suspend fun MySQLPool.queryAwait(sql: String): RowSet<Row> {
  return awaitResult {
    this.query(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.mysqlclient.MySQLPool.preparedQuery]
 *
 * @param sql 
 * @param arguments 
 * @return [RowSet<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLPool] using Vert.x codegen.
 */
suspend fun MySQLPool.preparedQueryAwait(sql: String, arguments: Tuple): RowSet<Row> {
  return awaitResult {
    this.preparedQuery(sql, arguments, it)
  }
}

/**
 * Suspending version of method [io.vertx.mysqlclient.MySQLPool.preparedBatch]
 *
 * @param sql 
 * @param batch 
 * @return [RowSet<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mysqlclient.MySQLPool] using Vert.x codegen.
 */
suspend fun MySQLPool.preparedBatchAwait(sql: String, batch: List<Tuple>): RowSet<Row> {
  return awaitResult {
    this.preparedBatch(sql, batch, it)
  }
}

