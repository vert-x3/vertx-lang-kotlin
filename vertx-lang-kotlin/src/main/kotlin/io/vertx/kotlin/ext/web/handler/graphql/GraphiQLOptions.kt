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

import io.vertx.ext.web.handler.graphql.GraphiQLOptions

/**
 * A function providing a DSL for building [io.vertx.ext.web.handler.graphql.GraphiQLOptions] objects.
 *
 * Embedded GraphiQL user interface options.
 *
 * @param enabled  Whether the GraphiQL development tool should be enabled. Defaults to <code>false</code>.
 * @param graphQLUri  Set the GraphQL endpoint URI. Defaults to the path used to get the GraphiQL user interface.
 * @param headers  A fixed set of HTTP headers to add to GraphiQL requests. Defaults to <code>null</code>.
 * @param query  Initial value of the query area in the GraphiQL user interface. Defaults to <code>null</code>.
 * @param variables  Initial value of the variables area in the GraphiQL user interface. Defaults to <code>null</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.graphql.GraphiQLOptions original] using Vert.x codegen.
 */
fun graphiQLOptionsOf(
  enabled: Boolean? = null,
  graphQLUri: String? = null,
  headers: Map<String, String>? = null,
  query: String? = null,
  variables: io.vertx.core.json.JsonObject? = null): GraphiQLOptions = io.vertx.ext.web.handler.graphql.GraphiQLOptions().apply {

  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (graphQLUri != null) {
    this.setGraphQLUri(graphQLUri)
  }
  if (headers != null) {
    this.setHeaders(headers)
  }
  if (query != null) {
    this.setQuery(query)
  }
  if (variables != null) {
    this.setVariables(variables)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.web.handler.graphql.GraphiQLOptions] objects.
 *
 * Embedded GraphiQL user interface options.
 *
 * @param enabled  Whether the GraphiQL development tool should be enabled. Defaults to <code>false</code>.
 * @param graphQLUri  Set the GraphQL endpoint URI. Defaults to the path used to get the GraphiQL user interface.
 * @param headers  A fixed set of HTTP headers to add to GraphiQL requests. Defaults to <code>null</code>.
 * @param query  Initial value of the query area in the GraphiQL user interface. Defaults to <code>null</code>.
 * @param variables  Initial value of the variables area in the GraphiQL user interface. Defaults to <code>null</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.graphql.GraphiQLOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("graphiQLOptionsOf(enabled, graphQLUri, headers, query, variables)")
)
fun GraphiQLOptions(
  enabled: Boolean? = null,
  graphQLUri: String? = null,
  headers: Map<String, String>? = null,
  query: String? = null,
  variables: io.vertx.core.json.JsonObject? = null): GraphiQLOptions = io.vertx.ext.web.handler.graphql.GraphiQLOptions().apply {

  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (graphQLUri != null) {
    this.setGraphQLUri(graphQLUri)
  }
  if (headers != null) {
    this.setHeaders(headers)
  }
  if (query != null) {
    this.setQuery(query)
  }
  if (variables != null) {
    this.setVariables(variables)
  }
}

