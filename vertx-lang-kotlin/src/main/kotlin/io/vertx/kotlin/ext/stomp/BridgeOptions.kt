package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.BridgeOptions
import io.vertx.ext.bridge.PermittedOptions

/**
 * A function providing a DSL for building [io.vertx.ext.stomp.BridgeOptions] objects.
 *
 * Specify the event bus bridge options.
 *
 * @param inboundPermitteds  Sets the list of inbound permitted options.
 * @param outboundPermitteds  Sets the list of outbound permitted options.
 * @param pointToPoint 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.BridgeOptions original] using Vert.x codegen.
 */
fun bridgeOptionsOf(
  inboundPermitteds: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null,
  outboundPermitteds: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null,
  pointToPoint: Boolean? = null): BridgeOptions = io.vertx.ext.stomp.BridgeOptions().apply {

  if (inboundPermitteds != null) {
    this.setInboundPermitteds(inboundPermitteds.toList())
  }
  if (outboundPermitteds != null) {
    this.setOutboundPermitteds(outboundPermitteds.toList())
  }
  if (pointToPoint != null) {
    this.setPointToPoint(pointToPoint)
  }
}

