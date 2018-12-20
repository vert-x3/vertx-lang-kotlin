package io.vertx.kotlin.ext.bridge

import io.vertx.ext.bridge.BridgeOptions
import io.vertx.ext.bridge.PermittedOptions

/**
 * A function providing a DSL for building [io.vertx.ext.bridge.BridgeOptions] objects.
 *
 * Specify the event bus bridge options.
 *
 * @param inboundPermitteds  Sets the list of inbound permitted options.
 * @param outboundPermitteds  Sets the list of outbound permitted options.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.bridge.BridgeOptions original] using Vert.x codegen.
 */
fun bridgeOptionsOf(
  inboundPermitteds: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null,
  outboundPermitteds: Iterable<io.vertx.ext.bridge.PermittedOptions>? = null): BridgeOptions = io.vertx.ext.bridge.BridgeOptions().apply {

  if (inboundPermitteds != null) {
    this.setInboundPermitteds(inboundPermitteds.toList())
  }
  if (outboundPermitteds != null) {
    this.setOutboundPermitteds(outboundPermitteds.toList())
  }
}

