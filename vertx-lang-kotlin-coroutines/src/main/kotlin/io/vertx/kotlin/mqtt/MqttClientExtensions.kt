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

/**
 *  Connects to an MQTT server calling connectHandler after connection
 * @param port  port of the MQTT server
 * @param host  hostname/ip address of the MQTT server
 * @return  current MQTT client instance
 */
suspend fun MqttClient.connect(port: Int, host: String): MqttConnAckMessage {
  return awaitResult { this.connect(port, host, it) }
}

/**
 *  Connects to an MQTT server calling connectHandler after connection
 * @param port  port of the MQTT server
 * @param host  hostname/ip address of the MQTT server
 * @param serverName  the SNI server name
 * @return  current MQTT client instance
 */
suspend fun MqttClient.connect(
  port: Int,
  host: String,
  serverName: String
): MqttConnAckMessage {
  return awaitResult { this.connect(port, host, serverName, it) }
}

/**
 *  Disconnects from the MQTT server calling disconnectHandler after disconnection
 * @return current MQTT client instance
 */
suspend fun MqttClient.disconnectSuspending() {
  awaitResult<Void?> { this.disconnect(it) }
}

/**
 *  Sends the PUBLISH message to the remote MQTT server
 * @param topic    topic on which the message is published
 * @param payload  message payload
 * @param qosLevel QoS level
 * @param isDup    if the message is a duplicate
 * @param isRetain if the message needs to be retained
 * @return current MQTT client instance
 */
suspend fun MqttClient.publishSuspending(
  topic: String,
  payload: Buffer,
  qosLevel: MqttQoS,
  isDup: Boolean,
  isRetain: Boolean
): Int {
  return awaitResult { this.publish(topic, payload, qosLevel, isDup, isRetain, it) }
}

/**
 *  Subscribes to the topic with a specified QoS level
 * @param topic                 topic you subscribe on
 * @param qos                   QoS level
 * @return current MQTT client instance
 */
suspend fun MqttClient.subscribeSuspending(topic: String, qos: Int): Int {
  return awaitResult { this.subscribe(topic, qos, it) }
}

/**
 *  Subscribes to the topic and adds a handler which will be called after the request is sent
 * @param topics                topics you subscribe on
 * @return current MQTT client instance
 */
suspend fun MqttClient.subscribeSuspending(topics: MutableMap<String, Int>): Int {
  return awaitResult { this.subscribe(topics, it) }
}

/**
 *  Unsubscribe from receiving messages on given topic
 * @param topic Topic you want to unsubscribe from
 * @return current MQTT client instance
 */
suspend fun MqttClient.unsubscribeSuspending(topic: String): Int {
  return awaitResult { this.unsubscribe(topic, it) }
}
