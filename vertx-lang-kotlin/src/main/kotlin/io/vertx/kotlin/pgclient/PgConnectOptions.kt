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
package io.vertx.kotlin.pgclient

import io.vertx.pgclient.PgConnectOptions
import io.vertx.core.net.ClientSSLOptions
import io.vertx.core.tracing.TracingPolicy
import io.vertx.pgclient.SslMode

/**
 * A function providing a DSL for building [io.vertx.pgclient.PgConnectOptions] objects.
 *
 *
 * @param host  Specify the host for connecting to the server.
 * @param port  Specify the port for connecting to the server.
 * @param user  Specify the user account to be used for the authentication.
 * @param password  Specify the user password to be used for the authentication.
 * @param database  Specify the default database for the connection.
 * @param cachePreparedStatements  Set whether prepared statements cache should be enabled.
 * @param preparedStatementCacheMaxSize  Set the maximum number of prepared statements that the connection will cache.
 * @param properties  Set properties for this client, which will be sent to server at the connection start.
 * @param tracingPolicy  Set the tracing policy for the client behavior when Vert.x has tracing enabled.
 * @param reconnectAttempts  Set the value of reconnect attempts
 * @param reconnectInterval  Set the reconnect interval
 * @param sslOptions 
 * @param pipeliningLimit 
 * @param preparedStatementCacheSqlLimit  Set the maximum length of prepared statement SQL string that the connection will cache. <p> This is an helper setting the [io.vertx.pgclient.PgConnectOptions].
 * @param sslMode  Set [io.vertx.pgclient.SslMode] for the client, this option can be used to provide different levels of secure protection.
 * @param useLayer7Proxy  Set the client to use a layer 7 (application) proxy compatible protocol, set to <code>true</code> when the client interacts with a layer 7 proxy like PgBouncer instead of a server. Prepared statement caching must be disabled.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.pgclient.PgConnectOptions original] using Vert.x codegen.
 */
fun pgConnectOptionsOf(
  host: String? = null,
  port: Int? = null,
  user: String? = null,
  password: String? = null,
  database: String? = null,
  cachePreparedStatements: Boolean? = null,
  preparedStatementCacheMaxSize: Int? = null,
  properties: Map<String, String>? = null,
  tracingPolicy: TracingPolicy? = null,
  reconnectAttempts: Int? = null,
  reconnectInterval: Long? = null,
  sslOptions: io.vertx.core.net.ClientSSLOptions? = null,
  pipeliningLimit: Int? = null,
  preparedStatementCacheSqlLimit: Int? = null,
  sslMode: SslMode? = null,
  useLayer7Proxy: Boolean? = null): PgConnectOptions = io.vertx.pgclient.PgConnectOptions().apply {

  if (host != null) {
    this.setHost(host)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (user != null) {
    this.setUser(user)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (database != null) {
    this.setDatabase(database)
  }
  if (cachePreparedStatements != null) {
    this.setCachePreparedStatements(cachePreparedStatements)
  }
  if (preparedStatementCacheMaxSize != null) {
    this.setPreparedStatementCacheMaxSize(preparedStatementCacheMaxSize)
  }
  if (properties != null) {
    this.setProperties(properties)
  }
  if (tracingPolicy != null) {
    this.setTracingPolicy(tracingPolicy)
  }
  if (reconnectAttempts != null) {
    this.setReconnectAttempts(reconnectAttempts)
  }
  if (reconnectInterval != null) {
    this.setReconnectInterval(reconnectInterval)
  }
  if (sslOptions != null) {
    this.setSslOptions(sslOptions)
  }
  if (pipeliningLimit != null) {
    this.setPipeliningLimit(pipeliningLimit)
  }
  if (preparedStatementCacheSqlLimit != null) {
    this.setPreparedStatementCacheSqlLimit(preparedStatementCacheSqlLimit)
  }
  if (sslMode != null) {
    this.setSslMode(sslMode)
  }
  if (useLayer7Proxy != null) {
    this.setUseLayer7Proxy(useLayer7Proxy)
  }
}

