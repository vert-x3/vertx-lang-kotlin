package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.CoordinateList
import io.vertx.ext.consul.Coordinate

/**
 * A function providing a DSL for building [io.vertx.ext.consul.CoordinateList] objects.
 *
 * Holds result of network coordinates query
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the requested coordinates
 * @param list  Set list of coordinates
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.CoordinateList original] using Vert.x codegen.
 */
fun coordinateListOf(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.Coordinate>? = null): CoordinateList = io.vertx.ext.consul.CoordinateList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

