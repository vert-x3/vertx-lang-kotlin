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

import io.vertx.ext.consul.Session

/**
 * A function providing a DSL for building [io.vertx.ext.consul.Session] objects.
 *
 * Holds properties of Consul sessions
 *
 * @param lockDelay  Set the Lock delay of session
 * @param node  Set the ID of node
 * @param checks  Set the list of associated health checks
 * @param id  Set the ID of node
 * @param createIndex  Set the create index of session
 * @param index  Set Consul index
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.Session original] using Vert.x codegen.
 */
fun sessionOf(
  lockDelay: Long? = null,
  node: String? = null,
  checks: Iterable<String>? = null,
  id: String? = null,
  createIndex: Long? = null,
  index: Long? = null): Session = io.vertx.ext.consul.Session().apply {

  if (lockDelay != null) {
    this.setLockDelay(lockDelay)
  }
  if (node != null) {
    this.setNode(node)
  }
  if (checks != null) {
    this.setChecks(checks.toList())
  }
  if (id != null) {
    this.setId(id)
  }
  if (createIndex != null) {
    this.setCreateIndex(createIndex)
  }
  if (index != null) {
    this.setIndex(index)
  }
}

