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
import io.vertx.core.net.JdkSSLEngineOptions
import io.vertx.core.net.JksOptions
import io.vertx.core.net.OpenSSLEngineOptions
import io.vertx.core.net.PemKeyCertOptions
import io.vertx.core.net.PemTrustOptions
import io.vertx.core.net.PfxOptions
import io.vertx.core.net.ProxyOptions
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.core.net.NetClientOptions] objects.
 *
 * Options for configuring a [io.vertx.core.net.NetClient].
 *
 * @param activityLogDataFormat  Set the value of Netty's logging handler's data format: Netty's pipeline is configured for logging on Netty's logger.
 * @param applicationLayerProtocols  Set the list of application-layer protocols to provide to the server during the Application-Layer Protocol Negotiation.
 * @param connectTimeout  Set the connect timeout
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param hostnameVerificationAlgorithm  Set the hostname verification algorithm interval To disable hostname verification, set hostnameVerificationAlgorithm to an empty String
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received nor sent within the timeout. If you want change default time unit, use [io.vertx.core.net.NetClientOptions]
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param jdkSslEngineOptions 
 * @param keyCertOptions  Set the key/cert options.
 * @param keyStoreOptions  Set the key/cert options in jks format, aka Java keystore.
 * @param localAddress  Set the local interface to bind for network connections. When the local address is null, it will pick any local address, the default local address is null.
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param metricsName  Set the metrics name identifying the reported metrics, useful for grouping metrics with the same name.
 * @param nonProxyHosts  Set a list of remote hosts that are not proxied when the client is configured to use a proxy. This list serves the same purpose than the JVM <code>nonProxyHosts</code> configuration. <p> Entries can use the <i>*</i> wildcard character for pattern matching, e.g <i>*.example.com</i> matches <i>www.example.com</i>.
 * @param openSslEngineOptions 
 * @param pemKeyCertOptions  Set the key/cert store options in pem format.
 * @param pemTrustOptions  Set the trust options in pem format
 * @param pfxKeyCertOptions  Set the key/cert options in pfx format.
 * @param pfxTrustOptions  Set the trust options in pfx format
 * @param proxyOptions  Set proxy options for connections via CONNECT proxy (e.g. Squid) or a SOCKS proxy.
 * @param readIdleTimeout  Set the read idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.core.net.NetClientOptions]
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reconnectAttempts  Set the value of reconnect attempts
 * @param reconnectInterval  Set the reconnect interval
 * @param registerWriteHandler  Whether a write-handler should be registered on the [io.vertx.core.eventbus.EventBus]. <p> Defaults to <code>false</code>.
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param sendBufferSize  Set the TCP send buffer size
 * @param soLinger  Set whether SO_linger keep alive is enabled
 * @param ssl  Set whether SSL/TLS is enabled
 * @param sslEngineOptions  Set to use SSL engine implementation to use.
 * @param sslHandshakeTimeout  Set the SSL handshake timeout, default time unit is seconds.
 * @param sslHandshakeTimeoutUnit  Set the SSL handshake timeout unit. If not specified, default is seconds.
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native transport.
 * @param tcpKeepAlive  Set whether TCP keep alive is enabled
 * @param tcpKeepAliveCount  The maximum number of keepalive probes TCP should send before dropping the connection.
 * @param tcpKeepAliveIdleSeconds  The time in seconds the connection needs to remain idle before TCP starts sending keepalive probes, if the socket option keepalive has been set.
 * @param tcpKeepAliveIntervalSeconds  The time in seconds between individual keepalive probes.
 * @param tcpNoDelay  Set whether TCP no delay is enabled
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native transport.
 * @param tcpUserTimeout  Sets the <code>TCP_USER_TIMEOUT</code> option - only with linux native transport.
 * @param trafficClass  Set the value of traffic class
 * @param trustAll  Set whether all server certificates should be trusted
 * @param trustOptions  Set the trust options.
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param useAlpn  Set the ALPN usage.
 * @param writeIdleTimeout  Set the write idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is sent within the timeout. If you want change default time unit, use [io.vertx.core.net.NetClientOptions]
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetClientOptions original] using Vert.x codegen.
 */
fun netClientOptionsOf(
  activityLogDataFormat: ByteBufFormat? = null,
  applicationLayerProtocols: Iterable<String>? = null,
  connectTimeout: Int? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  hostnameVerificationAlgorithm: String? = null,
  idleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
  keyCertOptions: io.vertx.core.net.KeyCertOptions? = null,
  keyStoreOptions: io.vertx.core.net.JksOptions? = null,
  localAddress: String? = null,
  logActivity: Boolean? = null,
  metricsName: String? = null,
  nonProxyHosts: Iterable<String>? = null,
  openSslEngineOptions: io.vertx.core.net.OpenSSLEngineOptions? = null,
  pemKeyCertOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  pemTrustOptions: io.vertx.core.net.PemTrustOptions? = null,
  pfxKeyCertOptions: io.vertx.core.net.PfxOptions? = null,
  pfxTrustOptions: io.vertx.core.net.PfxOptions? = null,
  proxyOptions: io.vertx.core.net.ProxyOptions? = null,
  readIdleTimeout: Int? = null,
  receiveBufferSize: Int? = null,
  reconnectAttempts: Int? = null,
  reconnectInterval: Long? = null,
  registerWriteHandler: Boolean? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  sendBufferSize: Int? = null,
  soLinger: Int? = null,
  ssl: Boolean? = null,
  sslEngineOptions: io.vertx.core.net.SSLEngineOptions? = null,
  sslHandshakeTimeout: Long? = null,
  sslHandshakeTimeoutUnit: TimeUnit? = null,
  tcpCork: Boolean? = null,
  tcpFastOpen: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  tcpKeepAliveCount: Int? = null,
  tcpKeepAliveIdleSeconds: Int? = null,
  tcpKeepAliveIntervalSeconds: Int? = null,
  tcpNoDelay: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  tcpUserTimeout: Int? = null,
  trafficClass: Int? = null,
  trustAll: Boolean? = null,
  trustOptions: io.vertx.core.net.TrustOptions? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  useAlpn: Boolean? = null,
  writeIdleTimeout: Int? = null): NetClientOptions = io.vertx.core.net.NetClientOptions().apply {

  if (activityLogDataFormat != null) {
    this.setActivityLogDataFormat(activityLogDataFormat)
  }
  if (applicationLayerProtocols != null) {
    this.setApplicationLayerProtocols(applicationLayerProtocols.toList())
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
  if (enabledCipherSuites != null) {
    for (item in enabledCipherSuites) {
      this.addEnabledCipherSuite(item)
    }
  }
  if (enabledSecureTransportProtocols != null) {
    this.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols.toSet())
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
  if (registerWriteHandler != null) {
    this.setRegisterWriteHandler(registerWriteHandler)
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
  if (tcpKeepAliveCount != null) {
    this.setTcpKeepAliveCount(tcpKeepAliveCount)
  }
  if (tcpKeepAliveIdleSeconds != null) {
    this.setTcpKeepAliveIdleSeconds(tcpKeepAliveIdleSeconds)
  }
  if (tcpKeepAliveIntervalSeconds != null) {
    this.setTcpKeepAliveIntervalSeconds(tcpKeepAliveIntervalSeconds)
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
  if (writeIdleTimeout != null) {
    this.setWriteIdleTimeout(writeIdleTimeout)
  }
}

