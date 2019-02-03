package io.vertx.kotlin.ext.stomp

import io.vertx.core.net.NetClient
import io.vertx.ext.stomp.StompClient
import io.vertx.ext.stomp.StompClientConnection
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClient.connect]
 *
 * @param port the server port
 * @param host the server host
 * @return [StompClientConnection]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClient] using Vert.x codegen.
 */
suspend fun StompClient.connectAwait(port: Int, host: String): StompClientConnection {
  return awaitResult {
    this.connect(port, host, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClient.connect]
 *
 * @param net the NET client to use
 * @return [StompClientConnection]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClient] using Vert.x codegen.
 */
suspend fun StompClient.connectAwait(net: NetClient): StompClientConnection {
  return awaitResult {
    this.connect(net, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClient.connect]
 *
 * @param port the server port
 * @param host the server host
 * @param net the NET client to use
 * @return [StompClientConnection]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClient] using Vert.x codegen.
 */
suspend fun StompClient.connectAwait(port: Int, host: String, net: NetClient): StompClientConnection {
  return awaitResult {
    this.connect(port, host, net, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompClient.connect]
 *
 * @return [StompClientConnection]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompClient] using Vert.x codegen.
 */
suspend fun StompClient.connectAwait(): StompClientConnection {
  return awaitResult {
    this.connect(it)
  }
}

