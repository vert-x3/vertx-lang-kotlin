package io.vertx.kotlin.micrometer

import io.vertx.micrometer.VertxPrometheusOptions
import io.vertx.core.http.HttpServerOptions

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

