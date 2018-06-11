package io.vertx.kotlin.ext.auth

import io.vertx.ext.auth.User
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String

suspend fun User.isAuthorized(authority: String): Boolean = awaitResult { this.isAuthorized(authority, it) }

@Deprecated("")
suspend fun User.isAuthorised(authority: String): Boolean = awaitResult { this.isAuthorised(authority, it) }
