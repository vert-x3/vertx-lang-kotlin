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

/**
 *  Execute a one shot SQL statement that returns a single SQL row. This method will reduce the boilerplate code by
 *  getting a connection from the pool (this object) and return it back after the execution. Only the first result
 *  from the result set is returned.
 * @param sql     the statement to execute
 * @return self
 */
suspend fun SQLConnection.querySingle(sql: String): JsonArray {
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
suspend fun SQLConnection.querySingleWithParams(sql: String, arguments: JsonArray): JsonArray {
  return awaitResult { this.querySingleWithParams(sql, arguments, it) }
}

/**
 *  Sets the auto commit flag for this connection. True by default.
 * @param autoCommit  the autoCommit flag, true by default.
 * @see java.sql.Connection#setAutoCommit(boolean)
 */
suspend fun SQLConnection.setAutoCommit(autoCommit: Boolean) {
  awaitResult<Void?> { this.setAutoCommit(autoCommit, it) }
}

/**
 *  Executes the given SQL statement
 * @param sql  the SQL to execute. For example <code>CREATE TABLE IF EXISTS table ...</code>
 * @see java.sql.Statement#execute(String)
 */
suspend fun SQLConnection.execute(sql: String) {
  awaitResult<Void?> { this.execute(sql, it) }
}

/**
 *  Executes the given SQL <code>SELECT</code> statement which returns the results of the query.
 * @param sql  the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @see java.sql.Statement#executeQuery(String)
 * @see java.sql.PreparedStatement#executeQuery(String)
 */
suspend fun SQLConnection.query(sql: String): ResultSet {
  return awaitResult { this.query(sql, it) }
}

/**
 *  Executes the given SQL <code>SELECT</code> statement which returns the results of the query as a read stream.
 * @param sql  the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @see java.sql.Statement#executeQuery(String)
 * @see java.sql.PreparedStatement#executeQuery(String)
 */
suspend fun SQLConnection.queryStream(sql: String): SQLRowStream {
  return awaitResult { this.queryStream(sql, it) }
}

/**
 *  Executes the given SQL <code>SELECT</code> prepared statement which returns the results of the query.
 * @param sql  the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @param params  these are the parameters to fill the statement.
 * @see java.sql.Statement#executeQuery(String)
 * @see java.sql.PreparedStatement#executeQuery(String)
 */
suspend fun SQLConnection.queryWithParams(sql: String, params: JsonArray): ResultSet {
  return awaitResult { this.queryWithParams(sql, params, it) }
}

/**
 *  Executes the given SQL <code>SELECT</code> statement which returns the results of the query as a read stream.
 * @param sql  the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @param params  these are the parameters to fill the statement.
 * @see java.sql.Statement#executeQuery(String)
 * @see java.sql.PreparedStatement#executeQuery(String)
 */
suspend fun SQLConnection.queryStreamWithParams(sql: String, params: JsonArray): SQLRowStream {
  return awaitResult { this.queryStreamWithParams(sql, params, it) }
}

/**
 *  Executes the given SQL statement which may be an <code>INSERT</code>, <code>UPDATE</code>, or <code>DELETE</code>
 *  statement.
 * @param sql  the SQL to execute. For example <code>INSERT INTO table ...</code>
 * @see java.sql.Statement#executeUpdate(String)
 * @see java.sql.PreparedStatement#executeUpdate(String)
 */
suspend fun SQLConnection.update(sql: String): UpdateResult {
  return awaitResult { this.update(sql, it) }
}

/**
 *  Executes the given prepared statement which may be an <code>INSERT</code>, <code>UPDATE</code>, or <code>DELETE</code>
 *  statement with the given parameters
 * @param sql  the SQL to execute. For example <code>INSERT INTO table ...</code>
 * @param params  these are the parameters to fill the statement.
 * @see java.sql.Statement#executeUpdate(String)
 * @see java.sql.PreparedStatement#executeUpdate(String)
 */
suspend fun SQLConnection.updateWithParams(sql: String, params: JsonArray): UpdateResult {
  return awaitResult { this.updateWithParams(sql, params, it) }
}

/**
 *  Calls the given SQL <code>PROCEDURE</code> which returns the result from the procedure.
 * @param sql  the SQL to execute. For example <code>{call getEmpName}</code>.
 * @see java.sql.CallableStatement#execute(String)
 */
suspend fun SQLConnection.call(sql: String): ResultSet {
  return awaitResult { this.call(sql, it) }
}

/**
 *  Calls the given SQL <code>PROCEDURE</code> which returns the result from the procedure.
 *  The index of params and outputs are important for both arrays, for example when dealing with a prodecure that
 *  takes the first 2 arguments as input values and the 3 arg as an output then the arrays should be like:
 *
 *  <pre>
 *    params = [VALUE1, VALUE2, null]
 *    outputs = [null, null, "VARCHAR"]
 *  </pre>
 *
 * @param sql  the SQL to execute. For example <code>{call getEmpName (?, ?)}</code>.
 * @param params  these are the parameters to fill the statement.
 * @param outputs  these are the outputs to fill the statement.
 * @see java.sql.CallableStatement#execute(String)
 */
suspend fun SQLConnection.callWithParams(
  sql: String,
  params: JsonArray,
  outputs: JsonArray
): ResultSet {
  return awaitResult { this.callWithParams(sql, params, outputs, it) }
}

/**
 *  Closes the connection. Important to always close the connection when you are done so it's returned to the pool. */
suspend fun SQLConnection.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}

