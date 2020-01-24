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
package io.vertx.kotlin.ext.auth

import io.vertx.ext.auth.PubSecKeyOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.PubSecKeyOptions] objects.
 *
 * Options describing Key stored in PEM format.
 *
 * @param algorithm 
 * @param buffer  The PEM or Secret key buffer
 * @param certificate 
 * @param id 
 * @param publicKey 
 * @param secretKey 
 * @param symmetric 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.PubSecKeyOptions original] using Vert.x codegen.
 */
fun pubSecKeyOptionsOf(
  algorithm: String? = null,
  buffer: String? = null,
  certificate: Boolean? = null,
  id: String? = null,
  publicKey: String? = null,
  secretKey: String? = null,
  symmetric: Boolean? = null): PubSecKeyOptions = io.vertx.ext.auth.PubSecKeyOptions().apply {

  if (algorithm != null) {
    this.setAlgorithm(algorithm)
  }
  if (buffer != null) {
    this.setBuffer(buffer)
  }
  if (certificate != null) {
    this.setCertificate(certificate)
  }
  if (id != null) {
    this.setId(id)
  }
  if (publicKey != null) {
    this.setPublicKey(publicKey)
  }
  if (secretKey != null) {
    this.setSecretKey(secretKey)
  }
  if (symmetric != null) {
    this.setSymmetric(symmetric)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.auth.PubSecKeyOptions] objects.
 *
 * Options describing Key stored in PEM format.
 *
 * @param algorithm 
 * @param buffer  The PEM or Secret key buffer
 * @param certificate 
 * @param id 
 * @param publicKey 
 * @param secretKey 
 * @param symmetric 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.PubSecKeyOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("pubSecKeyOptionsOf(algorithm, buffer, certificate, id, publicKey, secretKey, symmetric)")
)
fun PubSecKeyOptions(
  algorithm: String? = null,
  buffer: String? = null,
  certificate: Boolean? = null,
  id: String? = null,
  publicKey: String? = null,
  secretKey: String? = null,
  symmetric: Boolean? = null): PubSecKeyOptions = io.vertx.ext.auth.PubSecKeyOptions().apply {

  if (algorithm != null) {
    this.setAlgorithm(algorithm)
  }
  if (buffer != null) {
    this.setBuffer(buffer)
  }
  if (certificate != null) {
    this.setCertificate(certificate)
  }
  if (id != null) {
    this.setId(id)
  }
  if (publicKey != null) {
    this.setPublicKey(publicKey)
  }
  if (secretKey != null) {
    this.setSecretKey(secretKey)
  }
  if (symmetric != null) {
    this.setSymmetric(symmetric)
  }
}

