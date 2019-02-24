package io.vertx.kotlin.cassandra

import com.datastax.driver.core.PreparedStatement
import com.datastax.driver.core.Row
import com.datastax.driver.core.Statement
import io.vertx.cassandra.CassandraClient
import io.vertx.cassandra.CassandraRowStream
import io.vertx.cassandra.ResultSet
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Execute the query and provide a handler for consuming results.
 *
 * @param query the query to execute
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
 * Closes this client.
 *
 * @return current Cassandra client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClient original] using Vert.x codegen.
 */
suspend fun CassandraClient.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Execute the query and provide a handler for consuming results.
 *
 * @param query the query to execute
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
 * @return current Cassandra client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClient original] using Vert.x codegen.
 */
suspend fun CassandraClient.queryStreamAwait(statement : Statement) : CassandraRowStream {
  return awaitResult{
    this.queryStream(statement, it)
  }
}

