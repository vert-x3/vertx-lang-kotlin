package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.ServiceList
import io.vertx.ext.consul.Service

/**
 * A function providing a DSL for building [io.vertx.ext.consul.ServiceList] objects.
 *
 * Holds result of services query
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the requested list of services
 * @param list  Set list of services
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ServiceList original] using Vert.x codegen.
 */
fun serviceListOf(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.Service>? = null): ServiceList = io.vertx.ext.consul.ServiceList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.consul.ServiceList] objects.
 *
 * Holds result of services query
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the requested list of services
 * @param list  Set list of services
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ServiceList original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("serviceListOf(index, list)")
)
fun ServiceList(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.Service>? = null): ServiceList = io.vertx.ext.consul.ServiceList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

