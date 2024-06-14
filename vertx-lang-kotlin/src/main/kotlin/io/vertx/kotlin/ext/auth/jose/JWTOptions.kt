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
package io.vertx.kotlin.ext.auth.jose

import io.vertx.ext.auth.jose.JWTOptions

fun jwtOptionsOf(
  leeway: Int? = null,
  ignoreExpiration: Boolean? = null,
  algorithm: String? = null,
  header: io.vertx.core.json.JsonObject? = null,
  noTimestamp: Boolean? = null,
  expiresInSeconds: Int? = null,
  expiresInMinutes: Int? = null,
  audience: Iterable<String>? = null,
  audiences: Iterable<String>? = null,
  issuer: String? = null,
  subject: String? = null,
  nonceAlgorithm: String? = null): JWTOptions = io.vertx.ext.auth.jose.JWTOptions().apply {

  if (leeway != null) {
    this.setLeeway(leeway)
  }
  if (ignoreExpiration != null) {
    this.setIgnoreExpiration(ignoreExpiration)
  }
  if (algorithm != null) {
    this.setAlgorithm(algorithm)
  }
  if (header != null) {
    this.setHeader(header)
  }
  if (noTimestamp != null) {
    this.setNoTimestamp(noTimestamp)
  }
  if (expiresInSeconds != null) {
    this.setExpiresInSeconds(expiresInSeconds)
  }
  if (expiresInMinutes != null) {
    this.setExpiresInMinutes(expiresInMinutes)
  }
  if (audience != null) {
    this.setAudience(audience.toList())
  }
  if (audiences != null) {
    for (item in audiences) {
      this.addAudience(item)
    }
  }
  if (issuer != null) {
    this.setIssuer(issuer)
  }
  if (subject != null) {
    this.setSubject(subject)
  }
  if (nonceAlgorithm != null) {
    this.setNonceAlgorithm(nonceAlgorithm)
  }
}

