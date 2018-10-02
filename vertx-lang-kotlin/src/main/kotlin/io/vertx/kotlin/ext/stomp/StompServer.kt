package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.StompServer
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Connects the STOMP server default port (61613) and network interface (<code>0.0.0.0</code>). Once the socket
 * it bounds calls the given handler with the result. The result may be a failure if the socket is already used.
 *
 * @param handler the handler to call with the result
 * @returnthe current [io.vertx.ext.stomp.StompServer] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServer original] using Vert.x codegen.
 */
suspend fun StompServer.listenAwait() : StompServer {
  return awaitResult{
    this.listen(it)
  }
}

/**
 * Connects the STOMP server to the given port. This method use the default host (<code>0.0.0.0</code>). Once the socket
 * it bounds calls the given handler with the result. The result may be a failure if the socket is already used.
 *
 * @param port the port
 * @param handler the handler to call with the result
 * @returnthe current [io.vertx.ext.stomp.StompServer] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServer original] using Vert.x codegen.
 */
suspend fun StompServer.listenAwait(port : Int) : StompServer {
  return awaitResult{
    this.listen(port, it)
  }
}

/**
 * Connects the STOMP server to the given port / interface. Once the socket it bounds calls the given handler with
 * the result. The result may be a failure if the socket is already used.
 *
 * @param port the port
 * @param host the host / interface
 * @param handler the handler to call with the result
 * @returnthe current [io.vertx.ext.stomp.StompServer] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServer original] using Vert.x codegen.
 */
suspend fun StompServer.listenAwait(port : Int, host : String) : StompServer {
  return awaitResult{
    this.listen(port, host, it)
  }
}

/**
 * Closes the server.
 *
 * @param completionHandler handler called once the server has been stopped
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServer original] using Vert.x codegen.
 */
suspend fun StompServer.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

