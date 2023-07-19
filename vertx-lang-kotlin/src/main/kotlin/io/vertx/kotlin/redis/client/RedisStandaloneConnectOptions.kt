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
package io.vertx.kotlin.redis.client

import io.vertx.redis.client.RedisStandaloneConnectOptions

fun redisStandaloneConnectOptionsOf(
  connectionString: String? = null,
  connectionStrings: Iterable<String>? = null,
  endpoints: Iterable<String>? = null,
  maxNestedArrays: Int? = null,
  maxWaitingHandlers: Int? = null,
  password: String? = null,
  protocolNegotiation: Boolean? = null): RedisStandaloneConnectOptions = io.vertx.redis.client.RedisStandaloneConnectOptions().apply {

  if (connectionString != null) {
    this.setConnectionString(connectionString)
  }
  if (connectionStrings != null) {
    for (item in connectionStrings) {
      this.addConnectionString(item)
    }
  }
  if (endpoints != null) {
    this.setEndpoints(endpoints.toList())
  }
  if (maxNestedArrays != null) {
    this.setMaxNestedArrays(maxNestedArrays)
  }
  if (maxWaitingHandlers != null) {
    this.setMaxWaitingHandlers(maxWaitingHandlers)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (protocolNegotiation != null) {
    this.setProtocolNegotiation(protocolNegotiation)
  }
}

