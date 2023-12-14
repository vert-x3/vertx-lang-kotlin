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
package io.vertx.kotlin.amqp

import io.vertx.amqp.AmqpClientOptions
import io.netty.handler.logging.ByteBufFormat
import io.vertx.core.buffer.Buffer
import io.vertx.core.net.ProxyOptions
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.amqp.AmqpClientOptions] objects.
 *
 * Configures the AMQP Client.
 * You can also configure the underlying Proton instance. Refer to  for details.
 *
 * @param sendBufferSize 
 * @param receiveBufferSize 
 * @param reuseAddress 
 * @param trafficClass 
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param activityLogDataFormat  Set the value of Netty's logging handler's data format: Netty's pipeline is configured for logging on Netty's logger.
 * @param reusePort 
 * @param tcpNoDelay 
 * @param tcpKeepAlive 
 * @param soLinger 
 * @param idleTimeout 
 * @param readIdleTimeout  Set the read idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.amqp.AmqpClientOptions]
 * @param writeIdleTimeout  Set the write idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is sent within the timeout. If you want change default time unit, use [io.vertx.amqp.AmqpClientOptions]
 * @param idleTimeoutUnit 
 * @param ssl 
 * @param trustOptions 
 * @param enabledCipherSuites 
 * @param crlPaths 
 * @param crlValues 
 * @param useAlpn  Set the ALPN usage.
 * @param sslEngineOptions 
 * @param tcpFastOpen 
 * @param tcpCork 
 * @param tcpQuickAck 
 * @param tcpUserTimeout  Sets the <code>TCP_USER_TIMEOUT</code> option - only with linux native transport.
 * @param enabledSecureTransportProtocols 
 * @param sslHandshakeTimeout 
 * @param sslHandshakeTimeoutUnit 
 * @param trustAll 
 * @param connectTimeout 
 * @param metricsName  Set the metrics name identifying the reported metrics, useful for grouping metrics with the same name.
 * @param proxyOptions  Set proxy options for connections via CONNECT proxy (e.g. Squid) or a SOCKS proxy.
 * @param nonProxyHosts  Set a list of remote hosts that are not proxied when the client is configured to use a proxy. This list serves the same purpose than the JVM <code>nonProxyHosts</code> configuration. <p> Entries can use the <i>*</i> wildcard character for pattern matching, e.g <i>*.example.com</i> matches <i>www.example.com</i>.
 * @param localAddress 
 * @param reconnectAttempts 
 * @param hostnameVerificationAlgorithm 
 * @param applicationLayerProtocols  Set the list of application-layer protocols to provide to the server during the Application-Layer Protocol Negotiation.
 * @param reconnectInterval 
 * @param registerWriteHandler  Whether a write-handler should be registered on the [io.vertx.core.eventbus.EventBus]. <p> Defaults to <code>false</code>.
 * @param enabledSaslMechanisms 
 * @param virtualHost 
 * @param sniServerName 
 * @param heartbeat 
 * @param maxFrameSize 
 * @param host  Sets the host.
 * @param port  Sets the port.
 * @param username  Sets the username.
 * @param password  Sets the password.
 * @param containerId  Sets the container id.
 * @param connectionHostname  Explicitly override the hostname value used for the AMQP Open frame. The host connected to as per [io.vertx.amqp.AmqpClientOptions] will be used in the Open frame by default.
 * @param keyCertOptions 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.amqp.AmqpClientOptions original] using Vert.x codegen.
 */
fun amqpClientOptionsOf(
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
  reconnectAttempts: Int? = null,
  hostnameVerificationAlgorithm: String? = null,
  applicationLayerProtocols: Iterable<String>? = null,
  reconnectInterval: Long? = null,
  registerWriteHandler: Boolean? = null,
  enabledSaslMechanisms: Iterable<String>? = null,
  virtualHost: String? = null,
  sniServerName: String? = null,
  heartbeat: Int? = null,
  maxFrameSize: Int? = null,
  host: String? = null,
  port: Int? = null,
  username: String? = null,
  password: String? = null,
  containerId: String? = null,
  connectionHostname: String? = null,
  keyCertOptions: io.vertx.core.net.KeyCertOptions? = null): AmqpClientOptions = io.vertx.amqp.AmqpClientOptions().apply {

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
  if (reconnectAttempts != null) {
    this.setReconnectAttempts(reconnectAttempts)
  }
  if (hostnameVerificationAlgorithm != null) {
    this.setHostnameVerificationAlgorithm(hostnameVerificationAlgorithm)
  }
  if (applicationLayerProtocols != null) {
    this.setApplicationLayerProtocols(applicationLayerProtocols.toList())
  }
  if (reconnectInterval != null) {
    this.setReconnectInterval(reconnectInterval)
  }
  if (registerWriteHandler != null) {
    this.setRegisterWriteHandler(registerWriteHandler)
  }
  if (enabledSaslMechanisms != null) {
    for (item in enabledSaslMechanisms) {
      this.addEnabledSaslMechanism(item)
    }
  }
  if (virtualHost != null) {
    this.setVirtualHost(virtualHost)
  }
  if (sniServerName != null) {
    this.setSniServerName(sniServerName)
  }
  if (heartbeat != null) {
    this.setHeartbeat(heartbeat)
  }
  if (maxFrameSize != null) {
    this.setMaxFrameSize(maxFrameSize)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (username != null) {
    this.setUsername(username)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (containerId != null) {
    this.setContainerId(containerId)
  }
  if (connectionHostname != null) {
    this.setConnectionHostname(connectionHostname)
  }
  if (keyCertOptions != null) {
    this.setKeyCertOptions(keyCertOptions)
  }
}

