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
 * @param buffer  The PEM or Secret key buffer. When working with secret materials, the material is expected to be encoded in <code>UTF-8</code>. PEM files are expected to be <code>US_ASCII</code> as the format uses a base64 encoding for the payload.
 * @param id 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.PubSecKeyOptions original] using Vert.x codegen.
 */
fun pubSecKeyOptionsOf(
  algorithm: String? = null,
  buffer: io.vertx.core.buffer.Buffer? = null,
  id: String? = null): PubSecKeyOptions = io.vertx.ext.auth.PubSecKeyOptions().apply {

  if (algorithm != null) {
    this.setAlgorithm(algorithm)
  }
  if (buffer != null) {
    this.setBuffer(buffer)
  }
  if (id != null) {
    this.setId(id)
  }
}

