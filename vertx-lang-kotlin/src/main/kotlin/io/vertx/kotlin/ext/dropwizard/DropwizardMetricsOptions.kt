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
package io.vertx.kotlin.ext.dropwizard

import io.vertx.ext.dropwizard.DropwizardMetricsOptions
import io.vertx.ext.dropwizard.Match

/**
 * A function providing a DSL for building [io.vertx.ext.dropwizard.DropwizardMetricsOptions] objects.
 *
 * Vert.x Dropwizard metrics configuration.
 *
 * @param enabled  Set whether metrics will be enabled on the Vert.x instance.
 * @param registryName  Set the name used for registering the metrics in the Dropwizard shared registry.
 * @param jmxEnabled  Set whether JMX will be enabled on the Vert.x instance.
 * @param jmxDomain  Set the JMX domain to use when JMX metrics are enabled.
 * @param monitoredEventBusHandlers  Add a monitored event bus handler.
 * @param monitoredHttpServerUris  Add an monitored http server uri.
 * @param monitoredHttpServerRoutes  Add an monitored http server route.
 * @param monitoredHttpClientUris  Add an monitored http client uri.
 * @param configPath  Set the path for a config file that contains options in JSON format, to be used to create a new options object. The file will be looked for on the file system first and then on the classpath if it's not found.
 * @param monitoredHttpClientEndpoints  Add an monitored http client endpoint.
 * @param baseName  Set a custom baseName for metrics.
 * @param metricRegistry  Set the optional metric registry used instead of the Dropwizard shared registry.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.dropwizard.DropwizardMetricsOptions original] using Vert.x codegen.
 */
fun dropwizardMetricsOptionsOf(
  enabled: Boolean? = null,
  registryName: String? = null,
  jmxEnabled: Boolean? = null,
  jmxDomain: String? = null,
  monitoredEventBusHandlers: Iterable<io.vertx.ext.dropwizard.Match>? = null,
  monitoredHttpServerUris: Iterable<io.vertx.ext.dropwizard.Match>? = null,
  monitoredHttpServerRoutes: Iterable<io.vertx.ext.dropwizard.Match>? = null,
  monitoredHttpClientUris: Iterable<io.vertx.ext.dropwizard.Match>? = null,
  configPath: String? = null,
  monitoredHttpClientEndpoints: Iterable<io.vertx.ext.dropwizard.Match>? = null,
  baseName: String? = null,
  metricRegistry: com.codahale.metrics.MetricRegistry? = null): DropwizardMetricsOptions = io.vertx.ext.dropwizard.DropwizardMetricsOptions().apply {

  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (registryName != null) {
    this.setRegistryName(registryName)
  }
  if (jmxEnabled != null) {
    this.setJmxEnabled(jmxEnabled)
  }
  if (jmxDomain != null) {
    this.setJmxDomain(jmxDomain)
  }
  if (monitoredEventBusHandlers != null) {
    for (item in monitoredEventBusHandlers) {
      this.addMonitoredEventBusHandler(item)
    }
  }
  if (monitoredHttpServerUris != null) {
    for (item in monitoredHttpServerUris) {
      this.addMonitoredHttpServerUri(item)
    }
  }
  if (monitoredHttpServerRoutes != null) {
    for (item in monitoredHttpServerRoutes) {
      this.addMonitoredHttpServerRoute(item)
    }
  }
  if (monitoredHttpClientUris != null) {
    for (item in monitoredHttpClientUris) {
      this.addMonitoredHttpClientUri(item)
    }
  }
  if (configPath != null) {
    this.setConfigPath(configPath)
  }
  if (monitoredHttpClientEndpoints != null) {
    for (item in monitoredHttpClientEndpoints) {
      this.addMonitoredHttpClientEndpoint(item)
    }
  }
  if (baseName != null) {
    this.setBaseName(baseName)
  }
  if (metricRegistry != null) {
    this.setMetricRegistry(metricRegistry)
  }
}

