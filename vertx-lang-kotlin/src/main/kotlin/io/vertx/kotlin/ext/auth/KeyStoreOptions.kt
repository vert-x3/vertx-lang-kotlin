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

import io.vertx.ext.auth.KeyStoreOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.KeyStoreOptions] objects.
 *
 * Options describing how an JWT KeyStore should behave.
 *
 * @param password 
 * @param path 
 * @param type 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.KeyStoreOptions original] using Vert.x codegen.
 */
fun keyStoreOptionsOf(
  password: String? = null,
  path: String? = null,
  type: String? = null): KeyStoreOptions = io.vertx.ext.auth.KeyStoreOptions().apply {

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

/**
 * A function providing a DSL for building [io.vertx.ext.auth.KeyStoreOptions] objects.
 *
 * Options describing how an JWT KeyStore should behave.
 *
 * @param password 
 * @param path 
 * @param type 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.KeyStoreOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("keyStoreOptionsOf(password, path, type)")
)
fun KeyStoreOptions(
  password: String? = null,
  path: String? = null,
  type: String? = null): KeyStoreOptions = io.vertx.ext.auth.KeyStoreOptions().apply {

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

