package io.vertx.kotlin.core.http

import io.vertx.core.http.HttpServer
import io.vertx.core.net.SocketAddress
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.String

suspend fun HttpServer.listen(port: Int, host: String): HttpServer = awaitResult { this.listen(port, host, it) }

suspend fun HttpServer.listen(address: SocketAddress): HttpServer = awaitResult { this.listen(address, it) }

suspend fun HttpServer.listen(port: Int): HttpServer = awaitResult { this.listen(port, it) }

suspend fun HttpServer.listen(): HttpServer = awaitResult { this.listen(it) }

suspend fun HttpServer.close() {
  awaitResult<Void?> { this.close(it) }
}
