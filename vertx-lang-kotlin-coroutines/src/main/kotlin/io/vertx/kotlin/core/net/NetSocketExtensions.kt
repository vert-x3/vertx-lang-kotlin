package io.vertx.kotlin.core.net

import io.vertx.core.net.NetSocket
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Long
import kotlin.String

/**
 *  Same as [NetSocket.sendFile] but also takes a handler that will be called when the send has completed or
 *  a failure has occurred
 * @param filename  file name of the file to send
 * @return a reference to this, so the API can be used fluently
 */
suspend fun NetSocket.sendFileSuspending(filename: String) {
  awaitResult<Void?> { this.sendFile(filename, it) }
}

/**
 *  Same as [NetSocket.sendFile] but also takes a handler that will be called when the send has completed or
 *  a failure has occurred
 * @param filename  file name of the file to send
 * @param offset offset
 * @return a reference to this, so the API can be used fluently
 */
suspend fun NetSocket.sendFileSuspending(filename: String, offset: Long) {
  awaitResult<Void?> { this.sendFile(filename, offset, it) }
}

/**
 *  Same as [NetSocket.sendFile] but also takes a handler that will be called when the send has completed or
 *  a failure has occurred
 * @param filename  file name of the file to send
 * @param offset offset
 * @param length length
 * @return a reference to this, so the API can be used fluently
 */
suspend fun NetSocket.sendFileSuspending(
  filename: String,
  offset: Long,
  length: Long
) {
  awaitResult<Void?> { this.sendFile(filename, offset, length, it) }
}
