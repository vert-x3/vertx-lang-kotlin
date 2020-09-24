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
package io.vertx.kotlin.ext.auth.sqlclient

import io.vertx.ext.auth.sqlclient.SqlAuthorizationOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.sqlclient.SqlAuthorizationOptions] objects.
 *
 * Options configuring JDBC authentication.
 *
 * @param permissionsQuery  Set the permissions query to use. Use this if you want to override the default permissions query.
 * @param rolesQuery  Set the roles query to use. Use this if you want to override the default roles query.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.sqlclient.SqlAuthorizationOptions original] using Vert.x codegen.
 */
fun sqlAuthorizationOptionsOf(
  permissionsQuery: String? = null,
  rolesQuery: String? = null): SqlAuthorizationOptions = io.vertx.ext.auth.sqlclient.SqlAuthorizationOptions().apply {

  if (permissionsQuery != null) {
    this.setPermissionsQuery(permissionsQuery)
  }
  if (rolesQuery != null) {
    this.setRolesQuery(rolesQuery)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.auth.sqlclient.SqlAuthorizationOptions] objects.
 *
 * Options configuring JDBC authentication.
 *
 * @param permissionsQuery  Set the permissions query to use. Use this if you want to override the default permissions query.
 * @param rolesQuery  Set the roles query to use. Use this if you want to override the default roles query.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.sqlclient.SqlAuthorizationOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("sqlAuthorizationOptionsOf(permissionsQuery, rolesQuery)")
)
fun SqlAuthorizationOptions(
  permissionsQuery: String? = null,
  rolesQuery: String? = null): SqlAuthorizationOptions = io.vertx.ext.auth.sqlclient.SqlAuthorizationOptions().apply {

  if (permissionsQuery != null) {
    this.setPermissionsQuery(permissionsQuery)
  }
  if (rolesQuery != null) {
    this.setRolesQuery(rolesQuery)
  }
}

