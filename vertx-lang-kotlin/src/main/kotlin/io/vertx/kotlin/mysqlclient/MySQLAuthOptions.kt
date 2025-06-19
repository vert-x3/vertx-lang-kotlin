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

import io.vertx.mysqlclient.MySQLAuthOptions

/**
 * A function providing a DSL for building [io.vertx.mysqlclient.MySQLAuthOptions] objects.
 *
 * Authentication options for MySQL authentication which can be used for CHANGE_USER command.
 *
 * @param charset  Set the charset for the connection.
 * @param collation  Set the collation for the connection.
 * @param database  Specify the default database for the re-authentication.
 * @param password  Specify the user password to be used for the authentication.
 * @param properties  Set connection attributes which will be sent to server at the re-authentication.
 * @param serverRsaPublicKeyPath  Set the path of server RSA public key which is mostly used for encrypting password under insecure connections when performing authentication.
 * @param serverRsaPublicKeyValue  Set the value of server RSA public key which is mostly used for encrypting password under insecure connections when performing authentication.
 * @param user  Specify the user account to be used for the authentication.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mysqlclient.MySQLAuthOptions original] using Vert.x codegen.
 */
fun mySQLAuthOptionsOf(
  charset: String? = null,
  collation: String? = null,
  database: String? = null,
  password: String? = null,
  properties: Map<String, String>? = null,
  serverRsaPublicKeyPath: String? = null,
  serverRsaPublicKeyValue: io.vertx.core.buffer.Buffer? = null,
  user: String? = null): MySQLAuthOptions = io.vertx.mysqlclient.MySQLAuthOptions().apply {

  if (charset != null) {
    this.setCharset(charset)
  }
  if (collation != null) {
    this.setCollation(collation)
  }
  if (database != null) {
    this.setDatabase(database)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (properties != null) {
    this.setProperties(properties)
  }
  if (serverRsaPublicKeyPath != null) {
    this.setServerRsaPublicKeyPath(serverRsaPublicKeyPath)
  }
  if (serverRsaPublicKeyValue != null) {
    this.setServerRsaPublicKeyValue(serverRsaPublicKeyValue)
  }
  if (user != null) {
    this.setUser(user)
  }
}

