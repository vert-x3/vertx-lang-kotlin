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

import io.vertx.ext.consul.ServiceEntryList
import io.vertx.ext.consul.ServiceEntry

/**
 * A function providing a DSL for building [io.vertx.ext.consul.ServiceEntryList] objects.
 *
 * Holds list of services, nodes and related checks
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the requested list of services
 * @param list  Set list of services
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ServiceEntryList original] using Vert.x codegen.
 */
fun serviceEntryListOf(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.ServiceEntry>? = null): ServiceEntryList = io.vertx.ext.consul.ServiceEntryList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

