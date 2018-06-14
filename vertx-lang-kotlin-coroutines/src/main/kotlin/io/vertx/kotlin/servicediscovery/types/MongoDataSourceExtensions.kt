package io.vertx.kotlin.servicediscovery.types

import io.vertx.core.json.JsonObject
import io.vertx.ext.mongo.MongoClient
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import io.vertx.servicediscovery.types.MongoDataSource
import java.util.function.Function
import kotlin.Boolean

object MongoDataSourceExtensions {
 /**
  *  Convenient method that looks for a Mongo datasource source and provides the configured [io.vertx.ext.mongo.MongoClient]. The
  *  async result is marked as failed is there are no matching services, or if the lookup fails.
  * @param discovery     The service discovery instance
  * @param filter        The filter, optional */
 suspend fun getMongoClient(discovery: ServiceDiscovery, filter: JsonObject): MongoClient {
   return awaitResult { MongoDataSource.getMongoClient(discovery, filter, it) }
 }

 /**
  *  Convenient method that looks for a Mongo datasource source and provides the configured
  *  [io.vertx.ext.mongo.MongoClient]. The
  *  async result is marked as failed is there are no matching services, or if the lookup fails.
  * @param discovery     The service discovery instance
  * @param filter        The filter */
 suspend fun getMongoClient(discovery: ServiceDiscovery, filter: Function<Record, Boolean>): MongoClient {
   return awaitResult { MongoDataSource.getMongoClient(discovery, filter, it) }
 }

 /**
  *  Convenient method that looks for a Mongo datasource source and provides the configured [io.vertx.ext.mongo.MongoClient]. The
  *  async result is marked as failed is there are no matching services, or if the lookup fails.
  * @param discovery             The service discovery instance
  * @param filter                The filter, optional
  * @param consumerConfiguration the consumer configuration */
 suspend fun getMongoClient(
   discovery: ServiceDiscovery,
   filter: JsonObject,
   consumerConfiguration: JsonObject
 ): MongoClient {
   return awaitResult { MongoDataSource.getMongoClient(discovery, filter, consumerConfiguration, it) }
 }
}
