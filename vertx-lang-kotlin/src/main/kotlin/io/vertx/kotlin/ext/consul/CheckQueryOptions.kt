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

import io.vertx.ext.consul.CheckQueryOptions
import io.vertx.ext.consul.BlockingQueryOptions

/**
 * A function providing a DSL for building [io.vertx.ext.consul.CheckQueryOptions] objects.
 *
 * Options used to requesting list of checks
 *
 * @param blockingOptions  Set options for blocking query
 * @param dc  Set an optional datacenter. This will default to the datacenter of the agent being queried
 * @param filter  Set the expression to filter the queries results prior to returning the data
 * @param near  Set node name for sorting the list in ascending order based on the estimated round trip time from that node.
 * @param ns  Sets the optional namespace to list checks. By default, the namespace will be inherited from the request's ACL token or will default to the default namespace.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.CheckQueryOptions original] using Vert.x codegen.
 */
fun checkQueryOptionsOf(
  blockingOptions: io.vertx.ext.consul.BlockingQueryOptions? = null,
  dc: String? = null,
  filter: String? = null,
  near: String? = null,
  ns: String? = null): CheckQueryOptions = io.vertx.ext.consul.CheckQueryOptions().apply {

  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (dc != null) {
    this.setDc(dc)
  }
  if (filter != null) {
    this.setFilter(filter)
  }
  if (near != null) {
    this.setNear(near)
  }
  if (ns != null) {
    this.setNs(ns)
  }
}

