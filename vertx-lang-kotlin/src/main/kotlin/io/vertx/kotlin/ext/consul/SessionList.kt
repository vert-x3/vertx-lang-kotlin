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

import io.vertx.ext.consul.SessionList
import io.vertx.ext.consul.Session

/**
 * A function providing a DSL for building [io.vertx.ext.consul.SessionList] objects.
 *
 * Holds result of sessions query
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the requested list of sessions
 * @param list  Set list of sessions
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.SessionList original] using Vert.x codegen.
 */
fun sessionListOf(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.Session>? = null): SessionList = io.vertx.ext.consul.SessionList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

