package io.vertx.kotlin.ext.auth.jwt

import io.vertx.ext.auth.jwt.JWTOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.jwt.JWTOptions] objects.
 *
 * Options related to creation of new tokens.
 *
 * If any expiresInMinutes, audience, subject, issuer are not provided, there is no default.
 * The jwt generated won't include those properties in the payload.
 *
 * Generated JWTs will include an iat claim by default unless noTimestamp is specified.
 *
 * @param algorithm 
 * @param audience 
 * @param audiences 
 * @param expiresInMinutes 
 * @param expiresInSeconds 
 * @param header 
 * @param ignoreExpiration 
 * @param issuer 
 * @param leeway 
 * @param noTimestamp 
 * @param permissions  The permissions of this token.
 * @param subject 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.jwt.JWTOptions original] using Vert.x codegen.
 */
fun jwtOptionsOf(
  algorithm: String? = null,
  audience: Iterable<String>? = null,
  audiences: Iterable<String>? = null,
  expiresInMinutes: Int? = null,
  expiresInSeconds: Int? = null,
  header: io.vertx.core.json.JsonObject? = null,
  ignoreExpiration: Boolean? = null,
  issuer: String? = null,
  leeway: Int? = null,
  noTimestamp: Boolean? = null,
  permissions: Iterable<String>? = null,
  subject: String? = null): JWTOptions = io.vertx.ext.auth.jwt.JWTOptions().apply {

  if (algorithm != null) {
    this.setAlgorithm(algorithm)
  }
  if (audience != null) {
    this.setAudience(audience.toList())
  }
  if (audiences != null) {
    for (item in audiences) {
      this.addAudience(item)
    }
  }
  if (expiresInMinutes != null) {
    this.setExpiresInMinutes(expiresInMinutes)
  }
  if (expiresInSeconds != null) {
    this.setExpiresInSeconds(expiresInSeconds)
  }
  if (header != null) {
    this.setHeader(header)
  }
  if (ignoreExpiration != null) {
    this.setIgnoreExpiration(ignoreExpiration)
  }
  if (issuer != null) {
    this.setIssuer(issuer)
  }
  if (leeway != null) {
    this.setLeeway(leeway)
  }
  if (noTimestamp != null) {
    this.setNoTimestamp(noTimestamp)
  }
  if (permissions != null) {
    this.setPermissions(permissions.toList())
  }
  if (subject != null) {
    this.setSubject(subject)
  }
}

