package io.vertx.kotlin.ext.sql

import io.vertx.core.json.JsonArray
import io.vertx.ext.sql.ResultSet
import io.vertx.ext.sql.SQLOperations
import io.vertx.ext.sql.SQLRowStream
import io.vertx.ext.sql.UpdateResult
import io.vertx.kotlin.coroutines.awaitResult

suspend fun SQLOperations.queryAwait(sql : String) : ResultSet {
    return awaitResult{
        this.query(sql, it)
    }
}

suspend fun SQLOperations.queryWithParamsAwait(sql : String, params : JsonArray) : ResultSet {
    return awaitResult{
        this.queryWithParams(sql, params, it)
    }
}

suspend fun SQLOperations.queryStreamAwait(sql : String) : SQLRowStream {
    return awaitResult{
        this.queryStream(sql, it)
    }
}

suspend fun SQLOperations.queryStreamWithParamsAwait(sql : String, params : JsonArray) : SQLRowStream {
    return awaitResult{
        this.queryStreamWithParams(sql, params, it)
    }
}

suspend fun SQLOperations.querySingleAwait(sql : String) : JsonArray {
    return awaitResult{
        this.querySingle(sql, it)
    }
}

suspend fun SQLOperations.querySingleWithParamsAwait(sql : String, arguments : JsonArray) : JsonArray {
    return awaitResult{
        this.querySingleWithParams(sql, arguments, it)
    }
}

suspend fun SQLOperations.updateAwait(sql : String) : UpdateResult {
    return awaitResult{
        this.update(sql, it)
    }
}

suspend fun SQLOperations.updateWithParamsAwait(sql : String, params : JsonArray) : UpdateResult {
    return awaitResult{
        this.updateWithParams(sql, params, it)
    }
}

suspend fun SQLOperations.callAwait(sql : String) : ResultSet {
    return awaitResult{
        this.call(sql, it)
    }
}

suspend fun SQLOperations.callWithParamsAwait(sql : String, params : JsonArray, outputs : JsonArray) : ResultSet {
    return awaitResult{
        this.callWithParams(sql, params, outputs, it)
    }
}