/**
 *  Commits all changes made since the previous commit/rollback. */
suspend fun SQLConnection.commit() {
  awaitResult<Void?> { this.commit(it) }
}

/**
 *  Rolls back all changes made since the previous commit/rollback. */
suspend fun SQLConnection.rollback() {
  awaitResult<Void?> { this.rollback(it) }
}

/**
 *  Batch simple SQL strings and execute the batch where the async result contains a array of Integers.
 * @param sqlStatements sql statement */
suspend fun SQLConnection.batch(sqlStatements: MutableList<String>): MutableList<Int> {
  return awaitResult { this.batch(sqlStatements, it) }
}

/**
 *  Batch a prepared statement with all entries from the args list. Each entry is a batch.
 *  The operation completes with the execution of the batch where the async result contains a array of Integers.
 * @param sqlStatement sql statement
 * @param args the prepared statement arguments */
suspend fun SQLConnection.batchWithParams(sqlStatement: String, args: MutableList<JsonArray>): MutableList<Int> {
  return awaitResult { this.batchWithParams(sqlStatement, args, it) }
}

/**
 *  Batch a callable statement with all entries from the args list. Each entry is a batch.
 *  The size of the lists inArgs and outArgs MUST be the equal.
 *  The operation completes with the execution of the batch where the async result contains a array of Integers.
 * @param sqlStatement sql statement
 * @param inArgs the callable statement input arguments
 * @param outArgs the callable statement output arguments */
suspend fun SQLConnection.batchCallableWithParams(
  sqlStatement: String,
  inArgs: MutableList<JsonArray>,
  outArgs: MutableList<JsonArray>
): MutableList<Int> {
  return awaitResult { this.batchCallableWithParams(sqlStatement, inArgs, outArgs, it) }
}

/**
 *  Attempts to change the transaction isolation level for this Connection object to the one given.
 *  The constants defined in the interface Connection are the possible transaction isolation levels.
 *
 * @param isolation the level of isolation */
suspend fun SQLConnection.setTransactionIsolation(isolation: TransactionIsolation) {
  awaitResult<Void?> { this.setTransactionIsolation(isolation, it) }
}

/**
 *  Attempts to return the transaction isolation level for this Connection object to the one given. */
suspend fun SQLConnection.getTransactionIsolation(): TransactionIsolation {
  return awaitResult { this.getTransactionIsolation(it) }
}
