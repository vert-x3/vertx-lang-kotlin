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

import io.vertx.ext.consul.ServiceEntry
import io.vertx.ext.consul.Check
import io.vertx.ext.consul.Node
import io.vertx.ext.consul.Service

/**
 * A function providing a DSL for building [io.vertx.ext.consul.ServiceEntry] objects.
 *
 * Holds properties of service, node and related checks
 *
 * @param checks  Set list of checks
 * @param node  Set node
 * @param service  Set service
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ServiceEntry original] using Vert.x codegen.
 */
fun serviceEntryOf(
  checks: Iterable<io.vertx.ext.consul.Check>? = null,
  node: io.vertx.ext.consul.Node? = null,
  service: io.vertx.ext.consul.Service? = null): ServiceEntry = io.vertx.ext.consul.ServiceEntry().apply {

  if (checks != null) {
    this.setChecks(checks.toList())
  }
  if (node != null) {
    this.setNode(node)
  }
  if (service != null) {
    this.setService(service)
  }
}

