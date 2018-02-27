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

