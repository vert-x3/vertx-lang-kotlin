package io.vertx.kotlin.cassandra

import io.vertx.cassandra.Mapper
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.cassandra.Mapper.save]
 *
 * @param entity object to be stored in database
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.Mapper] using Vert.x codegen.
 */
suspend fun <T> Mapper<T>.saveAwait(entity: T): Unit {
  return awaitResult {
    this.save(entity) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.Mapper.delete]
 *
 * @param primaryKey primary key used to find row to delete
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.Mapper] using Vert.x codegen.
 */
suspend fun <T> Mapper<T>.deleteAwait(primaryKey: List<Any>): Unit {
  return awaitResult {
    this.delete(primaryKey) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.cassandra.Mapper.get]
 *
 * @param primaryKey primary key used to retrieve row
 * @return [T]
 *
 * NOTE: This function has been automatically generated from [io.vertx.cassandra.Mapper] using Vert.x codegen.
 */
suspend fun <T> Mapper<T>.getAwait(primaryKey: List<Any>): T {
  return awaitResult {
    this.get(primaryKey, it)
  }
}

