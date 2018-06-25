package io.vertx.kotlin.ext.asyncsql

import io.vertx.core.json.JsonArray
import io.vertx.ext.asyncsql.AsyncSQLClient
import io.vertx.kotlin.coroutines.awaitResult

suspend fun AsyncSQLClient.querySingleAwait(sql : String) : JsonArray {
    return awaitResult{
        this.querySingle(sql, it)
    }
}

suspend fun AsyncSQLClient.querySingleWithParamsAwait(sql : String, arguments : JsonArray) : JsonArray {
    return awaitResult{
        this.querySingleWithParams(sql, arguments, it)
    }
}

