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
import io.vertx.ext.sql.SQLClient
import io.vertx.ext.sql.SQLConnection
import io.vertx.ext.sql.SQLRowStream
import io.vertx.ext.sql.UpdateResult
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.sql.SQLClient.querySingle]
 *
 * @param sql the statement to execute
 * @return [JsonArray?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use querySingle returning a future and chain with coAwait()", replaceWith = ReplaceWith("querySingle(sql).coAwait()"))
suspend fun SQLClient.querySingleAwait(sql: String): JsonArray? {
  return awaitResult {
    this.querySingle(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLClient.querySingleWithParams]
 *
 * @param sql the statement to execute
 * @param arguments the arguments
 * @return [JsonArray?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use querySingleWithParams returning a future and chain with coAwait()", replaceWith = ReplaceWith("querySingleWithParams(sql, arguments).coAwait()"))
suspend fun SQLClient.querySingleWithParamsAwait(sql: String, arguments: JsonArray): JsonArray? {
  return awaitResult {
    this.querySingleWithParams(sql, arguments, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLClient.getConnection]
 *
 * @return [SQLConnection]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getConnection returning a future and chain with coAwait()", replaceWith = ReplaceWith("getConnection().coAwait()"))
suspend fun SQLClient.getConnectionAwait(): SQLConnection {
  return awaitResult {
    this.getConnection(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLClient.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with coAwait()", replaceWith = ReplaceWith("close().coAwait()"))
suspend fun SQLClient.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLClient.query]
 *
 * @param sql the statement to execute
 * @return [ResultSet]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use query returning a future and chain with coAwait()", replaceWith = ReplaceWith("query(sql).coAwait()"))
suspend fun SQLClient.queryAwait(sql: String): ResultSet {
  return awaitResult {
    this.query(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLClient.queryStream]
 *
 * @param sql the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @return [SQLRowStream]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use queryStream returning a future and chain with coAwait()", replaceWith = ReplaceWith("queryStream(sql).coAwait()"))
suspend fun SQLClient.queryStreamAwait(sql: String): SQLRowStream {
  return awaitResult {
    this.queryStream(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLClient.queryStreamWithParams]
 *
 * @param sql the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @param params these are the parameters to fill the statement.
 * @return [SQLRowStream]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use queryStreamWithParams returning a future and chain with coAwait()", replaceWith = ReplaceWith("queryStreamWithParams(sql, params).coAwait()"))
suspend fun SQLClient.queryStreamWithParamsAwait(sql: String, params: JsonArray): SQLRowStream {
  return awaitResult {
    this.queryStreamWithParams(sql, params, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLClient.queryWithParams]
 *
 * @param sql the statement to execute
 * @param arguments the arguments to the statement
 * @return [ResultSet]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use queryWithParams returning a future and chain with coAwait()", replaceWith = ReplaceWith("queryWithParams(sql, arguments).coAwait()"))
suspend fun SQLClient.queryWithParamsAwait(sql: String, arguments: JsonArray): ResultSet {
  return awaitResult {
    this.queryWithParams(sql, arguments, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLClient.update]
 *
 * @param sql the SQL to execute. For example <code>INSERT INTO table ...</code>
 * @return [UpdateResult]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use update returning a future and chain with coAwait()", replaceWith = ReplaceWith("update(sql).coAwait()"))
suspend fun SQLClient.updateAwait(sql: String): UpdateResult {
  return awaitResult {
    this.update(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLClient.updateWithParams]
 *
 * @param sql the SQL to execute. For example <code>INSERT INTO table ...</code>
 * @param params these are the parameters to fill the statement.
 * @return [UpdateResult]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use updateWithParams returning a future and chain with coAwait()", replaceWith = ReplaceWith("updateWithParams(sql, params).coAwait()"))
suspend fun SQLClient.updateWithParamsAwait(sql: String, params: JsonArray): UpdateResult {
  return awaitResult {
    this.updateWithParams(sql, params, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLClient.call]
 *
 * @param sql the SQL to execute. For example <code>{call getEmpName}</code>.
 * @return [ResultSet]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use call returning a future and chain with coAwait()", replaceWith = ReplaceWith("call(sql).coAwait()"))
suspend fun SQLClient.callAwait(sql: String): ResultSet {
  return awaitResult {
    this.call(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLClient.callWithParams]
 *
 * @param sql the SQL to execute. For example <code>{call getEmpName (?, ?)}</code>.
 * @param params these are the parameters to fill the statement.
 * @param outputs these are the outputs to fill the statement.
 * @return [ResultSet]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use callWithParams returning a future and chain with coAwait()", replaceWith = ReplaceWith("callWithParams(sql, params, outputs).coAwait()"))
suspend fun SQLClient.callWithParamsAwait(sql: String, params: JsonArray, outputs: JsonArray): ResultSet {
  return awaitResult {
    this.callWithParams(sql, params, outputs, it)
  }
}

