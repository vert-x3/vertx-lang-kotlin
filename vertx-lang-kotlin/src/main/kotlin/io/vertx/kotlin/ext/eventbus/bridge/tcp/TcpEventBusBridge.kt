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

