package io.vertx.kotlin.servicediscovery.types

import io.vertx.core.json.JsonObject
import io.vertx.ext.mongo.MongoClient
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import io.vertx.servicediscovery.types.MongoDataSource
import java.util.function.Function

suspend fun getMongoClientAwait(discovery : ServiceDiscovery, filter : JsonObject) : MongoClient {
    return awaitResult{
        MongoDataSource.getMongoClient(discovery, filter, it)
    }
}

suspend fun getMongoClientAwait(discovery : ServiceDiscovery, filter : Function<Record, Boolean>) : MongoClient {
    return awaitResult{
        MongoDataSource.getMongoClient(discovery, filter, it)
    }
}

suspend fun getMongoClientAwait(discovery : ServiceDiscovery, filter : JsonObject, consumerConfiguration : JsonObject) : MongoClient {
    return awaitResult{
        MongoDataSource.getMongoClient(discovery, filter, consumerConfiguration, it)
    }
}

