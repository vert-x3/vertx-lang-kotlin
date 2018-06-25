package io.vertx.kotlin.ext.sql

import io.vertx.core.json.JsonArray
import io.vertx.ext.sql.ResultSet
import io.vertx.ext.sql.SQLClient
import io.vertx.ext.sql.SQLConnection
import io.vertx.ext.sql.SQLRowStream
import io.vertx.ext.sql.UpdateResult
import io.vertx.kotlin.coroutines.awaitResult

suspend fun SQLClient.querySingleAwait(sql : String) : JsonArray {
    return awaitResult{
        this.querySingle(sql, it)
    }
}

suspend fun SQLClient.querySingleWithParamsAwait(sql : String, arguments : JsonArray) : JsonArray {
    return awaitResult{
        this.querySingleWithParams(sql, arguments, it)
    }
}

suspend fun SQLClient.getConnectionAwait() : SQLConnection {
    return awaitResult{
        this.getConnection(it)
    }
}

suspend fun SQLClient.closeAwait() : Unit {
    return awaitResult{
        this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun SQLClient.queryAwait(sql : String) : ResultSet {
    return awaitResult{
        this.query(sql, it)
    }
}

suspend fun SQLClient.queryStreamAwait(sql : String) : SQLRowStream {
    return awaitResult{
        this.queryStream(sql, it)
    }
}

suspend fun SQLClient.queryStreamWithParamsAwait(sql : String, params : JsonArray) : SQLRowStream {
    return awaitResult{
        this.queryStreamWithParams(sql, params, it)
    }
}

suspend fun SQLClient.queryWithParamsAwait(sql : String, arguments : JsonArray) : ResultSet {
    return awaitResult{
        this.queryWithParams(sql, arguments, it)
    }
}

suspend fun SQLClient.updateAwait(sql : String) : UpdateResult {
    return awaitResult{
        this.update(sql, it)
    }
}

suspend fun SQLClient.updateWithParamsAwait(sql : String, params : JsonArray) : UpdateResult {
    return awaitResult{
        this.updateWithParams(sql, params, it)
    }
}

suspend fun SQLClient.callAwait(sql : String) : ResultSet {
    return awaitResult{
        this.call(sql, it)
    }
}

suspend fun SQLClient.callWithParamsAwait(sql : String, params : JsonArray, outputs : JsonArray) : ResultSet {
    return awaitResult{
        this.callWithParams(sql, params, outputs, it)
    }
}

