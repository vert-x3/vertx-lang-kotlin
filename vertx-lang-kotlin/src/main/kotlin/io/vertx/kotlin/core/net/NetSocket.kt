package io.vertx.kotlin.core.net

import io.vertx.core.buffer.Buffer
import io.vertx.core.net.NetSocket
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Like  but with an <code>handler</code> called when the message has been written
 * or failed to be written.
 *
 * @param message 
 * @return  *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetSocket original] using Vert.x codegen.
 */
suspend fun NetSocket.writeAwait(message : Buffer) : Unit {
  return awaitResult{
    this.write(message, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Same as [io.vertx.core.net.NetSocket] but also takes a handler that will be called when the send has completed or
 * a failure has occurred
 *
 * @param filename file name of the file to send
 * @return a reference to this, so the API can be used fluently *
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
 * @return a reference to this, so the API can be used fluently *
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
 * @return a reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetSocket original] using Vert.x codegen.
 */
suspend fun NetSocket.sendFileAwait(filename : String, offset : Long, length : Long) : Unit {
  return awaitResult{
    this.sendFile(filename, offset, length, { ar -> it.handle(ar.mapEmpty()) })}
}

