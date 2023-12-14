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
import io.vertx.redis.client.ProtocolVersion

fun redisStandaloneConnectOptionsOf(
  maxNestedArrays: Int? = null,
  protocolNegotiation: Boolean? = null,
  preferredProtocolVersion: ProtocolVersion? = null,
  password: String? = null,
  endpoints: Iterable<String>? = null,
  connectionStrings: Iterable<String>? = null,
  maxWaitingHandlers: Int? = null,
  connectionString: String? = null): RedisStandaloneConnectOptions = io.vertx.redis.client.RedisStandaloneConnectOptions().apply {

  if (maxNestedArrays != null) {
    this.setMaxNestedArrays(maxNestedArrays)
  }
  if (protocolNegotiation != null) {
    this.setProtocolNegotiation(protocolNegotiation)
  }
  if (preferredProtocolVersion != null) {
    this.setPreferredProtocolVersion(preferredProtocolVersion)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (endpoints != null) {
    this.setEndpoints(endpoints.toList())
  }
  if (connectionStrings != null) {
    for (item in connectionStrings) {
      this.addConnectionString(item)
    }
  }
  if (maxWaitingHandlers != null) {
    this.setMaxWaitingHandlers(maxWaitingHandlers)
  }
  if (connectionString != null) {
    this.setConnectionString(connectionString)
  }
}

