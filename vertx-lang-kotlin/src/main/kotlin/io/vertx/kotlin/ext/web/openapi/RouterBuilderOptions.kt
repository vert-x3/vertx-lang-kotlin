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
package io.vertx.kotlin.ext.web.openapi

import io.vertx.ext.web.openapi.RouterBuilderOptions
import io.vertx.ext.web.openapi.RouteNamingStrategy

/**
 * A function providing a DSL for building [io.vertx.ext.web.openapi.RouterBuilderOptions] objects.
 *
 *
 * @param contractEndpoint  Configures the endpoint where the contract is served. The contract is served using the <a href="https://github.com/eclipse/microprofile-open-api/blob/master/spec/src/main/asciidoc/microprofile-openapi-spec.adoc#openapi-endpoint">Microprofile OpenAPI spec</a>.
 * @param mountNotImplementedHandler  If true, Router builder will automatically mount an handler that return HTTP 405/501 status code for each operation where you didn't specify an handler. You can customize the response with [io.vertx.ext.web.Router]
 * @param mountResponseContentTypeHandler  If true, when required, the factory will mount a [io.vertx.ext.web.handler.ResponseContentTypeHandler]
 * @param operationModelKey  When set, an additional handler will be created to expose the operation model in the routing context under the given key. When the key is null, the handler is not added.
 * @param requireSecurityHandlers  If true, when you call [io.vertx.ext.web.openapi.RouterBuilder] ()} the factory will mount for every path the required security handlers and, if a security handler is not defined, it throws an [io.vertx.ext.web.openapi.RouterBuilderException]
 * @param routeNamingStrategy  The strategy to follow when naming the generated routes.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.openapi.RouterBuilderOptions original] using Vert.x codegen.
 */
fun routerBuilderOptionsOf(
  contractEndpoint: String? = null,
  mountNotImplementedHandler: Boolean? = null,
  mountResponseContentTypeHandler: Boolean? = null,
  operationModelKey: String? = null,
  requireSecurityHandlers: Boolean? = null,
  routeNamingStrategy: RouteNamingStrategy? = null): RouterBuilderOptions = io.vertx.ext.web.openapi.RouterBuilderOptions().apply {

  if (contractEndpoint != null) {
    this.setContractEndpoint(contractEndpoint)
  }
  if (mountNotImplementedHandler != null) {
    this.setMountNotImplementedHandler(mountNotImplementedHandler)
  }
  if (mountResponseContentTypeHandler != null) {
    this.setMountResponseContentTypeHandler(mountResponseContentTypeHandler)
  }
  if (operationModelKey != null) {
    this.setOperationModelKey(operationModelKey)
  }
  if (requireSecurityHandlers != null) {
    this.setRequireSecurityHandlers(requireSecurityHandlers)
  }
  if (routeNamingStrategy != null) {
    this.setRouteNamingStrategy(routeNamingStrategy)
  }
}

