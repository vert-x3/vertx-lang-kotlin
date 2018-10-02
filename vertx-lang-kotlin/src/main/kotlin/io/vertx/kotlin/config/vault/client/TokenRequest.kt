package io.vertx.kotlin.config.vault.client

import io.vertx.config.vault.client.TokenRequest

/**
 * A function providing a DSL for building [io.vertx.config.vault.client.TokenRequest] objects.
 *
 * The token request structure.
 *
 * @param displayName 
 * @param id 
 * @param meta 
 * @param noDefaultPolicy 
 * @param noParent 
 * @param numUses 
 * @param policies 
 * @param role 
 * @param ttl 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.config.vault.client.TokenRequest original] using Vert.x codegen.
 */
fun TokenRequest(
  displayName: String? = null,
  id: String? = null,
  meta: Map<String, String>? = null,
  noDefaultPolicy: Boolean? = null,
  noParent: Boolean? = null,
  numUses: Long? = null,
  policies: Iterable<String>? = null,
  role: String? = null,
  ttl: String? = null): TokenRequest = io.vertx.config.vault.client.TokenRequest().apply {

  if (displayName != null) {
    this.setDisplayName(displayName)
  }
  if (id != null) {
    this.setId(id)
  }
  if (meta != null) {
    this.setMeta(meta)
  }
  if (noDefaultPolicy != null) {
    this.setNoDefaultPolicy(noDefaultPolicy)
  }
  if (noParent != null) {
    this.setNoParent(noParent)
  }
  if (numUses != null) {
    this.setNumUses(numUses)
  }
  if (policies != null) {
    this.setPolicies(policies.toList())
  }
  if (role != null) {
    this.setRole(role)
  }
  if (ttl != null) {
    this.setTTL(ttl)
  }
}

