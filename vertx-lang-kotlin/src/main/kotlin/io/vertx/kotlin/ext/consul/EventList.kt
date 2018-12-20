package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.EventList
import io.vertx.ext.consul.Event

/**
 * A function providing a DSL for building [io.vertx.ext.consul.EventList] objects.
 *
 * Holds result of events query
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the requested events
 * @param list  Set list of events
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.EventList original] using Vert.x codegen.
 */
fun eventListOf(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.Event>? = null): EventList = io.vertx.ext.consul.EventList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

