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
 * This is an extended version core's [io.vertx.core.net.KeyStoreOptions].
 *
 * This extension sets the default type to the runtime keystore type (for compatibility, reasons)
 * plus it allows the configuration of password per key using [io.vertx.ext.auth.KeyStoreOptions].
 *
 * @param password  Set the password for the key store
 * @param passwordProtection 
 * @param path  Set the path to the key store
 * @param type 
 * @param value  Set the key store as a buffer
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.KeyStoreOptions original] using Vert.x codegen.
 */
fun keyStoreOptionsOf(
  password: String? = null,
  passwordProtection: Map<String, String>? = null,
  path: String? = null,
  type: String? = null,
  value: io.vertx.core.buffer.Buffer? = null): KeyStoreOptions = io.vertx.ext.auth.KeyStoreOptions().apply {

  if (password != null) {
    this.setPassword(password)
  }
  if (passwordProtection != null) {
    this.setPasswordProtection(passwordProtection)
  }
  if (path != null) {
    this.setPath(path)
  }
  if (type != null) {
    this.setType(type)
  }
  if (value != null) {
    this.setValue(value)
  }
}

