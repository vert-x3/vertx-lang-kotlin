package io.vertx.kotlin.config

import io.vertx.config.ConfigRetrieverOptions
import io.vertx.config.ConfigStoreOptions

/**
 * A function providing a DSL for building [io.vertx.config.ConfigRetrieverOptions] objects.
 *
 * Options to configure the <code>ConfigRetriever</code>.
 *
 * @param includeDefaultStores  Enables or disables the inclusion of the default stored in the configuration.
 * @param scanPeriod  Configures the scan period, in ms. This is the time amount between two checks of the configuration updates.
 * @param stores  Sets the configuration stores.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.config.ConfigRetrieverOptions original] using Vert.x codegen.
 */
fun configRetrieverOptionsOf(
  includeDefaultStores: Boolean? = null,
  scanPeriod: Long? = null,
  stores: Iterable<io.vertx.config.ConfigStoreOptions>? = null): ConfigRetrieverOptions = io.vertx.config.ConfigRetrieverOptions().apply {

  if (includeDefaultStores != null) {
    this.setIncludeDefaultStores(includeDefaultStores)
  }
  if (scanPeriod != null) {
    this.setScanPeriod(scanPeriod)
  }
  if (stores != null) {
    this.setStores(stores.toList())
  }
}

