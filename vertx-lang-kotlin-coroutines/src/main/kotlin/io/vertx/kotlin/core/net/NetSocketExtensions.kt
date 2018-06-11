package io.vertx.kotlin.core.net

import io.vertx.core.net.NetSocket
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Long
import kotlin.String

suspend fun NetSocket.sendFile(filename: String) {
  awaitResult<Void?> { this.sendFile(filename, it) }
}

suspend fun NetSocket.sendFile(filename: String, offset: Long) {
  awaitResult<Void?> { this.sendFile(filename, offset, it) }
}

suspend fun NetSocket.sendFile(
  filename: String,
  offset: Long,
  length: Long
) {
  awaitResult<Void?> { this.sendFile(filename, offset, length, it) }
}
