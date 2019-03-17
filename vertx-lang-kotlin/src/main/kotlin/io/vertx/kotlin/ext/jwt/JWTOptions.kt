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
package io.vertx.kotlin.ext.jwt

import io.vertx.ext.jwt.JWTOptions

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
  subject: String? = null): JWTOptions = io.vertx.ext.jwt.JWTOptions().apply {

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

@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("jwtOptionsOf(algorithm, audience, audiences, expiresInMinutes, expiresInSeconds, header, ignoreExpiration, issuer, leeway, noTimestamp, permissions, subject)")
)
fun JWTOptions(
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
  subject: String? = null): JWTOptions = io.vertx.ext.jwt.JWTOptions().apply {

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

