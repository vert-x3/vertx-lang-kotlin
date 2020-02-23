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
package io.vertx.kotlin.ext.auth.jwt

import io.vertx.ext.auth.jwt.JWTAuthOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.jwt.JWTAuthOptions] objects.
 *
 * Options describing how an JWT Auth should behave.
 *
 * @param jwks 
 * @param jwtOptions 
 * @param keyStore 
 * @param permissionsClaimKey 
 * @param pubSecKeys 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.jwt.JWTAuthOptions original] using Vert.x codegen.
 */
fun jwtAuthOptionsOf(
  jwks: Iterable<io.vertx.core.json.JsonObject>? = null,
  jwtOptions: io.vertx.ext.jwt.JWTOptions? = null,
  keyStore: io.vertx.ext.auth.KeyStoreOptions? = null,
  permissionsClaimKey: String? = null,
  pubSecKeys: Iterable<io.vertx.ext.auth.PubSecKeyOptions>? = null): JWTAuthOptions = io.vertx.ext.auth.jwt.JWTAuthOptions().apply {

  if (jwks != null) {
    this.setJwks(jwks.toList())
  }
  if (jwtOptions != null) {
    this.setJWTOptions(jwtOptions)
  }
  if (keyStore != null) {
    this.setKeyStore(keyStore)
  }
  if (permissionsClaimKey != null) {
    this.setPermissionsClaimKey(permissionsClaimKey)
  }
  if (pubSecKeys != null) {
    this.setPubSecKeys(pubSecKeys.toList())
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.auth.jwt.JWTAuthOptions] objects.
 *
 * Options describing how an JWT Auth should behave.
 *
 * @param jwks 
 * @param jwtOptions 
 * @param keyStore 
 * @param permissionsClaimKey 
 * @param pubSecKeys 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.jwt.JWTAuthOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("jwtAuthOptionsOf(jwks, jwtOptions, keyStore, permissionsClaimKey, pubSecKeys)")
)
fun JWTAuthOptions(
  jwks: Iterable<io.vertx.core.json.JsonObject>? = null,
  jwtOptions: io.vertx.ext.jwt.JWTOptions? = null,
  keyStore: io.vertx.ext.auth.KeyStoreOptions? = null,
  permissionsClaimKey: String? = null,
  pubSecKeys: Iterable<io.vertx.ext.auth.PubSecKeyOptions>? = null): JWTAuthOptions = io.vertx.ext.auth.jwt.JWTAuthOptions().apply {

  if (jwks != null) {
    this.setJwks(jwks.toList())
  }
  if (jwtOptions != null) {
    this.setJWTOptions(jwtOptions)
  }
  if (keyStore != null) {
    this.setKeyStore(keyStore)
  }
  if (permissionsClaimKey != null) {
    this.setPermissionsClaimKey(permissionsClaimKey)
  }
  if (pubSecKeys != null) {
    this.setPubSecKeys(pubSecKeys.toList())
  }
}

