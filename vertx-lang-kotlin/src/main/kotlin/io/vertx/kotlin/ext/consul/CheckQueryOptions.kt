package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.CheckQueryOptions
import io.vertx.ext.consul.BlockingQueryOptions

/**
 * A function providing a DSL for building [io.vertx.ext.consul.CheckQueryOptions] objects.
 *
 * Options used to requesting list of checks
 *
 * @param blockingOptions  Set options for blocking query
 * @param near  Set node name for sorting the list in ascending order based on the estimated round trip time from that node.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.CheckQueryOptions original] using Vert.x codegen.
 */
fun checkQueryOptionsOf(
  blockingOptions: io.vertx.ext.consul.BlockingQueryOptions? = null,
  near: String? = null): CheckQueryOptions = io.vertx.ext.consul.CheckQueryOptions().apply {

  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (near != null) {
    this.setNear(near)
  }
}

