package io.vertx.kotlin.core.datagram

import io.vertx.core.buffer.Buffer
import io.vertx.core.datagram.DatagramSocket
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Write the given [io.vertx.core.buffer.Buffer] to the [io.vertx.core.net.SocketAddress].
 * The [io.vertx.core.Handler] will be notified once the write completes.
 *
 * @param packet the [io.vertx.core.buffer.Buffer] to write
 * @param port the host port of the remote peer
 * @param host the host address of the remote peer
 * @param handler the [io.vertx.core.Handler] to notify once the write completes.
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.datagram.DatagramSocket original] using Vert.x codegen.
 */
suspend fun DatagramSocket.sendAwait(packet : Buffer, port : Int, host : String) : DatagramSocket {
  return awaitResult{
    this.send(packet, port, host, it)
  }
}

/**
 * Write the given [java.lang.String] to the [io.vertx.core.net.SocketAddress] using UTF8 encoding.
 * The  will be notified once the write completes.
 *
 * @param str the [java.lang.String] to write
 * @param port the host port of the remote peer
 * @param host the host address of the remote peer
 * @param handler the [io.vertx.core.Handler] to notify once the write completes.
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.datagram.DatagramSocket original] using Vert.x codegen.
 */
suspend fun DatagramSocket.sendAwait(str : String, port : Int, host : String) : DatagramSocket {
  return awaitResult{
    this.send(str, port, host, it)
  }
}

/**
 * Write the given [java.lang.String] to the [io.vertx.core.net.SocketAddress] using the given encoding.
 * The  will be notified once the write completes.
 *
 * @param str the [java.lang.String] to write
 * @param enc the charset used for encoding
 * @param port the host port of the remote peer
 * @param host the host address of the remote peer
 * @param handler the [io.vertx.core.Handler] to notify once the write completes.
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.datagram.DatagramSocket original] using Vert.x codegen.
 */
suspend fun DatagramSocket.sendAwait(str : String, enc : String, port : Int, host : String) : DatagramSocket {
  return awaitResult{
    this.send(str, enc, port, host, it)
  }
}

/**
 * Closes the [io.vertx.core.datagram.DatagramSocket] implementation asynchronous
 * and notifies the handler once done.
 *
 * @param handler the handler to notify once complete
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.datagram.DatagramSocket original] using Vert.x codegen.
 */
suspend fun DatagramSocket.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Joins a multicast group and listens for packets send to it.
 * The  is notified once the operation completes.
 *
 * @param multicastAddress the address of the multicast group to join
 * @param handler then handler to notify once the operation completes
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.datagram.DatagramSocket original] using Vert.x codegen.
 */
suspend fun DatagramSocket.listenMulticastGroupAwait(multicastAddress : String) : DatagramSocket {
  return awaitResult{
    this.listenMulticastGroup(multicastAddress, it)
  }
}

/**
 * Joins a multicast group and listens for packets send to it on the given network interface.
 * The  is notified once the operation completes.
 *
 * @param multicastAddress the address of the multicast group to join
 * @param networkInterface the network interface on which to listen for packets.
 * @param source the address of the source for which we will listen for multicast packets
 * @param handler then handler to notify once the operation completes
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.datagram.DatagramSocket original] using Vert.x codegen.
 */
suspend fun DatagramSocket.listenMulticastGroupAwait(multicastAddress : String, networkInterface : String, source : String) : DatagramSocket {
  return awaitResult{
    this.listenMulticastGroup(multicastAddress, networkInterface, source, it)
  }
}

/**
 * Leaves a multicast group and stops listening for packets send to it.
 * The  is notified once the operation completes.
 *
 * @param multicastAddress the address of the multicast group to leave
 * @param handler then handler to notify once the operation completes
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.datagram.DatagramSocket original] using Vert.x codegen.
 */
suspend fun DatagramSocket.unlistenMulticastGroupAwait(multicastAddress : String) : DatagramSocket {
  return awaitResult{
    this.unlistenMulticastGroup(multicastAddress, it)
  }
}

/**
 * Leaves a multicast group and stops listening for packets send to it on the given network interface.
 * The  is notified once the operation completes.
 *
 * @param multicastAddress the address of the multicast group to join
 * @param networkInterface the network interface on which to listen for packets.
 * @param source the address of the source for which we will listen for multicast packets
 * @param handler the handler to notify once the operation completes
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.datagram.DatagramSocket original] using Vert.x codegen.
 */
suspend fun DatagramSocket.unlistenMulticastGroupAwait(multicastAddress : String, networkInterface : String, source : String) : DatagramSocket {
  return awaitResult{
    this.unlistenMulticastGroup(multicastAddress, networkInterface, source, it)
  }
}

/**
 * Block the given address for the given multicast address and notifies the  once
 * the operation completes.
 *
 * @param multicastAddress the address for which you want to block the source address
 * @param sourceToBlock the source address which should be blocked. You will not receive an multicast packets for it anymore.
 * @param handler the handler to notify once the operation completes
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.datagram.DatagramSocket original] using Vert.x codegen.
 */
suspend fun DatagramSocket.blockMulticastGroupAwait(multicastAddress : String, sourceToBlock : String) : DatagramSocket {
  return awaitResult{
    this.blockMulticastGroup(multicastAddress, sourceToBlock, it)
  }
}

/**
 * Block the given address for the given multicast address on the given network interface and notifies
 * the  once the operation completes.
 *
 * @param multicastAddress the address for which you want to block the source address
 * @param networkInterface the network interface on which the blocking should occur.
 * @param sourceToBlock the source address which should be blocked. You will not receive an multicast packets for it anymore.
 * @param handler the handler to notify once the operation completes
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.datagram.DatagramSocket original] using Vert.x codegen.
 */
suspend fun DatagramSocket.blockMulticastGroupAwait(multicastAddress : String, networkInterface : String, sourceToBlock : String) : DatagramSocket {
  return awaitResult{
    this.blockMulticastGroup(multicastAddress, networkInterface, sourceToBlock, it)
  }
}

/**
 * Start listening on the given port and host. The handler will be called when the socket is listening.
 *
 * @param port the port to listen on
 * @param host the host to listen on
 * @param handler the handler will be called when listening
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.datagram.DatagramSocket original] using Vert.x codegen.
 */
suspend fun DatagramSocket.listenAwait(port : Int, host : String) : DatagramSocket {
  return awaitResult{
    this.listen(port, host, it)
  }
}

