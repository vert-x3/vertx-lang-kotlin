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
package io.vertx.kotlin.ext.eventbus.bridge.tcp

import io.vertx.ext.eventbus.bridge.tcp.TcpEventBusBridge
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.eventbus.bridge.tcp.TcpEventBusBridge.listen]
 *
 * @return [TcpEventBusBridge]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.eventbus.bridge.tcp.TcpEventBusBridge] using Vert.x codegen.
 */
suspend fun TcpEventBusBridge.listenAwait(): TcpEventBusBridge {
  return awaitResult {
    this.listen(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.eventbus.bridge.tcp.TcpEventBusBridge.listen]
 *
 * @param port tcp port
 * @param address tcp address to the bind
 * @return [TcpEventBusBridge]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.eventbus.bridge.tcp.TcpEventBusBridge] using Vert.x codegen.
 */
suspend fun TcpEventBusBridge.listenAwait(port: Int, address: String): TcpEventBusBridge {
  return awaitResult {
    this.listen(port, address, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.eventbus.bridge.tcp.TcpEventBusBridge.listen]
 *
 * @param port tcp port
 * @return [TcpEventBusBridge]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.eventbus.bridge.tcp.TcpEventBusBridge] using Vert.x codegen.
 */
suspend fun TcpEventBusBridge.listenAwait(port: Int): TcpEventBusBridge {
  return awaitResult {
    this.listen(port, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.eventbus.bridge.tcp.TcpEventBusBridge.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.eventbus.bridge.tcp.TcpEventBusBridge] using Vert.x codegen.
 */
suspend fun TcpEventBusBridge.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

