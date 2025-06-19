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

import io.vertx.ext.consul.Node

/**
 * A function providing a DSL for building [io.vertx.ext.consul.Node] objects.
 *
 *
 * @param address  Set node address
 * @param datacenter  Set node datacenter
 * @param id  Set node id
 * @param lanAddress  Set node lan address
 * @param name  Set node name
 * @param nodeMeta  Set node meta
 * @param wanAddress  Set node wan address
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.Node original] using Vert.x codegen.
 */
fun nodeOf(
  address: String? = null,
  datacenter: String? = null,
  id: String? = null,
  lanAddress: String? = null,
  name: String? = null,
  nodeMeta: Map<String, String>? = null,
  wanAddress: String? = null): Node = io.vertx.ext.consul.Node().apply {

  if (address != null) {
    this.setAddress(address)
  }
  if (datacenter != null) {
    this.setDatacenter(datacenter)
  }
  if (id != null) {
    this.setId(id)
  }
  if (lanAddress != null) {
    this.setLanAddress(lanAddress)
  }
  if (name != null) {
    this.setName(name)
  }
  if (nodeMeta != null) {
    this.setNodeMeta(nodeMeta)
  }
  if (wanAddress != null) {
    this.setWanAddress(wanAddress)
  }
}

