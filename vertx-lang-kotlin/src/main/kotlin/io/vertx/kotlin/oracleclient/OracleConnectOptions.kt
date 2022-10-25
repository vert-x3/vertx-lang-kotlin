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
package io.vertx.kotlin.oracleclient

import io.vertx.oracleclient.OracleConnectOptions
import io.netty.handler.logging.ByteBufFormat
import io.vertx.core.net.JdkSSLEngineOptions
import io.vertx.core.net.JksOptions
import io.vertx.core.net.OpenSSLEngineOptions
import io.vertx.core.net.PemKeyCertOptions
import io.vertx.core.net.PemTrustOptions
import io.vertx.core.net.PfxOptions
import io.vertx.core.net.ProxyOptions
import io.vertx.core.tracing.TracingPolicy
import io.vertx.oracleclient.ServerMode
import java.util.concurrent.TimeUnit

fun oracleConnectOptionsOf(
  activityLogDataFormat: ByteBufFormat? = null,
  applicationLayerProtocols: Iterable<String>? = null,
  cachePreparedStatements: Boolean? = null,
  connectTimeout: Int? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  database: String? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  host: String? = null,
  hostnameVerificationAlgorithm: String? = null,
  idleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  instanceName: String? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
  keyCertOptions: io.vertx.core.net.KeyCertOptions? = null,
  keyStoreOptions: io.vertx.core.net.JksOptions? = null,
  localAddress: String? = null,
  logActivity: Boolean? = null,
  metricsName: String? = null,
  nonProxyHosts: Iterable<String>? = null,
  openSslEngineOptions: io.vertx.core.net.OpenSSLEngineOptions? = null,
  password: String? = null,
  pemKeyCertOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  pemTrustOptions: io.vertx.core.net.PemTrustOptions? = null,
  pfxKeyCertOptions: io.vertx.core.net.PfxOptions? = null,
  pfxTrustOptions: io.vertx.core.net.PfxOptions? = null,
  port: Int? = null,
  preparedStatementCacheMaxSize: Int? = null,
  preparedStatementCacheSqlLimit: Int? = null,
  properties: Map<String, String>? = null,
  proxyOptions: io.vertx.core.net.ProxyOptions? = null,
  readIdleTimeout: Int? = null,
  receiveBufferSize: Int? = null,
  reconnectAttempts: Int? = null,
  reconnectInterval: Long? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  sendBufferSize: Int? = null,
  serverMode: ServerMode? = null,
  serviceId: String? = null,
  serviceName: String? = null,
  soLinger: Int? = null,
  ssl: Boolean? = null,
  sslEngineOptions: io.vertx.core.net.SSLEngineOptions? = null,
  sslHandshakeTimeout: Long? = null,
  sslHandshakeTimeoutUnit: TimeUnit? = null,
  tcpCork: Boolean? = null,
  tcpFastOpen: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  tcpNoDelay: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  tcpUserTimeout: Int? = null,
  tnsAdmin: String? = null,
  tnsAlias: String? = null,
  tracingPolicy: TracingPolicy? = null,
  trafficClass: Int? = null,
  trustAll: Boolean? = null,
  trustOptions: io.vertx.core.net.TrustOptions? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  useAlpn: Boolean? = null,
  user: String? = null,
  writeIdleTimeout: Int? = null): OracleConnectOptions = io.vertx.oracleclient.OracleConnectOptions().apply {

  if (activityLogDataFormat != null) {
    this.setActivityLogDataFormat(activityLogDataFormat)
  }
  if (applicationLayerProtocols != null) {
    this.setApplicationLayerProtocols(applicationLayerProtocols.toList())
  }
  if (cachePreparedStatements != null) {
    this.setCachePreparedStatements(cachePreparedStatements)
  }
  if (connectTimeout != null) {
    this.setConnectTimeout(connectTimeout)
  }
  if (crlPaths != null) {
    for (item in crlPaths) {
      this.addCrlPath(item)
    }
  }
  if (crlValues != null) {
    for (item in crlValues) {
      this.addCrlValue(item)
    }
  }
  if (database != null) {
    this.setDatabase(database)
  }
  if (enabledCipherSuites != null) {
    for (item in enabledCipherSuites) {
      this.addEnabledCipherSuite(item)
    }
  }
  if (enabledSecureTransportProtocols != null) {
    this.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols.toSet())
  }
  if (host != null) {
    this.setHost(host)
  }
  if (hostnameVerificationAlgorithm != null) {
    this.setHostnameVerificationAlgorithm(hostnameVerificationAlgorithm)
  }
  if (idleTimeout != null) {
    this.setIdleTimeout(idleTimeout)
  }
  if (idleTimeoutUnit != null) {
    this.setIdleTimeoutUnit(idleTimeoutUnit)
  }
  if (instanceName != null) {
    this.setInstanceName(instanceName)
  }
  if (jdkSslEngineOptions != null) {
    this.setJdkSslEngineOptions(jdkSslEngineOptions)
  }
  if (keyCertOptions != null) {
    this.setKeyCertOptions(keyCertOptions)
  }
  if (keyStoreOptions != null) {
    this.setKeyStoreOptions(keyStoreOptions)
  }
  if (localAddress != null) {
    this.setLocalAddress(localAddress)
  }
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (metricsName != null) {
    this.setMetricsName(metricsName)
  }
  if (nonProxyHosts != null) {
    this.setNonProxyHosts(nonProxyHosts.toList())
  }
  if (openSslEngineOptions != null) {
    this.setOpenSslEngineOptions(openSslEngineOptions)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (pemKeyCertOptions != null) {
    this.setPemKeyCertOptions(pemKeyCertOptions)
  }
  if (pemTrustOptions != null) {
    this.setPemTrustOptions(pemTrustOptions)
  }
  if (pfxKeyCertOptions != null) {
    this.setPfxKeyCertOptions(pfxKeyCertOptions)
  }
  if (pfxTrustOptions != null) {
    this.setPfxTrustOptions(pfxTrustOptions)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (preparedStatementCacheMaxSize != null) {
    this.setPreparedStatementCacheMaxSize(preparedStatementCacheMaxSize)
  }
  if (preparedStatementCacheSqlLimit != null) {
    this.setPreparedStatementCacheSqlLimit(preparedStatementCacheSqlLimit)
  }
  if (properties != null) {
    this.setProperties(properties)
  }
  if (proxyOptions != null) {
    this.setProxyOptions(proxyOptions)
  }
  if (readIdleTimeout != null) {
    this.setReadIdleTimeout(readIdleTimeout)
  }
  if (receiveBufferSize != null) {
    this.setReceiveBufferSize(receiveBufferSize)
  }
  if (reconnectAttempts != null) {
    this.setReconnectAttempts(reconnectAttempts)
  }
  if (reconnectInterval != null) {
    this.setReconnectInterval(reconnectInterval)
  }
  if (reuseAddress != null) {
    this.setReuseAddress(reuseAddress)
  }
  if (reusePort != null) {
    this.setReusePort(reusePort)
  }
  if (sendBufferSize != null) {
    this.setSendBufferSize(sendBufferSize)
  }
  if (serverMode != null) {
    this.setServerMode(serverMode)
  }
  if (serviceId != null) {
    this.setServiceId(serviceId)
  }
  if (serviceName != null) {
    this.setServiceName(serviceName)
  }
  if (soLinger != null) {
    this.setSoLinger(soLinger)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (sslEngineOptions != null) {
    this.setSslEngineOptions(sslEngineOptions)
  }
  if (sslHandshakeTimeout != null) {
    this.setSslHandshakeTimeout(sslHandshakeTimeout)
  }
  if (sslHandshakeTimeoutUnit != null) {
    this.setSslHandshakeTimeoutUnit(sslHandshakeTimeoutUnit)
  }
  if (tcpCork != null) {
    this.setTcpCork(tcpCork)
  }
  if (tcpFastOpen != null) {
    this.setTcpFastOpen(tcpFastOpen)
  }
  if (tcpKeepAlive != null) {
    this.setTcpKeepAlive(tcpKeepAlive)
  }
  if (tcpNoDelay != null) {
    this.setTcpNoDelay(tcpNoDelay)
  }
  if (tcpQuickAck != null) {
    this.setTcpQuickAck(tcpQuickAck)
  }
  if (tcpUserTimeout != null) {
    this.setTcpUserTimeout(tcpUserTimeout)
  }
  if (tnsAdmin != null) {
    this.setTnsAdmin(tnsAdmin)
  }
  if (tnsAlias != null) {
    this.setTnsAlias(tnsAlias)
  }
  if (tracingPolicy != null) {
    this.setTracingPolicy(tracingPolicy)
  }
  if (trafficClass != null) {
    this.setTrafficClass(trafficClass)
  }
  if (trustAll != null) {
    this.setTrustAll(trustAll)
  }
  if (trustOptions != null) {
    this.setTrustOptions(trustOptions)
  }
  if (trustStoreOptions != null) {
    this.setTrustStoreOptions(trustStoreOptions)
  }
  if (useAlpn != null) {
    this.setUseAlpn(useAlpn)
  }
  if (user != null) {
    this.setUser(user)
  }
  if (writeIdleTimeout != null) {
    this.setWriteIdleTimeout(writeIdleTimeout)
  }
}

