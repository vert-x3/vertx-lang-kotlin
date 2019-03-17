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

import io.vertx.redis.client.RedisOptions
import io.vertx.core.net.NetClientOptions
import io.vertx.redis.client.RedisRole
import io.vertx.redis.client.RedisSlaves

/**
 * A function providing a DSL for building [io.vertx.redis.client.RedisOptions] objects.
 *
 * Redis Client Configuration options.
 *
 * @param endpoint  Sets a single endpoint to use while connecting to the redis server. Will replace the previously configured endpoints.
 * @param endpoints  Set the endpoints to use while connecting to the redis server. Only the cluster mode will consider more than 1 element. If more are provided, they are not considered by the client when in single server mode.
 * @param masterName  Set the master name (only considered in HA mode).
 * @param maxNestedArrays  Tune how much nested arrays are allowed on a redis response. This affects the parser performance.
 * @param maxWaitingHandlers  The client will always work on pipeline mode, this means that messages can start queueing. You can control how much backlog you're willing to accept. This methods sets how much handlers is the client willing to queue.
 * @param netClientOptions  Set the net client options to be used while connecting to the redis server. Use this to tune your connection.
 * @param password  Set the provided password to be used when establishing a connection to the server.
 * @param role  Set the role name (only considered in HA mode).
 * @param select  Set the provided database to be selected when establishing a connection to the server.
 * @param useSlave  Set whether or not to use slave nodes (only considered in Cluster mode).
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.client.RedisOptions original] using Vert.x codegen.
 */
fun redisOptionsOf(
  endpoint: io.vertx.core.net.SocketAddress? = null,
  endpoints: Iterable<io.vertx.core.net.SocketAddress>? = null,
  masterName: String? = null,
  maxNestedArrays: Int? = null,
  maxWaitingHandlers: Int? = null,
  netClientOptions: io.vertx.core.net.NetClientOptions? = null,
  password: String? = null,
  role: RedisRole? = null,
  select: Int? = null,
  useSlave: RedisSlaves? = null): RedisOptions = io.vertx.redis.client.RedisOptions().apply {

  if (endpoint != null) {
    this.setEndpoint(endpoint)
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
  if (netClientOptions != null) {
    this.setNetClientOptions(netClientOptions)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (role != null) {
    this.setRole(role)
  }
  if (select != null) {
    this.setSelect(select)
  }
  if (useSlave != null) {
    this.setUseSlave(useSlave)
  }
}

/**
 * A function providing a DSL for building [io.vertx.redis.client.RedisOptions] objects.
 *
 * Redis Client Configuration options.
 *
 * @param endpoint  Sets a single endpoint to use while connecting to the redis server. Will replace the previously configured endpoints.
 * @param endpoints  Set the endpoints to use while connecting to the redis server. Only the cluster mode will consider more than 1 element. If more are provided, they are not considered by the client when in single server mode.
 * @param masterName  Set the master name (only considered in HA mode).
 * @param maxNestedArrays  Tune how much nested arrays are allowed on a redis response. This affects the parser performance.
 * @param maxWaitingHandlers  The client will always work on pipeline mode, this means that messages can start queueing. You can control how much backlog you're willing to accept. This methods sets how much handlers is the client willing to queue.
 * @param netClientOptions  Set the net client options to be used while connecting to the redis server. Use this to tune your connection.
 * @param password  Set the provided password to be used when establishing a connection to the server.
 * @param role  Set the role name (only considered in HA mode).
 * @param select  Set the provided database to be selected when establishing a connection to the server.
 * @param useSlave  Set whether or not to use slave nodes (only considered in Cluster mode).
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.client.RedisOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("redisOptionsOf(endpoint, endpoints, masterName, maxNestedArrays, maxWaitingHandlers, netClientOptions, password, role, select, useSlave)")
)
fun RedisOptions(
  endpoint: io.vertx.core.net.SocketAddress? = null,
  endpoints: Iterable<io.vertx.core.net.SocketAddress>? = null,
  masterName: String? = null,
  maxNestedArrays: Int? = null,
  maxWaitingHandlers: Int? = null,
  netClientOptions: io.vertx.core.net.NetClientOptions? = null,
  password: String? = null,
  role: RedisRole? = null,
  select: Int? = null,
  useSlave: RedisSlaves? = null): RedisOptions = io.vertx.redis.client.RedisOptions().apply {

  if (endpoint != null) {
    this.setEndpoint(endpoint)
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
  if (netClientOptions != null) {
    this.setNetClientOptions(netClientOptions)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (role != null) {
    this.setRole(role)
  }
  if (select != null) {
    this.setSelect(select)
  }
  if (useSlave != null) {
    this.setUseSlave(useSlave)
  }
}

