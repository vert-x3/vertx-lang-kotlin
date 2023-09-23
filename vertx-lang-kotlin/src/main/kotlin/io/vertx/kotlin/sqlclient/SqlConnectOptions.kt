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
package io.vertx.kotlin.sqlclient

import io.vertx.sqlclient.SqlConnectOptions
import io.vertx.core.net.ClientSSLOptions
import io.vertx.core.tracing.TracingPolicy

/**
 * A function providing a DSL for building [io.vertx.sqlclient.SqlConnectOptions] objects.
 *
 * Connect options for configuring [io.vertx.sqlclient.SqlConnection] or [io.vertx.sqlclient.Pool].
 *
 * @param host  Specify the host for connecting to the server.
 * @param port  Specify the port for connecting to the server.
 * @param user  Specify the user account to be used for the authentication.
 * @param password  Specify the user password to be used for the authentication.
 * @param database  Specify the default database for the connection.
 * @param cachePreparedStatements  Set whether prepared statements cache should be enabled.
 * @param preparedStatementCacheMaxSize  Set the maximum number of prepared statements that the connection will cache.
 * @param preparedStatementCacheSqlLimit  Set the maximum length of prepared statement SQL string that the connection will cache. <p> This is an helper setting the [io.vertx.sqlclient.SqlConnectOptions].
 * @param properties  Set properties for this client, which will be sent to server at the connection start.
 * @param tracingPolicy  Set the tracing policy for the client behavior when Vert.x has tracing enabled.
 * @param reconnectAttempts  Set the value of reconnect attempts
 * @param reconnectInterval  Set the reconnect interval
 * @param sslOptions 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.sqlclient.SqlConnectOptions original] using Vert.x codegen.
 */
fun sqlConnectOptionsOf(
  host: String? = null,
  port: Int? = null,
  user: String? = null,
  password: String? = null,
  database: String? = null,
  cachePreparedStatements: Boolean? = null,
  preparedStatementCacheMaxSize: Int? = null,
  preparedStatementCacheSqlLimit: Int? = null,
  properties: Map<String, String>? = null,
  tracingPolicy: TracingPolicy? = null,
  reconnectAttempts: Int? = null,
  reconnectInterval: Long? = null,
  sslOptions: io.vertx.core.net.ClientSSLOptions? = null): SqlConnectOptions = io.vertx.sqlclient.SqlConnectOptions().apply {

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
  if (preparedStatementCacheSqlLimit != null) {
    this.setPreparedStatementCacheSqlLimit(preparedStatementCacheSqlLimit)
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
}

