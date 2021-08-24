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

import io.netty.handler.codec.mqtt.MqttProperties
import io.netty.handler.codec.mqtt.MqttQoS
import io.vertx.core.buffer.Buffer
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mqtt.MqttEndpoint

/**
 * Suspending version of method [io.vertx.mqtt.MqttEndpoint.publish]
 *
 * @param topic topic on which the message is published
 * @param payload message payload
 * @param qosLevel QoS level
 * @param isDup if the message is a duplicate
 * @param isRetain if the message needs to be retained
 * @return [Int]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mqtt.MqttEndpoint] using Vert.x codegen.
 */
@Deprecated(message = "Instead use publish returning a future and chain with await()", replaceWith = ReplaceWith("publish(topic, payload, qosLevel, isDup, isRetain).await()"))
suspend fun MqttEndpoint.publishAwait(topic: String, payload: Buffer, qosLevel: MqttQoS, isDup: Boolean, isRetain: Boolean): Int {
  return awaitResult {
    this.publish(topic, payload, qosLevel, isDup, isRetain, it)
  }
}

/**
 * Suspending version of method [io.vertx.mqtt.MqttEndpoint.publish]
 *
 * @param topic topic on which the message is published
 * @param payload message payload
 * @param qosLevel QoS level
 * @param isDup if the message is a duplicate
 * @param isRetain if the message needs to be retained
 * @param messageId message ID
 * @return [Int]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mqtt.MqttEndpoint] using Vert.x codegen.
 */
@Deprecated(message = "Instead use publish returning a future and chain with await()", replaceWith = ReplaceWith("publish(topic, payload, qosLevel, isDup, isRetain, messageId).await()"))
suspend fun MqttEndpoint.publishAwait(topic: String, payload: Buffer, qosLevel: MqttQoS, isDup: Boolean, isRetain: Boolean, messageId: Int): Int {
  return awaitResult {
    this.publish(topic, payload, qosLevel, isDup, isRetain, messageId, it)
  }
}

/**
 * Suspending version of method [io.vertx.mqtt.MqttEndpoint.publish]
 *
 * @param topic topic on which the message is published
 * @param payload message payload
 * @param qosLevel QoS level
 * @param isDup if the message is a duplicate
 * @param isRetain if the message needs to be retained
 * @param messageId message ID
 * @param properties PUBLISH message properties
 * @return [Int]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mqtt.MqttEndpoint] using Vert.x codegen.
 */
@Deprecated(message = "Instead use publish returning a future and chain with await()", replaceWith = ReplaceWith("publish(topic, payload, qosLevel, isDup, isRetain, messageId, properties).await()"))
suspend fun MqttEndpoint.publishAwait(topic: String, payload: Buffer, qosLevel: MqttQoS, isDup: Boolean, isRetain: Boolean, messageId: Int, properties: MqttProperties): Int {
  return awaitResult {
    this.publish(topic, payload, qosLevel, isDup, isRetain, messageId, properties, it)
  }
}

