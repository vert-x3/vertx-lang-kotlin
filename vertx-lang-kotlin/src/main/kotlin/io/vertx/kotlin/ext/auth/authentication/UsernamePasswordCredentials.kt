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

import io.vertx.ext.auth.authentication.UsernamePasswordCredentials

/**
 * A function providing a DSL for building [io.vertx.ext.auth.authentication.UsernamePasswordCredentials] objects.
 *
 * Credentials used by any [io.vertx.ext.auth.authentication.AuthenticationProvider] that requires tokens, for example JWT, Oauth2, OpenId Connect
 *
 * @param password 
 * @param username 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.authentication.UsernamePasswordCredentials original] using Vert.x codegen.
 */
fun usernamePasswordCredentialsOf(
  password: String? = null,
  username: String? = null): UsernamePasswordCredentials = io.vertx.ext.auth.authentication.UsernamePasswordCredentials(io.vertx.core.json.JsonObject()).apply {

  if (password != null) {
    this.setPassword(password)
  }
  if (username != null) {
    this.setUsername(username)
  }
}

