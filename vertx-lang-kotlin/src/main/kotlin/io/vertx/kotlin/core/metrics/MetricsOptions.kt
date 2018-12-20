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

