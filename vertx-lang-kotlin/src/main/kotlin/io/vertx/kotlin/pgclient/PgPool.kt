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
package io.vertx.kotlin.pgclient

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.pgclient.PgPool
import io.vertx.sqlclient.Row
import io.vertx.sqlclient.RowSet
import io.vertx.sqlclient.Tuple

/**
 * Suspending version of method [io.vertx.pgclient.PgPool.preparedQuery]
 *
 * @param sql 
 * @return [RowSet<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.pgclient.PgPool] using Vert.x codegen.
 */
suspend fun PgPool.preparedQueryAwait(sql: String): RowSet<Row> {
  return awaitResult {
    this.preparedQuery(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.pgclient.PgPool.query]
 *
 * @param sql 
 * @return [RowSet<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.pgclient.PgPool] using Vert.x codegen.
 */
suspend fun PgPool.queryAwait(sql: String): RowSet<Row> {
  return awaitResult {
    this.query(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.pgclient.PgPool.preparedQuery]
 *
 * @param sql 
 * @param arguments 
 * @return [RowSet<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.pgclient.PgPool] using Vert.x codegen.
 */
suspend fun PgPool.preparedQueryAwait(sql: String, arguments: Tuple): RowSet<Row> {
  return awaitResult {
    this.preparedQuery(sql, arguments, it)
  }
}

/**
 * Suspending version of method [io.vertx.pgclient.PgPool.preparedBatch]
 *
 * @param sql 
 * @param batch 
 * @return [RowSet<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.pgclient.PgPool] using Vert.x codegen.
 */
suspend fun PgPool.preparedBatchAwait(sql: String, batch: List<Tuple>): RowSet<Row> {
  return awaitResult {
    this.preparedBatch(sql, batch, it)
  }
}

