package io.vertx.kotlin.ext.stomp

import io.vertx.core.net.NetClient
import io.vertx.ext.stomp.StompClient
import io.vertx.ext.stomp.StompClientConnection
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.String

suspend fun StompClient.connect(port: Int, host: String): StompClientConnection {
  return awaitResult { this.connect(port, host, it) }
}

suspend fun StompClient.connect(net: NetClient): StompClientConnection {
  return awaitResult { this.connect(net, it) }
}

suspend fun StompClient.connect(
  port: Int,
  host: String,
  net: NetClient
): StompClientConnection {
  return awaitResult { this.connect(port, host, net, it) }
}

suspend fun StompClient.connect(): StompClientConnection {
  return awaitResult { this.connect(it) }
}
