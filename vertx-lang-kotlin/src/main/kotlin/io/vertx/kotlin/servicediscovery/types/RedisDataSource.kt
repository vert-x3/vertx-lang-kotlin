package io.vertx.kotlin.servicediscovery.types

import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.redis.RedisClient
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import io.vertx.servicediscovery.types.RedisDataSource as RedisDataSourceVertxAlias
import java.util.function.Function

object RedisDataSource {
    suspend fun getRedisClientAwait(discovery : ServiceDiscovery, filter : JsonObject) : RedisClient {
        return awaitResult{
            RedisDataSourceVertxAlias.getRedisClient(discovery, filter, it)
        }
    }

    suspend fun getRedisClientAwait(discovery : ServiceDiscovery, filter : Function<Record,Boolean>) : RedisClient {
        return awaitResult{
            RedisDataSourceVertxAlias.getRedisClient(discovery, filter, it)
        }
    }

    suspend fun getRedisClientAwait(discovery : ServiceDiscovery, filter : JsonObject, consumerConfiguration : JsonObject) : RedisClient {
        return awaitResult{
            RedisDataSourceVertxAlias.getRedisClient(discovery, filter, consumerConfiguration, it)
        }
    }

    suspend fun getRedisClientAwait(discovery : ServiceDiscovery, filter : Function<Record,Boolean>, consumerConfiguration : JsonObject) : RedisClient {
        return awaitResult{
            RedisDataSourceVertxAlias.getRedisClient(discovery, filter, consumerConfiguration, it)
        }
    }

}
