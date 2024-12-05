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
package io.vertx.kotlin.httpproxy

import io.vertx.httpproxy.ProxyOptions
import io.vertx.httpproxy.cache.CacheOptions

/**
 * A function providing a DSL for building [io.vertx.httpproxy.ProxyOptions] objects.
 *
 * Proxy options.
 *
 * @param cacheOptions  Set the cache options that configures the proxy. <code>null</code> cache options disables caching, by default cache is disabled.
 * @param supportWebSocket  Set whether WebSocket are supported.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.httpproxy.ProxyOptions original] using Vert.x codegen.
 */
fun proxyOptionsOf(
  cacheOptions: io.vertx.httpproxy.cache.CacheOptions? = null,
  supportWebSocket: Boolean? = null): ProxyOptions = io.vertx.httpproxy.ProxyOptions().apply {

  if (cacheOptions != null) {
    this.setCacheOptions(cacheOptions)
  }
  if (supportWebSocket != null) {
    this.setSupportWebSocket(supportWebSocket)
  }
}

