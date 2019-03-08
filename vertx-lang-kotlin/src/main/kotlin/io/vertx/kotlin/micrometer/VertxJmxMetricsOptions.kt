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
package io.vertx.kotlin.micrometer

import io.vertx.micrometer.VertxJmxMetricsOptions

/**
 * A function providing a DSL for building [io.vertx.micrometer.VertxJmxMetricsOptions] objects.
 *
 * Options for Prometheus metrics backend.
 *
 * @param domain  Set the JMX domain under which to publish metrics
 * @param enabled  Set true to enable Prometheus reporting
 * @param step  Push interval steps, in seconds. Default is 10 seconds.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.micrometer.VertxJmxMetricsOptions original] using Vert.x codegen.
 */
fun vertxJmxMetricsOptionsOf(
  domain: String? = null,
  enabled: Boolean? = null,
  step: Int? = null): VertxJmxMetricsOptions = io.vertx.micrometer.VertxJmxMetricsOptions().apply {

  if (domain != null) {
    this.setDomain(domain)
  }
  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (step != null) {
    this.setStep(step)
  }
}

/**
 * A function providing a DSL for building [io.vertx.micrometer.VertxJmxMetricsOptions] objects.
 *
 * Options for Prometheus metrics backend.
 *
 * @param domain  Set the JMX domain under which to publish metrics
 * @param enabled  Set true to enable Prometheus reporting
 * @param step  Push interval steps, in seconds. Default is 10 seconds.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.micrometer.VertxJmxMetricsOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("vertxJmxMetricsOptionsOf(domain, enabled, step)")
)
fun VertxJmxMetricsOptions(
  domain: String? = null,
  enabled: Boolean? = null,
  step: Int? = null): VertxJmxMetricsOptions = io.vertx.micrometer.VertxJmxMetricsOptions().apply {

  if (domain != null) {
    this.setDomain(domain)
  }
  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (step != null) {
    this.setStep(step)
  }
}

