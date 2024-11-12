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

import io.vertx.ext.consul.Service
import io.vertx.ext.consul.TxnOperationType

/**
 * A function providing a DSL for building [io.vertx.ext.consul.Service] objects.
 *
 * Holds properties of service and node that its containing
 *
 * @param address  Set service address
 * @param createIndex  Set the internal index value that represents when the entry was created.
 * @param id  Set ID of service
 * @param meta  Specifies arbitrary KV metadata linked to the service instance.
 * @param modifyIndex  Set the last index that modified this key.
 * @param name  Set service name
 * @param node  Set node name
 * @param nodeAddress  Set node address
 * @param port  Set service port
 * @param tags  Set list of service tags
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.Service original] using Vert.x codegen.
 */
fun serviceOf(
  address: String? = null,
  createIndex: Long? = null,
  id: String? = null,
  meta: Map<String, String>? = null,
  modifyIndex: Long? = null,
  name: String? = null,
  node: String? = null,
  nodeAddress: String? = null,
  port: Int? = null,
  tags: Iterable<String>? = null): Service = io.vertx.ext.consul.Service().apply {

  if (address != null) {
    this.setAddress(address)
  }
  if (createIndex != null) {
    this.setCreateIndex(createIndex)
  }
  if (id != null) {
    this.setId(id)
  }
  if (meta != null) {
    this.setMeta(meta)
  }
  if (modifyIndex != null) {
    this.setModifyIndex(modifyIndex)
  }
  if (name != null) {
    this.setName(name)
  }
  if (node != null) {
    this.setNode(node)
  }
  if (nodeAddress != null) {
    this.setNodeAddress(nodeAddress)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (tags != null) {
    this.setTags(tags.toList())
  }
}

