package io.vertx.kotlin.core

import io.vertx.core.VertxOptions
import io.vertx.core.dns.AddressResolverOptions
import io.vertx.core.eventbus.EventBusOptions
import io.vertx.core.file.FileSystemOptions
import io.vertx.core.metrics.MetricsOptions
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.core.VertxOptions] objects.
 *
 * Instances of this class are used to configure [io.vertx.core.Vertx] instances.
 *
 * @param addressResolverOptions  Sets the address resolver configuration to configure resolving DNS servers, cache TTL, etc...
 * @param blockedThreadCheckInterval  Sets the value of blocked thread check period, in [io.vertx.core.VertxOptions]. <p> The default value of [io.vertx.core.VertxOptions] is 
 * @param blockedThreadCheckIntervalUnit  Set the time unit of <code>blockedThreadCheckInterval</code>.
 * @param clusterHost  Set the hostname to be used for clustering.
 * @param clusterPingInterval  Set the value of cluster ping interval, in ms.
 * @param clusterPingReplyInterval  Set the value of cluster ping reply interval, in ms.
 * @param clusterPort  Set the port to be used for clustering.
 * @param clusterPublicHost  Set the public facing hostname to be used for clustering. Sometimes, e.g. when running on certain clouds, the local address the server listens on for clustering is not the same address that other nodes connect to it at, as the OS / cloud infrastructure does some kind of proxying. If this is the case you can specify a public hostname which is different from the hostname the server listens at. The default value is null which means use the same as the cluster hostname.
 * @param clusterPublicPort  See [io.vertx.core.VertxOptions] for an explanation.
 * @param clustered  Set whether or not the Vert.x instance will be clustered.
 * @param eventBusOptions  Sets the event bus configuration to configure the host, port, ssl...
 * @param eventLoopPoolSize  Set the number of event loop threads to be used by the Vert.x instance.
 * @param fileResolverCachingEnabled  Set whether the Vert.x file resolver uses caching for classpath resources. Deprecated. Use FileSystemOptions instead.
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
  clusterHost: String? = null,
  clusterPingInterval: Long? = null,
  clusterPingReplyInterval: Long? = null,
  clusterPort: Int? = null,
  clusterPublicHost: String? = null,
  clusterPublicPort: Int? = null,
  clustered: Boolean? = null,
  eventBusOptions: io.vertx.core.eventbus.EventBusOptions? = null,
  eventLoopPoolSize: Int? = null,
  fileResolverCachingEnabled: Boolean? = null,
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
  if (clusterHost != null) {
    this.setClusterHost(clusterHost)
  }
  if (clusterPingInterval != null) {
    this.setClusterPingInterval(clusterPingInterval)
  }
  if (clusterPingReplyInterval != null) {
    this.setClusterPingReplyInterval(clusterPingReplyInterval)
  }
  if (clusterPort != null) {
    this.setClusterPort(clusterPort)
  }
  if (clusterPublicHost != null) {
    this.setClusterPublicHost(clusterPublicHost)
  }
  if (clusterPublicPort != null) {
    this.setClusterPublicPort(clusterPublicPort)
  }
  if (clustered != null) {
    this.setClustered(clustered)
  }
  if (eventBusOptions != null) {
    this.setEventBusOptions(eventBusOptions)
  }
  if (eventLoopPoolSize != null) {
    this.setEventLoopPoolSize(eventLoopPoolSize)
  }
  if (fileResolverCachingEnabled != null) {
    this.setFileResolverCachingEnabled(fileResolverCachingEnabled)
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

/**
 * A function providing a DSL for building [io.vertx.core.VertxOptions] objects.
 *
 * Instances of this class are used to configure [io.vertx.core.Vertx] instances.
 *
 * @param addressResolverOptions  Sets the address resolver configuration to configure resolving DNS servers, cache TTL, etc...
 * @param blockedThreadCheckInterval  Sets the value of blocked thread check period, in [io.vertx.core.VertxOptions]. <p> The default value of [io.vertx.core.VertxOptions] is 
 * @param blockedThreadCheckIntervalUnit  Set the time unit of <code>blockedThreadCheckInterval</code>.
 * @param clusterHost  Set the hostname to be used for clustering.
 * @param clusterPingInterval  Set the value of cluster ping interval, in ms.
 * @param clusterPingReplyInterval  Set the value of cluster ping reply interval, in ms.
 * @param clusterPort  Set the port to be used for clustering.
 * @param clusterPublicHost  Set the public facing hostname to be used for clustering. Sometimes, e.g. when running on certain clouds, the local address the server listens on for clustering is not the same address that other nodes connect to it at, as the OS / cloud infrastructure does some kind of proxying. If this is the case you can specify a public hostname which is different from the hostname the server listens at. The default value is null which means use the same as the cluster hostname.
 * @param clusterPublicPort  See [io.vertx.core.VertxOptions] for an explanation.
 * @param clustered  Set whether or not the Vert.x instance will be clustered.
 * @param eventBusOptions  Sets the event bus configuration to configure the host, port, ssl...
 * @param eventLoopPoolSize  Set the number of event loop threads to be used by the Vert.x instance.
 * @param fileResolverCachingEnabled  Set whether the Vert.x file resolver uses caching for classpath resources. Deprecated. Use FileSystemOptions instead.
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
 * @param warningExceptionTime  Set the threshold value above this, the blocked warning contains a stack trace. in [io.vertx.core.VertxOptions]. The default value of [io.vertx.core.VertxOptions] is 
 * @param warningExceptionTimeUnit  Set the time unit of <code>warningExceptionTime</code>.
 * @param workerPoolSize  Set the maximum number of worker threads to be used by the Vert.x instance.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.VertxOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("vertxOptionsOf(addressResolverOptions, blockedThreadCheckInterval, blockedThreadCheckIntervalUnit, clusterHost, clusterPingInterval, clusterPingReplyInterval, clusterPort, clusterPublicHost, clusterPublicPort, clustered, eventBusOptions, eventLoopPoolSize, fileResolverCachingEnabled, fileSystemOptions, haEnabled, haGroup, internalBlockingPoolSize, maxEventLoopExecuteTime, maxEventLoopExecuteTimeUnit, maxWorkerExecuteTime, maxWorkerExecuteTimeUnit, metricsOptions, preferNativeTransport, quorumSize, warningExceptionTime, warningExceptionTimeUnit, workerPoolSize)")
)
fun VertxOptions(
  addressResolverOptions: io.vertx.core.dns.AddressResolverOptions? = null,
  blockedThreadCheckInterval: Long? = null,
  blockedThreadCheckIntervalUnit: TimeUnit? = null,
  clusterHost: String? = null,
  clusterPingInterval: Long? = null,
  clusterPingReplyInterval: Long? = null,
  clusterPort: Int? = null,
  clusterPublicHost: String? = null,
  clusterPublicPort: Int? = null,
  clustered: Boolean? = null,
  eventBusOptions: io.vertx.core.eventbus.EventBusOptions? = null,
  eventLoopPoolSize: Int? = null,
  fileResolverCachingEnabled: Boolean? = null,
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
  if (clusterHost != null) {
    this.setClusterHost(clusterHost)
  }
  if (clusterPingInterval != null) {
    this.setClusterPingInterval(clusterPingInterval)
  }
  if (clusterPingReplyInterval != null) {
    this.setClusterPingReplyInterval(clusterPingReplyInterval)
  }
  if (clusterPort != null) {
    this.setClusterPort(clusterPort)
  }
  if (clusterPublicHost != null) {
    this.setClusterPublicHost(clusterPublicHost)
  }
  if (clusterPublicPort != null) {
    this.setClusterPublicPort(clusterPublicPort)
  }
  if (clustered != null) {
    this.setClustered(clustered)
  }
  if (eventBusOptions != null) {
    this.setEventBusOptions(eventBusOptions)
  }
  if (eventLoopPoolSize != null) {
    this.setEventLoopPoolSize(eventLoopPoolSize)
  }
  if (fileResolverCachingEnabled != null) {
    this.setFileResolverCachingEnabled(fileResolverCachingEnabled)
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

