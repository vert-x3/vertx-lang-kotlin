package io.vertx.kotlin.core.datagram

import io.vertx.core.buffer.Buffer
import io.vertx.core.datagram.DatagramSocket
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.String

suspend fun DatagramSocket.send(
    packet: Buffer,
    port: Int,
    host: String
): DatagramSocket = awaitResult { this.send(packet, port, host, it) }

suspend fun DatagramSocket.send(
    str: String,
    port: Int,
    host: String
): DatagramSocket = awaitResult { this.send(str, port, host, it) }

suspend fun DatagramSocket.send(
    str: String,
    enc: String,
    port: Int,
    host: String
): DatagramSocket = awaitResult { this.send(str, enc, port, host, it) }

suspend fun DatagramSocket.close() {
  awaitResult<Void?> { this.close(it) }
}

suspend fun DatagramSocket.listenMulticastGroup(multicastAddress: String): DatagramSocket = awaitResult { this.listenMulticastGroup(multicastAddress, it) }

suspend fun DatagramSocket.listenMulticastGroup(
    multicastAddress: String,
    networkInterface: String,
    source: String?
): DatagramSocket = awaitResult { this.listenMulticastGroup(multicastAddress, networkInterface, source, it) }

suspend fun DatagramSocket.unlistenMulticastGroup(multicastAddress: String): DatagramSocket = awaitResult { this.unlistenMulticastGroup(multicastAddress, it) }

suspend fun DatagramSocket.unlistenMulticastGroup(
    multicastAddress: String,
    networkInterface: String,
    source: String?
): DatagramSocket = awaitResult { this.unlistenMulticastGroup(multicastAddress, networkInterface, source, it) }

suspend fun DatagramSocket.blockMulticastGroup(multicastAddress: String, sourceToBlock: String): DatagramSocket = awaitResult { this.blockMulticastGroup(multicastAddress, sourceToBlock, it) }

suspend fun DatagramSocket.blockMulticastGroup(
    multicastAddress: String,
    networkInterface: String,
    sourceToBlock: String
): DatagramSocket = awaitResult { this.blockMulticastGroup(multicastAddress, networkInterface, sourceToBlock, it) }

suspend fun DatagramSocket.listen(port: Int, host: String): DatagramSocket = awaitResult { this.listen(port, host, it) }
