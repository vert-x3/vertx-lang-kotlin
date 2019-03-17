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

import io.vertx.ext.auth.SecretOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.SecretOptions] objects.
 *
 * Options describing a secret.
 *
 * @param secret 
 * @param type 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.SecretOptions original] using Vert.x codegen.
 */
fun secretOptionsOf(
  secret: String? = null,
  type: String? = null): SecretOptions = io.vertx.ext.auth.SecretOptions().apply {

  if (secret != null) {
    this.setSecret(secret)
  }
  if (type != null) {
    this.setType(type)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.auth.SecretOptions] objects.
 *
 * Options describing a secret.
 *
 * @param secret 
 * @param type 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.SecretOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("secretOptionsOf(secret, type)")
)
fun SecretOptions(
  secret: String? = null,
  type: String? = null): SecretOptions = io.vertx.ext.auth.SecretOptions().apply {

  if (secret != null) {
    this.setSecret(secret)
  }
  if (type != null) {
    this.setType(type)
  }
}

