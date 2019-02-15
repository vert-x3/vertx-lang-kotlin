package io.vertx.kotlin.ext.sql

import io.vertx.core.json.JsonArray
import io.vertx.ext.sql.ResultSet
import io.vertx.ext.sql.SQLConnection
import io.vertx.ext.sql.SQLRowStream
import io.vertx.ext.sql.TransactionIsolation
import io.vertx.ext.sql.UpdateResult
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.querySingle]
 *
 * @param sql the statement to execute
 * @return [JsonArray?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
suspend fun SQLConnection.querySingleAwait(sql: String): JsonArray? {
  return awaitResult {
    this.querySingle(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.querySingleWithParams]
 *
 * @param sql the statement to execute
 * @param arguments the arguments
 * @return [JsonArray?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
suspend fun SQLConnection.querySingleWithParamsAwait(sql: String, arguments: JsonArray): JsonArray? {
  return awaitResult {
    this.querySingleWithParams(sql, arguments, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.setAutoCommit]
 *
 * @param autoCommit the autoCommit flag, true by default.
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
suspend fun SQLConnection.setAutoCommitAwait(autoCommit: Boolean): Unit {
  return awaitResult {
    this.setAutoCommit(autoCommit) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.execute]
 *
 * @param sql the SQL to execute. For example <code>CREATE TABLE IF EXISTS table ...</code>
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
suspend fun SQLConnection.executeAwait(sql: String): Unit {
  return awaitResult {
    this.execute(sql) { ar -> it.handle(ar.mapEmpty()) }
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
suspend fun SQLConnection.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.commit]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
suspend fun SQLConnection.commitAwait(): Unit {
  return awaitResult {
    this.commit { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.rollback]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
suspend fun SQLConnection.rollbackAwait(): Unit {
  return awaitResult {
    this.rollback { ar -> it.handle(ar.mapEmpty()) }
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
suspend fun SQLConnection.setTransactionIsolationAwait(isolation: TransactionIsolation): Unit {
  return awaitResult {
    this.setTransactionIsolation(isolation) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLConnection.getTransactionIsolation]
 *
 * @return [TransactionIsolation]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLConnection] using Vert.x codegen.
 */
suspend fun SQLConnection.getTransactionIsolationAwait(): TransactionIsolation {
  return awaitResult {
    this.getTransactionIsolation(it)
  }
}

