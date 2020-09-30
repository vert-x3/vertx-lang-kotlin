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

import io.vertx.ext.consul.NodeQueryOptions
import io.vertx.ext.consul.BlockingQueryOptions

/**
 * A function providing a DSL for building [io.vertx.ext.consul.NodeQueryOptions] objects.
 *
 * Options used to requesting list of nodes
 *
 * @param blockingOptions  Set options for blocking query
 * @param near  Set node name for sorting the list in ascending order based on the estimated round trip time from that node.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.NodeQueryOptions original] using Vert.x codegen.
 */
fun nodeQueryOptionsOf(
  blockingOptions: io.vertx.ext.consul.BlockingQueryOptions? = null,
  near: String? = null): NodeQueryOptions = io.vertx.ext.consul.NodeQueryOptions().apply {

  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (near != null) {
    this.setNear(near)
  }
}

