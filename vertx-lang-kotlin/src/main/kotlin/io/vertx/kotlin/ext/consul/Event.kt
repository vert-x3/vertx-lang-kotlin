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

import io.vertx.ext.consul.Event

/**
 * A function providing a DSL for building [io.vertx.ext.consul.Event] objects.
 *
 * Holds properties of Consul event
 *
 * @param id  Set ID of event
 * @param lTime  Set the Lamport clock time
 * @param name  Set name of event
 * @param node  Set regular expression to filter by node name
 * @param payload  Set payload of event
 * @param service  Set regular expression to filter by service
 * @param tag  Set regular expression to filter by tag
 * @param version  Set version
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.Event original] using Vert.x codegen.
 */
fun eventOf(
  id: String? = null,
  lTime: Int? = null,
  name: String? = null,
  node: String? = null,
  payload: String? = null,
  service: String? = null,
  tag: String? = null,
  version: Int? = null): Event = io.vertx.ext.consul.Event().apply {

  if (id != null) {
    this.setId(id)
  }
  if (lTime != null) {
    this.setLTime(lTime)
  }
  if (name != null) {
    this.setName(name)
  }
  if (node != null) {
    this.setNode(node)
  }
  if (payload != null) {
    this.setPayload(payload)
  }
  if (service != null) {
    this.setService(service)
  }
  if (tag != null) {
    this.setTag(tag)
  }
  if (version != null) {
    this.setVersion(version)
  }
}

