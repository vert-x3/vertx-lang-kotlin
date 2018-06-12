package io.vertx.kotlin.mqtt

import io.netty.handler.codec.mqtt.MqttQoS
import io.vertx.core.buffer.Buffer
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mqtt.MqttEndpoint
import kotlin.Boolean
import kotlin.Int
import kotlin.String

suspend fun MqttEndpoint.publishSuspending(
  topic: String,
  payload: Buffer,
  qosLevel: MqttQoS,
  isDup: Boolean,
  isRetain: Boolean
): Int {
  return awaitResult { this.publish(topic, payload, qosLevel, isDup, isRetain, it) }
}
