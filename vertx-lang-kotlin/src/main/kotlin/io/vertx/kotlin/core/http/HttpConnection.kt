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

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.Http2Settings
import io.vertx.core.http.HttpConnection
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Send to the remote endpoint an update of this endpoint settings
 * <p/>
 * The <code>completionHandler</code> will be notified when the remote endpoint has acknowledged the settings.
 * <p/>
 * This is not implemented for HTTP/1.x.
 *
 * @param settings the new settings
 * @return a reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpConnection original] using Vert.x codegen.
 */
suspend fun HttpConnection.updateSettingsAwait(settings : Http2Settings) : Unit {
  return awaitResult{
    this.updateSettings(settings, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Send a  frame to the remote endpoint.
 * <p/>
 * This is not implemented for HTTP/1.x.
 *
 * @param data the 8 bytes data of the frame
 * @return a reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.HttpConnection original] using Vert.x codegen.
 */
suspend fun HttpConnection.pingAwait(data : Buffer) : Buffer {
  return awaitResult{
    this.ping(data, it)
  }
}

