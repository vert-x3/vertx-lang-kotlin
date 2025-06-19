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
package io.vertx.kotlin.core.http

import io.vertx.core.http.Http2Settings

/**
 * A function providing a DSL for building [io.vertx.core.http.Http2Settings] objects.
 *
 * HTTP2 settings, the settings is initialized with the default HTTP/2 values.<p>
 *
 * The settings expose the parameters defined by the HTTP/2 specification, as well as extra settings for
 * protocol extensions.
 *
 * @param headerTableSize  Set  HTTP/2 setting.
 * @param initialWindowSize  Set the  HTTP/2 setting
 * @param maxConcurrentStreams  Set the  HTTP/2 setting
 * @param maxFrameSize  Set the  HTTP/2 setting
 * @param maxHeaderListSize  Set the  HTTP/2 setting
 * @param pushEnabled  Set the  HTTP/2 setting
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.Http2Settings original] using Vert.x codegen.
 */
fun http2SettingsOf(
  headerTableSize: Long? = null,
  initialWindowSize: Int? = null,
  maxConcurrentStreams: Long? = null,
  maxFrameSize: Int? = null,
  maxHeaderListSize: Long? = null,
  pushEnabled: Boolean? = null): Http2Settings = io.vertx.core.http.Http2Settings().apply {

  if (headerTableSize != null) {
    this.setHeaderTableSize(headerTableSize)
  }
  if (initialWindowSize != null) {
    this.setInitialWindowSize(initialWindowSize)
  }
  if (maxConcurrentStreams != null) {
    this.setMaxConcurrentStreams(maxConcurrentStreams)
  }
  if (maxFrameSize != null) {
    this.setMaxFrameSize(maxFrameSize)
  }
  if (maxHeaderListSize != null) {
    this.setMaxHeaderListSize(maxHeaderListSize)
  }
  if (pushEnabled != null) {
    this.setPushEnabled(pushEnabled)
  }
}

