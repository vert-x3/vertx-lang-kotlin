package io.vertx.kotlin.ext.sql

import io.vertx.core.json.JsonArray
import io.vertx.ext.sql.ResultSet
import io.vertx.ext.sql.SQLClient
import io.vertx.ext.sql.SQLConnection
import io.vertx.ext.sql.SQLRowStream
import io.vertx.ext.sql.UpdateResult
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.String

suspend fun SQLClient.querySingle(sql: String): JsonArray {
  return awaitResult { this.querySingle(sql, it) }
}

suspend fun SQLClient.querySingleWithParams(sql: String, arguments: JsonArray): JsonArray {
  return awaitResult { this.querySingleWithParams(sql, arguments, it) }
}

suspend fun SQLClient.getConnection(): SQLConnection {
  return awaitResult { this.getConnection(it) }
}

suspend fun SQLClient.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}

suspend fun SQLClient.query(sql: String): ResultSet {
  return awaitResult { this.query(sql, it) }
}

suspend fun SQLClient.queryStream(sql: String): SQLRowStream {
  return awaitResult { this.queryStream(sql, it) }
}

suspend fun SQLClient.queryStreamWithParams(sql: String, params: JsonArray): SQLRowStream {
  return awaitResult { this.queryStreamWithParams(sql, params, it) }
}

suspend fun SQLClient.queryWithParams(sql: String, arguments: JsonArray): ResultSet {
  return awaitResult { this.queryWithParams(sql, arguments, it) }
}

suspend fun SQLClient.update(sql: String): UpdateResult {
  return awaitResult { this.update(sql, it) }
}

suspend fun SQLClient.updateWithParams(sql: String, params: JsonArray): UpdateResult {
  return awaitResult { this.updateWithParams(sql, params, it) }
}

suspend fun SQLClient.call(sql: String): ResultSet {
  return awaitResult { this.call(sql, it) }
}

suspend fun SQLClient.callWithParams(
  sql: String,
  params: JsonArray,
  outputs: JsonArray
): ResultSet {
  return awaitResult { this.callWithParams(sql, params, outputs, it) }
}
