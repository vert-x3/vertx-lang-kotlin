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
 * @param resultHandler handler called with the connection result
 * @returnthe current [io.vertx.ext.stomp.StompClient] *
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
 * @param resultHandler handler called with the connection result
 * @returnthe current [io.vertx.ext.stomp.StompClient] *
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
 * @param resultHandler handler called with the connection result
 * @returnthe current [io.vertx.ext.stomp.StompClient] *
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
 * @param resultHandler handler called with the connection result. A failure will be sent to the handler if a TCP level issue happen before the `CONNECTED` frame is received. Afterwards, the [io.vertx.ext.stomp.StompClient] is called.
 * @returnthe current [io.vertx.ext.stomp.StompClient] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompClient original] using Vert.x codegen.
 */
suspend fun StompClient.connectAwait() : StompClientConnection {
  return awaitResult{
    this.connect(it)
  }
}

