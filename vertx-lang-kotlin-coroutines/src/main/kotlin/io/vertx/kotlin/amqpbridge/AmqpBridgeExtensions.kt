package io.vertx.kotlin.amqpbridge

import io.vertx.amqpbridge.AmqpBridge
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.String

/**
 *  Starts the bridge, establishing the underlying connection.
 * @param hostname
 *           the host name to connect to
 * @param port
 *           the port to connect to
 * @param username
 *           the username
 * @param password
 *           the password */
suspend fun AmqpBridge.start(
  hostname: String,
  port: Int,
  username: String,
  password: String
): AmqpBridge {
  return awaitResult { this.start(hostname, port, username, password, it) }
}

/**
 *  Starts the bridge, establishing the underlying connection.
 * @param hostname
 *           the host name to connect to
 * @param port
 *           the port to connect to */
suspend fun AmqpBridge.start(hostname: String, port: Int): AmqpBridge {
  return awaitResult { this.start(hostname, port, it) }
}

/**
 *  Shuts the bridge down, closing the underlying connection. */
suspend fun AmqpBridge.close() {
  awaitResult<Void?> { this.close(it) }
}
