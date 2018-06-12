package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.StompServer
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.String

suspend fun StompServer.listenSuspending(): StompServer {
  return awaitResult { this.listen(it) }
}

suspend fun StompServer.listenSuspending(port: Int): StompServer {
  return awaitResult { this.listen(port, it) }
}

suspend fun StompServer.listenSuspending(port: Int, host: String): StompServer {
  return awaitResult { this.listen(port, host, it) }
}

suspend fun StompServer.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}
