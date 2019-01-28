package io.vertx.kotlin.ext.auth.shiro

import io.vertx.ext.auth.shiro.ShiroAuthOptions
import io.vertx.ext.auth.shiro.ShiroAuthRealmType

/**
 * A function providing a DSL for building [io.vertx.ext.auth.shiro.ShiroAuthOptions] objects.
 *
 * Shiro auth configuration options, see Vert.x Auth Shiro component and/or Apache Shiro project.
 *
 * @param config  Set the Shiro auth config.
 * @param type  Set the Shiro auth options type.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.shiro.ShiroAuthOptions original] using Vert.x codegen.
 */
fun shiroAuthOptionsOf(
  config: io.vertx.core.json.JsonObject? = null,
  type: ShiroAuthRealmType? = null): ShiroAuthOptions = io.vertx.ext.auth.shiro.ShiroAuthOptions().apply {

  if (config != null) {
    this.setConfig(config)
  }
  if (type != null) {
    this.setType(type)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.auth.shiro.ShiroAuthOptions] objects.
 *
 * Shiro auth configuration options, see Vert.x Auth Shiro component and/or Apache Shiro project.
 *
 * @param config  Set the Shiro auth config.
 * @param type  Set the Shiro auth options type.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.shiro.ShiroAuthOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("shiroAuthOptionsOf(config, type)")
)
fun ShiroAuthOptions(
  config: io.vertx.core.json.JsonObject? = null,
  type: ShiroAuthRealmType? = null): ShiroAuthOptions = io.vertx.ext.auth.shiro.ShiroAuthOptions().apply {

  if (config != null) {
    this.setConfig(config)
  }
  if (type != null) {
    this.setType(type)
  }
}

