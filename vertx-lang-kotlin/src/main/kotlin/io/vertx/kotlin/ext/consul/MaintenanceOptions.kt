package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.MaintenanceOptions

/**
 * A function providing a DSL for building [io.vertx.ext.consul.MaintenanceOptions] objects.
 *
 * Options used to placing a given service into "maintenance mode".
 * During maintenance mode, the service will be marked as unavailable
 * and will not be present in DNS or API queries. Maintenance mode is persistent
 * and will be automatically restored on agent restart.
 *
 * @param enable  Set maintenance mode to enabled: <code>true</code> to enter maintenance mode or <code>false</code> to resume normal operation. This flag is required.
 * @param id  Set the ID of service. This field is required.
 * @param reason  Set the reason message. If provided, its value should be a text string explaining the reason for placing the service into maintenance mode. This is simply to aid human operators.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.MaintenanceOptions original] using Vert.x codegen.
 */
fun maintenanceOptionsOf(
  enable: Boolean? = null,
  id: String? = null,
  reason: String? = null): MaintenanceOptions = io.vertx.ext.consul.MaintenanceOptions().apply {

  if (enable != null) {
    this.setEnable(enable)
  }
  if (id != null) {
    this.setId(id)
  }
  if (reason != null) {
    this.setReason(reason)
  }
}

