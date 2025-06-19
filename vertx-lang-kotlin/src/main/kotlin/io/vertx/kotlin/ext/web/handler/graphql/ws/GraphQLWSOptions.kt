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
package io.vertx.kotlin.ext.web.handler.graphql.ws

import io.vertx.ext.web.handler.graphql.ws.GraphQLWSOptions

/**
 * A function providing a DSL for building [io.vertx.ext.web.handler.graphql.ws.GraphQLWSOptions] objects.
 *
 * Options for configuring the [io.vertx.ext.web.handler.graphql.ws.GraphQLWSHandler].
 *
 * @param connectionInitWaitTimeout  Set the maximum delay in milliseconds for the client to send the <code>CONNECTION_INIT</code> message. Defaults to <code>3000</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.graphql.ws.GraphQLWSOptions original] using Vert.x codegen.
 */
fun graphQLWSOptionsOf(
  connectionInitWaitTimeout: Long? = null): GraphQLWSOptions = io.vertx.ext.web.handler.graphql.ws.GraphQLWSOptions().apply {

  if (connectionInitWaitTimeout != null) {
    this.setConnectionInitWaitTimeout(connectionInitWaitTimeout)
  }
}

