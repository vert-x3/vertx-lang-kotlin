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
 * @param activityLogDataFormat  Set the value of Netty's logging handler's data format: Netty's pipeline is configured for logging on Netty's logger.
 * @param broadcast  Set if the socket can send or receive broadcast packets
 * @param ipV6  Set if IP v6 should be used
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param loopbackModeDisabled  Set if loopback mode is disabled
 * @param multicastNetworkInterface  Set the multicast network interface address
 * @param multicastTimeToLive  Set the multicast ttl value
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param sendBufferSize  Set the TCP send buffer size
 * @param trafficClass  Set the value of traffic class
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.datagram.DatagramSocketOptions original] using Vert.x codegen.
 */
fun datagramSocketOptionsOf(
  activityLogDataFormat: ByteBufFormat? = null,
  broadcast: Boolean? = null,
  ipV6: Boolean? = null,
  logActivity: Boolean? = null,
  loopbackModeDisabled: Boolean? = null,
  multicastNetworkInterface: String? = null,
  multicastTimeToLive: Int? = null,
  receiveBufferSize: Int? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  sendBufferSize: Int? = null,
  trafficClass: Int? = null): DatagramSocketOptions = io.vertx.core.datagram.DatagramSocketOptions().apply {

  if (activityLogDataFormat != null) {
    this.setActivityLogDataFormat(activityLogDataFormat)
  }
  if (broadcast != null) {
    this.setBroadcast(broadcast)
  }
  if (ipV6 != null) {
    this.setIpV6(ipV6)
  }
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (loopbackModeDisabled != null) {
    this.setLoopbackModeDisabled(loopbackModeDisabled)
  }
  if (multicastNetworkInterface != null) {
    this.setMulticastNetworkInterface(multicastNetworkInterface)
  }
  if (multicastTimeToLive != null) {
    this.setMulticastTimeToLive(multicastTimeToLive)
  }
  if (receiveBufferSize != null) {
    this.setReceiveBufferSize(receiveBufferSize)
  }
  if (reuseAddress != null) {
    this.setReuseAddress(reuseAddress)
  }
  if (reusePort != null) {
    this.setReusePort(reusePort)
  }
  if (sendBufferSize != null) {
    this.setSendBufferSize(sendBufferSize)
  }
  if (trafficClass != null) {
    this.setTrafficClass(trafficClass)
  }
}

