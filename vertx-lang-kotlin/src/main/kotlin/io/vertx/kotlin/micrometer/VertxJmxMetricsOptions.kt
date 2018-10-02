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

