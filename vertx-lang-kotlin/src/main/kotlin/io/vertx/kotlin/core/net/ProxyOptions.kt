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
package io.vertx.kotlin.core.net

import io.vertx.core.net.ProxyOptions
import io.vertx.core.net.ProxyType

/**
 * A function providing a DSL for building [io.vertx.core.net.ProxyOptions] objects.
 *
 * Proxy options for a net client or a net client.
 *
 * @param host  Set proxy host.
 * @param password  Set proxy password.
 * @param port  Set proxy port.
 * @param type  Set proxy type. <p>ProxyType can be HTTP, SOCKS4 and SOCKS5
 * @param username  Set proxy username.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.ProxyOptions original] using Vert.x codegen.
 */
fun proxyOptionsOf(
  host: String? = null,
  password: String? = null,
  port: Int? = null,
  type: ProxyType? = null,
  username: String? = null): ProxyOptions = io.vertx.core.net.ProxyOptions().apply {

  if (host != null) {
    this.setHost(host)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (type != null) {
    this.setType(type)
  }
  if (username != null) {
    this.setUsername(username)
  }
}

