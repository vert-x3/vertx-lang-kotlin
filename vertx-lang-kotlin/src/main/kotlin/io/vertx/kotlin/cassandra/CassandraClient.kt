package io.vertx.kotlin.cassandra

import com.datastax.driver.core.PreparedStatement
import com.datastax.driver.core.Row
import com.datastax.driver.core.Statement
import io.vertx.cassandra.CassandraClient
import io.vertx.cassandra.CassandraRowStream
import io.vertx.cassandra.ResultSet
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Connect to a Cassandra service.
 *
 * @param connectHandler handler called when asynchronous connect call ends
 * @return current Cassandra client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClient original] using Vert.x codegen.
 */
suspend fun CassandraClient.connectAwait() : Unit {
  return awaitResult{
    this.connect({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Connect to a Cassandra service.
 *
 * @param keyspace The name of the keyspace to use for the created connection.
 * @param connectHandler handler called when asynchronous connect call ends
 * @return current Cassandra client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClient original] using Vert.x codegen.
 */
suspend fun CassandraClient.connectAwait(keyspace : String) : Unit {
  return awaitResult{
    this.connect(keyspace, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Execute the query and provide a handler for consuming results.
 *
 * @param query the query to execute
 * @param resultHandler handler called when result of execution is present, but can be not fully fetched
 * @return current Cassandra client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClient original] using Vert.x codegen.
 */
suspend fun CassandraClient.executeAwait(query : String) : ResultSet {
  return awaitResult{
    this.execute(query, it)
  }
}

/**
 * Executes the given SQL <code>SELECT</code> statement which returns the results of the query as a read stream.
 *
 * @param sql the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @param rowStreamHandler the handler which is called once the operation completes. It will return an instance of [io.vertx.cassandra.CassandraRowStream].
 * @return current Cassandra client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClient original] using Vert.x codegen.
 */
suspend fun CassandraClient.queryStreamAwait(sql : String) : CassandraRowStream {
  return awaitResult{
    this.queryStream(sql, it)
  }
}

/**
 * Disconnects from the Cassandra service.
 *
 * @param disconnectHandler handler called when asynchronous disconnect call ends
 * @return current Cassandra client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClient original] using Vert.x codegen.
 */
suspend fun CassandraClient.disconnectAwait() : Unit {
  return awaitResult{
    this.disconnect({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Execute the query and provide a handler for consuming results.
 *
 * @param query the query to execute
 * @param resultHandler handler called when result of execution is fully fetched.
 * @return current Cassandra client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClient original] using Vert.x codegen.
 */
suspend fun CassandraClient.executeWithFullFetchAwait(query : String) : List<Row> {
  return awaitResult{
    this.executeWithFullFetch(query, it)
  }
}

/**
 * Execute the query and provide a handler for consuming results.
 *
 * @param statement the statement to execute
 * @param resultHandler handler called when result of execution is fully fetched.
 * @return current Cassandra client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClient original] using Vert.x codegen.
 */
suspend fun CassandraClient.executeWithFullFetchAwait(statement : Statement) : List<Row> {
  return awaitResult{
    this.executeWithFullFetch(statement, it)
  }
}

/**
 * Execute the statement and provide a handler for consuming results.
 *
 * @param statement the statement to execute
 * @param resultHandler handler called when result of execution is present
 * @return current Cassandra client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClient original] using Vert.x codegen.
 */
suspend fun CassandraClient.executeAwait(statement : Statement) : ResultSet {
  return awaitResult{
    this.execute(statement, it)
  }
}

/**
 * Prepares the provided query string.
 *
 * @param query the query to prepare
 * @param resultHandler handler called when result of query preparation is present
 * @return current Cassandra client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClient original] using Vert.x codegen.
 */
suspend fun CassandraClient.prepareAwait(query : String) : PreparedStatement {
  return awaitResult{
    this.prepare(query, it)
  }
}

/**
 * Executes the given SQL statement which returns the results of the query as a read stream.
 *
 * @param statement the statement to execute.
 * @param rowStreamHandler the handler which is called once the operation completes. It will return an instance of [io.vertx.cassandra.CassandraRowStream].
 * @return current Cassandra client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClient original] using Vert.x codegen.
 */
suspend fun CassandraClient.queryStreamAwait(statement : Statement) : CassandraRowStream {
  return awaitResult{
    this.queryStream(statement, it)
  }
}

