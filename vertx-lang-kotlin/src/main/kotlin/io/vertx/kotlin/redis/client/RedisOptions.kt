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
import io.vertx.core.tracing.TracingPolicy
import io.vertx.redis.client.RedisClientType
import io.vertx.redis.client.RedisReplicas
import io.vertx.redis.client.RedisRole

/**
 * A function providing a DSL for building [io.vertx.redis.client.RedisOptions] objects.
 *
 * Redis Client Configuration options.
 *
 * @param type  Set the desired client type to be created.
 * @param netClientOptions  Set the net client options to be used while connecting to the redis server. Use this to tune your connection.
 * @param endpoints  Set the endpoints to use while connecting to the redis server. Only the cluster mode will consider more than 1 element. If more are provided, they are not considered by the client when in single server mode.
 * @param endpoint  Sets a single connection string to use while connecting to the redis server. Will replace the previously configured connection strings.
 * @param connectionStrings  Adds a connection string (endpoint) to use while connecting to the redis server. Only the cluster mode will consider more than 1 element. If more are provided, they are not considered by the client when in single server mode.
 * @param connectionString  Sets a single connection string (endpoint) to use while connecting to the redis server. Will replace the previously configured connection strings.
 * @param maxWaitingHandlers  The client will always work on pipeline mode, this means that messages can start queueing. You can control how much backlog you're willing to accept. This methods sets how much handlers is the client willing to queue.
 * @param masterName  Set the master name (only considered in HA mode).
 * @param role  Set the role name (only considered in HA mode).
 * @param useReplicas  Set whether or not to use replica nodes (only considered in Cluster mode).
 * @param maxNestedArrays  Tune how much nested arrays are allowed on a redis response. This affects the parser performance.
 * @param tracingPolicy  Set the tracing policy for the client behavior when Vert.x has tracing enabled.
 * @param poolCleanerInterval  Tune how often in milliseconds should the connection pool cleaner execute. <p> For each connection in the pool, connections marked as invalid will be forcibly closed. A connection is marked invalid if it enters a exception or fatal state.
 * @param maxPoolSize  Tune the maximum size of the connection pool. When working with cluster or sentinel this value should be atleast the total number of cluster member (or number of sentinels + 1)
 * @param maxPoolWaiting  Tune the maximum waiting requests for a connection from the pool.
 * @param poolRecycleTimeout  Tune when a connection should be recycled in milliseconds.
 * @param password  Set the default password for cluster/sentinel connections.
 * @param protocolNegotiation  Should the client perform <code>REST</code> protocol negotiation during the connection acquire. By default this is <code>true</code>, but there are situations when using broken servers it may be useful to skip this and always fallback to <code>RESP2</code> without using the <code>HELLO</code> command.
 * @param poolName  Set a user defined pool name (for metrics reporting).
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.client.RedisOptions original] using Vert.x codegen.
 */
fun redisOptionsOf(
  type: RedisClientType? = null,
  netClientOptions: io.vertx.core.net.NetClientOptions? = null,
  endpoints: Iterable<String>? = null,
  endpoint: String? = null,
  connectionStrings: Iterable<String>? = null,
  connectionString: String? = null,
  maxWaitingHandlers: Int? = null,
  masterName: String? = null,
  role: RedisRole? = null,
  useReplicas: RedisReplicas? = null,
  maxNestedArrays: Int? = null,
  tracingPolicy: TracingPolicy? = null,
  poolCleanerInterval: Int? = null,
  maxPoolSize: Int? = null,
  maxPoolWaiting: Int? = null,
  poolRecycleTimeout: Int? = null,
  password: String? = null,
  protocolNegotiation: Boolean? = null,
  poolName: String? = null): RedisOptions = io.vertx.redis.client.RedisOptions().apply {

  if (type != null) {
    this.setType(type)
  }
  if (netClientOptions != null) {
    this.setNetClientOptions(netClientOptions)
  }
  if (endpoints != null) {
    this.setEndpoints(endpoints.toList())
  }
  if (endpoint != null) {
    this.setEndpoint(endpoint)
  }
  if (connectionStrings != null) {
    for (item in connectionStrings) {
      this.addConnectionString(item)
    }
  }
  if (connectionString != null) {
    this.setConnectionString(connectionString)
  }
  if (maxWaitingHandlers != null) {
    this.setMaxWaitingHandlers(maxWaitingHandlers)
  }
  if (masterName != null) {
    this.setMasterName(masterName)
  }
  if (role != null) {
    this.setRole(role)
  }
  if (useReplicas != null) {
    this.setUseReplicas(useReplicas)
  }
  if (maxNestedArrays != null) {
    this.setMaxNestedArrays(maxNestedArrays)
  }
  if (tracingPolicy != null) {
    this.setTracingPolicy(tracingPolicy)
  }
  if (poolCleanerInterval != null) {
    this.setPoolCleanerInterval(poolCleanerInterval)
  }
  if (maxPoolSize != null) {
    this.setMaxPoolSize(maxPoolSize)
  }
  if (maxPoolWaiting != null) {
    this.setMaxPoolWaiting(maxPoolWaiting)
  }
  if (poolRecycleTimeout != null) {
    this.setPoolRecycleTimeout(poolRecycleTimeout)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (protocolNegotiation != null) {
    this.setProtocolNegotiation(protocolNegotiation)
  }
  if (poolName != null) {
    this.setPoolName(poolName)
  }
}

