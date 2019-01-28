package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.DcCoordinates
import io.vertx.ext.consul.Coordinate

/**
 * A function providing a DSL for building [io.vertx.ext.consul.DcCoordinates] objects.
 *
 * Holds coordinates of servers in datacenter
 *
 * @param datacenter  Set datacenter
 * @param servers  Set list of servers in datacenter
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.DcCoordinates original] using Vert.x codegen.
 */
fun dcCoordinatesOf(
  datacenter: String? = null,
  servers: Iterable<io.vertx.ext.consul.Coordinate>? = null): DcCoordinates = io.vertx.ext.consul.DcCoordinates().apply {

  if (datacenter != null) {
    this.setDatacenter(datacenter)
  }
  if (servers != null) {
    this.setServers(servers.toList())
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.consul.DcCoordinates] objects.
 *
 * Holds coordinates of servers in datacenter
 *
 * @param datacenter  Set datacenter
 * @param servers  Set list of servers in datacenter
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.DcCoordinates original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("dcCoordinatesOf(datacenter, servers)")
)
fun DcCoordinates(
  datacenter: String? = null,
  servers: Iterable<io.vertx.ext.consul.Coordinate>? = null): DcCoordinates = io.vertx.ext.consul.DcCoordinates().apply {

  if (datacenter != null) {
    this.setDatacenter(datacenter)
  }
  if (servers != null) {
    this.setServers(servers.toList())
  }
}

