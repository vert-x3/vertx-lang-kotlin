package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.KeyValueList
import io.vertx.ext.consul.KeyValue

/**
 * A function providing a DSL for building [io.vertx.ext.consul.KeyValueList] objects.
 *
 * Holds result of key/value pairs query
 *
 * @param index  Set Consul index
 * @param list  Set list of key/value pairs
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.KeyValueList original] using Vert.x codegen.
 */
fun keyValueListOf(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.KeyValue>? = null): KeyValueList = io.vertx.ext.consul.KeyValueList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.consul.KeyValueList] objects.
 *
 * Holds result of key/value pairs query
 *
 * @param index  Set Consul index
 * @param list  Set list of key/value pairs
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.KeyValueList original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("keyValueListOf(index, list)")
)
fun KeyValueList(
  index: Long? = null,
  list: Iterable<io.vertx.ext.consul.KeyValue>? = null): KeyValueList = io.vertx.ext.consul.KeyValueList().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (list != null) {
    this.setList(list.toList())
  }
}

