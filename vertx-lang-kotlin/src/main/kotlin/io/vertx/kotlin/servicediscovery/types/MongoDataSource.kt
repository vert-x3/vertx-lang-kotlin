package io.vertx.kotlin.servicediscovery.types

import io.vertx.core.json.JsonObject
import io.vertx.ext.mongo.MongoClient
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import io.vertx.servicediscovery.types.MongoDataSource as MongoDataSourceVertxAlias
import java.util.function.Function

object MongoDataSource {
  /**
   * Suspending version of method [io.vertx.servicediscovery.types.MongoDataSource.getMongoClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter, optional
   * @return [MongoClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.MongoDataSource] using Vert.x codegen.
   */
  suspend fun getMongoClientAwait(discovery: ServiceDiscovery, filter: JsonObject): MongoClient {
    return awaitResult {
      MongoDataSourceVertxAlias.getMongoClient(discovery, filter, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.servicediscovery.types.MongoDataSource.getMongoClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter
   * @return [MongoClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.MongoDataSource] using Vert.x codegen.
   */
  suspend fun getMongoClientAwait(discovery: ServiceDiscovery, filter: (Record) -> Boolean): MongoClient {
    return awaitResult {
      MongoDataSourceVertxAlias.getMongoClient(discovery, filter, it::handle)
    }
  }

  /**
   * Suspending version of method [io.vertx.servicediscovery.types.MongoDataSource.getMongoClient]
   *
   * @param discovery The service discovery instance
   * @param filter The filter, optional
   * @param consumerConfiguration the consumer configuration
   * @return [MongoClient]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.MongoDataSource] using Vert.x codegen.
   */
  suspend fun getMongoClientAwait(discovery: ServiceDiscovery, filter: JsonObject, consumerConfiguration: JsonObject): MongoClient {
    return awaitResult {
      MongoDataSourceVertxAlias.getMongoClient(discovery, filter, consumerConfiguration, it)
    }
  }

}
