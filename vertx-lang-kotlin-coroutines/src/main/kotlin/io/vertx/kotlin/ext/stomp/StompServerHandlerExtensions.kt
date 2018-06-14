package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.StompServerConnection
import io.vertx.ext.stomp.StompServerHandler
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Boolean
import kotlin.String

/**
 *  Called when the client connects to a server requiring authentication. It invokes the [AuthProvider] configured
 *  using [StompServerHandler.authProvider].
 * @param connection server connection that contains session ID
 * @param login      the login
 * @param passcode   the password
 * @return the current [StompServerHandler]
 */
suspend fun StompServerHandler.onAuthenticationRequest(
  connection: StompServerConnection,
  login: String,
  passcode: String
): Boolean {
  return awaitResult { this.onAuthenticationRequest(connection, login, passcode, it) }
}
