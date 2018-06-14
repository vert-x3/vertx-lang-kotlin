package io.vertx.kotlin.core.net

import io.vertx.core.net.NetServer
import io.vertx.core.net.SocketAddress
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.String

/**
 *  Like [NetServer.listen] but providing a handler that will be notified when the server is listening, or fails.
 * @return a reference to this, so the API can be used fluently
 */
suspend fun NetServer.listenSuspending(): NetServer {
  return awaitResult { this.listen(it) }
}

/**
 *  Like [NetServer.listen] but providing a handler that will be notified when the server is listening, or fails.
 * @param port  the port to listen on
 * @param host  the host to listen on
 * @return a reference to this, so the API can be used fluently
 */
suspend fun NetServer.listenSuspending(port: Int, host: String): NetServer {
  return awaitResult { this.listen(port, host, it) }
}

/**
 *  Like [NetServer.listen] but providing a handler that will be notified when the server is listening, or fails.
 * @param port  the port to listen on
 * @return a reference to this, so the API can be used fluently
 */
suspend fun NetServer.listenSuspending(port: Int): NetServer {
  return awaitResult { this.listen(port, it) }
}

/**
 *  Like [NetServer.listen] but providing a handler that will be notified when the server is listening, or fails.
 * @param localAddress the local address to listen on
 * @return a reference to this, so the API can be used fluently
 */
suspend fun NetServer.listenSuspending(localAddress: SocketAddress): NetServer {
  return awaitResult { this.listen(localAddress, it) }
}

/**
 *  Like [NetServer.close] but supplying a handler that will be notified when close is complete. */
suspend fun NetServer.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}
