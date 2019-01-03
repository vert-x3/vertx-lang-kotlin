package io.vertx.kotlin.mqtt

import io.vertx.mqtt.MqttAuth

/**
 * A function providing a DSL for building [io.vertx.mqtt.MqttAuth] objects.
 *
 * MQTT authentication information
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttAuth original] using Vert.x codegen.
 */
fun mqttAuthOf(
): MqttAuth = io.vertx.mqtt.MqttAuth(io.vertx.core.json.JsonObject()).apply {

}

/**
 * A function providing a DSL for building [io.vertx.mqtt.MqttAuth] objects.
 *
 * MQTT authentication information
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttAuth original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("mqttAuthOf()")
)
fun MqttAuth(
): MqttAuth = io.vertx.mqtt.MqttAuth(io.vertx.core.json.JsonObject()).apply {

}

