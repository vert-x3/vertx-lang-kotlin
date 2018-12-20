package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.CheckList
import io.vertx.ext.consul.Check

/**
 * A function providing a DSL for building [io.vertx.ext.consul.CheckList] objects.
 *
 * Holds result of checks query
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the requested list of checks
 * @param list  Set list of checks
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.CheckList original] using Vert.x codegen.
 */
fun checkListOf(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.Check>? = null): CheckList = io.vertx.ext.consul.CheckList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

