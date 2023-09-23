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

import io.vertx.ext.web.handler.graphql.GraphiQLHandlerOptions

/**
 * A function providing a DSL for building [io.vertx.ext.web.handler.graphql.GraphiQLHandlerOptions] objects.
 *
 * Embedded GraphiQL user interface options.
 *
 * @param enabled  Whether the GraphiQL development tool should be enabled. Defaults to <code>false</code>.
 * @param httpEnabled  Whether the HTTP transport should be enabled. Defaults to <code>true</code>.
 * @param graphQLUri  Set the GraphQL HTTP endpoint URI. Defaults to [io.vertx.ext.web.handler.graphql.GraphiQLHandlerOptions].
 * @param graphQLWSEnabled  Whether the GraphQLWS transport should be enabled. Defaults to <code>true</code>.
 * @param graphWSQLUri  Set the GraphQLWS endpoint URI. Defaults to [io.vertx.ext.web.handler.graphql.GraphiQLHandlerOptions].
 * @param headers  A fixed set of HTTP headers to add to GraphiQL requests. Defaults to <code>null</code>.
 * @param wsConnectionParams  Initial GraphQLWS connection params. Defaults to <code>null</code>.
 * @param query  Initial value of the query area in the GraphiQL user interface. Defaults to <code>null</code>.
 * @param variables  Initial value of the variables area in the GraphiQL user interface. Defaults to <code>null</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.graphql.GraphiQLHandlerOptions original] using Vert.x codegen.
 */
fun graphiQLHandlerOptionsOf(
  enabled: Boolean? = null,
  httpEnabled: Boolean? = null,
  graphQLUri: String? = null,
  graphQLWSEnabled: Boolean? = null,
  graphWSQLUri: String? = null,
  headers: Map<String, String>? = null,
  wsConnectionParams: io.vertx.core.json.JsonObject? = null,
  query: String? = null,
  variables: io.vertx.core.json.JsonObject? = null): GraphiQLHandlerOptions = io.vertx.ext.web.handler.graphql.GraphiQLHandlerOptions().apply {

  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (httpEnabled != null) {
    this.setHttpEnabled(httpEnabled)
  }
  if (graphQLUri != null) {
    this.setGraphQLUri(graphQLUri)
  }
  if (graphQLWSEnabled != null) {
    this.setGraphQLWSEnabled(graphQLWSEnabled)
  }
  if (graphWSQLUri != null) {
    this.setGraphWSQLUri(graphWSQLUri)
  }
  if (headers != null) {
    this.setHeaders(headers)
  }
  if (wsConnectionParams != null) {
    this.setWsConnectionParams(wsConnectionParams)
  }
  if (query != null) {
    this.setQuery(query)
  }
  if (variables != null) {
    this.setVariables(variables)
  }
}

