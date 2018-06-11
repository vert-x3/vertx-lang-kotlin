package io.vertx.kotlin.amqpbridge

import io.vertx.amqpbridge.AmqpBridge
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.String

suspend fun AmqpBridge.start(
  hostname: String,
  port: Int,
  username: String,
  password: String
): AmqpBridge {
  return awaitResult { this.start(hostname, port, username, password, it) }
}

suspend fun AmqpBridge.start(hostname: String, port: Int): AmqpBridge {
  return awaitResult { this.start(hostname, port, it) }
}

suspend fun AmqpBridge.close() {
  awaitResult<Void?> { this.close(it) }
}
