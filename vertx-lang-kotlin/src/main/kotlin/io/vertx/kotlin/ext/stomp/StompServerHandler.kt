package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.StompServerConnection
import io.vertx.ext.stomp.StompServerHandler
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Called when the client connects to a server requiring authentication. It invokes the  configured
 * using [io.vertx.ext.stomp.StompServerHandler].
 *
 * @param connection server connection that contains session ID
 * @param login the login
 * @param passcode the password
 * @param handler handler receiving the authentication result
 * @returnthe current [io.vertx.ext.stomp.StompServerHandler] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerHandler original] using Vert.x codegen.
 */
suspend fun StompServerHandler.onAuthenticationRequestAwait(connection : StompServerConnection, login : String, passcode : String) : Boolean {
  return awaitResult{
    this.onAuthenticationRequest(connection, login, passcode, it)
  }
}

