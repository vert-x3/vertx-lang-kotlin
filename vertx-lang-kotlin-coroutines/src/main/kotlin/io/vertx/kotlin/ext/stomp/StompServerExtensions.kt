package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.StompServer
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.String

suspend fun StompServer.listen(): StompServer = awaitResult { this.listen(it) }

suspend fun StompServer.listen(port: Int): StompServer = awaitResult { this.listen(port, it) }

suspend fun StompServer.listen(port: Int, host: String): StompServer = awaitResult { this.listen(port, host, it) }

suspend fun StompServer.close() {
  awaitResult<Void?> { this.close(it) }
}
