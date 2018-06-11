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
  suspend fun getRedisClient(discovery: ServiceDiscovery, filter: JsonObject): RedisClient = awaitResult { RedisDataSource.getRedisClient(discovery, filter, it) }

  suspend fun getRedisClient(discovery: ServiceDiscovery, filter: Function<Record, Boolean>): RedisClient = awaitResult { RedisDataSource.getRedisClient(discovery, filter, it) }

  suspend fun getRedisClient(
      discovery: ServiceDiscovery,
      filter: JsonObject,
      consumerConfiguration: JsonObject
  ): RedisClient = awaitResult { RedisDataSource.getRedisClient(discovery, filter, consumerConfiguration, it) }

  suspend fun getRedisClient(
      discovery: ServiceDiscovery,
      filter: Function<Record, Boolean>,
      consumerConfiguration: JsonObject
  ): RedisClient = awaitResult { RedisDataSource.getRedisClient(discovery, filter, consumerConfiguration, it) }
}
