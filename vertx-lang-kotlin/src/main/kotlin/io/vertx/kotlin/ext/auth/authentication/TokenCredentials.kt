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
package io.vertx.kotlin.ext.auth.authentication

import io.vertx.ext.auth.authentication.TokenCredentials

/**
 * A function providing a DSL for building [io.vertx.ext.auth.authentication.TokenCredentials] objects.
 *
 * Credentials used by any [io.vertx.ext.auth.authentication.AuthenticationProvider] that requires Tokens, such as OAuth2 or JWT
 * to perform its authentication
 *
 * @param token 
 * @param scopes 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.authentication.TokenCredentials original] using Vert.x codegen.
 */
fun tokenCredentialsOf(
  token: String? = null,
  scopes: Iterable<String>? = null): TokenCredentials = io.vertx.ext.auth.authentication.TokenCredentials().apply {

  if (token != null) {
    this.setToken(token)
  }
  if (scopes != null) {
    this.setScopes(scopes.toList())
  }
}

