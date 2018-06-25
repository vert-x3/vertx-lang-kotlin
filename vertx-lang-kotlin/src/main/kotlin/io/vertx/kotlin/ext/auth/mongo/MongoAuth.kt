package io.vertx.kotlin.ext.auth.mongo

import io.vertx.ext.auth.mongo.MongoAuth
import io.vertx.kotlin.coroutines.awaitResult

suspend fun MongoAuth.insertUserAwait(username : String, password : String, roles : List<String>, permissions : List<String>) : String {
    return awaitResult{
        this.insertUser(username, password, roles, permissions, it)
    }
}

