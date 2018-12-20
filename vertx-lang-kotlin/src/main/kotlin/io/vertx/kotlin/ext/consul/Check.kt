package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Check
import io.vertx.ext.consul.CheckStatus

/**
 * A function providing a DSL for building [io.vertx.ext.consul.Check] objects.
 *
 * Holds check properties
 *
 * @param id  Set the ID of check
 * @param name  Set the name of check
 * @param nodeName  Set the name of node
 * @param notes  Set the human-readable note of check
 * @param output  Set the output of check
 * @param serviceId  Set the ID of service with which this check associated
 * @param serviceName  Set the name of service with which this check associated
 * @param status  Set the status of check
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.Check original] using Vert.x codegen.
 */
fun checkOf(
  id: String? = null,
  name: String? = null,
  nodeName: String? = null,
  notes: String? = null,
  output: String? = null,
  serviceId: String? = null,
  serviceName: String? = null,
  status: CheckStatus? = null): Check = io.vertx.ext.consul.Check().apply {

  if (id != null) {
    this.setId(id)
  }
  if (name != null) {
    this.setName(name)
  }
  if (nodeName != null) {
    this.setNodeName(nodeName)
  }
  if (notes != null) {
    this.setNotes(notes)
  }
  if (output != null) {
    this.setOutput(output)
  }
  if (serviceId != null) {
    this.setServiceId(serviceId)
  }
  if (serviceName != null) {
    this.setServiceName(serviceName)
  }
  if (status != null) {
    this.setStatus(status)
  }
}

