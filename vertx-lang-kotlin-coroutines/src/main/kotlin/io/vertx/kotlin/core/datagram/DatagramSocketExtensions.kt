package io.vertx.kotlin.core.datagram

import io.vertx.core.buffer.Buffer
import io.vertx.core.datagram.DatagramSocket
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.String

/**
 *  Write the given [io.vertx.core.buffer.Buffer] to the [io.vertx.core.net.SocketAddress].
 *  The [io.vertx.core.Handler] will be notified once the write completes.
 * @param packet  the [io.vertx.core.buffer.Buffer] to write
 * @param port  the host port of the remote peer
 * @param host  the host address of the remote peer
 * @return a reference to this, so the API can be used fluently
 */
suspend fun DatagramSocket.send(
  packet: Buffer,
  port: Int,
  host: String
): DatagramSocket {
  return awaitResult { this.send(packet, port, host, it) }
}

/**
 *  Write the given [String] to the [io.vertx.core.net.SocketAddress] using UTF8 encoding.
 *  The [Handler] will be notified once the write completes.
 * @param str   the [String] to write
 * @param port  the host port of the remote peer
 * @param host  the host address of the remote peer
 * @return a reference to this, so the API can be used fluently
 */
suspend fun DatagramSocket.send(
  str: String,
  port: Int,
  host: String
): DatagramSocket {
  return awaitResult { this.send(str, port, host, it) }
}

/**
 *  Write the given [String] to the [io.vertx.core.net.SocketAddress] using the given encoding.
 *  The [Handler] will be notified once the write completes.
 * @param str  the [String] to write
 * @param enc  the charset used for encoding
 * @param port  the host port of the remote peer
 * @param host  the host address of the remote peer
 * @return a reference to this, so the API can be used fluently
 */
suspend fun DatagramSocket.send(
  str: String,
  enc: String,
  port: Int,
  host: String
): DatagramSocket {
  return awaitResult { this.send(str, enc, port, host, it) }
}

/**
 *  Closes the [io.vertx.core.datagram.DatagramSocket] implementation asynchronous
 *  and notifies the handler once done. */
suspend fun DatagramSocket.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}

/**
 *  Joins a multicast group and listens for packets send to it.
 *  The [Handler] is notified once the operation completes.
 * @param multicastAddress  the address of the multicast group to join
 * @param  handler  then handler to notify once the operation completes
 * @return a reference to this, so the API can be used fluently
 */
suspend fun DatagramSocket.listenMulticastGroup(multicastAddress: String): DatagramSocket {
  return awaitResult { this.listenMulticastGroup(multicastAddress, it) }
}

/**
 *  Joins a multicast group and listens for packets send to it on the given network interface.
 *  The [Handler] is notified once the operation completes.
 * @param  multicastAddress  the address of the multicast group to join
 * @param  networkInterface  the network interface on which to listen for packets.
 * @param  source  the address of the source for which we will listen for multicast packets
 * @param  handler  then handler to notify once the operation completes
 * @return a reference to this, so the API can be used fluently
 */
suspend fun DatagramSocket.listenMulticastGroup(
  multicastAddress: String,
  networkInterface: String,
  source: String?
): DatagramSocket {
  return awaitResult { this.listenMulticastGroup(multicastAddress, networkInterface, source, it) }
}

/**
 *  Leaves a multicast group and stops listening for packets send to it.
 *  The [Handler] is notified once the operation completes.
 * @param multicastAddress  the address of the multicast group to leave
 * @return a reference to this, so the API can be used fluently
 */
suspend fun DatagramSocket.unlistenMulticastGroup(multicastAddress: String): DatagramSocket {
  return awaitResult { this.unlistenMulticastGroup(multicastAddress, it) }
}

/**
 *  Leaves a multicast group and stops listening for packets send to it on the given network interface.
 *  The [Handler] is notified once the operation completes.
 * @param  multicastAddress  the address of the multicast group to join
 * @param  networkInterface  the network interface on which to listen for packets.
 * @param  source  the address of the source for which we will listen for multicast packets
 * @param  handler the handler to notify once the operation completes
 * @return  a reference to this, so the API can be used fluently
 */
suspend fun DatagramSocket.unlistenMulticastGroup(
  multicastAddress: String,
  networkInterface: String,
  source: String?
): DatagramSocket {
  return awaitResult { this.unlistenMulticastGroup(multicastAddress, networkInterface, source, it) }
}

/**
 *  Block the given address for the given multicast address and notifies the [Handler] once
 *  the operation completes.
 * @param multicastAddress  the address for which you want to block the source address
 * @param sourceToBlock  the source address which should be blocked. You will not receive an multicast packets
 *                        for it anymore.
 * @return  a reference to this, so the API can be used fluently
 */
suspend fun DatagramSocket.blockMulticastGroup(multicastAddress: String, sourceToBlock: String): DatagramSocket {
  return awaitResult { this.blockMulticastGroup(multicastAddress, sourceToBlock, it) }
}

/**
 *  Block the given address for the given multicast address on the given network interface and notifies
 *  the [Handler] once the operation completes.
 * @param  multicastAddress  the address for which you want to block the source address
 * @param  networkInterface  the network interface on which the blocking should occur.
 * @param  sourceToBlock  the source address which should be blocked. You will not receive an multicast packets
 *                         for it anymore.
 * @param  handler  the handler to notify once the operation completes
 * @return  a reference to this, so the API can be used fluently
 */
suspend fun DatagramSocket.blockMulticastGroup(
  multicastAddress: String,
  networkInterface: String,
  sourceToBlock: String
): DatagramSocket {
  return awaitResult { this.blockMulticastGroup(multicastAddress, networkInterface, sourceToBlock, it) }
}

/**
 *  Start listening on the given port and host. The handler will be called when the socket is listening.
 * @param port  the port to listen on
 * @param host  the host to listen on
 * @return  a reference to this, so the API can be used fluently
 */
suspend fun DatagramSocket.listen(port: Int, host: String): DatagramSocket {
  return awaitResult { this.listen(port, host, it) }
}
