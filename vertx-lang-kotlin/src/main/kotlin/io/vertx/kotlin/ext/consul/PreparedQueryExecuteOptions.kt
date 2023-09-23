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

import io.vertx.ext.consul.PreparedQueryExecuteOptions

/**
 * A function providing a DSL for building [io.vertx.ext.consul.PreparedQueryExecuteOptions] objects.
 *
 * Options used to execute prepared query
 *
 * @param near  Set node name for sorting the list in ascending order based on the estimated round trip time from that node. Passing <code>_agent</code> will use the agent's node for the sort. If this is not present, the default behavior will shuffle the nodes randomly each time the query is executed.
 * @param limit  Set the size of the list to the given number of nodes. This is applied after any sorting or shuffling.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.PreparedQueryExecuteOptions original] using Vert.x codegen.
 */
fun preparedQueryExecuteOptionsOf(
  near: String? = null,
  limit: Int? = null): PreparedQueryExecuteOptions = io.vertx.ext.consul.PreparedQueryExecuteOptions().apply {

  if (near != null) {
    this.setNear(near)
  }
  if (limit != null) {
    this.setLimit(limit)
  }
}

