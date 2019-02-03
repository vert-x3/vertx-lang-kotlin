package io.vertx.kotlin.ext.jdbc

import io.vertx.core.json.JsonArray
import io.vertx.ext.jdbc.JDBCClient
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.jdbc.JDBCClient.querySingle]
 *
 * @param sql the statement to execute
 * @return [JsonArray?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.jdbc.JDBCClient] using Vert.x codegen.
 */
suspend fun JDBCClient.querySingleAwait(sql: String): JsonArray? {
  return awaitResult {
    this.querySingle(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.jdbc.JDBCClient.querySingleWithParams]
 *
 * @param sql the statement to execute
 * @param arguments the arguments
 * @return [JsonArray?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.jdbc.JDBCClient] using Vert.x codegen.
 */
suspend fun JDBCClient.querySingleWithParamsAwait(sql: String, arguments: JsonArray): JsonArray? {
  return awaitResult {
    this.querySingleWithParams(sql, arguments, it)
  }
}

