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
 * Listen on default port 7000 with a handler to report the state of the socket listen operation.
 *
 * @return self *
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
 * @return self *
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
 * @return self *
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
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.eventbus.bridge.tcp.TcpEventBusBridge original] using Vert.x codegen.
 */
suspend fun TcpEventBusBridge.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

