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

import io.vertx.ext.consul.Check
import io.vertx.ext.consul.CheckStatus

/**
 * A function providing a DSL for building [io.vertx.ext.consul.Check] objects.
 *
 * Holds check properties
 *
 * @param id  Set the ID of check
 * @param name  Set the name of check
 * @param node  Set the name of node
 * @param nodeName  Set the name of node Deprecated since consul 1.11, renamed to 'node'. Use [io.vertx.ext.consul.Check] ()} instead
 * @param notes  Set the human-readable note of check
 * @param output  Set the output of check
 * @param serviceId  Set the ID of service with which this check associated
 * @param serviceName  Set the name of service with which this check associated
 * @param status  Set the status of check
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.Check original] using Vert.x codegen.
 */
fun checkOf(
  id: String? = null,
  name: String? = null,
  node: String? = null,
  nodeName: String? = null,
  notes: String? = null,
  output: String? = null,
  serviceId: String? = null,
  serviceName: String? = null,
  status: CheckStatus? = null): Check = io.vertx.ext.consul.Check().apply {

  if (id != null) {
    this.setId(id)
  }
  if (name != null) {
    this.setName(name)
  }
  if (node != null) {
    this.setNode(node)
  }
  if (nodeName != null) {
    this.setNodeName(nodeName)
  }
  if (notes != null) {
    this.setNotes(notes)
  }
  if (output != null) {
    this.setOutput(output)
  }
  if (serviceId != null) {
    this.setServiceId(serviceId)
  }
  if (serviceName != null) {
    this.setServiceName(serviceName)
  }
  if (status != null) {
    this.setStatus(status)
  }
}

