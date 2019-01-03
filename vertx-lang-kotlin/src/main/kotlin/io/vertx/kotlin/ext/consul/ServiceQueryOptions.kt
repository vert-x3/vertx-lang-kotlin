package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.ServiceQueryOptions
import io.vertx.ext.consul.BlockingQueryOptions

/**
 * A function providing a DSL for building [io.vertx.ext.consul.ServiceQueryOptions] objects.
 *
 * Options used to requesting list of services
 *
 * @param blockingOptions  Set options for blocking query
 * @param near  Set node name for sorting the list in ascending order based on the estimated round trip time from that node.
 * @param tag  Set tag for filtering request results
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ServiceQueryOptions original] using Vert.x codegen.
 */
fun serviceQueryOptionsOf(
  blockingOptions: io.vertx.ext.consul.BlockingQueryOptions? = null,
  near: String? = null,
  tag: String? = null): ServiceQueryOptions = io.vertx.ext.consul.ServiceQueryOptions().apply {

  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (near != null) {
    this.setNear(near)
  }
  if (tag != null) {
    this.setTag(tag)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.consul.ServiceQueryOptions] objects.
 *
 * Options used to requesting list of services
 *
 * @param blockingOptions  Set options for blocking query
 * @param near  Set node name for sorting the list in ascending order based on the estimated round trip time from that node.
 * @param tag  Set tag for filtering request results
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ServiceQueryOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("serviceQueryOptionsOf(blockingOptions, near, tag)")
)
fun ServiceQueryOptions(
  blockingOptions: io.vertx.ext.consul.BlockingQueryOptions? = null,
  near: String? = null,
  tag: String? = null): ServiceQueryOptions = io.vertx.ext.consul.ServiceQueryOptions().apply {

  if (blockingOptions != null) {
    this.setBlockingOptions(blockingOptions)
  }
  if (near != null) {
    this.setNear(near)
  }
  if (tag != null) {
    this.setTag(tag)
  }
}

