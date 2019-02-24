package io.vertx.kotlin.cassandra

import com.datastax.driver.core.Row
import io.vertx.cassandra.CassandraRowStream
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.cassandra.CassandraRowStream.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.CassandraRowStream] using Vert.x codegen.
 */
suspend fun CassandraRowStream.pipeToAwait(dst: WriteStream<Row>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

