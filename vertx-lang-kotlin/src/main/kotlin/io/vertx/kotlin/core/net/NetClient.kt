package io.vertx.kotlin.core.net

import io.vertx.core.net.NetClient
import io.vertx.core.net.NetSocket
import io.vertx.core.net.SocketAddress
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.net.NetClient.connect]
 *
 * @param port the port
 * @param host the host
 * @return [NetSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetClient] using Vert.x codegen.
 */
suspend fun NetClient.connectAwait(port: Int, host: String): NetSocket {
  return awaitResult {
    this.connect(port, host, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetClient.connect]
 *
 * @param port the port
 * @param host the host
 * @param serverName the SNI server name
 * @return [NetSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetClient] using Vert.x codegen.
 */
suspend fun NetClient.connectAwait(port: Int, host: String, serverName: String): NetSocket {
  return awaitResult {
    this.connect(port, host, serverName, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetClient.connect]
 *
 * @param remoteAddress the remote address
 * @return [NetSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetClient] using Vert.x codegen.
 */
suspend fun NetClient.connectAwait(remoteAddress: SocketAddress): NetSocket {
  return awaitResult {
    this.connect(remoteAddress, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.net.NetClient.connect]
 *
 * @param remoteAddress the remote address
 * @param serverName the SNI server name
 * @return [NetSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.net.NetClient] using Vert.x codegen.
 */
suspend fun NetClient.connectAwait(remoteAddress: SocketAddress, serverName: String): NetSocket {
  return awaitResult {
    this.connect(remoteAddress, serverName, it)
  }
}

