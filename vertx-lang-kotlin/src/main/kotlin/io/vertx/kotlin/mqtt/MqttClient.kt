/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
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
@Deprecated(message = "Instead use connect returning a future and chain with await()", replaceWith = ReplaceWith("connect(port, host).await()"))
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
@Deprecated(message = "Instead use connect returning a future and chain with await()", replaceWith = ReplaceWith("connect(port, host, serverName).await()"))
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
@Deprecated(message = "Instead use disconnect returning a future and chain with await()", replaceWith = ReplaceWith("disconnect().await()"))
suspend fun MqttClient.disconnectAwait(): Unit {
  return awaitResult {
    this.disconnect(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
@Deprecated(message = "Instead use publish returning a future and chain with await()", replaceWith = ReplaceWith("publish(topic, payload, qosLevel, isDup, isRetain).await()"))
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
@Deprecated(message = "Instead use subscribe returning a future and chain with await()", replaceWith = ReplaceWith("subscribe(topic, qos).await()"))
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
@Deprecated(message = "Instead use subscribe returning a future and chain with await()", replaceWith = ReplaceWith("subscribe(topics).await()"))
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
@Deprecated(message = "Instead use unsubscribe returning a future and chain with await()", replaceWith = ReplaceWith("unsubscribe(topic).await()"))
suspend fun MqttClient.unsubscribeAwait(topic: String): Int {
  return awaitResult {
    this.unsubscribe(topic, it)
  }
}

