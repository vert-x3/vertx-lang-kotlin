package io.vertx.kotlin.cassandra

import io.vertx.cassandra.CassandraClient
import io.vertx.cassandra.CassandraRowStream
import io.vertx.cassandra.ResultSet
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Connect to a Cassandra service.
 *
 * @returncurrent Cassandra client instance *
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
 * @returncurrent Cassandra client instance *
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
 * @returncurrent Cassandra client instance *
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
 * @returncurrent Cassandra client instance *
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
 * @returncurrent Cassandra client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClient original] using Vert.x codegen.
 */
suspend fun CassandraClient.disconnectAwait() : Unit {
  return awaitResult{
    this.disconnect({ ar -> it.handle(ar.mapEmpty()) })}
}

