package io.vertx.kotlin.ext.asyncsql

import io.vertx.core.json.JsonArray
import io.vertx.ext.asyncsql.PostgreSQLClient
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Execute a one shot SQL statement that returns a single SQL row. This method will reduce the boilerplate code by
 * getting a connection from the pool (this object) and return it back after the execution. Only the first result
 * from the result set is returned.
 *
 * @param sql the statement to execute
 * @param handler the result handler
 * @returnself *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.asyncsql.PostgreSQLClient original] using Vert.x codegen.
 */
suspend fun PostgreSQLClient.querySingleAwait(sql : String) : JsonArray? {
  return awaitResult{
    this.querySingle(sql, it)
  }
}

/**
 * Execute a one shot SQL statement with arguments that returns a single SQL row. This method will reduce the
 * boilerplate code by getting a connection from the pool (this object) and return it back after the execution.
 * Only the first result from the result set is returned.
 *
 * @param sql the statement to execute
 * @param arguments the arguments
 * @param handler the result handler
 * @returnself *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.asyncsql.PostgreSQLClient original] using Vert.x codegen.
 */
suspend fun PostgreSQLClient.querySingleWithParamsAwait(sql : String, arguments : JsonArray) : JsonArray? {
  return awaitResult{
    this.querySingleWithParams(sql, arguments, it)
  }
}

