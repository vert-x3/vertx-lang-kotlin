package io.vertx.kotlin.core.net

import io.vertx.core.buffer.Buffer
import io.vertx.core.net.NetSocket
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Pipe this <code>ReadStream</code> to the <code>WriteStream</code>.
 * <p>
 * Elements emitted by this stream will be written to the write stream until this stream ends or fails.
 * <p>
 * Once this stream has ended or failed, the write stream will be ended and the <code>handler</code> will be
 * called with the result.
 *
 * @param dst the destination write stream
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetSocket original] using Vert.x codegen.
 */
suspend fun NetSocket.pipeToAwait(dst : WriteStream<Buffer>) : Unit {
  return awaitResult{
    this.pipeTo(dst, { ar -> it.handle(ar.mapEmpty()) })}
}

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

