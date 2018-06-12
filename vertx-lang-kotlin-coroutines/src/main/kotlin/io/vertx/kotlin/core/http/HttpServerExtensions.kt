package io.vertx.kotlin.core.http

import io.vertx.core.http.HttpServer
import io.vertx.core.net.SocketAddress
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.String

suspend fun HttpServer.listenSuspending(port: Int, host: String): HttpServer {
  return awaitResult { this.listen(port, host, it) }
}

suspend fun HttpServer.listen(address: SocketAddress): HttpServer {
  return awaitResult { this.listen(address, it) }
}

suspend fun HttpServer.listenSuspending(port: Int): HttpServer {
  return awaitResult { this.listen(port, it) }
}

suspend fun HttpServer.listenSuspending(): HttpServer {
  return awaitResult { this.listen(it) }
}

suspend fun HttpServer.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}
