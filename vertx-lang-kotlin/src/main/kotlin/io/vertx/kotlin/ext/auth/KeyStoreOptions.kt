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
 * <p>
 * This extension sets the default type to the runtime keystore type (for compatibility, reasons)
 * plus it allows the configuration of password per key using [io.vertx.ext.auth.KeyStoreOptions].
 *
 * @param type 
 * @param provider 
 * @param password 
 * @param path 
 * @param passwordProtection 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.KeyStoreOptions original] using Vert.x codegen.
 */
fun keyStoreOptionsOf(
  type: String? = null,
  provider: String? = null,
  password: String? = null,
  path: String? = null,
  passwordProtection: Map<String, String>? = null): KeyStoreOptions = io.vertx.ext.auth.KeyStoreOptions().apply {

  if (type != null) {
    this.setType(type)
  }
  if (provider != null) {
    this.setProvider(provider)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (path != null) {
    this.setPath(path)
  }
  if (passwordProtection != null) {
    this.setPasswordProtection(passwordProtection)
  }
}

