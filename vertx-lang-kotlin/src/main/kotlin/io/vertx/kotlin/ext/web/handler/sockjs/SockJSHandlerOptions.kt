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

import io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions

/**
 * A function providing a DSL for building [io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions] objects.
 *
 * Options for configuring a SockJS handler
 *
 * @param disabledTransports  Add a transport (by name) to the set of disabled transports.
 * @param heartbeatInterval  In order to keep proxies and load balancers from closing long running HTTP requests we need to pretend that the connection is active and send a heartbeat packet once in a while. This setting controls how often this is done. <p> Defaults to 25 seconds.
 * @param insertJSESSIONID  Whether to insert a <code>JSESSIONID</code> cookie so load-balancers ensure requests for a specific SockJS session are always routed to the correct server. <p> Defaults to <code>true</code>.
 * @param libraryURL  Transports which don't support cross-domain communication natively use an iframe trick. A simple page is served from the SockJS server (using its foreign domain) and is placed in an invisible iframe. <p> Code run from this iframe doesn't need to worry about cross-domain issues, as it's being run from domain local to the SockJS server. This iframe also does need to load SockJS javascript client library, and this option lets you specify its URL.
 * @param localWriteHandler  Whether the <code>writeHandler</code> should be local only or cluster-wide. <p> Defaults to <code>true</code>.
 * @param maxBytesStreaming  Most streaming transports save responses on the client side and don't free memory used by delivered messages. Such transports need to be garbage-collected once in a while. <p> This setting controls the maximum number of bytes that can be sent over a single HTTP streaming request before it will be closed. After that the client needs to open new request. Setting this value to one effectively disables streaming and will make streaming transports to behave like polling transports. <p> Defaults to 128K.
 * @param origin  Set the origin to be verified before a websocket upgrade happens. <p> Defaults to <code>null</code>.
 * @param registerWriteHandler  Whether a <code>writeHandler</code> should be registered on the [io.vertx.core.eventbus.EventBus]. <p> Defaults to <code>false</code>.
 * @param sessionTimeout  Set the delay before the server sends a <code>close</code> event when a client receiving connection has not been seen for a while. <p> Defaults to 5 seconds.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions original] using Vert.x codegen.
 */
fun sockJSHandlerOptionsOf(
  disabledTransports: Iterable<String>? = null,
  heartbeatInterval: Long? = null,
  insertJSESSIONID: Boolean? = null,
  libraryURL: String? = null,
  localWriteHandler: Boolean? = null,
  maxBytesStreaming: Int? = null,
  origin: String? = null,
  registerWriteHandler: Boolean? = null,
  sessionTimeout: Long? = null): SockJSHandlerOptions = io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions().apply {

  if (disabledTransports != null) {
    for (item in disabledTransports) {
      this.addDisabledTransport(item)
    }
  }
  if (heartbeatInterval != null) {
    this.setHeartbeatInterval(heartbeatInterval)
  }
  if (insertJSESSIONID != null) {
    this.setInsertJSESSIONID(insertJSESSIONID)
  }
  if (libraryURL != null) {
    this.setLibraryURL(libraryURL)
  }
  if (localWriteHandler != null) {
    this.setLocalWriteHandler(localWriteHandler)
  }
  if (maxBytesStreaming != null) {
    this.setMaxBytesStreaming(maxBytesStreaming)
  }
  if (origin != null) {
    this.setOrigin(origin)
  }
  if (registerWriteHandler != null) {
    this.setRegisterWriteHandler(registerWriteHandler)
  }
  if (sessionTimeout != null) {
    this.setSessionTimeout(sessionTimeout)
  }
}

