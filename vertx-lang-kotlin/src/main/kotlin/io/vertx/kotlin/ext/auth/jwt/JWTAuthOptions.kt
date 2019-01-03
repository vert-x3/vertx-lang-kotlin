package io.vertx.kotlin.ext.auth.jwt

import io.vertx.ext.auth.jwt.JWTAuthOptions
import io.vertx.ext.auth.KeyStoreOptions
import io.vertx.ext.auth.PubSecKeyOptions
import io.vertx.ext.auth.SecretOptions
import io.vertx.ext.jwt.JWTOptions

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
 * @param secrets 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.jwt.JWTAuthOptions original] using Vert.x codegen.
 */
fun jwtAuthOptionsOf(
  jwks: Iterable<io.vertx.core.json.JsonObject>? = null,
  jwtOptions: io.vertx.ext.jwt.JWTOptions? = null,
  keyStore: io.vertx.ext.auth.KeyStoreOptions? = null,
  permissionsClaimKey: String? = null,
  pubSecKeys: Iterable<io.vertx.ext.auth.PubSecKeyOptions>? = null,
  secrets: Iterable<io.vertx.ext.auth.SecretOptions>? = null): JWTAuthOptions = io.vertx.ext.auth.jwt.JWTAuthOptions().apply {

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
  if (secrets != null) {
    this.setSecrets(secrets.toList())
  }
}

