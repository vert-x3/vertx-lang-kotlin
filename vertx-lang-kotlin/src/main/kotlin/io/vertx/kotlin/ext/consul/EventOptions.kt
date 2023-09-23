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

import io.vertx.ext.consul.EventOptions

/**
 * A function providing a DSL for building [io.vertx.ext.consul.EventOptions] objects.
 *
 * Options used to trigger a new user event.
 *
 * @param node  Set regular expression to filter by node name
 * @param service  Set regular expression to filter by service
 * @param tag  Set regular expression to filter by tag
 * @param payload  Set payload of event
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.EventOptions original] using Vert.x codegen.
 */
fun eventOptionsOf(
  node: String? = null,
  service: String? = null,
  tag: String? = null,
  payload: String? = null): EventOptions = io.vertx.ext.consul.EventOptions().apply {

  if (node != null) {
    this.setNode(node)
  }
  if (service != null) {
    this.setService(service)
  }
  if (tag != null) {
    this.setTag(tag)
  }
  if (payload != null) {
    this.setPayload(payload)
  }
}

