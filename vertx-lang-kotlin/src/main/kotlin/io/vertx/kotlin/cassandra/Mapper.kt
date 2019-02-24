package io.vertx.kotlin.cassandra

import io.vertx.cassandra.Mapper
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Asynchronous save method.
 *
 * @param entity object to be stored in database
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.Mapper original] using Vert.x codegen.
 */
suspend fun <T> Mapper<T>.saveAwait(entity : T) : Unit {
  return awaitResult{
    this.save(entity, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Asynchronous delete method based on the column values of the primary key.
 *
 * @param primaryKey primary key used to find row to delete
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.Mapper original] using Vert.x codegen.
 */
suspend fun <T> Mapper<T>.deleteAwait(primaryKey : List<Any>) : Unit {
  return awaitResult{
    this.delete(primaryKey, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Asynchronous get method based on the column values of the primary key.
 *
 * @param primaryKey primary key used to retrieve row
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.Mapper original] using Vert.x codegen.
 */
suspend fun <T> Mapper<T>.getAwait(primaryKey : List<Any>) : T {
  return awaitResult{
    this.get(primaryKey, it)
  }
}

