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
package io.vertx.kotlin.config

import io.vertx.config.ConfigChange

/**
 * A function providing a DSL for building [io.vertx.config.ConfigChange] objects.
 *
 * A structure representing a configuration change.
 *
 * @param newConfiguration  Sets the new configuration.
 * @param previousConfiguration  Sets the previous configuration.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.config.ConfigChange original] using Vert.x codegen.
 */
fun configChangeOf(
  newConfiguration: io.vertx.core.json.JsonObject? = null,
  previousConfiguration: io.vertx.core.json.JsonObject? = null): ConfigChange = io.vertx.config.ConfigChange().apply {

  if (newConfiguration != null) {
    this.setNewConfiguration(newConfiguration)
  }
  if (previousConfiguration != null) {
    this.setPreviousConfiguration(previousConfiguration)
  }
}

/**
 * A function providing a DSL for building [io.vertx.config.ConfigChange] objects.
 *
 * A structure representing a configuration change.
 *
 * @param newConfiguration  Sets the new configuration.
 * @param previousConfiguration  Sets the previous configuration.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.config.ConfigChange original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("configChangeOf(newConfiguration, previousConfiguration)")
)
fun ConfigChange(
  newConfiguration: io.vertx.core.json.JsonObject? = null,
  previousConfiguration: io.vertx.core.json.JsonObject? = null): ConfigChange = io.vertx.config.ConfigChange().apply {

  if (newConfiguration != null) {
    this.setNewConfiguration(newConfiguration)
  }
  if (previousConfiguration != null) {
    this.setPreviousConfiguration(previousConfiguration)
  }
}

