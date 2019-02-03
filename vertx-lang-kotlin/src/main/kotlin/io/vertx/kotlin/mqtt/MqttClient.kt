package io.vertx.kotlin.mqtt

import io.netty.handler.codec.mqtt.MqttQoS
import io.vertx.core.buffer.Buffer
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mqtt.MqttClient
import io.vertx.mqtt.messages.MqttConnAckMessage

/**
 * Suspending version of method [io.vertx.mqtt.MqttClient.connect]
 *
 * @param port port of the MQTT server
 * @param host hostname/ip address of the MQTT server
 * @return [MqttConnAckMessage]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mqtt.MqttClient] using Vert.x codegen.
 */
suspend fun MqttClient.connectAwait(port: Int, host: String): MqttConnAckMessage {
  return awaitResult {
    this.connect(port, host, it)
  }
}

/**
 * Suspending version of method [io.vertx.mqtt.MqttClient.connect]
 *
 * @param port port of the MQTT server
 * @param host hostname/ip address of the MQTT server
 * @param serverName the SNI server name
 * @return [MqttConnAckMessage]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mqtt.MqttClient] using Vert.x codegen.
 */
suspend fun MqttClient.connectAwait(port: Int, host: String, serverName: String): MqttConnAckMessage {
  return awaitResult {
    this.connect(port, host, serverName, it)
  }
}

/**
 * Suspending version of method [io.vertx.mqtt.MqttClient.disconnect]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.mqtt.MqttClient] using Vert.x codegen.
 */
suspend fun MqttClient.disconnectAwait(): Unit {
  return awaitResult {
    this.disconnect { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.mqtt.MqttClient.publish]
 *
 * @param topic topic on which the message is published
 * @param payload message payload
 * @param qosLevel QoS level
 * @param isDup if the message is a duplicate
 * @param isRetain if the message needs to be retained
 * @return [Int]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mqtt.MqttClient] using Vert.x codegen.
 */
suspend fun MqttClient.publishAwait(topic: String, payload: Buffer, qosLevel: MqttQoS, isDup: Boolean, isRetain: Boolean): Int {
  return awaitResult {
    this.publish(topic, payload, qosLevel, isDup, isRetain, it)
  }
}

/**
 * Suspending version of method [io.vertx.mqtt.MqttClient.subscribe]
 *
 * @param topic topic you subscribe on
 * @param qos QoS level
 * @return [Int]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mqtt.MqttClient] using Vert.x codegen.
 */
suspend fun MqttClient.subscribeAwait(topic: String, qos: Int): Int {
  return awaitResult {
    this.subscribe(topic, qos, it)
  }
}

/**
 * Suspending version of method [io.vertx.mqtt.MqttClient.subscribe]
 *
 * @param topics topics you subscribe on
 * @return [Int]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mqtt.MqttClient] using Vert.x codegen.
 */
suspend fun MqttClient.subscribeAwait(topics: Map<String,Int>): Int {
  return awaitResult {
    this.subscribe(topics, it)
  }
}

/**
 * Suspending version of method [io.vertx.mqtt.MqttClient.unsubscribe]
 *
 * @param topic Topic you want to unsubscribe from
 * @return [Int]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mqtt.MqttClient] using Vert.x codegen.
 */
suspend fun MqttClient.unsubscribeAwait(topic: String): Int {
  return awaitResult {
    this.unsubscribe(topic, it)
  }
}

