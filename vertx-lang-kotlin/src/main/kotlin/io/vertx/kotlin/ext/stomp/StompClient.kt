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
package io.vertx.kotlin.ext.stomp

import io.vertx.core.net.NetClient
import io.vertx.ext.stomp.StompClient
import io.vertx.ext.stomp.StompClientConnection
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Connects to the server.
 *
 * @param port the server port
 * @param host the server host
 * @return the current [io.vertx.ext.stomp.StompClient] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClient original] using Vert.x codegen.
 */
suspend fun StompClient.connectAwait(port : Int, host : String) : StompClientConnection {
  return awaitResult{
    this.connect(port, host, it)
  }
}

/**
 * Connects to the server.
 *
 * @param net the NET client to use
 * @return the current [io.vertx.ext.stomp.StompClient] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClient original] using Vert.x codegen.
 */
suspend fun StompClient.connectAwait(net : NetClient) : StompClientConnection {
  return awaitResult{
    this.connect(net, it)
  }
}

/**
 * Connects to the server.
 *
 * @param port the server port
 * @param host the server host
 * @param net the NET client to use
 * @return the current [io.vertx.ext.stomp.StompClient] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClient original] using Vert.x codegen.
 */
suspend fun StompClient.connectAwait(port : Int, host : String, net : NetClient) : StompClientConnection {
  return awaitResult{
    this.connect(port, host, net, it)
  }
}

/**
 * Connects to the server using the host and port configured in the client's options.
 *
 * @return the current [io.vertx.ext.stomp.StompClient] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClient original] using Vert.x codegen.
 */
suspend fun StompClient.connectAwait() : StompClientConnection {
  return awaitResult{
    this.connect(it)
  }
}

