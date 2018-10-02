package io.vertx.kotlin.core.net

import io.vertx.core.net.NetServer
import io.vertx.core.net.SocketAddress
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Like [io.vertx.core.net.NetServer] but providing a handler that will be notified when the server is listening, or fails.
 *
 * @param listenHandler handler that will be notified when listening or failed
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetServer original] using Vert.x codegen.
 */
suspend fun NetServer.listenAwait() : NetServer {
  return awaitResult{
    this.listen(it)
  }
}

/**
 * Like [io.vertx.core.net.NetServer] but providing a handler that will be notified when the server is listening, or fails.
 *
 * @param port the port to listen on
 * @param host the host to listen on
 * @param listenHandler handler that will be notified when listening or failed
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetServer original] using Vert.x codegen.
 */
suspend fun NetServer.listenAwait(port : Int, host : String) : NetServer {
  return awaitResult{
    this.listen(port, host, it)
  }
}

/**
 * Like [io.vertx.core.net.NetServer] but providing a handler that will be notified when the server is listening, or fails.
 *
 * @param port the port to listen on
 * @param listenHandler handler that will be notified when listening or failed
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetServer original] using Vert.x codegen.
 */
suspend fun NetServer.listenAwait(port : Int) : NetServer {
  return awaitResult{
    this.listen(port, it)
  }
}

/**
 * Like [io.vertx.core.net.NetServer] but providing a handler that will be notified when the server is listening, or fails.
 *
 * @param localAddress the local address to listen on
 * @param listenHandler handler that will be notified when listening or failed
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetServer original] using Vert.x codegen.
 */
suspend fun NetServer.listenAwait(localAddress : SocketAddress) : NetServer {
  return awaitResult{
    this.listen(localAddress, it)
  }
}

/**
 * Like [io.vertx.core.net.NetServer] but supplying a handler that will be notified when close is complete.
 *
 * @param completionHandler the handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetServer original] using Vert.x codegen.
 */
suspend fun NetServer.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

