package io.vertx.kotlin.ext.asyncsql

import io.vertx.core.json.JsonArray
import io.vertx.ext.asyncsql.PostgreSQLClient
import io.vertx.kotlin.coroutines.awaitResult

suspend fun PostgreSQLClient.querySingleAwait(sql : String) : JsonArray {
    return awaitResult{
        this.querySingle(sql, it)
    }
}

suspend fun PostgreSQLClient.querySingleWithParamsAwait(sql : String, arguments : JsonArray) : JsonArray {
    return awaitResult{
        this.querySingleWithParams(sql, arguments, it)
    }
}

