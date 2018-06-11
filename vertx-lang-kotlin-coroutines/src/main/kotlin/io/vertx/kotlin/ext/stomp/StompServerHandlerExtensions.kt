package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.StompServerConnection
import io.vertx.ext.stomp.StompServerHandler
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Boolean
import kotlin.String

suspend fun StompServerHandler.onAuthenticationRequest(
    connection: StompServerConnection,
    login: String,
    passcode: String
): Boolean = awaitResult { this.onAuthenticationRequest(connection, login, passcode, it) }
