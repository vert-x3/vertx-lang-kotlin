package io.vertx.kotlin.ext.auth

import io.vertx.ext.auth.User
import io.vertx.kotlin.coroutines.awaitResult

suspend fun User.isAuthorizedAwait(authority : String) : Boolean {
    return awaitResult{
        this.isAuthorized(authority, it)
    }
}

