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
package io.vertx.kotlin.ext.web.handler.sockjs

import io.vertx.ext.web.handler.sockjs.SockJSBridgeOptions
import io.vertx.ext.bridge.PermittedOptions

/**
 * A function providing a DSL for building [io.vertx.ext.web.handler.sockjs.SockJSBridgeOptions] objects.
 *
 * Options for configuring the event bus bridge.
 *
 * @param inboundPermitteds  Sets the list of inbound permitted options.
 * @param outboundPermitteds  Sets the list of outbound permitted options.
 * @param maxAddressLength 
 * @param maxHandlersPerSocket 
 * @param pingTimeout 
 * @param replyTimeout 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.sockjs.SockJSBridgeOptions original] using Vert.x codegen.
 */
fun sockJSBridgeOptionsOf(
  inboundPermitteds: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null,
  outboundPermitteds: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null,
  maxAddressLength: Int? = null,
  maxHandlersPerSocket: Int? = null,
  pingTimeout: Long? = null,
  replyTimeout: Long? = null): SockJSBridgeOptions = io.vertx.ext.web.handler.sockjs.SockJSBridgeOptions().apply {

  if (inboundPermitteds != null) {
    this.setInboundPermitteds(inboundPermitteds.toList())
  }
  if (outboundPermitteds != null) {
    this.setOutboundPermitteds(outboundPermitteds.toList())
  }
  if (maxAddressLength != null) {
    this.setMaxAddressLength(maxAddressLength)
  }
  if (maxHandlersPerSocket != null) {
    this.setMaxHandlersPerSocket(maxHandlersPerSocket)
  }
  if (pingTimeout != null) {
    this.setPingTimeout(pingTimeout)
  }
  if (replyTimeout != null) {
    this.setReplyTimeout(replyTimeout)
  }
}

