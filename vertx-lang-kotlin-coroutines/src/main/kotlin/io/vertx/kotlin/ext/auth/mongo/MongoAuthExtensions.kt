package io.vertx.kotlin.ext.auth.mongo

import io.vertx.ext.auth.mongo.MongoAuth
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.String
import kotlin.collections.MutableList

suspend fun MongoAuth.insertUser(
    username: String,
    password: String,
    roles: MutableList<String>,
    permissions: MutableList<String>
): String = awaitResult { this.insertUser(username, password, roles, permissions, it) }
