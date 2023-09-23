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
package io.vertx.kotlin.oracleclient

import io.vertx.oracleclient.OracleConnectOptions
import io.vertx.core.net.ClientSSLOptions
import io.vertx.core.tracing.TracingPolicy
import io.vertx.oracleclient.ServerMode

fun oracleConnectOptionsOf(
  reconnectAttempts: Int? = null,
  reconnectInterval: Long? = null,
  sslOptions: io.vertx.core.net.ClientSSLOptions? = null,
  serviceId: String? = null,
  serviceName: String? = null,
  serverMode: ServerMode? = null,
  instanceName: String? = null,
  tnsAlias: String? = null,
  tnsAdmin: String? = null,
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
  ssl: Boolean? = null): OracleConnectOptions = io.vertx.oracleclient.OracleConnectOptions().apply {

  if (reconnectAttempts != null) {
    this.setReconnectAttempts(reconnectAttempts)
  }
  if (reconnectInterval != null) {
    this.setReconnectInterval(reconnectInterval)
  }
  if (sslOptions != null) {
    this.setSslOptions(sslOptions)
  }
  if (serviceId != null) {
    this.setServiceId(serviceId)
  }
  if (serviceName != null) {
    this.setServiceName(serviceName)
  }
  if (serverMode != null) {
    this.setServerMode(serverMode)
  }
  if (instanceName != null) {
    this.setInstanceName(instanceName)
  }
  if (tnsAlias != null) {
    this.setTnsAlias(tnsAlias)
  }
  if (tnsAdmin != null) {
    this.setTnsAdmin(tnsAdmin)
  }
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
  if (ssl != null) {
    this.setSsl(ssl)
  }
}

