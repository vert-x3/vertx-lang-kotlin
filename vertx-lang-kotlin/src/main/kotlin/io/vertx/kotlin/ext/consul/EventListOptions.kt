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

import io.vertx.ext.consul.EventListOptions
import io.vertx.ext.consul.BlockingQueryOptions

/**
 * A function providing a DSL for building [io.vertx.ext.consul.EventListOptions] objects.
 *
 * Holds options for events list request
 *
 * @param name  Set event name for filtering on events
 * @param blockingOptions  Set options for blocking query
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.EventListOptions original] using Vert.x codegen.
 */
fun eventListOptionsOf(
  name: String? = null,
  blockingOptions: io.vertx.ext.consul.BlockingQueryOptions? = null): EventListOptions = io.vertx.ext.consul.EventListOptions().apply {

  if (name != null) {
    this.setName(name)
  }
  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
}

