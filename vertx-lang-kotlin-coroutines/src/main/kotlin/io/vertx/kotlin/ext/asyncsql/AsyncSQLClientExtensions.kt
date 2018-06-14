package io.vertx.kotlin.ext.asyncsql

import io.vertx.core.json.JsonArray
import io.vertx.ext.asyncsql.AsyncSQLClient
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.String

/**
 *  Execute a one shot SQL statement that returns a single SQL row. This method will reduce the boilerplate code by
 *  getting a connection from the pool (this object) and return it back after the execution. Only the first result
 *  from the result set is returned.
 * @param sql     the statement to execute
 * @return self
 */
suspend fun AsyncSQLClient.querySingle(sql: String): JsonArray {
  return awaitResult { this.querySingle(sql, it) }
}

/**
 *  Execute a one shot SQL statement with arguments that returns a single SQL row. This method will reduce the
 *  boilerplate code by getting a connection from the pool (this object) and return it back after the execution.
 *  Only the first result from the result set is returned.
 * @param sql       the statement to execute
 * @param arguments the arguments
 * @return self
 */
suspend fun AsyncSQLClient.querySingleWithParams(sql: String, arguments: JsonArray): JsonArray {
  return awaitResult { this.querySingleWithParams(sql, arguments, it) }
}
