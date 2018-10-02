package io.vertx.kotlin.core.http

import io.vertx.core.http.HttpServer
import io.vertx.core.net.SocketAddress
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Like [io.vertx.core.http.HttpServer] but supplying a handler that will be called when the server is actually
 * listening (or has failed).
 *
 * @param port the port to listen on
 * @param host the host to listen on
 * @param listenHandler the listen handler
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServer original] using Vert.x codegen.
 */
suspend fun HttpServer.listenAwait(port : Int, host : String) : HttpServer {
  return awaitResult{
    this.listen(port, host, it)
  }
}

/**
 * Tell the server to start listening on the given address supplying
 * a handler that will be called when the server is actually
 * listening (or has failed).
 *
 * @param address the address to listen on
 * @param listenHandler the listen handler
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServer original] using Vert.x codegen.
 */
suspend fun HttpServer.listenAwait(address : SocketAddress) : HttpServer {
  return awaitResult{
    this.listen(address, it)
  }
}

/**
 * Like [io.vertx.core.http.HttpServer] but supplying a handler that will be called when the server is actually listening (or has failed).
 *
 * @param port the port to listen on
 * @param listenHandler the listen handler
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServer original] using Vert.x codegen.
 */
suspend fun HttpServer.listenAwait(port : Int) : HttpServer {
  return awaitResult{
    this.listen(port, it)
  }
}

/**
 * Like [io.vertx.core.http.HttpServer] but supplying a handler that will be called when the server is actually listening (or has failed).
 *
 * @param listenHandler the listen handler
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServer original] using Vert.x codegen.
 */
suspend fun HttpServer.listenAwait() : HttpServer {
  return awaitResult{
    this.listen(it)
  }
}

/**
 * Like [io.vertx.core.http.HttpServer] but supplying a handler that will be called when the server is actually closed (or has failed).
 *
 * @param completionHandler the handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpServer original] using Vert.x codegen.
 */
suspend fun HttpServer.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

