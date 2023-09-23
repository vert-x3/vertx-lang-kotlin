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
package io.vertx.kotlin.micrometer

import io.vertx.micrometer.MetricsNaming

/**
 * A function providing a DSL for building [io.vertx.micrometer.MetricsNaming] objects.
 *
 * Options for naming all metrics
 *
 * @param clientQueueTime 
 * @param clientQueuePending 
 * @param clientProcessingTime 
 * @param clientProcessingPending 
 * @param clientResetsCount 
 * @param datagramBytesRead 
 * @param datagramBytesWritten 
 * @param datagramErrorCount 
 * @param ebHandlers 
 * @param ebPending 
 * @param ebProcessed 
 * @param ebPublished 
 * @param ebSent 
 * @param ebReceived 
 * @param ebDelivered 
 * @param ebDiscarded 
 * @param ebReplyFailures 
 * @param ebBytesRead 
 * @param ebBytesWritten 
 * @param httpQueueTime 
 * @param httpQueuePending 
 * @param httpActiveRequests 
 * @param httpRequestsCount 
 * @param httpRequestBytes 
 * @param httpResponseTime 
 * @param httpResponsesCount 
 * @param httpResponseBytes 
 * @param httpActiveWsConnections 
 * @param httpRequestResetsCount 
 * @param netActiveConnections 
 * @param poolUsage 
 * @param poolInUse 
 * @param poolUsageRatio 
 * @param poolCompleted 
 * @param netBytesRead 
 * @param netBytesWritten 
 * @param netErrorCount 
 * @param poolQueueTime 
 * @param poolQueuePending 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.micrometer.MetricsNaming original] using Vert.x codegen.
 */
fun metricsNamingOf(
  clientQueueTime: String? = null,
  clientQueuePending: String? = null,
  clientProcessingTime: String? = null,
  clientProcessingPending: String? = null,
  clientResetsCount: String? = null,
  datagramBytesRead: String? = null,
  datagramBytesWritten: String? = null,
  datagramErrorCount: String? = null,
  ebHandlers: String? = null,
  ebPending: String? = null,
  ebProcessed: String? = null,
  ebPublished: String? = null,
  ebSent: String? = null,
  ebReceived: String? = null,
  ebDelivered: String? = null,
  ebDiscarded: String? = null,
  ebReplyFailures: String? = null,
  ebBytesRead: String? = null,
  ebBytesWritten: String? = null,
  httpQueueTime: String? = null,
  httpQueuePending: String? = null,
  httpActiveRequests: String? = null,
  httpRequestsCount: String? = null,
  httpRequestBytes: String? = null,
  httpResponseTime: String? = null,
  httpResponsesCount: String? = null,
  httpResponseBytes: String? = null,
  httpActiveWsConnections: String? = null,
  httpRequestResetsCount: String? = null,
  netActiveConnections: String? = null,
  poolUsage: String? = null,
  poolInUse: String? = null,
  poolUsageRatio: String? = null,
  poolCompleted: String? = null,
  netBytesRead: String? = null,
  netBytesWritten: String? = null,
  netErrorCount: String? = null,
  poolQueueTime: String? = null,
  poolQueuePending: String? = null): MetricsNaming = io.vertx.micrometer.MetricsNaming().apply {

  if (clientQueueTime != null) {
    this.setClientQueueTime(clientQueueTime)
  }
  if (clientQueuePending != null) {
    this.setClientQueuePending(clientQueuePending)
  }
  if (clientProcessingTime != null) {
    this.setClientProcessingTime(clientProcessingTime)
  }
  if (clientProcessingPending != null) {
    this.setClientProcessingPending(clientProcessingPending)
  }
  if (clientResetsCount != null) {
    this.setClientResetsCount(clientResetsCount)
  }
  if (datagramBytesRead != null) {
    this.setDatagramBytesRead(datagramBytesRead)
  }
  if (datagramBytesWritten != null) {
    this.setDatagramBytesWritten(datagramBytesWritten)
  }
  if (datagramErrorCount != null) {
    this.setDatagramErrorCount(datagramErrorCount)
  }
  if (ebHandlers != null) {
    this.setEbHandlers(ebHandlers)
  }
  if (ebPending != null) {
    this.setEbPending(ebPending)
  }
  if (ebProcessed != null) {
    this.setEbProcessed(ebProcessed)
  }
  if (ebPublished != null) {
    this.setEbPublished(ebPublished)
  }
  if (ebSent != null) {
    this.setEbSent(ebSent)
  }
  if (ebReceived != null) {
    this.setEbReceived(ebReceived)
  }
  if (ebDelivered != null) {
    this.setEbDelivered(ebDelivered)
  }
  if (ebDiscarded != null) {
    this.setEbDiscarded(ebDiscarded)
  }
  if (ebReplyFailures != null) {
    this.setEbReplyFailures(ebReplyFailures)
  }
  if (ebBytesRead != null) {
    this.setEbBytesRead(ebBytesRead)
  }
  if (ebBytesWritten != null) {
    this.setEbBytesWritten(ebBytesWritten)
  }
  if (httpQueueTime != null) {
    this.setHttpQueueTime(httpQueueTime)
  }
  if (httpQueuePending != null) {
    this.setHttpQueuePending(httpQueuePending)
  }
  if (httpActiveRequests != null) {
    this.setHttpActiveRequests(httpActiveRequests)
  }
  if (httpRequestsCount != null) {
    this.setHttpRequestsCount(httpRequestsCount)
  }
  if (httpRequestBytes != null) {
    this.setHttpRequestBytes(httpRequestBytes)
  }
  if (httpResponseTime != null) {
    this.setHttpResponseTime(httpResponseTime)
  }
  if (httpResponsesCount != null) {
    this.setHttpResponsesCount(httpResponsesCount)
  }
  if (httpResponseBytes != null) {
    this.setHttpResponseBytes(httpResponseBytes)
  }
  if (httpActiveWsConnections != null) {
    this.setHttpActiveWsConnections(httpActiveWsConnections)
  }
  if (httpRequestResetsCount != null) {
    this.setHttpRequestResetsCount(httpRequestResetsCount)
  }
  if (netActiveConnections != null) {
    this.setNetActiveConnections(netActiveConnections)
  }
  if (poolUsage != null) {
    this.setPoolUsage(poolUsage)
  }
  if (poolInUse != null) {
    this.setPoolInUse(poolInUse)
  }
  if (poolUsageRatio != null) {
    this.setPoolUsageRatio(poolUsageRatio)
  }
  if (poolCompleted != null) {
    this.setPoolCompleted(poolCompleted)
  }
  if (netBytesRead != null) {
    this.setNetBytesRead(netBytesRead)
  }
  if (netBytesWritten != null) {
    this.setNetBytesWritten(netBytesWritten)
  }
  if (netErrorCount != null) {
    this.setNetErrorCount(netErrorCount)
  }
  if (poolQueueTime != null) {
    this.setPoolQueueTime(poolQueueTime)
  }
  if (poolQueuePending != null) {
    this.setPoolQueuePending(poolQueuePending)
  }
}

