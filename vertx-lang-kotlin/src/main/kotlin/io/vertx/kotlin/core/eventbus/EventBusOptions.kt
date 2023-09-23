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
package io.vertx.kotlin.core.eventbus

import io.vertx.core.eventbus.EventBusOptions
import io.netty.handler.logging.ByteBufFormat
import io.vertx.core.http.ClientAuth
import io.vertx.core.net.JdkSSLEngineOptions
import io.vertx.core.net.JksOptions
import io.vertx.core.net.OpenSSLEngineOptions
import io.vertx.core.net.PemKeyCertOptions
import io.vertx.core.net.PemTrustOptions
import io.vertx.core.net.PfxOptions
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.core.eventbus.EventBusOptions] objects.
 *
 * Options to configure the event bus.
 *
 * @param sendBufferSize  Set the TCP send buffer size
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reuseAddress  Set the value of reuse address
 * @param trafficClass  Set the value of traffic class
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param activityLogDataFormat  Set the value of Netty's logging handler's data format: Netty's pipeline is configured for logging on Netty's logger.
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param tcpNoDelay  Set whether TCP no delay is enabled
 * @param tcpKeepAlive  Set whether TCP keep alive is enabled
 * @param soLinger  Set whether SO_linger keep alive is enabled
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received nor sent within the timeout. If you want change default time unit, use [io.vertx.core.eventbus.EventBusOptions]
 * @param readIdleTimeout  Set the read idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.core.eventbus.EventBusOptions]
 * @param writeIdleTimeout  Set the write idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is sent within the timeout. If you want change default time unit, use [io.vertx.core.eventbus.EventBusOptions]
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param ssl  Set whether SSL/TLS is enabled
 * @param keyStoreOptions  Set the key/cert options in jks format, aka Java keystore.
 * @param pfxKeyCertOptions  Set the key/cert options in pfx format.
 * @param pemKeyCertOptions  Set the key/cert store options in pem format.
 * @param trustOptions  Set the trust options.
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param pfxTrustOptions  Set the trust options in pfx format
 * @param pemTrustOptions  Set the trust options in pem format
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param useAlpn  Set the ALPN usage.
 * @param sslEngineOptions  Set to use SSL engine implementation to use.
 * @param jdkSslEngineOptions 
 * @param openSslEngineOptions 
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native transport.
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native transport.
 * @param tcpUserTimeout  Sets the <code>TCP_USER_TIMEOUT</code> option - only with linux native transport.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param sslHandshakeTimeout  Set the SSL handshake timeout, default time unit is seconds.
 * @param sslHandshakeTimeoutUnit  Set the SSL handshake timeout unit. If not specified, default is seconds.
 * @param clientAuth  Set whether client auth is required
 * @param acceptBacklog  Set the accept back log.
 * @param host  Sets the host. Defaults to <code>null</code>. <p> When the clustered eventbus starts, it tries to bind to the provided <code>host</code>. If <code>host</code> is <code>null</code>, then it tries to bind to the same host as the underlying cluster manager. As a last resort, an address will be picked among the available network interfaces.
 * @param port  Sets the port.
 * @param reconnectAttempts  Sets the value of reconnect attempts.
 * @param reconnectInterval  Set the reconnect interval.
 * @param trustAll  Set whether all server certificates should be trusted.
 * @param connectTimeout  Sets the connect timeout
 * @param clusterPingInterval  Set the value of cluster ping interval, in ms.
 * @param clusterPingReplyInterval  Set the value of cluster ping reply interval, in ms.
 * @param clusterPublicHost  Set the public facing hostname to be used for clustering. Sometimes, e.g. when running on certain clouds, the local address the server listens on for clustering is not the same address that other nodes connect to it at, as the OS / cloud infrastructure does some kind of proxying. If this is the case you can specify a public hostname which is different from the hostname the server listens at. <p> The default value is null which means use the same as the cluster hostname.
 * @param clusterPublicPort  See [io.vertx.core.eventbus.EventBusOptions] for an explanation.
 * @param clusterNodeMetadata  Set information about this node when Vert.x is clustered. <p> The data may be used by the [io.vertx.core.spi.cluster.NodeSelector] to select a node for a given message. For example, it could be used to implement a partioning strategy. <p> The default [io.vertx.core.spi.cluster.NodeSelector] does not use the node metadata.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.eventbus.EventBusOptions original] using Vert.x codegen.
 */
