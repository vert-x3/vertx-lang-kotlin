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
package io.vertx.kotlin.jdbcclient

import io.vertx.jdbcclient.JDBCConnectOptions

fun jdbcConnectOptionsOf(
  connectTimeout: Int? = null,
  dataSourceImplementation: String? = null,
  database: String? = null,
  idleTimeout: Int? = null,
  jdbcUrl: String? = null,
  metricsEnabled: Boolean? = null,
  password: String? = null,
  user: String? = null): JDBCConnectOptions = io.vertx.jdbcclient.JDBCConnectOptions().apply {

  if (connectTimeout != null) {
    this.setConnectTimeout(connectTimeout)
  }
  if (dataSourceImplementation != null) {
    this.setDataSourceImplementation(dataSourceImplementation)
  }
  if (database != null) {
    this.setDatabase(database)
  }
  if (idleTimeout != null) {
    this.setIdleTimeout(idleTimeout)
  }
  if (jdbcUrl != null) {
    this.setJdbcUrl(jdbcUrl)
  }
  if (metricsEnabled != null) {
    this.setMetricsEnabled(metricsEnabled)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (user != null) {
    this.setUser(user)
  }
}

