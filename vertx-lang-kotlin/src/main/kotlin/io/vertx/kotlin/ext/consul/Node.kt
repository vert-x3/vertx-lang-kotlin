package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Node

/**
 * A function providing a DSL for building [io.vertx.ext.consul.Node] objects.
 *
 *
 * @param address  Set node address
 * @param lanAddress  Set node lan address
 * @param name  Set node name
 * @param wanAddress  Set node wan address
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.Node original] using Vert.x codegen.
 */
fun nodeOf(
  address: String? = null,
  lanAddress: String? = null,
  name: String? = null,
  wanAddress: String? = null): Node = io.vertx.ext.consul.Node().apply {

  if (address != null) {
    this.setAddress(address)
  }
  if (lanAddress != null) {
    this.setLanAddress(lanAddress)
  }
  if (name != null) {
    this.setName(name)
  }
  if (wanAddress != null) {
    this.setWanAddress(wanAddress)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.consul.Node] objects.
 *
 *
 * @param address  Set node address
 * @param lanAddress  Set node lan address
 * @param name  Set node name
 * @param wanAddress  Set node wan address
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.Node original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("nodeOf(address, lanAddress, name, wanAddress)")
)
fun Node(
  address: String? = null,
  lanAddress: String? = null,
  name: String? = null,
  wanAddress: String? = null): Node = io.vertx.ext.consul.Node().apply {

  if (address != null) {
    this.setAddress(address)
  }
  if (lanAddress != null) {
    this.setLanAddress(lanAddress)
  }
  if (name != null) {
    this.setName(name)
  }
  if (wanAddress != null) {
    this.setWanAddress(wanAddress)
  }
}

