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
package io.vertx.kotlin.ext.auth.htdigest

import io.vertx.ext.auth.htdigest.HtdigestCredentials

/**
 * A function providing a DSL for building [io.vertx.ext.auth.htdigest.HtdigestCredentials] objects.
 *
 * Credentials specific to the [io.vertx.ext.auth.htdigest.HtdigestAuth] authentication provider
 *
 * @param algorithm 
 * @param cnonce 
 * @param method 
 * @param nc 
 * @param nonce 
 * @param opaque 
 * @param qop 
 * @param realm 
 * @param response 
 * @param uri 
 * @param username 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.htdigest.HtdigestCredentials original] using Vert.x codegen.
 */
fun htdigestCredentialsOf(
  algorithm: String? = null,
  cnonce: String? = null,
  method: String? = null,
  nc: String? = null,
  nonce: String? = null,
  opaque: String? = null,
  qop: String? = null,
  realm: String? = null,
  response: String? = null,
  uri: String? = null,
  username: String? = null): HtdigestCredentials = io.vertx.ext.auth.htdigest.HtdigestCredentials().apply {

  if (algorithm != null) {
    this.setAlgorithm(algorithm)
  }
  if (cnonce != null) {
    this.setCnonce(cnonce)
  }
  if (method != null) {
    this.setMethod(method)
  }
  if (nc != null) {
    this.setNc(nc)
  }
  if (nonce != null) {
    this.setNonce(nonce)
  }
  if (opaque != null) {
    this.setOpaque(opaque)
  }
  if (qop != null) {
    this.setQop(qop)
  }
  if (realm != null) {
    this.setRealm(realm)
  }
  if (response != null) {
    this.setResponse(response)
  }
  if (uri != null) {
    this.setUri(uri)
  }
  if (username != null) {
    this.setUsername(username)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.auth.htdigest.HtdigestCredentials] objects.
 *
 * Credentials specific to the [io.vertx.ext.auth.htdigest.HtdigestAuth] authentication provider
 *
 * @param algorithm 
 * @param cnonce 
 * @param method 
 * @param nc 
 * @param nonce 
 * @param opaque 
 * @param qop 
 * @param realm 
 * @param response 
 * @param uri 
 * @param username 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.htdigest.HtdigestCredentials original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("htdigestCredentialsOf(algorithm, cnonce, method, nc, nonce, opaque, qop, realm, response, uri, username)")
)
fun HtdigestCredentials(
  algorithm: String? = null,
  cnonce: String? = null,
  method: String? = null,
  nc: String? = null,
  nonce: String? = null,
  opaque: String? = null,
  qop: String? = null,
  realm: String? = null,
  response: String? = null,
  uri: String? = null,
  username: String? = null): HtdigestCredentials = io.vertx.ext.auth.htdigest.HtdigestCredentials().apply {

  if (algorithm != null) {
    this.setAlgorithm(algorithm)
  }
  if (cnonce != null) {
    this.setCnonce(cnonce)
  }
  if (method != null) {
    this.setMethod(method)
  }
  if (nc != null) {
    this.setNc(nc)
  }
  if (nonce != null) {
    this.setNonce(nonce)
  }
  if (opaque != null) {
    this.setOpaque(opaque)
  }
  if (qop != null) {
    this.setQop(qop)
  }
  if (realm != null) {
    this.setRealm(realm)
  }
  if (response != null) {
    this.setResponse(response)
  }
  if (uri != null) {
    this.setUri(uri)
  }
  if (username != null) {
    this.setUsername(username)
  }
}

