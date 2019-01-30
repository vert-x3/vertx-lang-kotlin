package io.vertx.kotlin.ext.dropwizard

import io.vertx.ext.dropwizard.DropwizardMetricsOptions
import io.vertx.ext.dropwizard.Match

/**
 * A function providing a DSL for building [io.vertx.ext.dropwizard.DropwizardMetricsOptions] objects.
 *
 * Vert.x Dropwizard metrics configuration.
 *
 * @param baseName  Set a custom baseName for metrics.
 * @param configPath  Set the path for a config file that contains options in JSON format, to be used to create a new options object. The file will be looked for on the file system first and then on the classpath if it's not found.
 * @param enabled  Set whether metrics will be enabled on the Vert.x instance.
 * @param jmxDomain  Set the JMX domain to use when JMX metrics are enabled.
 * @param jmxEnabled  Set whether JMX will be enabled on the Vert.x instance.
 * @param monitoredEventBusHandlers  Add a monitored event bus handler.
 * @param monitoredHttpClientEndpoints  Add an monitored http client endpoint.
 * @param monitoredHttpClientUris  Add an monitored http client uri.
 * @param monitoredHttpServerUris  Add an monitored http server uri.
 * @param registryName  Set the name used for registering the metrics in the Dropwizard shared registry.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.dropwizard.DropwizardMetricsOptions original] using Vert.x codegen.
 */
fun dropwizardMetricsOptionsOf(
  baseName: String? = null,
  configPath: String? = null,
  enabled: Boolean? = null,
  jmxDomain: String? = null,
  jmxEnabled: Boolean? = null,
  monitoredEventBusHandlers: Iterable<io.vertx.ext.dropwizard.Match>? = null,
  monitoredHttpClientEndpoints: Iterable<io.vertx.ext.dropwizard.Match>? = null,
  monitoredHttpClientUris: Iterable<io.vertx.ext.dropwizard.Match>? = null,
  monitoredHttpServerUris: Iterable<io.vertx.ext.dropwizard.Match>? = null,
  registryName: String? = null): DropwizardMetricsOptions = io.vertx.ext.dropwizard.DropwizardMetricsOptions().apply {

  if (baseName != null) {
    this.setBaseName(baseName)
  }
  if (configPath != null) {
    this.setConfigPath(configPath)
  }
  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (jmxDomain != null) {
    this.setJmxDomain(jmxDomain)
  }
  if (jmxEnabled != null) {
    this.setJmxEnabled(jmxEnabled)
  }
  if (monitoredEventBusHandlers != null) {
    for (item in monitoredEventBusHandlers) {
      this.addMonitoredEventBusHandler(item)
    }
  }
  if (monitoredHttpClientEndpoints != null) {
    for (item in monitoredHttpClientEndpoints) {
      this.addMonitoredHttpClientEndpoint(item)
    }
  }
  if (monitoredHttpClientUris != null) {
    for (item in monitoredHttpClientUris) {
      this.addMonitoredHttpClientUri(item)
    }
  }
  if (monitoredHttpServerUris != null) {
    for (item in monitoredHttpServerUris) {
      this.addMonitoredHttpServerUri(item)
    }
  }
  if (registryName != null) {
    this.setRegistryName(registryName)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.dropwizard.DropwizardMetricsOptions] objects.
 *
 * Vert.x Dropwizard metrics configuration.
 *
 * @param baseName  Set a custom baseName for metrics.
 * @param configPath  Set the path for a config file that contains options in JSON format, to be used to create a new options object. The file will be looked for on the file system first and then on the classpath if it's not found.
 * @param enabled  Set whether metrics will be enabled on the Vert.x instance.
 * @param jmxDomain  Set the JMX domain to use when JMX metrics are enabled.
 * @param jmxEnabled  Set whether JMX will be enabled on the Vert.x instance.
 * @param monitoredEventBusHandlers  Add a monitored event bus handler.
 * @param monitoredHttpClientEndpoints  Add an monitored http client endpoint.
 * @param monitoredHttpClientUris  Add an monitored http client uri.
 * @param monitoredHttpServerUris  Add an monitored http server uri.
 * @param registryName  Set the name used for registering the metrics in the Dropwizard shared registry.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.dropwizard.DropwizardMetricsOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("dropwizardMetricsOptionsOf(baseName, configPath, enabled, jmxDomain, jmxEnabled, monitoredEventBusHandlers, monitoredHttpClientEndpoints, monitoredHttpClientUris, monitoredHttpServerUris, registryName)")
)
fun DropwizardMetricsOptions(
  baseName: String? = null,
  configPath: String? = null,
  enabled: Boolean? = null,
  jmxDomain: String? = null,
  jmxEnabled: Boolean? = null,
  monitoredEventBusHandlers: Iterable<io.vertx.ext.dropwizard.Match>? = null,
  monitoredHttpClientEndpoints: Iterable<io.vertx.ext.dropwizard.Match>? = null,
  monitoredHttpClientUris: Iterable<io.vertx.ext.dropwizard.Match>? = null,
  monitoredHttpServerUris: Iterable<io.vertx.ext.dropwizard.Match>? = null,
  registryName: String? = null): DropwizardMetricsOptions = io.vertx.ext.dropwizard.DropwizardMetricsOptions().apply {

  if (baseName != null) {
    this.setBaseName(baseName)
  }
  if (configPath != null) {
    this.setConfigPath(configPath)
  }
  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (jmxDomain != null) {
    this.setJmxDomain(jmxDomain)
  }
  if (jmxEnabled != null) {
    this.setJmxEnabled(jmxEnabled)
  }
  if (monitoredEventBusHandlers != null) {
    for (item in monitoredEventBusHandlers) {
      this.addMonitoredEventBusHandler(item)
    }
  }
  if (monitoredHttpClientEndpoints != null) {
    for (item in monitoredHttpClientEndpoints) {
      this.addMonitoredHttpClientEndpoint(item)
    }
  }
  if (monitoredHttpClientUris != null) {
    for (item in monitoredHttpClientUris) {
      this.addMonitoredHttpClientUri(item)
    }
  }
  if (monitoredHttpServerUris != null) {
    for (item in monitoredHttpServerUris) {
      this.addMonitoredHttpServerUri(item)
    }
  }
  if (registryName != null) {
    this.setRegistryName(registryName)
  }
}

