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

import io.vertx.redis.client.RedisSentinelConnectOptions
import io.vertx.redis.client.ProtocolVersion
import io.vertx.redis.client.RedisRole

fun redisSentinelConnectOptionsOf(
  autoFailover: Boolean? = null,
  connectionString: String? = null,
  connectionStrings: Iterable<String>? = null,
  endpoints: Iterable<String>? = null,
  masterName: String? = null,
  maxNestedArrays: Int? = null,
  maxWaitingHandlers: Int? = null,
  password: String? = null,
  preferredProtocolVersion: ProtocolVersion? = null,
  protocolNegotiation: Boolean? = null,
  role: RedisRole? = null,
  topologyCacheTTL: Long? = null): RedisSentinelConnectOptions = io.vertx.redis.client.RedisSentinelConnectOptions().apply {

  if (autoFailover != null) {
    this.setAutoFailover(autoFailover)
  }
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
  if (masterName != null) {
    this.setMasterName(masterName)
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
  if (preferredProtocolVersion != null) {
    this.setPreferredProtocolVersion(preferredProtocolVersion)
  }
  if (protocolNegotiation != null) {
    this.setProtocolNegotiation(protocolNegotiation)
  }
  if (role != null) {
    this.setRole(role)
  }
  if (topologyCacheTTL != null) {
    this.setTopologyCacheTTL(topologyCacheTTL)
  }
}

