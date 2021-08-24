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
package io.vertx.kotlin.core

import io.vertx.core.VertxOptions
import io.vertx.core.dns.AddressResolverOptions
import io.vertx.core.eventbus.EventBusOptions
import io.vertx.core.file.FileSystemOptions
import io.vertx.core.metrics.MetricsOptions
import io.vertx.core.tracing.TracingOptions
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.core.VertxOptions] objects.
 *
 * Instances of this class are used to configure [io.vertx.core.Vertx] instances.
 *
 * @param addressResolverOptions  Sets the address resolver configuration to configure resolving DNS servers, cache TTL, etc...
 * @param blockedThreadCheckInterval  Sets the value of blocked thread check period, in [io.vertx.core.VertxOptions]. <p> The default value of [io.vertx.core.VertxOptions] is 
 * @param blockedThreadCheckIntervalUnit  Set the time unit of <code>blockedThreadCheckInterval</code>.
 * @param clusterManager  Programmatically set the cluster manager to be used when clustering. <p> Only valid if clustered = true. <p> Normally Vert.x will look on the classpath for a cluster manager, but if you want to set one programmatically you can use this method.
 * @param disableTCCL  Configures whether Vert.x sets the [io.vertx.core.Context] classloader as the thread context classloader on actions executed on that [io.vertx.core.Context]. When a [io.vertx.core.Context] is created the current thread classloader is captured and associated with this classloader. Likewise when a Verticle is created, the Verticle's [io.vertx.core.Context] classloader is set to the current thread classloader unless this classloader is overriden by [io.vertx.core.DeploymentOptions]. This setting overrides the (legacy) system property <code>vertx.disableTCCL</code> and provides control at the Vertx instance level.
 * @param eventBusOptions  Sets the event bus configuration to configure the host, port, ssl...
 * @param eventLoopPoolSize  Set the number of event loop threads to be used by the Vert.x instance.
 * @param fileSystemOptions  Set the file system options
 * @param haEnabled  Set whether HA will be enabled on the Vert.x instance.
 * @param haGroup  Set the HA group to be used when HA is enabled.
 * @param internalBlockingPoolSize  Set the value of internal blocking pool size
 * @param maxEventLoopExecuteTime  Sets the value of max event loop execute time, in [io.vertx.core.VertxOptions]. <p> The default value of [io.vertx.core.VertxOptions]is 
 * @param maxEventLoopExecuteTimeUnit  Set the time unit of <code>maxEventLoopExecuteTime</code>.
 * @param maxWorkerExecuteTime  Sets the value of max worker execute time, in [io.vertx.core.VertxOptions]. <p> The default value of [io.vertx.core.VertxOptions] is 
 * @param maxWorkerExecuteTimeUnit  Set the time unit of <code>maxWorkerExecuteTime</code>.
 * @param metricsOptions  Set the metrics options
 * @param preferNativeTransport  Set wether to prefer the native transport to the JDK transport.
 * @param quorumSize  Set the quorum size to be used when HA is enabled.
 * @param tracingOptions  Set the tracing options
 * @param warningExceptionTime  Set the threshold value above this, the blocked warning contains a stack trace. in [io.vertx.core.VertxOptions]. The default value of [io.vertx.core.VertxOptions] is 
 * @param warningExceptionTimeUnit  Set the time unit of <code>warningExceptionTime</code>.
 * @param workerPoolSize  Set the maximum number of worker threads to be used by the Vert.x instance.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.VertxOptions original] using Vert.x codegen.
 */
fun vertxOptionsOf(
  addressResolverOptions: io.vertx.core.dns.AddressResolverOptions? = null,
  blockedThreadCheckInterval: Long? = null,
  blockedThreadCheckIntervalUnit: TimeUnit? = null,
  clusterManager: io.vertx.core.spi.cluster.ClusterManager? = null,
  disableTCCL: Boolean? = null,
  eventBusOptions: io.vertx.core.eventbus.EventBusOptions? = null,
  eventLoopPoolSize: Int? = null,
  fileSystemOptions: io.vertx.core.file.FileSystemOptions? = null,
  haEnabled: Boolean? = null,
  haGroup: String? = null,
  internalBlockingPoolSize: Int? = null,
  maxEventLoopExecuteTime: Long? = null,
  maxEventLoopExecuteTimeUnit: TimeUnit? = null,
  maxWorkerExecuteTime: Long? = null,
  maxWorkerExecuteTimeUnit: TimeUnit? = null,
  metricsOptions: io.vertx.core.metrics.MetricsOptions? = null,
  preferNativeTransport: Boolean? = null,
  quorumSize: Int? = null,
  tracingOptions: io.vertx.core.tracing.TracingOptions? = null,
  warningExceptionTime: Long? = null,
  warningExceptionTimeUnit: TimeUnit? = null,
  workerPoolSize: Int? = null): VertxOptions = io.vertx.core.VertxOptions().apply {

  if (addressResolverOptions != null) {
    this.setAddressResolverOptions(addressResolverOptions)
  }
  if (blockedThreadCheckInterval != null) {
    this.setBlockedThreadCheckInterval(blockedThreadCheckInterval)
  }
  if (blockedThreadCheckIntervalUnit != null) {
    this.setBlockedThreadCheckIntervalUnit(blockedThreadCheckIntervalUnit)
  }
  if (clusterManager != null) {
    this.setClusterManager(clusterManager)
  }
  if (disableTCCL != null) {
    this.setDisableTCCL(disableTCCL)
  }
  if (eventBusOptions != null) {
    this.setEventBusOptions(eventBusOptions)
  }
  if (eventLoopPoolSize != null) {
    this.setEventLoopPoolSize(eventLoopPoolSize)
  }
  if (fileSystemOptions != null) {
    this.setFileSystemOptions(fileSystemOptions)
  }
  if (haEnabled != null) {
    this.setHAEnabled(haEnabled)
  }
  if (haGroup != null) {
    this.setHAGroup(haGroup)
  }
  if (internalBlockingPoolSize != null) {
    this.setInternalBlockingPoolSize(internalBlockingPoolSize)
  }
  if (maxEventLoopExecuteTime != null) {
    this.setMaxEventLoopExecuteTime(maxEventLoopExecuteTime)
  }
  if (maxEventLoopExecuteTimeUnit != null) {
    this.setMaxEventLoopExecuteTimeUnit(maxEventLoopExecuteTimeUnit)
  }
  if (maxWorkerExecuteTime != null) {
    this.setMaxWorkerExecuteTime(maxWorkerExecuteTime)
  }
  if (maxWorkerExecuteTimeUnit != null) {
    this.setMaxWorkerExecuteTimeUnit(maxWorkerExecuteTimeUnit)
  }
  if (metricsOptions != null) {
    this.setMetricsOptions(metricsOptions)
  }
  if (preferNativeTransport != null) {
    this.setPreferNativeTransport(preferNativeTransport)
  }
  if (quorumSize != null) {
    this.setQuorumSize(quorumSize)
  }
  if (tracingOptions != null) {
    this.setTracingOptions(tracingOptions)
  }
  if (warningExceptionTime != null) {
    this.setWarningExceptionTime(warningExceptionTime)
  }
  if (warningExceptionTimeUnit != null) {
    this.setWarningExceptionTimeUnit(warningExceptionTimeUnit)
  }
  if (workerPoolSize != null) {
    this.setWorkerPoolSize(workerPoolSize)
  }
}

