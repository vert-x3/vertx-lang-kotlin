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

import io.vertx.ext.consul.ServiceQueryOptions
import io.vertx.ext.consul.BlockingQueryOptions

/**
 * A function providing a DSL for building [io.vertx.ext.consul.ServiceQueryOptions] objects.
 *
 * Options used to requesting list of services
 *
 * @param near  Set node name for sorting the list in ascending order based on the estimated round trip time from that node.
 * @param tag  Set tag for filtering request results
 * @param blockingOptions  Set options for blocking query
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ServiceQueryOptions original] using Vert.x codegen.
 */
fun serviceQueryOptionsOf(
  near: String? = null,
  tag: String? = null,
  blockingOptions: io.vertx.ext.consul.BlockingQueryOptions? = null): ServiceQueryOptions = io.vertx.ext.consul.ServiceQueryOptions().apply {

  if (near != null) {
    this.setNear(near)
  }
  if (tag != null) {
    this.setTag(tag)
  }
  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
}

