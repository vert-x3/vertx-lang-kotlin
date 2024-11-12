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

import io.vertx.ext.consul.ServiceOptions
import io.vertx.ext.consul.CheckOptions

/**
 * A function providing a DSL for building [io.vertx.ext.consul.ServiceOptions] objects.
 *
 * Options used to register service.
 *
 * @param address  Set service address
 * @param checkListOptions  Set checks options of service
 * @param checkOptions  Set check options of service
 * @param createIndex  Set the internal index value that represents when the entry was created.
 * @param id  Set the ID of session
 * @param meta  Specifies arbitrary KV metadata linked to the service instance.
 * @param modifyIndex  Set the last index that modified this key.
 * @param name  Set service name
 * @param port  Set service port
 * @param tags  Set list of tags associated with service
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ServiceOptions original] using Vert.x codegen.
 */
fun serviceOptionsOf(
  address: String? = null,
  checkListOptions: Iterable<io.vertx.ext.consul.CheckOptions>? = null,
  checkOptions: io.vertx.ext.consul.CheckOptions? = null,
  createIndex: Long? = null,
  id: String? = null,
  meta: Map<String, String>? = null,
  modifyIndex: Long? = null,
  name: String? = null,
  port: Int? = null,
  tags: Iterable<String>? = null): ServiceOptions = io.vertx.ext.consul.ServiceOptions().apply {

  if (address != null) {
    this.setAddress(address)
  }
  if (checkListOptions != null) {
    this.setCheckListOptions(checkListOptions.toList())
  }
  if (checkOptions != null) {
    this.setCheckOptions(checkOptions)
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
  if (port != null) {
    this.setPort(port)
  }
  if (tags != null) {
    this.setTags(tags.toList())
  }
}

