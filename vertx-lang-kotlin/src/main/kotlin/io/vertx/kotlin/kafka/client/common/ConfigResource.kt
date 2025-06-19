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
package io.vertx.kotlin.kafka.client.common

import io.vertx.kafka.client.common.ConfigResource
import org.apache.kafka.common.config.ConfigResource.Type

/**
 * A function providing a DSL for building [io.vertx.kafka.client.common.ConfigResource] objects.
 *
 * A class representing resources that have configuration
 *
 * @param default  Set if this is the default resource of a resource type. Resource name is empty for the default resource.
 * @param name  Set the resource name
 * @param type  Set the resource type
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.common.ConfigResource original] using Vert.x codegen.
 */
fun configResourceOf(
  default: Boolean? = null,
  name: String? = null,
  type: Type? = null): ConfigResource = io.vertx.kafka.client.common.ConfigResource().apply {

  if (default != null) {
    this.setDefault(default)
  }
  if (name != null) {
    this.setName(name)
  }
  if (type != null) {
    this.setType(type)
  }
}

