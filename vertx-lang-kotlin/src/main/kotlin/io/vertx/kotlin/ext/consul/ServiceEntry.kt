package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.ServiceEntry
import io.vertx.ext.consul.Check
import io.vertx.ext.consul.Node
import io.vertx.ext.consul.Service

/**
 * A function providing a DSL for building [io.vertx.ext.consul.ServiceEntry] objects.
 *
 * Holds properties of service, node and related checks
 *
 * @param checks  Set list of checks
 * @param node  Set node
 * @param service  Set service
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ServiceEntry original] using Vert.x codegen.
 */
fun serviceEntryOf(
  checks: Iterable<io.vertx.ext.consul.Check>? = null,
  node: io.vertx.ext.consul.Node? = null,
  service: io.vertx.ext.consul.Service? = null): ServiceEntry = io.vertx.ext.consul.ServiceEntry().apply {

  if (checks != null) {
    this.setChecks(checks.toList())
  }
  if (node != null) {
    this.setNode(node)
  }
  if (service != null) {
    this.setService(service)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.consul.ServiceEntry] objects.
 *
 * Holds properties of service, node and related checks
 *
 * @param checks  Set list of checks
 * @param node  Set node
 * @param service  Set service
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ServiceEntry original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("serviceEntryOf(checks, node, service)")
)
fun ServiceEntry(
  checks: Iterable<io.vertx.ext.consul.Check>? = null,
  node: io.vertx.ext.consul.Node? = null,
  service: io.vertx.ext.consul.Service? = null): ServiceEntry = io.vertx.ext.consul.ServiceEntry().apply {

  if (checks != null) {
    this.setChecks(checks.toList())
  }
  if (node != null) {
    this.setNode(node)
  }
  if (service != null) {
    this.setService(service)
  }
}

