/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.core.net

import io.vertx.core.net.TrafficShapingOptions
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.core.net.TrafficShapingOptions] objects.
 *
 * Options describing how [io.netty.handler.traffic.GlobalTrafficShapingHandler] will handle traffic shaping.
 *
 * @param checkIntervalForStats  Set the delay between two computations of performances for channels or 0 if no stats are to be computed
 * @param checkIntervalForStatsTimeUnit  Set time unit for check interval for stats.
 * @param inboundGlobalBandwidth  Set bandwidth limit in bytes per second for inbound connections
 * @param maxDelayToWait  Set the maximum delay to wait in case of traffic excess
 * @param maxDelayToWaitUnit  Set the maximum delay to wait time unit
 * @param outboundGlobalBandwidth  Set bandwidth limit in bytes per second for outbound connections
 * @param peakOutboundGlobalBandwidth  Set the maximum global write size in bytes per second allowed in the buffer globally for all channels before write suspended is set. Default value is 400 MB
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.TrafficShapingOptions original] using Vert.x codegen.
 */
fun trafficShapingOptionsOf(
  checkIntervalForStats: Long? = null,
  checkIntervalForStatsTimeUnit: TimeUnit? = null,
  inboundGlobalBandwidth: Long? = null,
  maxDelayToWait: Long? = null,
  maxDelayToWaitUnit: TimeUnit? = null,
  outboundGlobalBandwidth: Long? = null,
  peakOutboundGlobalBandwidth: Long? = null): TrafficShapingOptions = io.vertx.core.net.TrafficShapingOptions().apply {

  if (checkIntervalForStats != null) {
    this.setCheckIntervalForStats(checkIntervalForStats)
  }
  if (checkIntervalForStatsTimeUnit != null) {
    this.setCheckIntervalForStatsTimeUnit(checkIntervalForStatsTimeUnit)
  }
  if (inboundGlobalBandwidth != null) {
    this.setInboundGlobalBandwidth(inboundGlobalBandwidth)
  }
  if (maxDelayToWait != null) {
    this.setMaxDelayToWait(maxDelayToWait)
  }
  if (maxDelayToWaitUnit != null) {
    this.setMaxDelayToWaitUnit(maxDelayToWaitUnit)
  }
  if (outboundGlobalBandwidth != null) {
    this.setOutboundGlobalBandwidth(outboundGlobalBandwidth)
  }
  if (peakOutboundGlobalBandwidth != null) {
    this.setPeakOutboundGlobalBandwidth(peakOutboundGlobalBandwidth)
  }
}

