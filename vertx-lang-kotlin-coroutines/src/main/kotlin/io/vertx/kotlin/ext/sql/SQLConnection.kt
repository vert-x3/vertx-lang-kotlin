package io.vertx.kotlin.ext.sql

import io.vertx.core.json.JsonArray
import io.vertx.ext.sql.ResultSet
import io.vertx.ext.sql.SQLConnection
import io.vertx.ext.sql.SQLRowStream
import io.vertx.ext.sql.TransactionIsolation
import io.vertx.ext.sql.UpdateResult
import io.vertx.kotlin.coroutines.awaitResult

suspend fun SQLConnection.querySingleAwait(sql : String) : JsonArray? {
    return awaitResult{
        this.querySingle(sql, it)
    }
}

suspend fun SQLConnection.querySingleWithParamsAwait(sql : String, arguments : JsonArray) : JsonArray? {
    return awaitResult{
        this.querySingleWithParams(sql, arguments, it)
    }
}

suspend fun SQLConnection.setAutoCommitAwait(autoCommit : Boolean) : Void? {
    return awaitResult{
        this.setAutoCommit(autoCommit, it)
    }
}

suspend fun SQLConnection.executeAwait(sql : String) : Void? {
    return awaitResult{
        this.execute(sql, it)
    }
}

suspend fun SQLConnection.queryAwait(sql : String) : ResultSet? {
    return awaitResult{
        this.query(sql, it)
    }
}

suspend fun SQLConnection.queryStreamAwait(sql : String) : SQLRowStream? {
    return awaitResult{
        this.queryStream(sql, it)
    }
}

suspend fun SQLConnection.queryWithParamsAwait(sql : String, params : JsonArray) : ResultSet? {
    return awaitResult{
        this.queryWithParams(sql, params, it)
    }
}

suspend fun SQLConnection.queryStreamWithParamsAwait(sql : String, params : JsonArray) : SQLRowStream? {
    return awaitResult{
        this.queryStreamWithParams(sql, params, it)
    }
}

suspend fun SQLConnection.updateAwait(sql : String) : UpdateResult? {
    return awaitResult{
        this.update(sql, it)
    }
}

suspend fun SQLConnection.updateWithParamsAwait(sql : String, params : JsonArray) : UpdateResult? {
    return awaitResult{
        this.updateWithParams(sql, params, it)
    }
}

suspend fun SQLConnection.callAwait(sql : String) : ResultSet? {
    return awaitResult{
        this.call(sql, it)
    }
}

suspend fun SQLConnection.callWithParamsAwait(sql : String, params : JsonArray, outputs : JsonArray) : ResultSet? {
    return awaitResult{
        this.callWithParams(sql, params, outputs, it)
    }
}

suspend fun SQLConnection.closeAwait() : Void? {
    return awaitResult{
        this.close(it)
    }
}

suspend fun SQLConnection.commitAwait() : Void? {
    return awaitResult{
        this.commit(it)
    }
}

suspend fun SQLConnection.rollbackAwait() : Void? {
    return awaitResult{
        this.rollback(it)
    }
}

suspend fun SQLConnection.batchAwait(sqlStatements : List<String>) : List<Int>? {
    return awaitResult{
        this.batch(sqlStatements, it)
    }
}

suspend fun SQLConnection.batchWithParamsAwait(sqlStatement : String, args : List<JsonArray>) : List<Int>? {
    return awaitResult{
        this.batchWithParams(sqlStatement, args, it)
    }
}

suspend fun SQLConnection.batchCallableWithParamsAwait(sqlStatement : String, inArgs : List<JsonArray>, outArgs : List<JsonArray>) : List<Int>? {
    return awaitResult{
        this.batchCallableWithParams(sqlStatement, inArgs, outArgs, it)
    }
}

suspend fun SQLConnection.setTransactionIsolationAwait(isolation : TransactionIsolation) : Void? {
    return awaitResult{
        this.setTransactionIsolation(isolation, it)
    }
}

suspend fun SQLConnection.getTransactionIsolationAwait() : TransactionIsolation? {
    return awaitResult{
        this.getTransactionIsolation(it)
    }
}

