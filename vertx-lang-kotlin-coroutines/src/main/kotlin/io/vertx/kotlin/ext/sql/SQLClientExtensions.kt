package io.vertx.kotlin.ext.sql

import io.vertx.core.json.JsonArray
import io.vertx.ext.sql.ResultSet
import io.vertx.ext.sql.SQLClient
import io.vertx.ext.sql.SQLConnection
import io.vertx.ext.sql.SQLRowStream
import io.vertx.ext.sql.UpdateResult
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.String

suspend fun SQLClient.querySingle(sql: String): JsonArray = awaitResult { this.querySingle(sql, it) }

suspend fun SQLClient.querySingleWithParams(sql: String, arguments: JsonArray): JsonArray = awaitResult { this.querySingleWithParams(sql, arguments, it) }

suspend fun SQLClient.getConnection(): SQLConnection = awaitResult { this.getConnection(it) }

suspend fun SQLClient.close() {
  awaitResult<Void?> { this.close(it) }
}

suspend fun SQLClient.query(sql: String): ResultSet = awaitResult { this.query(sql, it) }

suspend fun SQLClient.queryStream(sql: String): SQLRowStream = awaitResult { this.queryStream(sql, it) }

suspend fun SQLClient.queryStreamWithParams(sql: String, params: JsonArray): SQLRowStream = awaitResult { this.queryStreamWithParams(sql, params, it) }

suspend fun SQLClient.queryWithParams(sql: String, arguments: JsonArray): ResultSet = awaitResult { this.queryWithParams(sql, arguments, it) }

suspend fun SQLClient.update(sql: String): UpdateResult = awaitResult { this.update(sql, it) }

suspend fun SQLClient.updateWithParams(sql: String, params: JsonArray): UpdateResult = awaitResult { this.updateWithParams(sql, params, it) }

suspend fun SQLClient.call(sql: String): ResultSet = awaitResult { this.call(sql, it) }

suspend fun SQLClient.callWithParams(
    sql: String,
    params: JsonArray,
    outputs: JsonArray
): ResultSet = awaitResult { this.callWithParams(sql, params, outputs, it) }
