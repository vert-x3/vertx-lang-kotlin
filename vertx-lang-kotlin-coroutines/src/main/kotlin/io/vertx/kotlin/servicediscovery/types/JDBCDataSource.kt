package io.vertx.kotlin.servicediscovery.types

import io.vertx.core.json.JsonObject
import io.vertx.ext.jdbc.JDBCClient
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import io.vertx.servicediscovery.types.JDBCDataSource
import java.util.function.Function

suspend fun getJDBCClientAwait(discovery : ServiceDiscovery, filter : JsonObject) : JDBCClient? {
    return awaitResult{
        JDBCDataSource.getJDBCClient(discovery, filter, it)
    }
}

suspend fun getJDBCClientAwait(discovery : ServiceDiscovery, filter : Function<Record, Boolean>) : JDBCClient? {
    return awaitResult{
        JDBCDataSource.getJDBCClient(discovery, filter, it)
    }
}

suspend fun getJDBCClientAwait(discovery : ServiceDiscovery, filter : JsonObject, consumerConfiguration : JsonObject) : JDBCClient? {
    return awaitResult{
        JDBCDataSource.getJDBCClient(discovery, filter, consumerConfiguration, it)
    }
}

suspend fun getJDBCClientAwait(discovery : ServiceDiscovery, filter : Function<Record, Boolean>, consumerConfiguration : JsonObject) : JDBCClient? {
    return awaitResult{
        JDBCDataSource.getJDBCClient(discovery, filter, consumerConfiguration, it)
    }
}

