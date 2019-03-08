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
package io.vertx.kotlin.ext.auth.jdbc

import io.vertx.ext.auth.jdbc.JDBCAuthOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.jdbc.JDBCAuthOptions] objects.
 *
 * Options configuring JDBC authentication.
 *
 * @param authenticationQuery  Set the authentication query to use. Use this if you want to override the default authentication query.
 * @param config  The configuration of the JDBC client: refer to the Vert.x JDBC Client configuration.
 * @param datasourceName  Set the data source name to use, only use in shared mode.
 * @param permissionsQuery  Set the permissions query to use. Use this if you want to override the default permissions query.
 * @param rolesPrefix  Set the role prefix to distinguish from permissions when checking for isPermitted requests.
 * @param rolesQuery  Set the roles query to use. Use this if you want to override the default roles query.
 * @param shared  Set whether the JDBC client is shared or non shared.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.jdbc.JDBCAuthOptions original] using Vert.x codegen.
 */
fun jdbcAuthOptionsOf(
  authenticationQuery: String? = null,
  config: io.vertx.core.json.JsonObject? = null,
  datasourceName: String? = null,
  permissionsQuery: String? = null,
  rolesPrefix: String? = null,
  rolesQuery: String? = null,
  shared: Boolean? = null): JDBCAuthOptions = io.vertx.ext.auth.jdbc.JDBCAuthOptions().apply {

  if (authenticationQuery != null) {
    this.setAuthenticationQuery(authenticationQuery)
  }
  if (config != null) {
    this.setConfig(config)
  }
  if (datasourceName != null) {
    this.setDatasourceName(datasourceName)
  }
  if (permissionsQuery != null) {
    this.setPermissionsQuery(permissionsQuery)
  }
  if (rolesPrefix != null) {
    this.setRolesPrefix(rolesPrefix)
  }
  if (rolesQuery != null) {
    this.setRolesQuery(rolesQuery)
  }
  if (shared != null) {
    this.setShared(shared)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.auth.jdbc.JDBCAuthOptions] objects.
 *
 * Options configuring JDBC authentication.
 *
 * @param authenticationQuery  Set the authentication query to use. Use this if you want to override the default authentication query.
 * @param config  The configuration of the JDBC client: refer to the Vert.x JDBC Client configuration.
 * @param datasourceName  Set the data source name to use, only use in shared mode.
 * @param permissionsQuery  Set the permissions query to use. Use this if you want to override the default permissions query.
 * @param rolesPrefix  Set the role prefix to distinguish from permissions when checking for isPermitted requests.
 * @param rolesQuery  Set the roles query to use. Use this if you want to override the default roles query.
 * @param shared  Set whether the JDBC client is shared or non shared.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.jdbc.JDBCAuthOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("jdbcAuthOptionsOf(authenticationQuery, config, datasourceName, permissionsQuery, rolesPrefix, rolesQuery, shared)")
)
fun JDBCAuthOptions(
  authenticationQuery: String? = null,
  config: io.vertx.core.json.JsonObject? = null,
  datasourceName: String? = null,
  permissionsQuery: String? = null,
  rolesPrefix: String? = null,
  rolesQuery: String? = null,
  shared: Boolean? = null): JDBCAuthOptions = io.vertx.ext.auth.jdbc.JDBCAuthOptions().apply {

  if (authenticationQuery != null) {
    this.setAuthenticationQuery(authenticationQuery)
  }
  if (config != null) {
    this.setConfig(config)
  }
  if (datasourceName != null) {
    this.setDatasourceName(datasourceName)
  }
  if (permissionsQuery != null) {
    this.setPermissionsQuery(permissionsQuery)
  }
  if (rolesPrefix != null) {
    this.setRolesPrefix(rolesPrefix)
  }
  if (rolesQuery != null) {
    this.setRolesQuery(rolesQuery)
  }
  if (shared != null) {
    this.setShared(shared)
  }
}

