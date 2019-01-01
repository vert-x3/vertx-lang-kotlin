package io.vertx.kotlin.ext.eventbus.bridge.tcp

import io.vertx.ext.eventbus.bridge.tcp.TcpEventBusBridge
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Listen on default port 7000 with a handler to report the state of the socket listen operation.
 *
 * @param handler the result handler
 * @returnself *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.eventbus.bridge.tcp.TcpEventBusBridge original] using Vert.x codegen.
 */
suspend fun TcpEventBusBridge.listenAwait() : TcpEventBusBridge {
  return awaitResult{
    this.listen(it)
  }
}

/**
 * Listen on specific port and bind to specific address
 *
 * @param port tcp port
 * @param address tcp address to the bind
 * @param handler the result handler
 * @returnself *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.eventbus.bridge.tcp.TcpEventBusBridge original] using Vert.x codegen.
 */
suspend fun TcpEventBusBridge.listenAwait(port : Int, address : String) : TcpEventBusBridge {
  return awaitResult{
    this.listen(port, address, it)
  }
}

/**
 * Listen on specific port
 *
 * @param port tcp port
 * @param handler the result handler
 * @returnself *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.eventbus.bridge.tcp.TcpEventBusBridge original] using Vert.x codegen.
 */
suspend fun TcpEventBusBridge.listenAwait(port : Int) : TcpEventBusBridge {
  return awaitResult{
    this.listen(port, it)
  }
}

/**
 * Close the current socket.
 *
 * @param handler the result handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.eventbus.bridge.tcp.TcpEventBusBridge original] using Vert.x codegen.
 */
suspend fun TcpEventBusBridge.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

