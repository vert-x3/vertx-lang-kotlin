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
package io.vertx.kotlin.kafka.admin

import io.vertx.kafka.admin.ConfigSynonym
import org.apache.kafka.clients.admin.ConfigEntry.ConfigSource

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.ConfigSynonym] objects.
 *
 * Class representing a configuration synonym of a [io.vertx.kafka.admin.ConfigEntry]
 *
 * @param name  Set the name of this configuration
 * @param source  Set the source of this configuration
 * @param value  Set the value of this configuration, which may be null if the configuration is sensitive
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.ConfigSynonym original] using Vert.x codegen.
 */
fun configSynonymOf(
  name: String? = null,
  source: ConfigSource? = null,
  value: String? = null): ConfigSynonym = io.vertx.kafka.admin.ConfigSynonym().apply {

  if (name != null) {
    this.setName(name)
  }
  if (source != null) {
    this.setSource(source)
  }
  if (value != null) {
    this.setValue(value)
  }
}

