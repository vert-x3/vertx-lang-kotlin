package io.vertx.kotlin.ext.stomp

import io.vertx.core.net.NetClient
import io.vertx.ext.stomp.StompClient
import io.vertx.ext.stomp.StompClientConnection
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.String

/**
 *  Connects to the server.
 * @param port          the server port
 * @param host          the server host
 * @return the current [StompClient]
 */
suspend fun StompClient.connect(port: Int, host: String): StompClientConnection {
  return awaitResult { this.connect(port, host, it) }
}

/**
 *  Connects to the server.
 * @param net           the NET client to use
 * @return the current [StompClient]
 */
suspend fun StompClient.connect(net: NetClient): StompClientConnection {
  return awaitResult { this.connect(net, it) }
}

/**
 *  Connects to the server.
 * @param port          the server port
 * @param host          the server host
 * @param net           the NET client to use
 * @return the current [StompClient]
 */
suspend fun StompClient.connect(
  port: Int,
  host: String,
  net: NetClient
): StompClientConnection {
  return awaitResult { this.connect(port, host, net, it) }
}

/**
 *  Connects to the server using the host and port configured in the client's options.
 * @return the current [StompClient]
 */
suspend fun StompClient.connect(): StompClientConnection {
  return awaitResult { this.connect(it) }
}
