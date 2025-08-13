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
import io.vertx.redis.client.ProtocolVersion
import io.vertx.redis.client.RedisClientType
import io.vertx.redis.client.RedisClusterTransactions
import io.vertx.redis.client.RedisReplicas
import io.vertx.redis.client.RedisRole
import io.vertx.redis.client.RedisTopology

/**
 * A function providing a DSL for building [io.vertx.redis.client.RedisOptions] objects.
 *
 * Redis Client Configuration options.
 *
 * @param autoFailover  Returns whether automatic failover is enabled. This only makes sense for sentinel clients with role of  and is ignored otherwise. <p> If enabled, the sentinel client will additionally create a connection to one sentinel node and watch for failover events. When new master is elected, all connections to the old master are automatically closed and new connections to the new master are created. Note that these new connections will <em>not</em> have the same event handlers (,  and ), will <em>not</em> be in the same streaming mode (,  and ), and will <em>not</em> watch the same subscriptions (<code>SUBSCRIBE</code>, <code>PSUBSCRIBE</code>, etc.) as the old ones. In other words, automatic failover makes sense for connections executing regular commands, but not for connections used to subscribe to Redis pub/sub channels. <p> Note that there is a brief period of time between the old master failing and the new master being elected when the existing connections will temporarily fail all operations. After the new master is elected, the connections will automatically fail over and start working again.
 * @param clusterTransactions  Set how Redis transactions are handled in cluster mode.
 * @param connectionString  Sets a single connection string (endpoint) to use while connecting to the redis server. Will replace the previously configured connection strings.
 * @param connectionStrings  Adds a connection string (endpoint) to use while connecting to the redis server. Only the cluster mode will consider more than 1 element. If more are provided, they are not considered by the client when in single server mode.
 * @param endpoint  Sets a single connection string to use while connecting to the redis server. Will replace the previously configured connection strings.
 * @param endpoints  Set the endpoints to use while connecting to the redis server. Only the cluster mode will consider more than 1 element. If more are provided, they are not considered by the client when in single server mode.
 * @param hashSlotCacheTTL  Sets the TTL of the hash slot cache. The TTL is expressed in milliseconds. Defaults to 1000 millis (1 second). <p> This is only meaningful in case of a  Redis client and is ignored otherwise. </p>
 * @param masterName  Set the name of the master set. <p> This is only meaningful in case of a  Redis client and is ignored otherwise. </p>
 * @param maxNestedArrays  Tune how much nested arrays are allowed on a redis response. This affects the parser performance.
 * @param maxPoolSize  Set the maximum size of the connection pool. <p> By default, the maximum pool size is 6. <p> When working with cluster or sentinel, this value should be at least the total number of cluster member (or number of sentinels + 1).
 * @param maxPoolWaiting  Set the maximum number of requests waiting for a connection from the pool. <p> By default, the maximum number of waiting requests size is 24.
 * @param maxWaitingHandlers  The client will always work on pipeline mode, this means that messages can start queueing. You can control how much backlog you're willing to accept. This methods sets how much handlers is the client willing to queue.
 * @param metricsName  Set the metrics name identifying the reported metrics, useful for grouping metrics with the same name.
 * @param netClientOptions  Set the net client options to be used while connecting to the redis server. Use this to tune your connection.
 * @param password  Set the default password for cluster/sentinel connections.
 * @param poolCleanerInterval  Set how often the connection pool will be cleaned. Cleaning the connection pool means scanning for unused and invalid connections and if any are found, they are forcibly closed and evicted from the pool. <p> A connection is marked invalid if it enters a exception or fatal state. It is marked unused if it is unused for longer than the . <p> The value is in milliseconds. By default, the cleaning interval is 30 seconds. The value of -1 means connection pool cleaning is disabled.
 * @param poolName  Set the connection pool name to be used for metrics reporting. The default name is a random UUID.
 * @param poolRecycleTimeout  Set how long a connection can stay unused before it is recycled during connection pool . <p> The value is in milliseconds. By default, the recycle timeout is 3 minutes. The value of -1 means connection recycling is disabled.
 * @param preferredProtocolVersion  Sets the preferred protocol version to be used during protocol negotiation. When not set, defaults to RESP 3. When protocol negotiation is disabled, this setting has no effect.
 * @param protocolNegotiation  Should the client perform <code>REST</code> protocol negotiation during the connection acquire. By default this is <code>true</code>, but there are situations when using broken servers it may be useful to skip this and always fallback to <code>RESP2</code> without using the <code>HELLO</code> command.
 * @param role  Set the client role; that is, to which kind of node should the connection be established. <p> This is only meaningful in case of a  Redis client and is ignored otherwise. </p>
 * @param topology  Set how the  should be obtained. By default, the topology is  automatically. <p> This is only meaningful in case of a  Redis client. In case of a  and  Redis client, topology is currently always discovered automatically and the topology mode is ignored. </p>
 * @param tracingPolicy  Set the tracing policy for the client behavior when Vert.x has tracing enabled.
 * @param type  Set the desired client type to be created.
 * @param useReplicas  Set whether to use replica nodes for read only queries. <p> This is only meaningful in case of a  and  Redis client and is ignored otherwise. </p>
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.client.RedisOptions original] using Vert.x codegen.
 */
