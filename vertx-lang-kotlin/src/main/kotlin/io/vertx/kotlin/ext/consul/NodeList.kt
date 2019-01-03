package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.NodeList
import io.vertx.ext.consul.Node

/**
 * A function providing a DSL for building [io.vertx.ext.consul.NodeList] objects.
 *
 * Holds result of nodes query
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the requested list of nodes
 * @param list  Set list of nodes
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.NodeList original] using Vert.x codegen.
 */
fun nodeListOf(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.Node>? = null): NodeList = io.vertx.ext.consul.NodeList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.consul.NodeList] objects.
 *
 * Holds result of nodes query
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the requested list of nodes
 * @param list  Set list of nodes
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.NodeList original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("nodeListOf(index, list)")
)
fun NodeList(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.Node>? = null): NodeList = io.vertx.ext.consul.NodeList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

