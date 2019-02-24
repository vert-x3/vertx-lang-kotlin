package io.vertx.kotlin.ext.web.handler.sockjs

import io.vertx.core.buffer.Buffer
import io.vertx.core.streams.WriteStream
import io.vertx.ext.web.handler.sockjs.SockJSSocket
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.web.handler.sockjs.SockJSSocket.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.handler.sockjs.SockJSSocket] using Vert.x codegen.
 */
suspend fun SockJSSocket.pipeToAwait(dst: WriteStream<Buffer>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

