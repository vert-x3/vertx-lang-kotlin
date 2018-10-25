package io.vertx.kotlin.cassandra

import io.vertx.cassandra.CassandraClient
import io.vertx.cassandra.CassandraRowStream
import io.vertx.cassandra.ResultSet
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Connect to a Cassandra service.
 *
 * @param connectHandler handler called when asynchronous connect call ends
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
 * @param connectHandler handler called when asynchronous connect call ends
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
 * @param resultHandler handler called when result of execution is present, but can be not fully fetched
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
 * @param rowStreamHandler the handler which is called once the operation completes. It will return an instance of [io.vertx.cassandra.CassandraRowStream].
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
 * @param disconnectHandler handler called when asynchronous disconnect call ends
 * @returncurrent Cassandra client instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClient original] using Vert.x codegen.
 */
suspend fun CassandraClient.disconnectAwait() : Unit {
  return awaitResult{
    this.disconnect({ ar -> it.handle(ar.mapEmpty()) })}
}

