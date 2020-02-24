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

/**
 * A function providing a DSL for building [io.vertx.ext.consul.EventListOptions] objects.
 *
 * Holds options for events list request
 *
 * @param blockingOptions  Set options for blocking query
 * @param name  Set event name for filtering on events
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.EventListOptions original] using Vert.x codegen.
 */
fun eventListOptionsOf(
  blockingOptions: io.vertx.ext.consul.BlockingQueryOptions? = null,
  name: String? = null): EventListOptions = io.vertx.ext.consul.EventListOptions().apply {

  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (name != null) {
    this.setName(name)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.consul.EventListOptions] objects.
 *
 * Holds options for events list request
 *
 * @param blockingOptions  Set options for blocking query
 * @param name  Set event name for filtering on events
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.EventListOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("eventListOptionsOf(blockingOptions, name)")
)
fun EventListOptions(
  blockingOptions: io.vertx.ext.consul.BlockingQueryOptions? = null,
  name: String? = null): EventListOptions = io.vertx.ext.consul.EventListOptions().apply {

  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (name != null) {
    this.setName(name)
  }
}

