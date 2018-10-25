package io.vertx.kotlin.cassandra

import io.vertx.cassandra.ResultSet
import io.vertx.kotlin.coroutines.awaitResult

/**
 *
 * @param handler handler called when result is fetched
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.ResultSet original] using Vert.x codegen.
 */
suspend fun ResultSet.fetchMoreResultsAwait() : Unit {
  return awaitResult{
    this.fetchMoreResults({ ar -> it.handle(ar.mapEmpty()) })}
}

