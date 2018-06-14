package io.vertx.kotlin.core.http

import io.vertx.core.http.HttpServer
import io.vertx.core.net.SocketAddress
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.String

/**
 *  Like [HttpServer.listen] but supplying a handler that will be called when the server is actually
 *  listening (or has failed).
 * @param port  the port to listen on
 * @param host  the host to listen on */
suspend fun HttpServer.listenSuspending(port: Int, host: String): HttpServer {
  return awaitResult { this.listen(port, host, it) }
}

/**
 *  Tell the server to start listening on the given address supplying
 *  a handler that will be called when the server is actually
 *  listening (or has failed).
 * @param address the address to listen on */
suspend fun HttpServer.listen(address: SocketAddress): HttpServer {
  return awaitResult { this.listen(address, it) }
}

/**
 *  Like [HttpServer.listen] but supplying a handler that will be called when the server is actually listening (or has failed).
 * @param port  the port to listen on */
suspend fun HttpServer.listenSuspending(port: Int): HttpServer {
  return awaitResult { this.listen(port, it) }
}

/**
 *  Like [HttpServer.listen] but supplying a handler that will be called when the server is actually listening (or has failed). */
suspend fun HttpServer.listenSuspending(): HttpServer {
  return awaitResult { this.listen(it) }
}

/**
 *  Like [HttpServer.close] but supplying a handler that will be called when the server is actually closed (or has failed). */
suspend fun HttpServer.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}
