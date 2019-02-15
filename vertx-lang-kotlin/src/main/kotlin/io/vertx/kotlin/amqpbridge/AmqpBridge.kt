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
package io.vertx.kotlin.amqpbridge

import io.vertx.amqpbridge.AmqpBridge
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.amqpbridge.AmqpBridge.start]
 *
 * @param hostname the host name to connect to
 * @param port the port to connect to
 * @param username the username
 * @param password the password
 * @return [AmqpBridge]
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqpbridge.AmqpBridge] using Vert.x codegen.
 */
suspend fun AmqpBridge.startAwait(hostname: String, port: Int, username: String, password: String): AmqpBridge {
  return awaitResult {
    this.start(hostname, port, username, password, it)
  }
}

/**
 * Suspending version of method [io.vertx.amqpbridge.AmqpBridge.start]
 *
 * @param hostname the host name to connect to
 * @param port the port to connect to
 * @return [AmqpBridge]
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqpbridge.AmqpBridge] using Vert.x codegen.
 */
suspend fun AmqpBridge.startAwait(hostname: String, port: Int): AmqpBridge {
  return awaitResult {
    this.start(hostname, port, it)
  }
}

/**
 * Suspending version of method [io.vertx.amqpbridge.AmqpBridge.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqpbridge.AmqpBridge] using Vert.x codegen.
 */
suspend fun AmqpBridge.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

