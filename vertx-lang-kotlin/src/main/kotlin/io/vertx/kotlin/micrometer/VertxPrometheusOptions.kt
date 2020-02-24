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

import io.vertx.micrometer.VertxPrometheusOptions

/**
 * A function providing a DSL for building [io.vertx.micrometer.VertxPrometheusOptions] objects.
 *
 * Options for Prometheus metrics backend.
 *
 * @param embeddedServerEndpoint  Set metrics endpoint. Use conjointly with the embedded server options. Defaults to <i>/metrics</i>.
 * @param embeddedServerOptions  HTTP server options for the embedded server
 * @param enabled  Set true to enable Prometheus reporting
 * @param publishQuantiles  Set true to publish histogram stats, necessary to compute quantiles. Note that it generates many new timeseries for stats, which is why it is deactivated by default.
 * @param startEmbeddedServer  When true, an embedded server will init to expose metrics with Prometheus format.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.micrometer.VertxPrometheusOptions original] using Vert.x codegen.
 */
fun vertxPrometheusOptionsOf(
  embeddedServerEndpoint: String? = null,
  embeddedServerOptions: io.vertx.core.http.HttpServerOptions? = null,
  enabled: Boolean? = null,
  publishQuantiles: Boolean? = null,
  startEmbeddedServer: Boolean? = null): VertxPrometheusOptions = io.vertx.micrometer.VertxPrometheusOptions().apply {

  if (embeddedServerEndpoint != null) {
    this.setEmbeddedServerEndpoint(embeddedServerEndpoint)
  }
  if (embeddedServerOptions != null) {
    this.setEmbeddedServerOptions(embeddedServerOptions)
  }
  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (publishQuantiles != null) {
    this.setPublishQuantiles(publishQuantiles)
  }
  if (startEmbeddedServer != null) {
    this.setStartEmbeddedServer(startEmbeddedServer)
  }
}

/**
 * A function providing a DSL for building [io.vertx.micrometer.VertxPrometheusOptions] objects.
 *
 * Options for Prometheus metrics backend.
 *
 * @param embeddedServerEndpoint  Set metrics endpoint. Use conjointly with the embedded server options. Defaults to <i>/metrics</i>.
 * @param embeddedServerOptions  HTTP server options for the embedded server
 * @param enabled  Set true to enable Prometheus reporting
 * @param publishQuantiles  Set true to publish histogram stats, necessary to compute quantiles. Note that it generates many new timeseries for stats, which is why it is deactivated by default.
 * @param startEmbeddedServer  When true, an embedded server will init to expose metrics with Prometheus format.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.micrometer.VertxPrometheusOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("vertxPrometheusOptionsOf(embeddedServerEndpoint, embeddedServerOptions, enabled, publishQuantiles, startEmbeddedServer)")
)
fun VertxPrometheusOptions(
  embeddedServerEndpoint: String? = null,
  embeddedServerOptions: io.vertx.core.http.HttpServerOptions? = null,
  enabled: Boolean? = null,
  publishQuantiles: Boolean? = null,
  startEmbeddedServer: Boolean? = null): VertxPrometheusOptions = io.vertx.micrometer.VertxPrometheusOptions().apply {

  if (embeddedServerEndpoint != null) {
    this.setEmbeddedServerEndpoint(embeddedServerEndpoint)
  }
  if (embeddedServerOptions != null) {
    this.setEmbeddedServerOptions(embeddedServerOptions)
  }
  if (enabled != null) {
    this.setEnabled(enabled)
  }
  if (publishQuantiles != null) {
    this.setPublishQuantiles(publishQuantiles)
  }
  if (startEmbeddedServer != null) {
    this.setStartEmbeddedServer(startEmbeddedServer)
  }
}

