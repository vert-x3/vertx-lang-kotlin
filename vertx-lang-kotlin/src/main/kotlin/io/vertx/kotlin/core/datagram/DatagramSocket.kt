package io.vertx.kotlin.core.datagram

import io.vertx.core.buffer.Buffer
import io.vertx.core.datagram.DatagramPacket
import io.vertx.core.datagram.DatagramSocket
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.pipeToAwait(dst: WriteStream<DatagramPacket>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.send]
 *
 * @param packet the [io.vertx.core.buffer.Buffer] to write
 * @param port the host port of the remote peer
 * @param host the host address of the remote peer
 * @return [DatagramSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.sendAwait(packet: Buffer, port: Int, host: String): DatagramSocket {
  return awaitResult {
    this.send(packet, port, host, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.send]
 *
 * @param str the [java.lang.String] to write
 * @param port the host port of the remote peer
 * @param host the host address of the remote peer
 * @return [DatagramSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.sendAwait(str: String, port: Int, host: String): DatagramSocket {
  return awaitResult {
    this.send(str, port, host, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.send]
 *
 * @param str the [java.lang.String] to write
 * @param enc the charset used for encoding
 * @param port the host port of the remote peer
 * @param host the host address of the remote peer
 * @return [DatagramSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.sendAwait(str: String, enc: String, port: Int, host: String): DatagramSocket {
  return awaitResult {
    this.send(str, enc, port, host, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.listenMulticastGroup]
 *
 * @param multicastAddress the address of the multicast group to join
 * @return [DatagramSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.listenMulticastGroupAwait(multicastAddress: String): DatagramSocket {
  return awaitResult {
    this.listenMulticastGroup(multicastAddress, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.listenMulticastGroup]
 *
 * @param multicastAddress the address of the multicast group to join
 * @param networkInterface the network interface on which to listen for packets.
 * @param source the address of the source for which we will listen for multicast packets
 * @return [DatagramSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.listenMulticastGroupAwait(multicastAddress: String, networkInterface: String, source: String): DatagramSocket {
  return awaitResult {
    this.listenMulticastGroup(multicastAddress, networkInterface, source, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.unlistenMulticastGroup]
 *
 * @param multicastAddress the address of the multicast group to leave
 * @return [DatagramSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.unlistenMulticastGroupAwait(multicastAddress: String): DatagramSocket {
  return awaitResult {
    this.unlistenMulticastGroup(multicastAddress, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.unlistenMulticastGroup]
 *
 * @param multicastAddress the address of the multicast group to join
 * @param networkInterface the network interface on which to listen for packets.
 * @param source the address of the source for which we will listen for multicast packets
 * @return [DatagramSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.unlistenMulticastGroupAwait(multicastAddress: String, networkInterface: String, source: String): DatagramSocket {
  return awaitResult {
    this.unlistenMulticastGroup(multicastAddress, networkInterface, source, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.blockMulticastGroup]
 *
 * @param multicastAddress the address for which you want to block the source address
 * @param sourceToBlock the source address which should be blocked. You will not receive an multicast packets for it anymore.
 * @return [DatagramSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.blockMulticastGroupAwait(multicastAddress: String, sourceToBlock: String): DatagramSocket {
  return awaitResult {
    this.blockMulticastGroup(multicastAddress, sourceToBlock, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.blockMulticastGroup]
 *
 * @param multicastAddress the address for which you want to block the source address
 * @param networkInterface the network interface on which the blocking should occur.
 * @param sourceToBlock the source address which should be blocked. You will not receive an multicast packets for it anymore.
 * @return [DatagramSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.blockMulticastGroupAwait(multicastAddress: String, networkInterface: String, sourceToBlock: String): DatagramSocket {
  return awaitResult {
    this.blockMulticastGroup(multicastAddress, networkInterface, sourceToBlock, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.listen]
 *
 * @param port the port to listen on
 * @param host the host to listen on
 * @return [DatagramSocket]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.listenAwait(port: Int, host: String): DatagramSocket {
  return awaitResult {
    this.listen(port, host, it)
  }
}

