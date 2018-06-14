package io.vertx.kotlin.mqtt

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mqtt.MqttServer
import kotlin.Int
import kotlin.String

/**
 *  Start the server listening for incoming connections on the port and host specified
 *  It ignores any options specified through the constructor
 * @param port          the port to listen on
 * @param host          the host to listen on
 * @return a reference to this, so the API can be used fluently
 */
suspend fun MqttServer.listenSuspending(port: Int, host: String): MqttServer {
  return awaitResult { this.listen(port, host, it) }
}

/**
 *  Start the server listening for incoming connections on the port specified but on
 *  "0.0.0.0" as host. It ignores any options specified through the constructor
 * @param port          the port to listen on
 * @return a reference to this, so the API can be used fluently
 */
suspend fun MqttServer.listenSuspending(port: Int): MqttServer {
  return awaitResult { this.listen(port, it) }
}

/**
 *  Start the server listening for incoming connections using the specified options
 *  through the constructor
 * @return a reference to this, so the API can be used fluently
 */
suspend fun MqttServer.listenSuspending(): MqttServer {
  return awaitResult { this.listen(it) }
}

/**
 *  Close the server supplying an handler that will be called when the server is actually closed (or has failed). */
suspend fun MqttServer.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}
