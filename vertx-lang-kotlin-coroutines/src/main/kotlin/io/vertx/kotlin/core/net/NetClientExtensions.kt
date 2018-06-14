package io.vertx.kotlin.core.net

import io.vertx.core.net.NetClient
import io.vertx.core.net.NetSocket
import io.vertx.core.net.SocketAddress
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.String

/**
 *  Open a connection to a server at the specific `port` and `host`.
 *  <p>
 *  `host` can be a valid host name or IP address. The connect is done asynchronously and on success, a
 *  [NetSocket] instance is supplied via the `connectHandler` instance
 * @param port  the port
 * @param host  the host
 * @return a reference to this, so the API can be used fluently
 */
suspend fun NetClient.connect(port: Int, host: String): NetSocket {
  return awaitResult { this.connect(port, host, it) }
}

/**
 *  Open a connection to a server at the specific `port` and `host`.
 *  <p>
 *  `host` can be a valid host name or IP address. The connect is done asynchronously and on success, a
 *  [NetSocket] instance is supplied via the `connectHandler` instance
 * @param port the port
 * @param host the host
 * @param serverName the SNI server name
 * @return a reference to this, so the API can be used fluently
 */
suspend fun NetClient.connect(
  port: Int,
  host: String,
  serverName: String
): NetSocket {
  return awaitResult { this.connect(port, host, serverName, it) }
}

/**
 *  Open a connection to a server at the specific `remoteAddress`.
 *  <p>
 *  The connect is done asynchronously and on success, a [NetSocket] instance is supplied via the `connectHandler` instance
 * @param remoteAddress the remote address
 * @return a reference to this, so the API can be used fluently
 */
suspend fun NetClient.connect(remoteAddress: SocketAddress): NetSocket {
  return awaitResult { this.connect(remoteAddress, it) }
}

/**
 *  Open a connection to a server at the specific `remoteAddress`.
 *  <p>
 *  The connect is done asynchronously and on success, a [NetSocket] instance is supplied via the `connectHandler` instance
 * @param remoteAddress the remote address
 * @param serverName the SNI server name
 * @return a reference to this, so the API can be used fluently
 */
suspend fun NetClient.connect(remoteAddress: SocketAddress, serverName: String): NetSocket {
  return awaitResult { this.connect(remoteAddress, serverName, it) }
}
