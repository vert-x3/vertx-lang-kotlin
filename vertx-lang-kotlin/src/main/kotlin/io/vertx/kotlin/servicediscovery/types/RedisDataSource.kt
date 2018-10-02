package io.vertx.kotlin.servicediscovery.types

import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.redis.RedisClient
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import io.vertx.servicediscovery.types.RedisDataSource as RedisDataSourceVertxAlias
import java.util.function.Function

object RedisDataSource {
/**
 * Convenient method that looks for a Redis data source and provides the configured [io.vertx.redis.RedisClient].
 * The async result is marked as failed is there are no matching services, or if the lookup fails.
 *
 * @param discovery The service discovery instance
 * @param filter The filter, optional
 * @param resultHandler The result handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.RedisDataSource original] using Vert.x codegen.
 */
  suspend fun getRedisClientAwait(discovery : ServiceDiscovery, filter : JsonObject) : RedisClient {
    return awaitResult{
      RedisDataSourceVertxAlias.getRedisClient(discovery, filter, it)
    }
  }

/**
 * Convenient method that looks for a Redis data source and provides the configured [io.vertx.redis.RedisClient].
 * The async result is marked as failed is there are no matching services, or if the lookup fails.
 *
 * @param discovery The service discovery instance
 * @param filter The filter, cannot be <code>null</code>
 * @param resultHandler The result handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.RedisDataSource original] using Vert.x codegen.
 */
  suspend fun getRedisClientAwait(discovery : ServiceDiscovery, filter : Function<Record,Boolean>) : RedisClient {
    return awaitResult{
      RedisDataSourceVertxAlias.getRedisClient(discovery, filter, it)
    }
  }

/**
 * Convenient method that looks for a Redis data source and provides the configured [io.vertx.redis.RedisClient].
 * The async result is marked as failed is there are no matching services, or if the lookup fails.
 *
 * @param discovery The service discovery instance
 * @param filter The filter, optional
 * @param consumerConfiguration The additional consumer configuration
 * @param resultHandler The result handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.RedisDataSource original] using Vert.x codegen.
 */
  suspend fun getRedisClientAwait(discovery : ServiceDiscovery, filter : JsonObject, consumerConfiguration : JsonObject) : RedisClient {
    return awaitResult{
      RedisDataSourceVertxAlias.getRedisClient(discovery, filter, consumerConfiguration, it)
    }
  }

/**
 * Convenient method that looks for a Redis data source and provides the configured [io.vertx.redis.RedisClient].
 * The async result is marked as failed is there are no matching services, or if the lookup fails.
 *
 * @param discovery The service discovery instance
 * @param filter The filter, cannot be <code>null</code>
 * @param consumerConfiguration The additional consumer configuration
 * @param resultHandler The result handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.RedisDataSource original] using Vert.x codegen.
 */
  suspend fun getRedisClientAwait(discovery : ServiceDiscovery, filter : Function<Record,Boolean>, consumerConfiguration : JsonObject) : RedisClient {
    return awaitResult{
      RedisDataSourceVertxAlias.getRedisClient(discovery, filter, consumerConfiguration, it)
    }
  }

}
