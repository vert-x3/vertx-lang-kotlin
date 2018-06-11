package io.vertx.kotlin.ext.jdbc

import io.vertx.core.json.JsonArray
import io.vertx.ext.jdbc.JDBCClient
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.String

suspend fun JDBCClient.querySingle(sql: String): JsonArray = awaitResult { this.querySingle(sql, it) }

suspend fun JDBCClient.querySingleWithParams(sql: String, arguments: JsonArray): JsonArray = awaitResult { this.querySingleWithParams(sql, arguments, it) }
