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
 * @param factory  Programmatically set the tracer factory to be used when tracing are enabled. <p> Only valid if [io.vertx.core.tracing.TracingOptions] = true. <p> Normally Vert.x will look on the classpath for a tracer factory implementation, but if you want to set one programmatically you can use this method.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.tracing.TracingOptions original] using Vert.x codegen.
 */
fun tracingOptionsOf(
  enabled: Boolean? = null,
  factory: io.vertx.core.spi.VertxTracerFactory? = null): TracingOptions = io.vertx.core.tracing.TracingOptions().apply {

  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (factory != null) {
    this.setFactory(factory)
  }
}

/**
 * A function providing a DSL for building [io.vertx.core.tracing.TracingOptions] objects.
 *
 * Vert.x tracing base configuration, this class can be extended by provider implementations to configure
 * those specific implementations.
 *
 * @param enabled  Set whether tracing will be enabled on the Vert.x instance.
 * @param factory  Programmatically set the tracer factory to be used when tracing are enabled. <p> Only valid if [io.vertx.core.tracing.TracingOptions] = true. <p> Normally Vert.x will look on the classpath for a tracer factory implementation, but if you want to set one programmatically you can use this method.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.tracing.TracingOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("tracingOptionsOf(enabled, factory)")
)
fun TracingOptions(
  enabled: Boolean? = null,
  factory: io.vertx.core.spi.VertxTracerFactory? = null): TracingOptions = io.vertx.core.tracing.TracingOptions().apply {

  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (factory != null) {
    this.setFactory(factory)
  }
}

