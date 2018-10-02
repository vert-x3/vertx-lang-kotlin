package io.vertx.kotlin.ext.sql

import io.vertx.core.json.JsonArray
import io.vertx.ext.sql.ResultSet
import io.vertx.ext.sql.SQLClient
import io.vertx.ext.sql.SQLConnection
import io.vertx.ext.sql.SQLRowStream
import io.vertx.ext.sql.UpdateResult
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
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLClient original] using Vert.x codegen.
 */
suspend fun SQLClient.querySingleAwait(sql : String) : JsonArray? {
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
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLClient original] using Vert.x codegen.
 */
suspend fun SQLClient.querySingleWithParamsAwait(sql : String, arguments : JsonArray) : JsonArray? {
  return awaitResult{
    this.querySingleWithParams(sql, arguments, it)
  }
}

/**
 * Returns a connection that can be used to perform SQL operations on. It's important to remember
 * to close the connection when you are done, so it is returned to the pool.
 *
 * @param handler the handler which is called when the <code>JdbcConnection</code> object is ready for use.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLClient original] using Vert.x codegen.
 */
suspend fun SQLClient.getConnectionAwait() : SQLConnection {
  return awaitResult{
    this.getConnection(it)
  }
}

/**
 * Close the client and release all resources.
 * Call the handler when close is complete.
 *
 * @param handler the handler that will be called when close is complete
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLClient original] using Vert.x codegen.
 */
suspend fun SQLClient.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Execute a single SQL statement, this method acquires a connection from the the pool and executes the SQL
 * statement and returns it back after the execution.
 *
 * @param sql the statement to execute
 * @param handler the result handler
 * @returnself *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLClient original] using Vert.x codegen.
 */
suspend fun SQLClient.queryAwait(sql : String) : ResultSet {
  return awaitResult{
    this.query(sql, it)
  }
}

/**
 * Executes the given SQL <code>SELECT</code> statement which returns the results of the query as a read stream.
 *
 * @param sql the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @param handler the handler which is called once the operation completes. It will return a <code>SQLRowStream</code>.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLClient original] using Vert.x codegen.
 */
suspend fun SQLClient.queryStreamAwait(sql : String) : SQLRowStream {
  return awaitResult{
    this.queryStream(sql, it)
  }
}

/**
 * Executes the given SQL <code>SELECT</code> statement which returns the results of the query as a read stream.
 *
 * @param sql the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @param params these are the parameters to fill the statement.
 * @param handler the handler which is called once the operation completes. It will return a <code>SQLRowStream</code>.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLClient original] using Vert.x codegen.
 */
suspend fun SQLClient.queryStreamWithParamsAwait(sql : String, params : JsonArray) : SQLRowStream {
  return awaitResult{
    this.queryStreamWithParams(sql, params, it)
  }
}

/**
 * Execute a single SQL prepared statement, this method acquires a connection from the the pool and executes the SQL
 * prepared statement and returns it back after the execution.
 *
 * @param sql the statement to execute
 * @param arguments the arguments to the statement
 * @param handler the result handler
 * @returnself *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLClient original] using Vert.x codegen.
 */
suspend fun SQLClient.queryWithParamsAwait(sql : String, arguments : JsonArray) : ResultSet {
  return awaitResult{
    this.queryWithParams(sql, arguments, it)
  }
}

/**
 * Executes the given SQL statement which may be an <code>INSERT</code>, <code>UPDATE</code>, or <code>DELETE</code>
 * statement.
 *
 * @param sql the SQL to execute. For example <code>INSERT INTO table ...</code>
 * @param handler the handler which is called once the operation completes.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLClient original] using Vert.x codegen.
 */
suspend fun SQLClient.updateAwait(sql : String) : UpdateResult {
  return awaitResult{
    this.update(sql, it)
  }
}

/**
 * Executes the given prepared statement which may be an <code>INSERT</code>, <code>UPDATE</code>, or <code>DELETE</code>
 * statement with the given parameters
 *
 * @param sql the SQL to execute. For example <code>INSERT INTO table ...</code>
 * @param params these are the parameters to fill the statement.
 * @param handler the handler which is called once the operation completes.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLClient original] using Vert.x codegen.
 */
suspend fun SQLClient.updateWithParamsAwait(sql : String, params : JsonArray) : UpdateResult {
  return awaitResult{
    this.updateWithParams(sql, params, it)
  }
}

/**
 * Calls the given SQL <code>PROCEDURE</code> which returns the result from the procedure.
 *
 * @param sql the SQL to execute. For example <code>{call getEmpName}</code>.
 * @param handler the handler which is called once the operation completes. It will return a <code>ResultSet</code>.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLClient original] using Vert.x codegen.
 */
suspend fun SQLClient.callAwait(sql : String) : ResultSet {
  return awaitResult{
    this.call(sql, it)
  }
}

/**
 * Calls the given SQL <code>PROCEDURE</code> which returns the result from the procedure.
 *
 * The index of params and outputs are important for both arrays, for example when dealing with a prodecure that
 * takes the first 2 arguments as input values and the 3 arg as an output then the arrays should be like:
 *
 * <pre>
 *   params = [VALUE1, VALUE2, null]
 *   outputs = [null, null, "VARCHAR"]
 * </pre>
 *
 * @param sql the SQL to execute. For example <code>{call getEmpName (?, ?)}</code>.
 * @param params these are the parameters to fill the statement.
 * @param outputs these are the outputs to fill the statement.
 * @param handler the handler which is called once the operation completes. It will return a <code>ResultSet</code>.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLClient original] using Vert.x codegen.
 */
suspend fun SQLClient.callWithParamsAwait(sql : String, params : JsonArray, outputs : JsonArray) : ResultSet {
  return awaitResult{
    this.callWithParams(sql, params, outputs, it)
  }
}

