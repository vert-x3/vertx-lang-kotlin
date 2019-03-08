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
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("preparedQueryExecuteResponseOf(dc, dnsTtl, failovers, nodes, service)")
)
fun PreparedQueryExecuteResponse(
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

