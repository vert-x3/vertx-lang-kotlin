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
package io.vertx.kotlin.core.tracing

import io.vertx.core.tracing.TracingOptions

/**
 * A function providing a DSL for building [io.vertx.core.tracing.TracingOptions] objects.
 *
 * Vert.x tracing base configuration, this class can be extended by provider implementations to configure
 * those specific implementations.
 *
 * @param enabled  Set whether tracing will be enabled on the Vert.x instance.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.tracing.TracingOptions original] using Vert.x codegen.
 */
fun tracingOptionsOf(
  enabled: Boolean? = null): TracingOptions = io.vertx.core.tracing.TracingOptions().apply {

  if (enabled != null) {
    this.setEnabled(enabled)
  }
}

/**
 * A function providing a DSL for building [io.vertx.core.tracing.TracingOptions] objects.
 *
 * Vert.x tracing base configuration, this class can be extended by provider implementations to configure
 * those specific implementations.
 *
 * @param enabled  Set whether tracing will be enabled on the Vert.x instance.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.tracing.TracingOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("tracingOptionsOf(enabled)")
)
fun TracingOptions(
  enabled: Boolean? = null): TracingOptions = io.vertx.core.tracing.TracingOptions().apply {

  if (enabled != null) {
    this.setEnabled(enabled)
  }
}

