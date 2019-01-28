package io.vertx.kotlin.cassandra

import com.datastax.driver.core.Row
import io.vertx.cassandra.ResultSet
import io.vertx.kotlin.coroutines.awaitResult

/**
 *
 * @return  *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.ResultSet original] using Vert.x codegen.
 */
suspend fun ResultSet.fetchMoreResultsAwait() : Unit {
  return awaitResult{
    this.fetchMoreResults({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 *
 * @return  *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.ResultSet original] using Vert.x codegen.
 */
suspend fun ResultSet.oneAwait() : Row? {
  return awaitResult{
    this.one(it)
  }
}

/**
 *
 * @return  *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.ResultSet original] using Vert.x codegen.
 */
suspend fun ResultSet.allAwait() : List<Row> {
  return awaitResult{
    this.all(it)
  }
}

