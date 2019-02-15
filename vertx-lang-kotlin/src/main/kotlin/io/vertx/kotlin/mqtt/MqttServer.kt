package io.vertx.kotlin.mqtt

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mqtt.MqttServer

/**
 * Suspending version of method [io.vertx.mqtt.MqttServer.listen]
 *
 * @param port the port to listen on
 * @param host the host to listen on
 * @return [MqttServer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mqtt.MqttServer] using Vert.x codegen.
 */
suspend fun MqttServer.listenAwait(port: Int, host: String): MqttServer {
  return awaitResult {
    this.listen(port, host, it)
  }
}

/**
 * Suspending version of method [io.vertx.mqtt.MqttServer.listen]
 *
 * @param port the port to listen on
 * @return [MqttServer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mqtt.MqttServer] using Vert.x codegen.
 */
suspend fun MqttServer.listenAwait(port: Int): MqttServer {
  return awaitResult {
    this.listen(port, it)
  }
}

/**
 * Suspending version of method [io.vertx.mqtt.MqttServer.listen]
 *
 * @return [MqttServer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.mqtt.MqttServer] using Vert.x codegen.
 */
suspend fun MqttServer.listenAwait(): MqttServer {
  return awaitResult {
    this.listen(it)
  }
}

/**
 * Suspending version of method [io.vertx.mqtt.MqttServer.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.mqtt.MqttServer] using Vert.x codegen.
 */
suspend fun MqttServer.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

