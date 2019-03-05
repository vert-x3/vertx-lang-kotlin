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
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("configSynonymOf(name, source, value)")
)
fun ConfigSynonym(
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

