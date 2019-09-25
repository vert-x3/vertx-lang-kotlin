/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
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
    this.pipeTo(dst, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.send]
 *
 * @param packet the [io.vertx.core.buffer.Buffer] to write
 * @param port the host port of the remote peer
 * @param host the host address of the remote peer
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.sendAwait(packet: Buffer, port: Int, host: String): Unit {
  return awaitResult {
    this.send(packet, port, host, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.send]
 *
 * @param str the [java.lang.String] to write
 * @param port the host port of the remote peer
 * @param host the host address of the remote peer
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.sendAwait(str: String, port: Int, host: String): Unit {
  return awaitResult {
    this.send(str, port, host, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.send]
 *
 * @param str the [java.lang.String] to write
 * @param enc the charset used for encoding
 * @param port the host port of the remote peer
 * @param host the host address of the remote peer
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.sendAwait(str: String, enc: String, port: Int, host: String): Unit {
  return awaitResult {
    this.send(str, enc, port, host, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.listenMulticastGroup]
 *
 * @param multicastAddress the address of the multicast group to join
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.listenMulticastGroupAwait(multicastAddress: String): Unit {
  return awaitResult {
    this.listenMulticastGroup(multicastAddress, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.listenMulticastGroup]
 *
 * @param multicastAddress the address of the multicast group to join
 * @param networkInterface the network interface on which to listen for packets.
 * @param source the address of the source for which we will listen for multicast packets
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.listenMulticastGroupAwait(multicastAddress: String, networkInterface: String, source: String?): Unit {
  return awaitResult {
    this.listenMulticastGroup(multicastAddress, networkInterface, source, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.unlistenMulticastGroup]
 *
 * @param multicastAddress the address of the multicast group to leave
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.unlistenMulticastGroupAwait(multicastAddress: String): Unit {
  return awaitResult {
    this.unlistenMulticastGroup(multicastAddress, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.unlistenMulticastGroup]
 *
 * @param multicastAddress the address of the multicast group to join
 * @param networkInterface the network interface on which to listen for packets.
 * @param source the address of the source for which we will listen for multicast packets
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.unlistenMulticastGroupAwait(multicastAddress: String, networkInterface: String, source: String?): Unit {
  return awaitResult {
    this.unlistenMulticastGroup(multicastAddress, networkInterface, source, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.blockMulticastGroup]
 *
 * @param multicastAddress the address for which you want to block the source address
 * @param sourceToBlock the source address which should be blocked. You will not receive an multicast packets for it anymore.
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.blockMulticastGroupAwait(multicastAddress: String, sourceToBlock: String): Unit {
  return awaitResult {
    this.blockMulticastGroup(multicastAddress, sourceToBlock, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.datagram.DatagramSocket.blockMulticastGroup]
 *
 * @param multicastAddress the address for which you want to block the source address
 * @param networkInterface the network interface on which the blocking should occur.
 * @param sourceToBlock the source address which should be blocked. You will not receive an multicast packets for it anymore.
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.datagram.DatagramSocket] using Vert.x codegen.
 */
suspend fun DatagramSocket.blockMulticastGroupAwait(multicastAddress: String, networkInterface: String, sourceToBlock: String): Unit {
  return awaitResult {
    this.blockMulticastGroup(multicastAddress, networkInterface, sourceToBlock, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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

