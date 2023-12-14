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

import io.vertx.core.net.NetClientOptions
import io.netty.handler.logging.ByteBufFormat
import io.vertx.core.buffer.Buffer
import io.vertx.core.net.ProxyOptions
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.core.net.NetClientOptions] objects.
 *
 * Options for configuring a [io.vertx.core.net.NetClient].
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
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received nor sent within the timeout. If you want change default time unit, use [io.vertx.core.net.NetClientOptions]
 * @param readIdleTimeout  Set the read idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.core.net.NetClientOptions]
 * @param writeIdleTimeout  Set the write idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is sent within the timeout. If you want change default time unit, use [io.vertx.core.net.NetClientOptions]
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param ssl  Set whether SSL/TLS is enabled
 * @param trustOptions  Set the trust options.
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param useAlpn  Set the ALPN usage.
 * @param sslEngineOptions  Set to use SSL engine implementation to use.
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native transport.
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native transport.
 * @param tcpUserTimeout  Sets the <code>TCP_USER_TIMEOUT</code> option - only with linux native transport.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param sslHandshakeTimeout  Set the SSL handshake timeout, default time unit is seconds.
 * @param sslHandshakeTimeoutUnit  Set the SSL handshake timeout unit. If not specified, default is seconds.
 * @param trustAll  Set whether all server certificates should be trusted
 * @param connectTimeout  Set the connect timeout
 * @param metricsName  Set the metrics name identifying the reported metrics, useful for grouping metrics with the same name.
 * @param proxyOptions  Set proxy options for connections via CONNECT proxy (e.g. Squid) or a SOCKS proxy.
 * @param nonProxyHosts  Set a list of remote hosts that are not proxied when the client is configured to use a proxy. This list serves the same purpose than the JVM <code>nonProxyHosts</code> configuration. <p> Entries can use the <i>*</i> wildcard character for pattern matching, e.g <i>*.example.com</i> matches <i>www.example.com</i>.
 * @param localAddress  Set the local interface to bind for network connections. When the local address is null, it will pick any local address, the default local address is null.
 * @param keyCertOptions  Set the key/cert options.
 * @param reconnectAttempts  Set the value of reconnect attempts
 * @param reconnectInterval  Set the reconnect interval
 * @param hostnameVerificationAlgorithm  Set the hostname verification algorithm interval To disable hostname verification, set hostnameVerificationAlgorithm to an empty String
 * @param applicationLayerProtocols  Set the list of application-layer protocols to provide to the server during the Application-Layer Protocol Negotiation.
 * @param registerWriteHandler  Whether a write-handler should be registered on the [io.vertx.core.eventbus.EventBus]. <p> Defaults to <code>false</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetClientOptions original] using Vert.x codegen.
 */
fun netClientOptionsOf(
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
  trustOptions: io.vertx.core.net.TrustOptions? = null,
  enabledCipherSuites: Iterable<String>? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  useAlpn: Boolean? = null,
  sslEngineOptions: io.vertx.core.net.SSLEngineOptions? = null,
  tcpFastOpen: Boolean? = null,
  tcpCork: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  tcpUserTimeout: Int? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  sslHandshakeTimeout: Long? = null,
  sslHandshakeTimeoutUnit: TimeUnit? = null,
  trustAll: Boolean? = null,
  connectTimeout: Int? = null,
  metricsName: String? = null,
  proxyOptions: io.vertx.core.net.ProxyOptions? = null,
  nonProxyHosts: Iterable<String>? = null,
  localAddress: String? = null,
  keyCertOptions: io.vertx.core.net.KeyCertOptions? = null,
  reconnectAttempts: Int? = null,
  reconnectInterval: Long? = null,
  hostnameVerificationAlgorithm: String? = null,
  applicationLayerProtocols: Iterable<String>? = null,
  registerWriteHandler: Boolean? = null): NetClientOptions = io.vertx.core.net.NetClientOptions().apply {

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
  if (trustOptions != null) {
    this.setTrustOptions(trustOptions)
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
  if (trustAll != null) {
    this.setTrustAll(trustAll)
  }
  if (connectTimeout != null) {
    this.setConnectTimeout(connectTimeout)
  }
  if (metricsName != null) {
    this.setMetricsName(metricsName)
  }
  if (proxyOptions != null) {
    this.setProxyOptions(proxyOptions)
  }
  if (nonProxyHosts != null) {
    this.setNonProxyHosts(nonProxyHosts.toList())
  }
  if (localAddress != null) {
    this.setLocalAddress(localAddress)
  }
  if (keyCertOptions != null) {
    this.setKeyCertOptions(keyCertOptions)
  }
  if (reconnectAttempts != null) {
    this.setReconnectAttempts(reconnectAttempts)
  }
  if (reconnectInterval != null) {
    this.setReconnectInterval(reconnectInterval)
  }
  if (hostnameVerificationAlgorithm != null) {
    this.setHostnameVerificationAlgorithm(hostnameVerificationAlgorithm)
  }
  if (applicationLayerProtocols != null) {
    this.setApplicationLayerProtocols(applicationLayerProtocols.toList())
  }
  if (registerWriteHandler != null) {
    this.setRegisterWriteHandler(registerWriteHandler)
  }
}

