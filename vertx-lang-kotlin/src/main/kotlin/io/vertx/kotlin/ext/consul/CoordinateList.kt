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

import io.vertx.ext.consul.CoordinateList
import io.vertx.ext.consul.Coordinate

/**
 * A function providing a DSL for building [io.vertx.ext.consul.CoordinateList] objects.
 *
 * Holds result of network coordinates query
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the requested coordinates
 * @param list  Set list of coordinates
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.CoordinateList original] using Vert.x codegen.
 */
fun coordinateListOf(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.Coordinate>? = null): CoordinateList = io.vertx.ext.consul.CoordinateList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

