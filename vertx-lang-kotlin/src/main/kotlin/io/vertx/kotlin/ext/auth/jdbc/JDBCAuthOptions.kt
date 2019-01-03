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

