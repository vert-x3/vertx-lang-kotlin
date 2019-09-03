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
package io.vertx.kotlin.ext.web.api.contract

import io.vertx.ext.web.api.contract.RouterFactoryOptions

/**
 * A function providing a DSL for building [io.vertx.ext.web.api.contract.RouterFactoryOptions] objects.
 *
 *
 * @param mountNotImplementedHandler  If true, Router Factory will automatically mount an handler that return HTTP 405/501 status code for each operation where you didn't specify an handler. You can customize the response with [io.vertx.ext.web.Router]
 * @param mountResponseContentTypeHandler  If true, when required, the factory will mount a [io.vertx.ext.web.handler.ResponseContentTypeHandler]
 * @param mountValidationFailureHandler  Enable or disable validation failure handler. If you enable it during router creation a failure handler that manages ValidationException will be mounted. You can change the validation failure handler with with function [io.vertx.ext.web.api.contract.RouterFactory]. If failure is different from ValidationException, next failure handler will be called.
 * @param operationModelKey  When set, an additional handler will be created to expose the operation model in the routing context under the given key. When the key is null, the handler is not added.
 * @param requireSecurityHandlers  If true, when you call [io.vertx.ext.web.api.contract.RouterFactory] the factory will mount for every path the required security handlers and, if a security handler is not defined, it throws an [io.vertx.ext.web.api.contract.RouterFactoryException]
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.api.contract.RouterFactoryOptions original] using Vert.x codegen.
 */
fun routerFactoryOptionsOf(
  mountNotImplementedHandler: Boolean? = null,
  mountResponseContentTypeHandler: Boolean? = null,
  mountValidationFailureHandler: Boolean? = null,
  operationModelKey: String? = null,
  requireSecurityHandlers: Boolean? = null): RouterFactoryOptions = io.vertx.ext.web.api.contract.RouterFactoryOptions().apply {

  if (mountNotImplementedHandler != null) {
    this.setMountNotImplementedHandler(mountNotImplementedHandler)
  }
  if (mountResponseContentTypeHandler != null) {
    this.setMountResponseContentTypeHandler(mountResponseContentTypeHandler)
  }
  if (mountValidationFailureHandler != null) {
    this.setMountValidationFailureHandler(mountValidationFailureHandler)
  }
  if (operationModelKey != null) {
    this.setOperationModelKey(operationModelKey)
  }
  if (requireSecurityHandlers != null) {
    this.setRequireSecurityHandlers(requireSecurityHandlers)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.web.api.contract.RouterFactoryOptions] objects.
 *
 *
 * @param mountNotImplementedHandler  If true, Router Factory will automatically mount an handler that return HTTP 405/501 status code for each operation where you didn't specify an handler. You can customize the response with [io.vertx.ext.web.Router]
 * @param mountResponseContentTypeHandler  If true, when required, the factory will mount a [io.vertx.ext.web.handler.ResponseContentTypeHandler]
 * @param mountValidationFailureHandler  Enable or disable validation failure handler. If you enable it during router creation a failure handler that manages ValidationException will be mounted. You can change the validation failure handler with with function [io.vertx.ext.web.api.contract.RouterFactory]. If failure is different from ValidationException, next failure handler will be called.
 * @param operationModelKey  When set, an additional handler will be created to expose the operation model in the routing context under the given key. When the key is null, the handler is not added.
 * @param requireSecurityHandlers  If true, when you call [io.vertx.ext.web.api.contract.RouterFactory] the factory will mount for every path the required security handlers and, if a security handler is not defined, it throws an [io.vertx.ext.web.api.contract.RouterFactoryException]
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.api.contract.RouterFactoryOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("routerFactoryOptionsOf(mountNotImplementedHandler, mountResponseContentTypeHandler, mountValidationFailureHandler, operationModelKey, requireSecurityHandlers)")
)
fun RouterFactoryOptions(
  mountNotImplementedHandler: Boolean? = null,
  mountResponseContentTypeHandler: Boolean? = null,
  mountValidationFailureHandler: Boolean? = null,
  operationModelKey: String? = null,
  requireSecurityHandlers: Boolean? = null): RouterFactoryOptions = io.vertx.ext.web.api.contract.RouterFactoryOptions().apply {

  if (mountNotImplementedHandler != null) {
    this.setMountNotImplementedHandler(mountNotImplementedHandler)
  }
  if (mountResponseContentTypeHandler != null) {
    this.setMountResponseContentTypeHandler(mountResponseContentTypeHandler)
  }
  if (mountValidationFailureHandler != null) {
    this.setMountValidationFailureHandler(mountValidationFailureHandler)
  }
  if (operationModelKey != null) {
    this.setOperationModelKey(operationModelKey)
  }
  if (requireSecurityHandlers != null) {
    this.setRequireSecurityHandlers(requireSecurityHandlers)
  }
}

