package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.EventOptions

/**
 * A function providing a DSL for building [io.vertx.ext.consul.EventOptions] objects.
 *
 * Options used to trigger a new user event.
 *
 * @param node  Set regular expression to filter by node name
 * @param payload  Set payload of event
 * @param service  Set regular expression to filter by service
 * @param tag  Set regular expression to filter by tag
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.EventOptions original] using Vert.x codegen.
 */
fun eventOptionsOf(
  node: String? = null,
  payload: String? = null,
  service: String? = null,
  tag: String? = null): EventOptions = io.vertx.ext.consul.EventOptions().apply {

  if (node != null) {
    this.setNode(node)
  }
  if (payload != null) {
    this.setPayload(payload)
  }
  if (service != null) {
    this.setService(service)
  }
  if (tag != null) {
    this.setTag(tag)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.consul.EventOptions] objects.
 *
 * Options used to trigger a new user event.
 *
 * @param node  Set regular expression to filter by node name
 * @param payload  Set payload of event
 * @param service  Set regular expression to filter by service
 * @param tag  Set regular expression to filter by tag
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.EventOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("eventOptionsOf(node, payload, service, tag)")
)
fun EventOptions(
  node: String? = null,
  payload: String? = null,
  service: String? = null,
  tag: String? = null): EventOptions = io.vertx.ext.consul.EventOptions().apply {

  if (node != null) {
    this.setNode(node)
  }
  if (payload != null) {
    this.setPayload(payload)
  }
  if (service != null) {
    this.setService(service)
  }
  if (tag != null) {
    this.setTag(tag)
  }
}

