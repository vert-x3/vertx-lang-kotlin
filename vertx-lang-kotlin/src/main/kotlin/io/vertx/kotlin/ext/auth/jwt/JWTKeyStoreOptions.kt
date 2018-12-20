package io.vertx.kotlin.ext.auth.jwt

import io.vertx.ext.auth.jwt.JWTKeyStoreOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.jwt.JWTKeyStoreOptions] objects.
 *
 * Options describing how an JWT KeyStore should behave.
 *
 * @param password 
 * @param path 
 * @param type 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.jwt.JWTKeyStoreOptions original] using Vert.x codegen.
 */
fun jWTKeyStoreOptionsOf(
  password: String? = null,
  path: String? = null,
  type: String? = null): JWTKeyStoreOptions = io.vertx.ext.auth.jwt.JWTKeyStoreOptions().apply {

  if (password != null) {
    this.setPassword(password)
  }
  if (path != null) {
    this.setPath(path)
  }
  if (type != null) {
    this.setType(type)
  }
}

