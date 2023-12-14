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
package io.vertx.kotlin.core.metrics

import io.vertx.core.metrics.MetricsOptions

/**
 * A function providing a DSL for building [io.vertx.core.metrics.MetricsOptions] objects.
 *
 * Vert.x metrics base configuration, this class can be extended by provider implementations to configure
 * those specific implementations.
 *
 * @param enabled  Set whether metrics will be enabled on the Vert.x instance.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.metrics.MetricsOptions original] using Vert.x codegen.
 */
fun metricsOptionsOf(
  enabled: Boolean? = null): MetricsOptions = io.vertx.core.metrics.MetricsOptions().apply {

  if (enabled != null) {
    this.setEnabled(enabled)
  }
}

