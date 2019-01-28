package io.vertx.kotlin.ext.auth

import io.vertx.ext.auth.SecretOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.SecretOptions] objects.
 *
 * Options describing a secret.
 *
 * @param secret 
 * @param type 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.SecretOptions original] using Vert.x codegen.
 */
fun secretOptionsOf(
  secret: String? = null,
  type: String? = null): SecretOptions = io.vertx.ext.auth.SecretOptions().apply {

  if (secret != null) {
    this.setSecret(secret)
  }
  if (type != null) {
    this.setType(type)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.auth.SecretOptions] objects.
 *
 * Options describing a secret.
 *
 * @param secret 
 * @param type 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.SecretOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("secretOptionsOf(secret, type)")
)
fun SecretOptions(
  secret: String? = null,
  type: String? = null): SecretOptions = io.vertx.ext.auth.SecretOptions().apply {

  if (secret != null) {
    this.setSecret(secret)
  }
  if (type != null) {
    this.setType(type)
  }
}

