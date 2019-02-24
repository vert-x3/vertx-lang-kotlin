package io.vertx.kotlin.cassandra

import com.datastax.driver.core.PreparedStatement
import com.datastax.driver.core.Row
import com.datastax.driver.core.Statement
import io.vertx.cassandra.CassandraClient
import io.vertx.cassandra.CassandraRowStream
import io.vertx.cassandra.ResultSet
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.cassandra.CassandraClient.execute]
 *
 * @param query the query to execute
 * @return [ResultSet]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.CassandraClient] using Vert.x codegen.
 */
suspend fun CassandraClient.executeAwait(query: String): ResultSet {
  return awaitResult {
    this.execute(query, it)
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.CassandraClient.queryStream]
 *
 * @param sql the SQL to execute. For example <code>SELECT * FROM table ...</code>.
 * @return [CassandraRowStream]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.CassandraClient] using Vert.x codegen.
 */
suspend fun CassandraClient.queryStreamAwait(sql: String): CassandraRowStream {
  return awaitResult {
    this.queryStream(sql, it)
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.CassandraClient.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.CassandraClient] using Vert.x codegen.
 */
suspend fun CassandraClient.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.CassandraClient.executeWithFullFetch]
 *
 * @param query the query to execute
 * @return [List<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.CassandraClient] using Vert.x codegen.
 */
suspend fun CassandraClient.executeWithFullFetchAwait(query: String): List<Row> {
  return awaitResult {
    this.executeWithFullFetch(query, it)
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.CassandraClient.executeWithFullFetch]
 *
 * @param statement the statement to execute
 * @return [List<Row>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.CassandraClient] using Vert.x codegen.
 */
suspend fun CassandraClient.executeWithFullFetchAwait(statement: Statement): List<Row> {
  return awaitResult {
    this.executeWithFullFetch(statement, it)
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.CassandraClient.execute]
 *
 * @param statement the statement to execute
 * @return [ResultSet]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.CassandraClient] using Vert.x codegen.
 */
suspend fun CassandraClient.executeAwait(statement: Statement): ResultSet {
  return awaitResult {
    this.execute(statement, it)
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.CassandraClient.prepare]
 *
 * @param query the query to prepare
 * @return [PreparedStatement]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.CassandraClient] using Vert.x codegen.
 */
suspend fun CassandraClient.prepareAwait(query: String): PreparedStatement {
  return awaitResult {
    this.prepare(query, it)
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.CassandraClient.queryStream]
 *
 * @param statement the statement to execute.
 * @return [CassandraRowStream]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.CassandraClient] using Vert.x codegen.
 */
suspend fun CassandraClient.queryStreamAwait(statement: Statement): CassandraRowStream {
  return awaitResult {
    this.queryStream(statement, it)
  }
}

