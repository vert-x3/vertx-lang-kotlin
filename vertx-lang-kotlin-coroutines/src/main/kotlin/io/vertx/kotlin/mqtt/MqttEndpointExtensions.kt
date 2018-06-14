package io.vertx.kotlin.mqtt

import io.netty.handler.codec.mqtt.MqttQoS
import io.vertx.core.buffer.Buffer
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mqtt.MqttEndpoint
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 *  Sends the PUBLISH message to the remote MQTT server
 * @param topic    topic on which the message is published
 * @param payload  message payload
 * @param qosLevel QoS level
 * @param isDup    if the message is a duplicate
 * @param isRetain if the message needs to be retained
 * @return current MQTT client instance
 */
suspend fun MqttEndpoint.publishSuspending(
  topic: String,
  payload: Buffer,
  qosLevel: MqttQoS,
  isDup: Boolean,
  isRetain: Boolean
): Int {
  return awaitResult { this.publish(topic, payload, qosLevel, isDup, isRetain, it) }
}
