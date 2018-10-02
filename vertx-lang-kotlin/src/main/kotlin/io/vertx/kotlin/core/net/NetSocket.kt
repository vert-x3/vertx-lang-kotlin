package io.vertx.kotlin.core.net

import io.vertx.core.net.NetSocket
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Same as [io.vertx.core.net.NetSocket] but also takes a handler that will be called when the send has completed or
 * a failure has occurred
 *
 * @param filename file name of the file to send
 * @param resultHandler handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetSocket original] using Vert.x codegen.
 */
suspend fun NetSocket.sendFileAwait(filename : String) : Unit {
  return awaitResult{
    this.sendFile(filename, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Same as [io.vertx.core.net.NetSocket] but also takes a handler that will be called when the send has completed or
 * a failure has occurred
 *
 * @param filename file name of the file to send
 * @param offset offset
 * @param resultHandler handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetSocket original] using Vert.x codegen.
 */
suspend fun NetSocket.sendFileAwait(filename : String, offset : Long) : Unit {
  return awaitResult{
    this.sendFile(filename, offset, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Same as [io.vertx.core.net.NetSocket] but also takes a handler that will be called when the send has completed or
 * a failure has occurred
 *
 * @param filename file name of the file to send
 * @param offset offset
 * @param length length
 * @param resultHandler handler
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetSocket original] using Vert.x codegen.
 */
suspend fun NetSocket.sendFileAwait(filename : String, offset : Long, length : Long) : Unit {
  return awaitResult{
    this.sendFile(filename, offset, length, { ar -> it.handle(ar.mapEmpty()) })}
}

