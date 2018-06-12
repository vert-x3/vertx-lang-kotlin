package io.vertx.kotlin.mqtt

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mqtt.MqttServer
import kotlin.Int
import kotlin.String

suspend fun MqttServer.listenSuspending(port: Int, host: String): MqttServer {
  return awaitResult { this.listen(port, host, it) }
}

suspend fun MqttServer.listenSuspending(port: Int): MqttServer {
  return awaitResult { this.listen(port, it) }
}

suspend fun MqttServer.listenSuspending(): MqttServer {
  return awaitResult { this.listen(it) }
}

suspend fun MqttServer.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}
