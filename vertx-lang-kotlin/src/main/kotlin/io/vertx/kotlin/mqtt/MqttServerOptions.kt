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
package io.vertx.kotlin.mqtt

import io.vertx.mqtt.MqttServerOptions
import io.netty.handler.logging.ByteBufFormat
import io.vertx.core.http.ClientAuth
import io.vertx.core.net.JdkSSLEngineOptions
import io.vertx.core.net.JksOptions
import io.vertx.core.net.OpenSSLEngineOptions
import io.vertx.core.net.PemKeyCertOptions
import io.vertx.core.net.PemTrustOptions
import io.vertx.core.net.PfxOptions
import io.vertx.core.net.TrafficShapingOptions
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.mqtt.MqttServerOptions] objects.
 *
 * Represents options used by the MQTT server
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
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received nor sent within the timeout. If you want change default time unit, use [io.vertx.core.net.NetServerOptions]
 * @param readIdleTimeout  Set the read idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.core.net.NetServerOptions]
 * @param writeIdleTimeout  Set the write idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is sent within the timeout. If you want change default time unit, use [io.vertx.core.net.NetServerOptions]
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
 * @param acceptBacklog  Set the accept back log
 * @param port  Set the port
 * @param host  Set the host
 * @param clientAuth  Set whether client auth is required
 * @param sni  Set whether the server supports Server Name Indiciation
 * @param trafficShapingOptions  Set traffic shaping options. If not specified, traffic is unthrottled.
 * @param registerWriteHandler  Whether a write-handler should be registered on the [io.vertx.core.eventbus.EventBus]. <p> Defaults to <code>false</code>.
 * @param keyCertOptions  Set the key/cert options.
 * @param maxMessageSize  Set max MQTT message size
 * @param autoClientId  Set if clientid should be auto-generated when it's "zero-bytes"
 * @param maxClientIdLength  Set the max client id length.
 * @param timeoutOnConnect  Set the timeout on CONNECT packet
 * @param useProxyProtocol  Set whether the server uses the HA Proxy protocol
 * @param proxyProtocolTimeout  Set the Proxy protocol timeout, default time unit is seconds.
 * @param proxyProtocolTimeoutUnit  Set the Proxy protocol timeout unit. If not specified, default is seconds.
 * @param useWebSocket  enable mqtt over websocket
 * @param webSocketMaxFrameSize  Set the WebSocket max frame size. <p> This should be used when WebSocket transport is used and [io.vertx.mqtt.MqttServerOptions] is larger than the WebSocket frame size
 * @param perFrameWebSocketCompressionSupported  Enable or disable support for the WebSocket per-frame deflate compression extension.
 * @param perMessageWebSocketCompressionSupported  Enable or disable support for WebSocket per-message deflate compression extension.
 * @param webSocketCompressionLevel  Set the WebSocket compression level.
 * @param webSocketAllowServerNoContext  Set whether the WebSocket server will accept the <code>server_no_context_takeover</code> parameter of the per-message deflate compression extension offered by the client.
 * @param webSocketPreferredClientNoContext  Set whether the WebSocket server will accept the <code>client_no_context_takeover</code> parameter of the per-message deflate compression extension offered by the client.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttServerOptions original] using Vert.x codegen.
 */
fun mqttServerOptionsOf(
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
  acceptBacklog: Int? = null,
  port: Int? = null,
  host: String? = null,
  clientAuth: ClientAuth? = null,
  sni: Boolean? = null,
  trafficShapingOptions: io.vertx.core.net.TrafficShapingOptions? = null,
  registerWriteHandler: Boolean? = null,
  keyCertOptions: io.vertx.core.net.KeyCertOptions? = null,
  maxMessageSize: Int? = null,
  autoClientId: Boolean? = null,
  maxClientIdLength: Int? = null,
  timeoutOnConnect: Int? = null,
  useProxyProtocol: Boolean? = null,
  proxyProtocolTimeout: Long? = null,
  proxyProtocolTimeoutUnit: TimeUnit? = null,
  useWebSocket: Boolean? = null,
  webSocketMaxFrameSize: Int? = null,
  perFrameWebSocketCompressionSupported: Boolean? = null,
  perMessageWebSocketCompressionSupported: Boolean? = null,
  webSocketCompressionLevel: Int? = null,
  webSocketAllowServerNoContext: Boolean? = null,
  webSocketPreferredClientNoContext: Boolean? = null): MqttServerOptions = io.vertx.mqtt.MqttServerOptions().apply {

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
  if (acceptBacklog != null) {
    this.setAcceptBacklog(acceptBacklog)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (clientAuth != null) {
    this.setClientAuth(clientAuth)
  }
  if (sni != null) {
    this.setSni(sni)
  }
  if (trafficShapingOptions != null) {
    this.setTrafficShapingOptions(trafficShapingOptions)
  }
  if (registerWriteHandler != null) {
    this.setRegisterWriteHandler(registerWriteHandler)
  }
  if (keyCertOptions != null) {
    this.setKeyCertOptions(keyCertOptions)
  }
  if (maxMessageSize != null) {
    this.setMaxMessageSize(maxMessageSize)
  }
  if (autoClientId != null) {
    this.setAutoClientId(autoClientId)
  }
  if (maxClientIdLength != null) {
    this.setMaxClientIdLength(maxClientIdLength)
  }
  if (timeoutOnConnect != null) {
    this.setTimeoutOnConnect(timeoutOnConnect)
  }
  if (useProxyProtocol != null) {
    this.setUseProxyProtocol(useProxyProtocol)
  }
  if (proxyProtocolTimeout != null) {
    this.setProxyProtocolTimeout(proxyProtocolTimeout)
  }
  if (proxyProtocolTimeoutUnit != null) {
    this.setProxyProtocolTimeoutUnit(proxyProtocolTimeoutUnit)
  }
  if (useWebSocket != null) {
    this.setUseWebSocket(useWebSocket)
  }
  if (webSocketMaxFrameSize != null) {
    this.setWebSocketMaxFrameSize(webSocketMaxFrameSize)
  }
  if (perFrameWebSocketCompressionSupported != null) {
    this.setPerFrameWebSocketCompressionSupported(perFrameWebSocketCompressionSupported)
  }
  if (perMessageWebSocketCompressionSupported != null) {
    this.setPerMessageWebSocketCompressionSupported(perMessageWebSocketCompressionSupported)
  }
  if (webSocketCompressionLevel != null) {
    this.setWebSocketCompressionLevel(webSocketCompressionLevel)
  }
  if (webSocketAllowServerNoContext != null) {
    this.setWebSocketAllowServerNoContext(webSocketAllowServerNoContext)
  }
  if (webSocketPreferredClientNoContext != null) {
    this.setWebSocketPreferredClientNoContext(webSocketPreferredClientNoContext)
  }
}

