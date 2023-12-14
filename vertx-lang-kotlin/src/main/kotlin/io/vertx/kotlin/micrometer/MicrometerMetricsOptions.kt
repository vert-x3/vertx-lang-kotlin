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

import io.vertx.micrometer.MicrometerMetricsOptions
import io.vertx.micrometer.Label
import io.vertx.micrometer.Match
import io.vertx.micrometer.MetricsNaming
import io.vertx.micrometer.VertxInfluxDbOptions
import io.vertx.micrometer.VertxJmxMetricsOptions
import io.vertx.micrometer.VertxPrometheusOptions

/**
 * A function providing a DSL for building [io.vertx.micrometer.MicrometerMetricsOptions] objects.
 *
 * Vert.x micrometer configuration.
 * <p>
 * It is required to set either <code>influxDbOptions</code>, <code>prometheusOptions</code> or <code>jmxMetricsOptions</code>
 * (or, programmatically, <code>micrometerRegistry</code>) in order to actually report metrics.
 *
 * @param enabled  Set whether metrics will be enabled on the Vert.x instance. Metrics are not enabled by default.
 * @param disabledMetricsCategories  Sets metrics types that are disabled.
 * @param registryName  Set a name for the metrics registry, so that a new registry will be created and associated with this name. If <code>registryName</code> is not provided (or null), a default registry will be used. If the same name is given to several Vert.x instances (within the same JVM), they will share the same registry.
 * @param labels  Sets enabled labels. These labels can be fine-tuned later on using Micrometer's Meter filters (see http://micrometer.io/docs/concepts#_meter_filters)
 * @param labelMatches  Set a list of rules for label matching.
 * @param labelMatchs  Add a rule for label matching.
 * @param micrometerRegistry  Programmatically set the Micrometer MeterRegistry to be used by Vert.x. This is useful in several scenarios, such as: <ul>   <li>if there is already a MeterRegistry used in the application that should be used by Vert.x as well.</li>   <li>to define some backend configuration that is not covered in this module (example: reporting to non-covered backends such as New Relic)</li>   <li>to use Micrometer's CompositeRegistry</li> </ul> This setter is mutually exclusive with setInfluxDbOptions/setPrometheusOptions/setJmxMetricsOptions and takes precedence over them.
 * @param influxDbOptions  Set InfluxDB options. Setting a registry backend option is mandatory in order to effectively report metrics.
 * @param prometheusOptions  Set Prometheus options. Setting a registry backend option is mandatory in order to effectively report metrics.
 * @param jmxMetricsOptions  Set JMX metrics options. Setting a registry backend option is mandatory in order to effectively report metrics.
 * @param jvmMetricsEnabled  Whether JVM metrics should be collected. Defaults to <code>false</code>.
 * @param nettyMetricsEnabled  Whether Netty metrics should be collected. Defaults to <code>false</code>.
 * @param metricsNaming  <code>MetricsNaming</code> is a structure that holds names of all metrics, each one can be changed individually. For instance, to retrieve compatibility with the names used in Vert.x 3.x, use <code>setMetricsNaming(MetricsNaming.v3Names())</code>
 * @param meterCacheEnabled  Whether a meter cache should be enabled. Defaults to <code>true</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.micrometer.MicrometerMetricsOptions original] using Vert.x codegen.
 */
fun micrometerMetricsOptionsOf(
  enabled: Boolean? = null,
  disabledMetricsCategories: Iterable<String>? = null,
  registryName: String? = null,
  labels: Iterable<Label>? = null,
  labelMatches: Iterable<io.vertx.micrometer.Match>? = null,
  labelMatchs: Iterable<io.vertx.micrometer.Match>? = null,
  micrometerRegistry: io.micrometer.core.instrument.MeterRegistry? = null,
  influxDbOptions: io.vertx.micrometer.VertxInfluxDbOptions? = null,
  prometheusOptions: io.vertx.micrometer.VertxPrometheusOptions? = null,
  jmxMetricsOptions: io.vertx.micrometer.VertxJmxMetricsOptions? = null,
  jvmMetricsEnabled: Boolean? = null,
  nettyMetricsEnabled: Boolean? = null,
  metricsNaming: io.vertx.micrometer.MetricsNaming? = null,
  meterCacheEnabled: Boolean? = null): MicrometerMetricsOptions = io.vertx.micrometer.MicrometerMetricsOptions().apply {

  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (disabledMetricsCategories != null) {
    this.setDisabledMetricsCategories(disabledMetricsCategories.toSet())
  }
  if (registryName != null) {
    this.setRegistryName(registryName)
  }
  if (labels != null) {
    this.setLabels(labels.toSet())
  }
  if (labelMatches != null) {
    this.setLabelMatches(labelMatches.toList())
  }
  if (labelMatchs != null) {
    for (item in labelMatchs) {
      this.addLabelMatch(item)
    }
  }
  if (micrometerRegistry != null) {
    this.setMicrometerRegistry(micrometerRegistry)
  }
  if (influxDbOptions != null) {
    this.setInfluxDbOptions(influxDbOptions)
  }
  if (prometheusOptions != null) {
    this.setPrometheusOptions(prometheusOptions)
  }
  if (jmxMetricsOptions != null) {
    this.setJmxMetricsOptions(jmxMetricsOptions)
  }
  if (jvmMetricsEnabled != null) {
    this.setJvmMetricsEnabled(jvmMetricsEnabled)
  }
  if (nettyMetricsEnabled != null) {
    this.setNettyMetricsEnabled(nettyMetricsEnabled)
  }
  if (metricsNaming != null) {
    this.setMetricsNaming(metricsNaming)
  }
  if (meterCacheEnabled != null) {
    this.setMeterCacheEnabled(meterCacheEnabled)
  }
}

