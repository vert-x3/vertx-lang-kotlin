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
@Deprecated(message = "Instead use listen returning a future that can yield a result ", replaceWith = ReplaceWith("listen(port, host).await()"))
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
@Deprecated(message = "Instead use listen returning a future that can yield a result ", replaceWith = ReplaceWith("listen(port).await()"))
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
@Deprecated(message = "Instead use listen returning a future that can yield a result ", replaceWith = ReplaceWith("listen().await()"))
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
@Deprecated(message = "Instead use close returning a future that can yield a result ", replaceWith = ReplaceWith("close().await()"))
suspend fun MqttServer.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

