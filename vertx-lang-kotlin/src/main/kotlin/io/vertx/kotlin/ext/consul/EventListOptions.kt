package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.EventListOptions
import io.vertx.ext.consul.BlockingQueryOptions

/**
 * A function providing a DSL for building [io.vertx.ext.consul.EventListOptions] objects.
 *
 * Holds options for events list request
 *
 * @param blockingOptions  Set options for blocking query
 * @param name  Set event name for filtering on events
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.EventListOptions original] using Vert.x codegen.
 */
fun eventListOptionsOf(
  blockingOptions: io.vertx.ext.consul.BlockingQueryOptions? = null,
  name: String? = null): EventListOptions = io.vertx.ext.consul.EventListOptions().apply {

  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (name != null) {
    this.setName(name)
  }
}

