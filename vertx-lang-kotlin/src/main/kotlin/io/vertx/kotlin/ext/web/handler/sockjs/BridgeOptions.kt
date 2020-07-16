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

import io.vertx.ext.web.handler.sockjs.BridgeOptions
import io.vertx.ext.bridge.PermittedOptions

/**
 * A function providing a DSL for building [io.vertx.ext.web.handler.sockjs.BridgeOptions] objects.
 *
 * Deprecated: use [io.vertx.ext.web.handler.sockjs.SockJSBridgeOptions] instead.
 *
 * @param inboundPermitted 
 * @param inboundPermitteds 
 * @param maxAddressLength 
 * @param maxHandlersPerSocket 
 * @param outboundPermitted 
 * @param outboundPermitteds 
 * @param pingTimeout 
 * @param replyTimeout 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.sockjs.BridgeOptions original] using Vert.x codegen.
 */
fun bridgeOptionsOf(
  inboundPermitted: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null,
  inboundPermitteds: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null,
  maxAddressLength: Int? = null,
  maxHandlersPerSocket: Int? = null,
  outboundPermitted: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null,
  outboundPermitteds: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null,
  pingTimeout: Long? = null,
  replyTimeout: Long? = null): BridgeOptions = io.vertx.ext.web.handler.sockjs.BridgeOptions().apply {

  if (inboundPermitted != null) {
    this.setInboundPermitted(inboundPermitted.toList())
  }
  if (inboundPermitteds != null) {
    for (item in inboundPermitteds) {
      this.addInboundPermitted(item)
    }
  }
  if (maxAddressLength != null) {
    this.setMaxAddressLength(maxAddressLength)
  }
  if (maxHandlersPerSocket != null) {
    this.setMaxHandlersPerSocket(maxHandlersPerSocket)
  }
  if (outboundPermitted != null) {
    this.setOutboundPermitted(outboundPermitted.toList())
  }
  if (outboundPermitteds != null) {
    for (item in outboundPermitteds) {
      this.addOutboundPermitted(item)
    }
  }
  if (pingTimeout != null) {
    this.setPingTimeout(pingTimeout)
  }
  if (replyTimeout != null) {
    this.setReplyTimeout(replyTimeout)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.web.handler.sockjs.BridgeOptions] objects.
 *
 * Deprecated: use [io.vertx.ext.web.handler.sockjs.SockJSBridgeOptions] instead.
 *
 * @param inboundPermitted 
 * @param inboundPermitteds 
 * @param maxAddressLength 
 * @param maxHandlersPerSocket 
 * @param outboundPermitted 
 * @param outboundPermitteds 
 * @param pingTimeout 
 * @param replyTimeout 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.sockjs.BridgeOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("bridgeOptionsOf(inboundPermitted, inboundPermitteds, maxAddressLength, maxHandlersPerSocket, outboundPermitted, outboundPermitteds, pingTimeout, replyTimeout)")
)
fun BridgeOptions(
  inboundPermitted: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null,
  inboundPermitteds: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null,
  maxAddressLength: Int? = null,
  maxHandlersPerSocket: Int? = null,
  outboundPermitted: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null,
  outboundPermitteds: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null,
  pingTimeout: Long? = null,
  replyTimeout: Long? = null): BridgeOptions = io.vertx.ext.web.handler.sockjs.BridgeOptions().apply {

  if (inboundPermitted != null) {
    this.setInboundPermitted(inboundPermitted.toList())
  }
  if (inboundPermitteds != null) {
    for (item in inboundPermitteds) {
      this.addInboundPermitted(item)
    }
  }
  if (maxAddressLength != null) {
    this.setMaxAddressLength(maxAddressLength)
  }
  if (maxHandlersPerSocket != null) {
    this.setMaxHandlersPerSocket(maxHandlersPerSocket)
  }
  if (outboundPermitted != null) {
    this.setOutboundPermitted(outboundPermitted.toList())
  }
  if (outboundPermitteds != null) {
    for (item in outboundPermitteds) {
      this.addOutboundPermitted(item)
    }
  }
  if (pingTimeout != null) {
    this.setPingTimeout(pingTimeout)
  }
  if (replyTimeout != null) {
    this.setReplyTimeout(replyTimeout)
  }
}

