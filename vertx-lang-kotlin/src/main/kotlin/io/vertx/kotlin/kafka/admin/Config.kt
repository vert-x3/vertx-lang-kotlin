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

import io.vertx.kafka.admin.Config
import io.vertx.kafka.admin.ConfigEntry

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.Config] objects.
 *
 * A configuration object containing the configuration entries for a resource
 *
 * @param entries  Set the configuration entries for a resource
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.Config original] using Vert.x codegen.
 */
fun configOf(
  entries: Iterable<io.vertx.kafka.admin.ConfigEntry>? = null): Config = io.vertx.kafka.admin.Config().apply {

  if (entries != null) {
    this.setEntries(entries.toList())
  }
}

