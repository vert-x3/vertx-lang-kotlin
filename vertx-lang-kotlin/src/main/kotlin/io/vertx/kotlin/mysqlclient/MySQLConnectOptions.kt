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
package io.vertx.kotlin.mysqlclient

import io.vertx.mysqlclient.MySQLConnectOptions
import io.vertx.core.buffer.Buffer
import io.vertx.core.net.ClientSSLOptions
import io.vertx.core.tracing.TracingPolicy
import io.vertx.mysqlclient.MySQLAuthenticationPlugin
import io.vertx.mysqlclient.SslMode

/**
 * A function providing a DSL for building [io.vertx.mysqlclient.MySQLConnectOptions] objects.
 *
 * Connect options for configuring [io.vertx.mysqlclient.MySQLConnection] or [io.vertx.mysqlclient.MySQLBuilder].
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
 * @param collation  Set the collation for the connection.
 * @param charset  Set the charset for the connection.
 * @param characterEncoding  Set the Java charset for encoding string values, this value is UTF-8 by default.
 * @param useAffectedRows  Sets how affected rows are calculated on update/delete/insert, if set to <code>true</code> an update that effectively does not change any data returns zero affected rows. See <a href="https://dev.mysql.com/doc/refman/8.0/en/mysql-affected-rows.html">mysql-affected-rows</a> for details.
 * @param sslMode  Set the [io.vertx.mysqlclient.SslMode] for the client, this option can be used to specify the desired security state of the connection to the server.
 * @param authenticationPlugin  Set the default [io.vertx.mysqlclient.MySQLAuthenticationPlugin] for the client, the option will take effect at the connection start.
 * @param serverRsaPublicKeyPath  Set the path of server RSA public key which is mostly used for encrypting password under insecure connections when performing authentication.
 * @param serverRsaPublicKeyValue  Set the value of server RSA public key which is mostly used for encrypting password under insecure connections when performing authentication.
 * @param pipeliningLimit  Set the pipelining limit count.
 * @param preparedStatementCacheSqlLimit  Set the maximum length of prepared statement SQL string that the connection will cache. <p> This is an helper setting the [io.vertx.mysqlclient.MySQLConnectOptions].
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mysqlclient.MySQLConnectOptions original] using Vert.x codegen.
 */
fun mySQLConnectOptionsOf(
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
  collation: String? = null,
  charset: String? = null,
  characterEncoding: String? = null,
  useAffectedRows: Boolean? = null,
  sslMode: SslMode? = null,
  authenticationPlugin: MySQLAuthenticationPlugin? = null,
  serverRsaPublicKeyPath: String? = null,
  serverRsaPublicKeyValue: io.vertx.core.buffer.Buffer? = null,
  pipeliningLimit: Int? = null,
  preparedStatementCacheSqlLimit: Int? = null): MySQLConnectOptions = io.vertx.mysqlclient.MySQLConnectOptions().apply {

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
  if (collation != null) {
    this.setCollation(collation)
  }
  if (charset != null) {
    this.setCharset(charset)
  }
  if (characterEncoding != null) {
    this.setCharacterEncoding(characterEncoding)
  }
  if (useAffectedRows != null) {
    this.setUseAffectedRows(useAffectedRows)
  }
  if (sslMode != null) {
    this.setSslMode(sslMode)
  }
  if (authenticationPlugin != null) {
    this.setAuthenticationPlugin(authenticationPlugin)
  }
  if (serverRsaPublicKeyPath != null) {
    this.setServerRsaPublicKeyPath(serverRsaPublicKeyPath)
  }
  if (serverRsaPublicKeyValue != null) {
    this.setServerRsaPublicKeyValue(serverRsaPublicKeyValue)
  }
  if (pipeliningLimit != null) {
    this.setPipeliningLimit(pipeliningLimit)
  }
  if (preparedStatementCacheSqlLimit != null) {
    this.setPreparedStatementCacheSqlLimit(preparedStatementCacheSqlLimit)
  }
}

