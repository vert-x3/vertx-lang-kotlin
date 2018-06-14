package io.vertx.kotlin.servicediscovery.types

import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.redis.RedisClient
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import io.vertx.servicediscovery.types.RedisDataSource
import java.util.function.Function
import kotlin.Boolean

object RedisDataSourceExtensions {
 /**
  *  Convenient method that looks for a Redis data source and provides the configured [io.vertx.redis.RedisClient].
  *  The async result is marked as failed is there are no matching services, or if the lookup fails.
  * @param discovery     The service discovery instance
  * @param filter        The filter, optional */
 suspend fun getRedisClient(discovery: ServiceDiscovery, filter: JsonObject): RedisClient {
   return awaitResult { RedisDataSource.getRedisClient(discovery, filter, it) }
 }

 /**
  *  Convenient method that looks for a Redis data source and provides the configured [io.vertx.redis.RedisClient].
  *  The async result is marked as failed is there are no matching services, or if the lookup fails.
  * @param discovery     The service discovery instance
  * @param filter        The filter, cannot be `null` */
 suspend fun getRedisClient(discovery: ServiceDiscovery, filter: Function<Record, Boolean>): RedisClient {
   return awaitResult { RedisDataSource.getRedisClient(discovery, filter, it) }
 }

 /**
  *  Convenient method that looks for a Redis data source and provides the configured [io.vertx.redis.RedisClient].
  *  The async result is marked as failed is there are no matching services, or if the lookup fails.
  * @param discovery             The service discovery instance
  * @param filter                The filter, optional
  * @param consumerConfiguration The additional consumer configuration */
 suspend fun getRedisClient(
   discovery: ServiceDiscovery,
   filter: JsonObject,
   consumerConfiguration: JsonObject
 ): RedisClient {
   return awaitResult { RedisDataSource.getRedisClient(discovery, filter, consumerConfiguration, it) }
 }

 /**
  *  Convenient method that looks for a Redis data source and provides the configured [io.vertx.redis.RedisClient].
  *  The async result is marked as failed is there are no matching services, or if the lookup fails.
  * @param discovery             The service discovery instance
  * @param filter                The filter, cannot be `null`
  * @param consumerConfiguration The additional consumer configuration */
 suspend fun getRedisClient(
   discovery: ServiceDiscovery,
   filter: Function<Record, Boolean>,
   consumerConfiguration: JsonObject
 ): RedisClient {
   return awaitResult { RedisDataSource.getRedisClient(discovery, filter, consumerConfiguration, it) }
 }
}