fun redisOptionsOf(
  autoFailover: Boolean? = null,
  clusterTransactions: RedisClusterTransactions? = null,
  connectionString: String? = null,
  connectionStrings: Iterable<String>? = null,
  endpoint: String? = null,
  endpoints: Iterable<String>? = null,
  hashSlotCacheTTL: Long? = null,
  masterName: String? = null,
  maxNestedArrays: Int? = null,
  maxPoolSize: Int? = null,
  maxPoolWaiting: Int? = null,
  maxWaitingHandlers: Int? = null,
  metricsName: String? = null,
  netClientOptions: io.vertx.core.net.NetClientOptions? = null,
  password: String? = null,
  poolCleanerInterval: Int? = null,
  poolName: String? = null,
  poolRecycleTimeout: Int? = null,
  preferredProtocolVersion: ProtocolVersion? = null,
  protocolNegotiation: Boolean? = null,
  role: RedisRole? = null,
  topology: RedisTopology? = null,
  tracingPolicy: TracingPolicy? = null,
  type: RedisClientType? = null,
  useReplicas: RedisReplicas? = null): RedisOptions = io.vertx.redis.client.RedisOptions().apply {

  if (autoFailover != null) {
    this.setAutoFailover(autoFailover)
  }
  if (clusterTransactions != null) {
    this.setClusterTransactions(clusterTransactions)
  }
  if (connectionString != null) {
    this.setConnectionString(connectionString)
  }
  if (connectionStrings != null) {
    for (item in connectionStrings) {
      this.addConnectionString(item)
    }
  }
  if (endpoint != null) {
    this.setEndpoint(endpoint)
  }
  if (endpoints != null) {
    this.setEndpoints(endpoints.toList())
  }
  if (hashSlotCacheTTL != null) {
    this.setHashSlotCacheTTL(hashSlotCacheTTL)
  }
  if (masterName != null) {
    this.setMasterName(masterName)
  }
  if (maxNestedArrays != null) {
    this.setMaxNestedArrays(maxNestedArrays)
  }
  if (maxPoolSize != null) {
    this.setMaxPoolSize(maxPoolSize)
  }
  if (maxPoolWaiting != null) {
    this.setMaxPoolWaiting(maxPoolWaiting)
  }
  if (maxWaitingHandlers != null) {
    this.setMaxWaitingHandlers(maxWaitingHandlers)
  }
  if (metricsName != null) {
    this.setMetricsName(metricsName)
  }
  if (netClientOptions != null) {
    this.setNetClientOptions(netClientOptions)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (poolCleanerInterval != null) {
    this.setPoolCleanerInterval(poolCleanerInterval)
  }
  if (poolName != null) {
    this.setPoolName(poolName)
  }
  if (poolRecycleTimeout != null) {
    this.setPoolRecycleTimeout(poolRecycleTimeout)
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
  if (topology != null) {
    this.setTopology(topology)
  }
  if (tracingPolicy != null) {
    this.setTracingPolicy(tracingPolicy)
  }
  if (type != null) {
    this.setType(type)
  }
  if (useReplicas != null) {
    this.setUseReplicas(useReplicas)
  }
}

