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

import io.vertx.ext.auth.jdbc.JDBCAuthorizationOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.jdbc.JDBCAuthorizationOptions] objects.
 *
 * Options configuring JDBC authentication.
 *
 * @param permissionsQuery  Set the permissions query to use. Use this if you want to override the default permissions query.
 * @param rolesQuery  Set the roles query to use. Use this if you want to override the default roles query.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.jdbc.JDBCAuthorizationOptions original] using Vert.x codegen.
 */
fun jdbcAuthorizationOptionsOf(
  permissionsQuery: String? = null,
  rolesQuery: String? = null): JDBCAuthorizationOptions = io.vertx.ext.auth.jdbc.JDBCAuthorizationOptions().apply {

  if (permissionsQuery != null) {
    this.setPermissionsQuery(permissionsQuery)
  }
  if (rolesQuery != null) {
    this.setRolesQuery(rolesQuery)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.auth.jdbc.JDBCAuthorizationOptions] objects.
 *
 * Options configuring JDBC authentication.
 *
 * @param permissionsQuery  Set the permissions query to use. Use this if you want to override the default permissions query.
 * @param rolesQuery  Set the roles query to use. Use this if you want to override the default roles query.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.jdbc.JDBCAuthorizationOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("jdbcAuthorizationOptionsOf(permissionsQuery, rolesQuery)")
)
fun JDBCAuthorizationOptions(
  permissionsQuery: String? = null,
  rolesQuery: String? = null): JDBCAuthorizationOptions = io.vertx.ext.auth.jdbc.JDBCAuthorizationOptions().apply {

  if (permissionsQuery != null) {
    this.setPermissionsQuery(permissionsQuery)
  }
  if (rolesQuery != null) {
    this.setRolesQuery(rolesQuery)
  }
}

