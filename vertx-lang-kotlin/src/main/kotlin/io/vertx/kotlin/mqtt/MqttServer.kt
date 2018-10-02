package io.vertx.kotlin.mqtt

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mqtt.MqttServer

/**
 * Start the server listening for incoming connections on the port and host specified
 * It ignores any options specified through the constructor
 *
 * @param port the port to listen on
 * @param host the host to listen on
 * @param listenHandler handler called when the asynchronous listen call ends
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttServer original] using Vert.x codegen.
 */
suspend fun MqttServer.listenAwait(port : Int, host : String) : MqttServer {
  return awaitResult{
    this.listen(port, host, it)
  }
}

/**
 * Start the server listening for incoming connections on the port specified but on
 * "0.0.0.0" as host. It ignores any options specified through the constructor
 *
 * @param port the port to listen on
 * @param listenHandler handler called when the asynchronous listen call ends
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttServer original] using Vert.x codegen.
 */
suspend fun MqttServer.listenAwait(port : Int) : MqttServer {
  return awaitResult{
    this.listen(port, it)
  }
}

/**
 * Start the server listening for incoming connections using the specified options
 * through the constructor
 *
 * @param listenHandler handler called when the asynchronous listen call ends
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttServer original] using Vert.x codegen.
 */
suspend fun MqttServer.listenAwait() : MqttServer {
  return awaitResult{
    this.listen(it)
  }
}

/**
 * Close the server supplying an handler that will be called when the server is actually closed (or has failed).
 *
 * @param completionHandler the handler called on completion
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttServer original] using Vert.x codegen.
 */
suspend fun MqttServer.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

