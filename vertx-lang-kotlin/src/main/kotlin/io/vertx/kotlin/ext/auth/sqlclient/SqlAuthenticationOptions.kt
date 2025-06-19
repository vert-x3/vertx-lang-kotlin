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
package io.vertx.kotlin.ext.auth.sqlclient

import io.vertx.ext.auth.sqlclient.SqlAuthenticationOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.sqlclient.SqlAuthenticationOptions] objects.
 *
 * Options configuring JDBC authentication.
 *
 * @param authenticationQuery  Set the authentication query to use. Use this if you want to override the default authentication query.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.sqlclient.SqlAuthenticationOptions original] using Vert.x codegen.
 */
fun sqlAuthenticationOptionsOf(
  authenticationQuery: String? = null): SqlAuthenticationOptions = io.vertx.ext.auth.sqlclient.SqlAuthenticationOptions().apply {

  if (authenticationQuery != null) {
    this.setAuthenticationQuery(authenticationQuery)
  }
}

