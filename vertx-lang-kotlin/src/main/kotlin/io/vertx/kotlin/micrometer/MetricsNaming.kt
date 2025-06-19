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
 * @param clientProcessingPending 
 * @param clientProcessingTime 
 * @param clientQueuePending 
 * @param clientQueueTime 
 * @param clientResetsCount 
 * @param datagramBytesRead 
 * @param datagramBytesWritten 
 * @param datagramErrorCount 
 * @param ebBytesRead 
 * @param ebBytesWritten 
 * @param ebDelivered 
 * @param ebDiscarded 
 * @param ebHandlers 
 * @param ebPending 
 * @param ebProcessed 
 * @param ebPublished 
 * @param ebReceived 
 * @param ebReplyFailures 
 * @param ebSent 
 * @param httpActiveRequests 
 * @param httpActiveWsConnections 
 * @param httpQueuePending 
 * @param httpQueueTime 
 * @param httpRequestBytes 
 * @param httpRequestResetsCount 
 * @param httpRequestsCount 
 * @param httpResponseBytes 
 * @param httpResponseTime 
 * @param httpResponsesCount 
 * @param netActiveConnections 
 * @param netBytesRead 
 * @param netBytesWritten 
 * @param netErrorCount 
 * @param poolCompleted 
 * @param poolInUse 
 * @param poolQueuePending 
 * @param poolQueueTime 
 * @param poolUsage 
 * @param poolUsageRatio 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.micrometer.MetricsNaming original] using Vert.x codegen.
 */
fun metricsNamingOf(
  clientProcessingPending: String? = null,
  clientProcessingTime: String? = null,
  clientQueuePending: String? = null,
  clientQueueTime: String? = null,
  clientResetsCount: String? = null,
  datagramBytesRead: String? = null,
  datagramBytesWritten: String? = null,
  datagramErrorCount: String? = null,
  ebBytesRead: String? = null,
  ebBytesWritten: String? = null,
  ebDelivered: String? = null,
  ebDiscarded: String? = null,
  ebHandlers: String? = null,
  ebPending: String? = null,
  ebProcessed: String? = null,
  ebPublished: String? = null,
  ebReceived: String? = null,
  ebReplyFailures: String? = null,
  ebSent: String? = null,
  httpActiveRequests: String? = null,
  httpActiveWsConnections: String? = null,
  httpQueuePending: String? = null,
  httpQueueTime: String? = null,
  httpRequestBytes: String? = null,
  httpRequestResetsCount: String? = null,
  httpRequestsCount: String? = null,
  httpResponseBytes: String? = null,
  httpResponseTime: String? = null,
  httpResponsesCount: String? = null,
  netActiveConnections: String? = null,
  netBytesRead: String? = null,
  netBytesWritten: String? = null,
  netErrorCount: String? = null,
  poolCompleted: String? = null,
  poolInUse: String? = null,
  poolQueuePending: String? = null,
  poolQueueTime: String? = null,
  poolUsage: String? = null,
  poolUsageRatio: String? = null): MetricsNaming = io.vertx.micrometer.MetricsNaming().apply {

  if (clientProcessingPending != null) {
    this.setClientProcessingPending(clientProcessingPending)
  }
  if (clientProcessingTime != null) {
    this.setClientProcessingTime(clientProcessingTime)
  }
  if (clientQueuePending != null) {
    this.setClientQueuePending(clientQueuePending)
  }
  if (clientQueueTime != null) {
    this.setClientQueueTime(clientQueueTime)
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
  if (ebBytesRead != null) {
    this.setEbBytesRead(ebBytesRead)
  }
  if (ebBytesWritten != null) {
    this.setEbBytesWritten(ebBytesWritten)
  }
  if (ebDelivered != null) {
    this.setEbDelivered(ebDelivered)
  }
  if (ebDiscarded != null) {
    this.setEbDiscarded(ebDiscarded)
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
  if (ebReceived != null) {
    this.setEbReceived(ebReceived)
  }
  if (ebReplyFailures != null) {
    this.setEbReplyFailures(ebReplyFailures)
  }
  if (ebSent != null) {
    this.setEbSent(ebSent)
  }
  if (httpActiveRequests != null) {
    this.setHttpActiveRequests(httpActiveRequests)
  }
  if (httpActiveWsConnections != null) {
    this.setHttpActiveWsConnections(httpActiveWsConnections)
  }
  if (httpQueuePending != null) {
    this.setHttpQueuePending(httpQueuePending)
  }
  if (httpQueueTime != null) {
    this.setHttpQueueTime(httpQueueTime)
  }
  if (httpRequestBytes != null) {
    this.setHttpRequestBytes(httpRequestBytes)
  }
  if (httpRequestResetsCount != null) {
    this.setHttpRequestResetsCount(httpRequestResetsCount)
  }
  if (httpRequestsCount != null) {
    this.setHttpRequestsCount(httpRequestsCount)
  }
  if (httpResponseBytes != null) {
    this.setHttpResponseBytes(httpResponseBytes)
  }
  if (httpResponseTime != null) {
    this.setHttpResponseTime(httpResponseTime)
  }
  if (httpResponsesCount != null) {
    this.setHttpResponsesCount(httpResponsesCount)
  }
  if (netActiveConnections != null) {
    this.setNetActiveConnections(netActiveConnections)
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
  if (poolCompleted != null) {
    this.setPoolCompleted(poolCompleted)
  }
  if (poolInUse != null) {
    this.setPoolInUse(poolInUse)
  }
  if (poolQueuePending != null) {
    this.setPoolQueuePending(poolQueuePending)
  }
  if (poolQueueTime != null) {
    this.setPoolQueueTime(poolQueueTime)
  }
  if (poolUsage != null) {
    this.setPoolUsage(poolUsage)
  }
  if (poolUsageRatio != null) {
    this.setPoolUsageRatio(poolUsageRatio)
  }
}

