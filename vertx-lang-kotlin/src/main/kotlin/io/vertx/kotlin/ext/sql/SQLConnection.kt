package io.vertx.kotlin.ext.sql

import io.vertx.core.json.JsonArray
import io.vertx.ext.sql.ResultSet
import io.vertx.ext.sql.SQLConnection
import io.vertx.ext.sql.SQLRowStream
import io.vertx.ext.sql.TransactionIsolation
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
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.querySingleAwait(sql : String) : JsonArray? {
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
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.querySingleWithParamsAwait(sql : String, arguments : JsonArray) : JsonArray? {
  return awaitResult{
    this.querySingleWithParams(sql, arguments, it)
  }
}

/**
 * Sets the auto commit flag for this connection. True by default.
 *
 * @param autoCommit the autoCommit flag, true by default.
 * @param resultHandler the handler which is called once this operation completes.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.setAutoCommitAwait(autoCommit : Boolean) : Unit {
  return awaitResult{
    this.setAutoCommit(autoCommit, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Executes the given SQL statement
 *
 * @param sql the SQL to execute. For example <code>CREATE TABLE IF EXISTS table ...</code>
 * @param resultHandler the handler which is called once this operation completes.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.executeAwait(sql : String) : Unit {
  return awaitResult{
    this.execute(sql, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Executes the given SQL <code>SELECT</code> statement which returns the results of the query.
 *
 * @param sql the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @param resultHandler the handler which is called once the operation completes. It will return a <code>ResultSet</code>.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.queryAwait(sql : String) : ResultSet {
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
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.queryStreamAwait(sql : String) : SQLRowStream {
  return awaitResult{
    this.queryStream(sql, it)
  }
}

/**
 * Executes the given SQL <code>SELECT</code> prepared statement which returns the results of the query.
 *
 * @param sql the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @param params these are the parameters to fill the statement.
 * @param resultHandler the handler which is called once the operation completes. It will return a <code>ResultSet</code>.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.queryWithParamsAwait(sql : String, params : JsonArray) : ResultSet {
  return awaitResult{
    this.queryWithParams(sql, params, it)
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
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.queryStreamWithParamsAwait(sql : String, params : JsonArray) : SQLRowStream {
  return awaitResult{
    this.queryStreamWithParams(sql, params, it)
  }
}

/**
 * Executes the given SQL statement which may be an <code>INSERT</code>, <code>UPDATE</code>, or <code>DELETE</code>
 * statement.
 *
 * @param sql the SQL to execute. For example <code>INSERT INTO table ...</code>
 * @param resultHandler the handler which is called once the operation completes.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.updateAwait(sql : String) : UpdateResult {
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
 * @param resultHandler the handler which is called once the operation completes.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.updateWithParamsAwait(sql : String, params : JsonArray) : UpdateResult {
  return awaitResult{
    this.updateWithParams(sql, params, it)
  }
}

/**
 * Calls the given SQL <code>PROCEDURE</code> which returns the result from the procedure.
 *
 * @param sql the SQL to execute. For example <code>{call getEmpName}</code>.
 * @param resultHandler the handler which is called once the operation completes. It will return a <code>ResultSet</code>.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.callAwait(sql : String) : ResultSet {
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
 * @param resultHandler the handler which is called once the operation completes. It will return a <code>ResultSet</code>.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.callWithParamsAwait(sql : String, params : JsonArray, outputs : JsonArray) : ResultSet {
  return awaitResult{
    this.callWithParams(sql, params, outputs, it)
  }
}

/**
 * Closes the connection. Important to always close the connection when you are done so it's returned to the pool.
 *
 * @param handler the handler called when this operation completes.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Commits all changes made since the previous commit/rollback.
 *
 * @param handler the handler called when this operation completes.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.commitAwait() : Unit {
  return awaitResult{
    this.commit({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Rolls back all changes made since the previous commit/rollback.
 *
 * @param handler the handler called when this operation completes.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.rollbackAwait() : Unit {
  return awaitResult{
    this.rollback({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Batch simple SQL strings and execute the batch where the async result contains a array of Integers.
 *
 * @param sqlStatements sql statement
 * @param handler the result handler
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.batchAwait(sqlStatements : List<String>) : List<Int> {
  return awaitResult{
    this.batch(sqlStatements, it)
  }
}

/**
 * Batch a prepared statement with all entries from the args list. Each entry is a batch.
 * The operation completes with the execution of the batch where the async result contains a array of Integers.
 *
 * @param sqlStatement sql statement
 * @param args the prepared statement arguments
 * @param handler the result handler
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.batchWithParamsAwait(sqlStatement : String, args : List<JsonArray>) : List<Int> {
  return awaitResult{
    this.batchWithParams(sqlStatement, args, it)
  }
}

/**
 * Batch a callable statement with all entries from the args list. Each entry is a batch.
 * The size of the lists inArgs and outArgs MUST be the equal.
 * The operation completes with the execution of the batch where the async result contains a array of Integers.
 *
 * @param sqlStatement sql statement
 * @param inArgs the callable statement input arguments
 * @param outArgs the callable statement output arguments
 * @param handler the result handler
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.batchCallableWithParamsAwait(sqlStatement : String, inArgs : List<JsonArray>, outArgs : List<JsonArray>) : List<Int> {
  return awaitResult{
    this.batchCallableWithParams(sqlStatement, inArgs, outArgs, it)
  }
}

/**
 * Attempts to change the transaction isolation level for this Connection object to the one given.
 *
 * The constants defined in the interface Connection are the possible transaction isolation levels.
 *
 * @param isolation the level of isolation
 * @param handler the handler called when this operation completes.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.setTransactionIsolationAwait(isolation : TransactionIsolation) : Unit {
  return awaitResult{
    this.setTransactionIsolation(isolation, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Attempts to return the transaction isolation level for this Connection object to the one given.
 *
 * @param handler the handler called when this operation completes.
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.SQLConnection original] using Vert.x codegen.
 */
suspend fun SQLConnection.getTransactionIsolationAwait() : TransactionIsolation {
  return awaitResult{
    this.getTransactionIsolation(it)
  }
}

