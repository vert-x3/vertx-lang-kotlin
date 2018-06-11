package io.vertx.kotlin.ext.sql

import io.vertx.core.json.JsonArray
import io.vertx.ext.sql.ResultSet
import io.vertx.ext.sql.SQLConnection
import io.vertx.ext.sql.SQLRowStream
import io.vertx.ext.sql.TransactionIsolation
import io.vertx.ext.sql.UpdateResult
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.MutableList

suspend fun SQLConnection.querySingle(sql: String): JsonArray {
  return awaitResult { this.querySingle(sql, it) }
}

suspend fun SQLConnection.querySingleWithParams(sql: String, arguments: JsonArray): JsonArray {
  return awaitResult { this.querySingleWithParams(sql, arguments, it) }
}

suspend fun SQLConnection.setAutoCommit(autoCommit: Boolean) {
  awaitResult<Void?> { this.setAutoCommit(autoCommit, it) }
}

suspend fun SQLConnection.execute(sql: String) {
  awaitResult<Void?> { this.execute(sql, it) }
}

suspend fun SQLConnection.query(sql: String): ResultSet {
  return awaitResult { this.query(sql, it) }
}

suspend fun SQLConnection.queryStream(sql: String): SQLRowStream {
  return awaitResult { this.queryStream(sql, it) }
}

suspend fun SQLConnection.queryWithParams(sql: String, params: JsonArray): ResultSet {
  return awaitResult { this.queryWithParams(sql, params, it) }
}

suspend fun SQLConnection.queryStreamWithParams(sql: String, params: JsonArray): SQLRowStream {
  return awaitResult { this.queryStreamWithParams(sql, params, it) }
}

suspend fun SQLConnection.update(sql: String): UpdateResult {
  return awaitResult { this.update(sql, it) }
}

suspend fun SQLConnection.updateWithParams(sql: String, params: JsonArray): UpdateResult {
  return awaitResult { this.updateWithParams(sql, params, it) }
}

suspend fun SQLConnection.call(sql: String): ResultSet {
  return awaitResult { this.call(sql, it) }
}

suspend fun SQLConnection.callWithParams(
  sql: String,
  params: JsonArray,
  outputs: JsonArray
): ResultSet {
  return awaitResult { this.callWithParams(sql, params, outputs, it) }
}

suspend fun SQLConnection.close() {
  awaitResult<Void?> { this.close(it) }
}

suspend fun SQLConnection.commit() {
  awaitResult<Void?> { this.commit(it) }
}

suspend fun SQLConnection.rollback() {
  awaitResult<Void?> { this.rollback(it) }
}

suspend fun SQLConnection.batch(sqlStatements: MutableList<String>): MutableList<Int> {
  return awaitResult { this.batch(sqlStatements, it) }
}

suspend fun SQLConnection.batchWithParams(sqlStatement: String, args: MutableList<JsonArray>): MutableList<Int> {
  return awaitResult { this.batchWithParams(sqlStatement, args, it) }
}

suspend fun SQLConnection.batchCallableWithParams(
  sqlStatement: String,
  inArgs: MutableList<JsonArray>,
  outArgs: MutableList<JsonArray>
): MutableList<Int> {
  return awaitResult { this.batchCallableWithParams(sqlStatement, inArgs, outArgs, it) }
}

suspend fun SQLConnection.setTransactionIsolation(isolation: TransactionIsolation) {
  awaitResult<Void?> { this.setTransactionIsolation(isolation, it) }
}

suspend fun SQLConnection.getTransactionIsolation(): TransactionIsolation {
  return awaitResult { this.getTransactionIsolation(it) }
}
