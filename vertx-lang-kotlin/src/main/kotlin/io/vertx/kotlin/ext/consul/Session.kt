package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Session

/**
 * A function providing a DSL for building [io.vertx.ext.consul.Session] objects.
 *
 * Holds properties of Consul sessions
 *
 * @param checks  Set the list of associated health checks
 * @param createIndex  Set the create index of session
 * @param id  Set the ID of node
 * @param index  Set Consul index
 * @param lockDelay  Set the Lock delay of session
 * @param node  Set the ID of node
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.Session original] using Vert.x codegen.
 */
fun sessionOf(
  checks: Iterable<String>? = null,
  createIndex: Long? = null,
  id: String? = null,
  index: Long? = null,
  lockDelay: Long? = null,
  node: String? = null): Session = io.vertx.ext.consul.Session().apply {

  if (checks != null) {
    this.setChecks(checks.toList())
  }
  if (createIndex != null) {
    this.setCreateIndex(createIndex)
  }
  if (id != null) {
    this.setId(id)
  }
  if (index != null) {
    this.setIndex(index)
  }
  if (lockDelay != null) {
    this.setLockDelay(lockDelay)
  }
  if (node != null) {
    this.setNode(node)
  }
}

