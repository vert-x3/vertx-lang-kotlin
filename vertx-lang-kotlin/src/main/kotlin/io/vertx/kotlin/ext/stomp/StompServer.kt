package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.StompServer
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.stomp.StompServer.listen]
 *
 * @return [StompServer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompServer] using Vert.x codegen.
 */
suspend fun StompServer.listenAwait(): StompServer {
  return awaitResult {
    this.listen(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompServer.listen]
 *
 * @param port the port
 * @return [StompServer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompServer] using Vert.x codegen.
 */
suspend fun StompServer.listenAwait(port: Int): StompServer {
  return awaitResult {
    this.listen(port, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompServer.listen]
 *
 * @param port the port
 * @param host the host / interface
 * @return [StompServer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompServer] using Vert.x codegen.
 */
suspend fun StompServer.listenAwait(port: Int, host: String): StompServer {
  return awaitResult {
    this.listen(port, host, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.stomp.StompServer.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompServer] using Vert.x codegen.
 */
suspend fun StompServer.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

