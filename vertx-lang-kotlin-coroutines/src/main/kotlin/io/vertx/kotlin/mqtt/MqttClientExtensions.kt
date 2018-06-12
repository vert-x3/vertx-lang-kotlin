package io.vertx.kotlin.mqtt

import io.netty.handler.codec.mqtt.MqttQoS
import io.vertx.core.buffer.Buffer
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mqtt.MqttClient
import io.vertx.mqtt.messages.MqttConnAckMessage
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.MutableMap

suspend fun MqttClient.connect(port: Int, host: String): MqttConnAckMessage {
  return awaitResult { this.connect(port, host, it) }
}

suspend fun MqttClient.connect(
  port: Int,
  host: String,
  serverName: String
): MqttConnAckMessage {
  return awaitResult { this.connect(port, host, serverName, it) }
}

suspend fun MqttClient.disconnectSuspending() {
  awaitResult<Void?> { this.disconnect(it) }
}

suspend fun MqttClient.publishSuspending(
  topic: String,
  payload: Buffer,
  qosLevel: MqttQoS,
  isDup: Boolean,
  isRetain: Boolean
): Int {
  return awaitResult { this.publish(topic, payload, qosLevel, isDup, isRetain, it) }
}

suspend fun MqttClient.subscribeSuspending(topic: String, qos: Int): Int {
  return awaitResult { this.subscribe(topic, qos, it) }
}

suspend fun MqttClient.subscribeSuspending(topics: MutableMap<String, Int>): Int {
  return awaitResult { this.subscribe(topics, it) }
}

suspend fun MqttClient.unsubscribeSuspending(topic: String): Int {
  return awaitResult { this.unsubscribe(topic, it) }
}
