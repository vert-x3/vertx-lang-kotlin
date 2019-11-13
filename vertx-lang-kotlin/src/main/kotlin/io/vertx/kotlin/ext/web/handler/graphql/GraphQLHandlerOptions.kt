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

import io.vertx.ext.web.handler.graphql.GraphQLHandlerOptions

/**
 * A function providing a DSL for building [io.vertx.ext.web.handler.graphql.GraphQLHandlerOptions] objects.
 *
 * Options for configuring the [io.vertx.ext.web.handler.graphql.GraphQLHandler].
 *
 * @param requestBatchingEnabled  Whether request batching should be enabled. Defaults to <code>false</code>.
 * @param requestMultipartEnabled  Whether request multipart should be enabled. Defaults to <code>false</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.graphql.GraphQLHandlerOptions original] using Vert.x codegen.
 */
fun graphQLHandlerOptionsOf(
  requestBatchingEnabled: Boolean? = null,
  requestMultipartEnabled: Boolean? = null): GraphQLHandlerOptions = io.vertx.ext.web.handler.graphql.GraphQLHandlerOptions().apply {

  if (requestBatchingEnabled != null) {
    this.setRequestBatchingEnabled(requestBatchingEnabled)
  }
  if (requestMultipartEnabled != null) {
    this.setRequestMultipartEnabled(requestMultipartEnabled)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.web.handler.graphql.GraphQLHandlerOptions] objects.
 *
 * Options for configuring the [io.vertx.ext.web.handler.graphql.GraphQLHandler].
 *
 * @param requestBatchingEnabled  Whether request batching should be enabled. Defaults to <code>false</code>.
 * @param requestMultipartEnabled  Whether request multipart should be enabled. Defaults to <code>false</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.graphql.GraphQLHandlerOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("graphQLHandlerOptionsOf(requestBatchingEnabled, requestMultipartEnabled)")
)
fun GraphQLHandlerOptions(
  requestBatchingEnabled: Boolean? = null,
  requestMultipartEnabled: Boolean? = null): GraphQLHandlerOptions = io.vertx.ext.web.handler.graphql.GraphQLHandlerOptions().apply {

  if (requestBatchingEnabled != null) {
    this.setRequestBatchingEnabled(requestBatchingEnabled)
  }
  if (requestMultipartEnabled != null) {
    this.setRequestMultipartEnabled(requestMultipartEnabled)
  }
}

