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
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("configOf(entries)")
)
fun Config(
  entries: Iterable<io.vertx.kafka.admin.ConfigEntry>? = null): Config = io.vertx.kafka.admin.Config().apply {

  if (entries != null) {
    this.setEntries(entries.toList())
  }
}

