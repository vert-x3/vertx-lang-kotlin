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
 * @param disabledTransports 
 * @param heartbeatInterval 
 * @param insertJSESSIONID 
 * @param libraryURL 
 * @param maxBytesStreaming 
 * @param sessionTimeout 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions original] using Vert.x codegen.
 */
fun sockJSHandlerOptionsOf(
  disabledTransports: Iterable<String>? = null,
  heartbeatInterval: Long? = null,
  insertJSESSIONID: Boolean? = null,
  libraryURL: String? = null,
  maxBytesStreaming: Int? = null,
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
  if (maxBytesStreaming != null) {
    this.setMaxBytesStreaming(maxBytesStreaming)
  }
  if (sessionTimeout != null) {
    this.setSessionTimeout(sessionTimeout)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions] objects.
 *
 * Options for configuring a SockJS handler
 *
 * @param disabledTransports 
 * @param heartbeatInterval 
 * @param insertJSESSIONID 
 * @param libraryURL 
 * @param maxBytesStreaming 
 * @param sessionTimeout 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("sockJSHandlerOptionsOf(disabledTransports, heartbeatInterval, insertJSESSIONID, libraryURL, maxBytesStreaming, sessionTimeout)")
)
fun SockJSHandlerOptions(
  disabledTransports: Iterable<String>? = null,
  heartbeatInterval: Long? = null,
  insertJSESSIONID: Boolean? = null,
  libraryURL: String? = null,
  maxBytesStreaming: Int? = null,
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
  if (maxBytesStreaming != null) {
    this.setMaxBytesStreaming(maxBytesStreaming)
  }
  if (sessionTimeout != null) {
    this.setSessionTimeout(sessionTimeout)
  }
}

