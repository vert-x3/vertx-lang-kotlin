package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.PreparedQueryExecuteResponse
import io.vertx.ext.consul.ServiceEntry

/**
 * A function providing a DSL for building [io.vertx.ext.consul.PreparedQueryExecuteResponse] objects.
 *
 * The results of executing prepared query
 *
 * @param dc  Set the datacenter that ultimately provided the list of nodes
 * @param dnsTtl  Set the TTL duration when query results are served over DNS. If this is specified, it will take precedence over any Consul agent-specific configuration.
 * @param failovers  Set the number of remote datacenters that were queried while executing the query.
 * @param nodes  Set the list of healthy nodes providing the given service, as specified by the constraints of the prepared query.
 * @param service  Set the service name that the query was selecting. This is useful for context in case an empty list of nodes is returned.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.PreparedQueryExecuteResponse original] using Vert.x codegen.
 */
fun preparedQueryExecuteResponseOf(
  dc: String? = null,
  dnsTtl: String? = null,
  failovers: Int? = null,
  nodes: Iterable<io.vertx.ext.consul.ServiceEntry>? = null,
  service: String? = null): PreparedQueryExecuteResponse = io.vertx.ext.consul.PreparedQueryExecuteResponse().apply {

  if (dc != null) {
    this.setDc(dc)
  }
  if (dnsTtl != null) {
    this.setDnsTtl(dnsTtl)
  }
  if (failovers != null) {
    this.setFailovers(failovers)
  }
  if (nodes != null) {
    this.setNodes(nodes.toList())
  }
  if (service != null) {
    this.setService(service)
  }
}

