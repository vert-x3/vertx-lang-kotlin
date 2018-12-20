package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.SessionList
import io.vertx.ext.consul.Session

/**
 * A function providing a DSL for building [io.vertx.ext.consul.SessionList] objects.
 *
 * Holds result of sessions query
 *
 * @param index  Set Consul index, a unique identifier representing the current state of the requested list of sessions
 * @param list  Set list of sessions
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.SessionList original] using Vert.x codegen.
 */
fun sessionListOf(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.Session>? = null): SessionList = io.vertx.ext.consul.SessionList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

