package io.vertx.kotlin.core.net

import io.vertx.core.net.NetClient
import io.vertx.core.net.NetSocket
import io.vertx.core.net.SocketAddress
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.String

suspend fun NetClient.connect(port: Int, host: String): NetSocket = awaitResult { this.connect(port, host, it) }

suspend fun NetClient.connect(
    port: Int,
    host: String,
    serverName: String
): NetSocket = awaitResult { this.connect(port, host, serverName, it) }

suspend fun NetClient.connect(remoteAddress: SocketAddress): NetSocket = awaitResult { this.connect(remoteAddress, it) }

suspend fun NetClient.connect(remoteAddress: SocketAddress, serverName: String): NetSocket = awaitResult { this.connect(remoteAddress, serverName, it) }
