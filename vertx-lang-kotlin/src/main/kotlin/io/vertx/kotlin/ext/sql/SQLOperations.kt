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
package io.vertx.kotlin.ext.sql

import io.vertx.core.json.JsonArray
import io.vertx.ext.sql.ResultSet
import io.vertx.ext.sql.SQLOperations
import io.vertx.ext.sql.SQLRowStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.sql.SQLOperations.queryWithParams]
 *
 * @param sql the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @param params these are the parameters to fill the statement.
 * @return [ResultSet]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLOperations] using Vert.x codegen.
 */
@Deprecated(message = "Instead use queryWithParams returning a future and chain with await()", replaceWith = ReplaceWith("queryWithParams(sql, params).await()"))
suspend fun SQLOperations.queryWithParamsAwait(sql: String, params: JsonArray): ResultSet {
  return awaitResult {
    this.queryWithParams(sql, params, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLOperations.queryStream]
 *
 * @param sql the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @return [SQLRowStream]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLOperations] using Vert.x codegen.
 */
@Deprecated(message = "Instead use queryStream returning a future and chain with await()", replaceWith = ReplaceWith("queryStream(sql).await()"))
suspend fun SQLOperations.queryStreamAwait(sql: String): SQLRowStream {
  return awaitResult {
    this.queryStream(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLOperations.queryStreamWithParams]
 *
 * @param sql the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @param params these are the parameters to fill the statement.
 * @return [SQLRowStream]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLOperations] using Vert.x codegen.
 */
@Deprecated(message = "Instead use queryStreamWithParams returning a future and chain with await()", replaceWith = ReplaceWith("queryStreamWithParams(sql, params).await()"))
suspend fun SQLOperations.queryStreamWithParamsAwait(sql: String, params: JsonArray): SQLRowStream {
  return awaitResult {
    this.queryStreamWithParams(sql, params, it)
  }
}

