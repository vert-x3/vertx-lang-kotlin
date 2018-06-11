package io.vertx.kotlin.mqtt

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mqtt.MqttServer
import kotlin.Int
import kotlin.String

suspend fun MqttServer.listen(port: Int, host: String): MqttServer = awaitResult { this.listen(port, host, it) }

suspend fun MqttServer.listen(port: Int): MqttServer = awaitResult { this.listen(port, it) }

suspend fun MqttServer.listen(): MqttServer = awaitResult { this.listen(it) }

suspend fun MqttServer.close() {
  awaitResult<Void?> { this.close(it) }
}