fun eventBusOptionsOf(
  sendBufferSize: Int? = null,
  receiveBufferSize: Int? = null,
  reuseAddress: Boolean? = null,
  trafficClass: Int? = null,
  logActivity: Boolean? = null,
  activityLogDataFormat: ByteBufFormat? = null,
  reusePort: Boolean? = null,
  tcpNoDelay: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  soLinger: Int? = null,
  idleTimeout: Int? = null,
  readIdleTimeout: Int? = null,
  writeIdleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  ssl: Boolean? = null,
  keyStoreOptions: io.vertx.core.net.JksOptions? = null,
  pfxKeyCertOptions: io.vertx.core.net.PfxOptions? = null,
  pemKeyCertOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  trustOptions: io.vertx.core.net.TrustOptions? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  pfxTrustOptions: io.vertx.core.net.PfxOptions? = null,
  pemTrustOptions: io.vertx.core.net.PemTrustOptions? = null,
  enabledCipherSuites: Iterable<String>? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  useAlpn: Boolean? = null,
  sslEngineOptions: io.vertx.core.net.SSLEngineOptions? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
  openSslEngineOptions: io.vertx.core.net.OpenSSLEngineOptions? = null,
  tcpFastOpen: Boolean? = null,
  tcpCork: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  tcpUserTimeout: Int? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  sslHandshakeTimeout: Long? = null,
  sslHandshakeTimeoutUnit: TimeUnit? = null,
  clientAuth: ClientAuth? = null,
  acceptBacklog: Int? = null,
  host: String? = null,
  port: Int? = null,
  reconnectAttempts: Int? = null,
  reconnectInterval: Long? = null,
  trustAll: Boolean? = null,
  connectTimeout: Int? = null,
  clusterPingInterval: Long? = null,
  clusterPingReplyInterval: Long? = null,
  clusterPublicHost: String? = null,
  clusterPublicPort: Int? = null,
  clusterNodeMetadata: io.vertx.core.json.JsonObject? = null): EventBusOptions = io.vertx.core.eventbus.EventBusOptions().apply {

  if (sendBufferSize != null) {
    this.setSendBufferSize(sendBufferSize)
  }
  if (receiveBufferSize != null) {
    this.setReceiveBufferSize(receiveBufferSize)
  }
  if (reuseAddress != null) {
    this.setReuseAddress(reuseAddress)
  }
  if (trafficClass != null) {
    this.setTrafficClass(trafficClass)
  }
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (activityLogDataFormat != null) {
    this.setActivityLogDataFormat(activityLogDataFormat)
  }
  if (reusePort != null) {
    this.setReusePort(reusePort)
  }
  if (tcpNoDelay != null) {
    this.setTcpNoDelay(tcpNoDelay)
  }
  if (tcpKeepAlive != null) {
    this.setTcpKeepAlive(tcpKeepAlive)
  }
  if (soLinger != null) {
    this.setSoLinger(soLinger)
  }
  if (idleTimeout != null) {
    this.setIdleTimeout(idleTimeout)
  }
  if (readIdleTimeout != null) {
    this.setReadIdleTimeout(readIdleTimeout)
  }
  if (writeIdleTimeout != null) {
    this.setWriteIdleTimeout(writeIdleTimeout)
  }
  if (idleTimeoutUnit != null) {
    this.setIdleTimeoutUnit(idleTimeoutUnit)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (keyStoreOptions != null) {
    this.setKeyStoreOptions(keyStoreOptions)
  }
  if (pfxKeyCertOptions != null) {
    this.setPfxKeyCertOptions(pfxKeyCertOptions)
  }
  if (pemKeyCertOptions != null) {
    this.setPemKeyCertOptions(pemKeyCertOptions)
  }
  if (trustOptions != null) {
    this.setTrustOptions(trustOptions)
  }
  if (trustStoreOptions != null) {
    this.setTrustStoreOptions(trustStoreOptions)
  }
  if (pfxTrustOptions != null) {
    this.setPfxTrustOptions(pfxTrustOptions)
  }
  if (pemTrustOptions != null) {
    this.setPemTrustOptions(pemTrustOptions)
  }
  if (enabledCipherSuites != null) {
    for (item in enabledCipherSuites) {
      this.addEnabledCipherSuite(item)
    }
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
  if (useAlpn != null) {
    this.setUseAlpn(useAlpn)
  }
  if (sslEngineOptions != null) {
    this.setSslEngineOptions(sslEngineOptions)
  }
  if (jdkSslEngineOptions != null) {
    this.setJdkSslEngineOptions(jdkSslEngineOptions)
  }
  if (openSslEngineOptions != null) {
    this.setOpenSslEngineOptions(openSslEngineOptions)
  }
  if (tcpFastOpen != null) {
    this.setTcpFastOpen(tcpFastOpen)
  }
  if (tcpCork != null) {
    this.setTcpCork(tcpCork)
  }
  if (tcpQuickAck != null) {
    this.setTcpQuickAck(tcpQuickAck)
  }
  if (tcpUserTimeout != null) {
    this.setTcpUserTimeout(tcpUserTimeout)
  }
  if (enabledSecureTransportProtocols != null) {
    this.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols.toSet())
  }
  if (sslHandshakeTimeout != null) {
    this.setSslHandshakeTimeout(sslHandshakeTimeout)
  }
  if (sslHandshakeTimeoutUnit != null) {
    this.setSslHandshakeTimeoutUnit(sslHandshakeTimeoutUnit)
  }
  if (clientAuth != null) {
    this.setClientAuth(clientAuth)
  }
  if (acceptBacklog != null) {
    this.setAcceptBacklog(acceptBacklog)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (reconnectAttempts != null) {
    this.setReconnectAttempts(reconnectAttempts)
  }
  if (reconnectInterval != null) {
    this.setReconnectInterval(reconnectInterval)
  }
  if (trustAll != null) {
    this.setTrustAll(trustAll)
  }
  if (connectTimeout != null) {
    this.setConnectTimeout(connectTimeout)
  }
  if (clusterPingInterval != null) {
    this.setClusterPingInterval(clusterPingInterval)
  }
  if (clusterPingReplyInterval != null) {
    this.setClusterPingReplyInterval(clusterPingReplyInterval)
  }
  if (clusterPublicHost != null) {
    this.setClusterPublicHost(clusterPublicHost)
  }
  if (clusterPublicPort != null) {
    this.setClusterPublicPort(clusterPublicPort)
  }
  if (clusterNodeMetadata != null) {
    this.setClusterNodeMetadata(clusterNodeMetadata)
  }
}

