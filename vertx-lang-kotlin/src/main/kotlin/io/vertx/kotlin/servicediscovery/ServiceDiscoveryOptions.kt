package io.vertx.kotlin.servicediscovery

import io.vertx.servicediscovery.ServiceDiscoveryOptions

/**
 * A function providing a DSL for building [io.vertx.servicediscovery.ServiceDiscoveryOptions] objects.
 *
 * Options to configure the service discovery.
 *
 * @param announceAddress  Sets the event bus address on which the service arrivals, departures and modifications are announced. This address must be consistent in the whole application.
 * @param autoRegistrationOfImporters  Sets whether or not the registration of importers declared as SPI is enabled.
 * @param backendConfiguration  Sets the configuration passed to the . Refer to the backend documentation to get more details on the requirements. The default backend does not need any configuration.
 * @param name  Sets the service discovery name used in the service usage events. If not set, the node id is used.
 * @param usageAddress  Sets the usage address: the event bus address on which are sent the service usage events (bind / release).
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.ServiceDiscoveryOptions original] using Vert.x codegen.
 */
fun ServiceDiscoveryOptions(
  announceAddress: String? = null,
  autoRegistrationOfImporters: Boolean? = null,
  backendConfiguration: io.vertx.core.json.JsonObject? = null,
  name: String? = null,
  usageAddress: String? = null): ServiceDiscoveryOptions = io.vertx.servicediscovery.ServiceDiscoveryOptions().apply {

  if (announceAddress != null) {
    this.setAnnounceAddress(announceAddress)
  }
  if (autoRegistrationOfImporters != null) {
    this.setAutoRegistrationOfImporters(autoRegistrationOfImporters)
  }
  if (backendConfiguration != null) {
    this.setBackendConfiguration(backendConfiguration)
  }
  if (name != null) {
    this.setName(name)
  }
  if (usageAddress != null) {
    this.setUsageAddress(usageAddress)
  }
}

