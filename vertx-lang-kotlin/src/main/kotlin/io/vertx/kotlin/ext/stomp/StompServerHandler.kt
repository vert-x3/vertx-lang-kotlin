package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.StompServerConnection
import io.vertx.ext.stomp.StompServerHandler
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.stomp.StompServerHandler.onAuthenticationRequest]
 *
 * @param connection server connection that contains session ID
 * @param login the login
 * @param passcode the password
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompServerHandler] using Vert.x codegen.
 */
suspend fun StompServerHandler.onAuthenticationRequestAwait(connection: StompServerConnection, login: String, passcode: String): Boolean {
  return awaitResult {
    this.onAuthenticationRequest(connection, login, passcode, it)
  }
}

