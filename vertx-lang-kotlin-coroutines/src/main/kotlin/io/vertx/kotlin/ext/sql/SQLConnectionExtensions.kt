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

suspend fun SQLConnection.querySingle(sql: String): JsonArray = awaitResult { this.querySingle(sql, it) }

suspend fun SQLConnection.querySingleWithParams(sql: String, arguments: JsonArray): JsonArray = awaitResult { this.querySingleWithParams(sql, arguments, it) }

suspend fun SQLConnection.setAutoCommit(autoCommit: Boolean) {
  awaitResult<Void?> { this.setAutoCommit(autoCommit, it) }
}

suspend fun SQLConnection.execute(sql: String) {
  awaitResult<Void?> { this.execute(sql, it) }
}

suspend fun SQLConnection.query(sql: String): ResultSet = awaitResult { this.query(sql, it) }

suspend fun SQLConnection.queryStream(sql: String): SQLRowStream = awaitResult { this.queryStream(sql, it) }

suspend fun SQLConnection.queryWithParams(sql: String, params: JsonArray): ResultSet = awaitResult { this.queryWithParams(sql, params, it) }

suspend fun SQLConnection.queryStreamWithParams(sql: String, params: JsonArray): SQLRowStream = awaitResult { this.queryStreamWithParams(sql, params, it) }

suspend fun SQLConnection.update(sql: String): UpdateResult = awaitResult { this.update(sql, it) }

suspend fun SQLConnection.updateWithParams(sql: String, params: JsonArray): UpdateResult = awaitResult { this.updateWithParams(sql, params, it) }

suspend fun SQLConnection.call(sql: String): ResultSet = awaitResult { this.call(sql, it) }

suspend fun SQLConnection.callWithParams(
    sql: String,
    params: JsonArray,
    outputs: JsonArray
): ResultSet = awaitResult { this.callWithParams(sql, params, outputs, it) }

suspend fun SQLConnection.close() {
  awaitResult<Void?> { this.close(it) }
}

suspend fun SQLConnection.commit() {
  awaitResult<Void?> { this.commit(it) }
}

suspend fun SQLConnection.rollback() {
  awaitResult<Void?> { this.rollback(it) }
}

suspend fun SQLConnection.batch(sqlStatements: MutableList<String>): MutableList<Int> = awaitResult { this.batch(sqlStatements, it) }

suspend fun SQLConnection.batchWithParams(sqlStatement: String, args: MutableList<JsonArray>): MutableList<Int> = awaitResult { this.batchWithParams(sqlStatement, args, it) }

suspend fun SQLConnection.batchCallableWithParams(
    sqlStatement: String,
    inArgs: MutableList<JsonArray>,
    outArgs: MutableList<JsonArray>
): MutableList<Int> = awaitResult { this.batchCallableWithParams(sqlStatement, inArgs, outArgs, it) }

suspend fun SQLConnection.setTransactionIsolation(isolation: TransactionIsolation) {
  awaitResult<Void?> { this.setTransactionIsolation(isolation, it) }
}

suspend fun SQLConnection.getTransactionIsolation(): TransactionIsolation = awaitResult { this.getTransactionIsolation(it) }
