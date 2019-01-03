package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.NodeQueryOptions
import io.vertx.ext.consul.BlockingQueryOptions

/**
 * A function providing a DSL for building [io.vertx.ext.consul.NodeQueryOptions] objects.
 *
 * Options used to requesting list of nodes
 *
 * @param blockingOptions  Set options for blocking query
 * @param near  Set node name for sorting the list in ascending order based on the estimated round trip time from that node.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.NodeQueryOptions original] using Vert.x codegen.
 */
fun nodeQueryOptionsOf(
  blockingOptions: io.vertx.ext.consul.BlockingQueryOptions? = null,
  near: String? = null): NodeQueryOptions = io.vertx.ext.consul.NodeQueryOptions().apply {

  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (near != null) {
    this.setNear(near)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.consul.NodeQueryOptions] objects.
 *
 * Options used to requesting list of nodes
 *
 * @param blockingOptions  Set options for blocking query
 * @param near  Set node name for sorting the list in ascending order based on the estimated round trip time from that node.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.NodeQueryOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("nodeQueryOptionsOf(blockingOptions, near)")
)
fun NodeQueryOptions(
  blockingOptions: io.vertx.ext.consul.BlockingQueryOptions? = null,
  near: String? = null): NodeQueryOptions = io.vertx.ext.consul.NodeQueryOptions().apply {

  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (near != null) {
    this.setNear(near)
  }
}

