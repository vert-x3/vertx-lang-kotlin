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
import io.vertx.ext.sql.SQLConnection
import io.vertx.ext.sql.SQLRowStream
import io.vertx.ext.sql.TransactionIsolation
import io.vertx.ext.sql.UpdateResult
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.setAutoCommit]
 *
 * @param autoCommit the autoCommit flag, true by default.
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use setAutoCommit returning a future and chain with await()", replaceWith = ReplaceWith("setAutoCommit(autoCommit).await()"))
suspend fun SQLConnection.setAutoCommitAwait(autoCommit: Boolean): Unit {
  return awaitResult {
    this.setAutoCommit(autoCommit, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.execute]
 *
 * @param sql the SQL to execute. For example <code>CREATE TABLE IF EXISTS table ...</code>
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use execute returning a future and chain with await()", replaceWith = ReplaceWith("execute(sql).await()"))
suspend fun SQLConnection.executeAwait(sql: String): Unit {
  return awaitResult {
    this.execute(sql, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.query]
 *
 * @param sql the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @return [ResultSet]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use query returning a future and chain with await()", replaceWith = ReplaceWith("query(sql).await()"))
suspend fun SQLConnection.queryAwait(sql: String): ResultSet {
  return awaitResult {
    this.query(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.queryStream]
 *
 * @param sql the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @return [SQLRowStream]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use queryStream returning a future and chain with await()", replaceWith = ReplaceWith("queryStream(sql).await()"))
suspend fun SQLConnection.queryStreamAwait(sql: String): SQLRowStream {
  return awaitResult {
    this.queryStream(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.queryWithParams]
 *
 * @param sql the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @param params these are the parameters to fill the statement.
 * @return [ResultSet]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use queryWithParams returning a future and chain with await()", replaceWith = ReplaceWith("queryWithParams(sql, params).await()"))
suspend fun SQLConnection.queryWithParamsAwait(sql: String, params: JsonArray): ResultSet {
  return awaitResult {
    this.queryWithParams(sql, params, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.queryStreamWithParams]
 *
 * @param sql the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @param params these are the parameters to fill the statement.
 * @return [SQLRowStream]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use queryStreamWithParams returning a future and chain with await()", replaceWith = ReplaceWith("queryStreamWithParams(sql, params).await()"))
suspend fun SQLConnection.queryStreamWithParamsAwait(sql: String, params: JsonArray): SQLRowStream {
  return awaitResult {
    this.queryStreamWithParams(sql, params, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.update]
 *
 * @param sql the SQL to execute. For example <code>INSERT INTO table ...</code>
 * @return [UpdateResult]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use update returning a future and chain with await()", replaceWith = ReplaceWith("update(sql).await()"))
suspend fun SQLConnection.updateAwait(sql: String): UpdateResult {
  return awaitResult {
    this.update(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.updateWithParams]
 *
 * @param sql the SQL to execute. For example <code>INSERT INTO table ...</code>
 * @param params these are the parameters to fill the statement.
 * @return [UpdateResult]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use updateWithParams returning a future and chain with await()", replaceWith = ReplaceWith("updateWithParams(sql, params).await()"))
suspend fun SQLConnection.updateWithParamsAwait(sql: String, params: JsonArray): UpdateResult {
  return awaitResult {
    this.updateWithParams(sql, params, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.call]
 *
 * @param sql the SQL to execute. For example <code>{call getEmpName}</code>.
 * @return [ResultSet]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use call returning a future and chain with await()", replaceWith = ReplaceWith("call(sql).await()"))
suspend fun SQLConnection.callAwait(sql: String): ResultSet {
  return awaitResult {
    this.call(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.callWithParams]
 *
 * @param sql the SQL to execute. For example <code>{call getEmpName (?, ?)}</code>.
 * @param params these are the parameters to fill the statement.
 * @param outputs these are the outputs to fill the statement.
 * @return [ResultSet]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use callWithParams returning a future and chain with await()", replaceWith = ReplaceWith("callWithParams(sql, params, outputs).await()"))
suspend fun SQLConnection.callWithParamsAwait(sql: String, params: JsonArray, outputs: JsonArray): ResultSet {
  return awaitResult {
    this.callWithParams(sql, params, outputs, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with await()", replaceWith = ReplaceWith("close().await()"))
suspend fun SQLConnection.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.commit]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use commit returning a future and chain with await()", replaceWith = ReplaceWith("commit().await()"))
suspend fun SQLConnection.commitAwait(): Unit {
  return awaitResult {
    this.commit(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.rollback]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use rollback returning a future and chain with await()", replaceWith = ReplaceWith("rollback().await()"))
suspend fun SQLConnection.rollbackAwait(): Unit {
  return awaitResult {
    this.rollback(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.batch]
 *
 * @param sqlStatements sql statement
 * @return [List<Int>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use batch returning a future and chain with await()", replaceWith = ReplaceWith("batch(sqlStatements).await()"))
suspend fun SQLConnection.batchAwait(sqlStatements: List<String>): List<Int> {
  return awaitResult {
    this.batch(sqlStatements, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.batchWithParams]
 *
 * @param sqlStatement sql statement
 * @param args the prepared statement arguments
 * @return [List<Int>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use batchWithParams returning a future and chain with await()", replaceWith = ReplaceWith("batchWithParams(sqlStatement, args).await()"))
suspend fun SQLConnection.batchWithParamsAwait(sqlStatement: String, args: List<JsonArray>): List<Int> {
  return awaitResult {
    this.batchWithParams(sqlStatement, args, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.batchCallableWithParams]
 *
 * @param sqlStatement sql statement
 * @param inArgs the callable statement input arguments
 * @param outArgs the callable statement output arguments
 * @return [List<Int>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use batchCallableWithParams returning a future and chain with await()", replaceWith = ReplaceWith("batchCallableWithParams(sqlStatement, inArgs, outArgs).await()"))
suspend fun SQLConnection.batchCallableWithParamsAwait(sqlStatement: String, inArgs: List<JsonArray>, outArgs: List<JsonArray>): List<Int> {
  return awaitResult {
    this.batchCallableWithParams(sqlStatement, inArgs, outArgs, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.setTransactionIsolation]
 *
 * @param isolation the level of isolation
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use setTransactionIsolation returning a future and chain with await()", replaceWith = ReplaceWith("setTransactionIsolation(isolation).await()"))
suspend fun SQLConnection.setTransactionIsolationAwait(isolation: TransactionIsolation): Unit {
  return awaitResult {
    this.setTransactionIsolation(isolation, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.getTransactionIsolation]
 *
 * @return [TransactionIsolation]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getTransactionIsolation returning a future and chain with await()", replaceWith = ReplaceWith("getTransactionIsolation().await()"))
suspend fun SQLConnection.getTransactionIsolationAwait(): TransactionIsolation {
  return awaitResult {
    this.getTransactionIsolation(it)
  }
}

