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

import io.vertx.core.datagram.DatagramSocketOptions
import io.netty.handler.logging.ByteBufFormat

/**
 * A function providing a DSL for building [io.vertx.core.datagram.DatagramSocketOptions] objects.
 *
 * Options used to configure a datagram socket.
 *
 * @param reuseAddress  Set the value of reuse address
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param activityLogDataFormat  Set the value of Netty's logging handler's data format: Netty's pipeline is configured for logging on Netty's logger.
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param sendBufferSize  Set the TCP send buffer size
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param trafficClass  Set the value of traffic class
 * @param broadcast  Set if the socket can send or receive broadcast packets
 * @param loopbackModeDisabled  Set if loopback mode is disabled
 * @param multicastTimeToLive  Set the multicast ttl value
 * @param multicastNetworkInterface  Set the multicast network interface address
 * @param ipV6  Set if IP v6 should be used
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.datagram.DatagramSocketOptions original] using Vert.x codegen.
 */
fun datagramSocketOptionsOf(
  reuseAddress: Boolean? = null,
  logActivity: Boolean? = null,
  activityLogDataFormat: ByteBufFormat? = null,
  reusePort: Boolean? = null,
  sendBufferSize: Int? = null,
  receiveBufferSize: Int? = null,
  trafficClass: Int? = null,
  broadcast: Boolean? = null,
  loopbackModeDisabled: Boolean? = null,
  multicastTimeToLive: Int? = null,
  multicastNetworkInterface: String? = null,
  ipV6: Boolean? = null): DatagramSocketOptions = io.vertx.core.datagram.DatagramSocketOptions().apply {

  if (reuseAddress != null) {
    this.setReuseAddress(reuseAddress)
  }
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (activityLogDataFormat != null) {
    this.setActivityLogDataFormat(activityLogDataFormat)
  }
  if (reusePort != null) {
    this.setReusePort(reusePort)
  }
  if (sendBufferSize != null) {
    this.setSendBufferSize(sendBufferSize)
  }
  if (receiveBufferSize != null) {
    this.setReceiveBufferSize(receiveBufferSize)
  }
  if (trafficClass != null) {
    this.setTrafficClass(trafficClass)
  }
  if (broadcast != null) {
    this.setBroadcast(broadcast)
  }
  if (loopbackModeDisabled != null) {
    this.setLoopbackModeDisabled(loopbackModeDisabled)
  }
  if (multicastTimeToLive != null) {
    this.setMulticastTimeToLive(multicastTimeToLive)
  }
  if (multicastNetworkInterface != null) {
    this.setMulticastNetworkInterface(multicastNetworkInterface)
  }
  if (ipV6 != null) {
    this.setIpV6(ipV6)
  }
}

