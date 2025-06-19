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
package io.vertx.kotlin.ext.web.handler.graphql

import io.vertx.ext.web.handler.graphql.ApolloWSOptions

/**
 * A function providing a DSL for building [io.vertx.ext.web.handler.graphql.ApolloWSOptions] objects.
 *
 * Options for configuring the [io.vertx.ext.web.handler.graphql.ApolloWSHandler].
 *
 * @param keepAlive  Set the interval in milliseconds to send <code>KEEPALIVE</code> messages to all clients. Defaults to <code>30000</code>.
 * @param origin  Set the <code>Origin</code> for this handler, by default it will be <code>null</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.graphql.ApolloWSOptions original] using Vert.x codegen.
 */
fun apolloWSOptionsOf(
  keepAlive: Long? = null,
  origin: String? = null): ApolloWSOptions = io.vertx.ext.web.handler.graphql.ApolloWSOptions().apply {

  if (keepAlive != null) {
    this.setKeepAlive(keepAlive)
  }
  if (origin != null) {
    this.setOrigin(origin)
  }
}

