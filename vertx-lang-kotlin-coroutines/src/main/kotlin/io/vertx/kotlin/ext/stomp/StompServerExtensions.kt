package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.StompServer
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.String

/**
 *  Connects the STOMP server default port (61613) and network interface (`0.0.0.0`). Once the socket
 *  it bounds calls the given handler with the result. The result may be a failure if the socket is already used.
 * @return the current [StompServer]
 */
suspend fun StompServer.listenSuspending(): StompServer {
  return awaitResult { this.listen(it) }
}

/**
 *  Connects the STOMP server to the given port. This method use the default host (`0.0.0.0`). Once the socket
 *  it bounds calls the given handler with the result. The result may be a failure if the socket is already used.
 * @param port    the port
 * @return the current [StompServer]
 */
suspend fun StompServer.listenSuspending(port: Int): StompServer {
  return awaitResult { this.listen(port, it) }
}

/**
 *  Connects the STOMP server to the given port / interface. Once the socket it bounds calls the given handler with
 *  the result. The result may be a failure if the socket is already used.
 * @param port    the port
 * @param host    the host / interface
 * @return the current [StompServer]
 */
suspend fun StompServer.listenSuspending(port: Int, host: String): StompServer {
  return awaitResult { this.listen(port, host, it) }
}

/**
 *  Closes the server. */
suspend fun StompServer.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}
