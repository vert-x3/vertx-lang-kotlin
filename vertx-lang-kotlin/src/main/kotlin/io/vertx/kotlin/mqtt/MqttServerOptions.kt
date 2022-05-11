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
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.mqtt.MqttServerOptions] objects.
 *
 * Represents options used by the MQTT server
 *
 * @param acceptBacklog  Set the accept back log
 * @param activityLogDataFormat  Set the value of Netty's logging handler's data format: Netty's pipeline is configured for logging on Netty's logger.
 * @param autoClientId  Set if clientid should be auto-generated when it's "zero-bytes"
 * @param clientAuth  Set whether client auth is required
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param host  Set the host
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received nor sent within the timeout. If you want change default time unit, use [io.vertx.core.net.NetServerOptions]
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param jdkSslEngineOptions 
 * @param keyCertOptions  Set the key/cert options.
 * @param keyStoreOptions  Set the key/cert options in jks format, aka Java keystore.
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param maxMessageSize  Set max MQTT message size
 * @param openSslEngineOptions 
 * @param pemKeyCertOptions  Set the key/cert store options in pem format.
 * @param pemTrustOptions  Set the trust options in pem format
 * @param pfxKeyCertOptions  Set the key/cert options in pfx format.
 * @param pfxTrustOptions  Set the trust options in pfx format
 * @param port  Set the port
 * @param proxyProtocolTimeout  Set the Proxy protocol timeout, default time unit is seconds.
 * @param proxyProtocolTimeoutUnit  Set the Proxy protocol timeout unit. If not specified, default is seconds.
 * @param readIdleTimeout  Set the read idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.core.net.NetServerOptions]
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param sendBufferSize  Set the TCP send buffer size
 * @param sni  Set whether the server supports Server Name Indiciation
 * @param soLinger  Set whether SO_linger keep alive is enabled
 * @param ssl  Set whether SSL/TLS is enabled
 * @param sslEngineOptions  Set to use SSL engine implementation to use.
 * @param sslHandshakeTimeout  Set the SSL handshake timeout, default time unit is seconds.
 * @param sslHandshakeTimeoutUnit  Set the SSL handshake timeout unit. If not specified, default is seconds.
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native transport.
 * @param tcpKeepAlive  Set whether TCP keep alive is enabled
 * @param tcpNoDelay  Set whether TCP no delay is enabled
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native transport.
 * @param timeoutOnConnect  Set the timeout on CONNECT packet
 * @param trafficClass  Set the value of traffic class
 * @param trustOptions  Set the trust options.
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param useAlpn  Set the ALPN usage.
 * @param useProxyProtocol  Set whether the server uses the HA Proxy protocol
 * @param useWebSocket  enable mqtt over websocket
 * @param webSocketMaxFrameSize  Set the WebSocket max frame size. <p> This should be used when WebSocket transport is used and [io.vertx.mqtt.MqttServerOptions] is larger than the WebSocket frame size
 * @param writeIdleTimeout  Set the write idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is sent within the timeout. If you want change default time unit, use [io.vertx.core.net.NetServerOptions]
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mqtt.MqttServerOptions original] using Vert.x codegen.
 */
fun mqttServerOptionsOf(
  acceptBacklog: Int? = null,
  activityLogDataFormat: ByteBufFormat? = null,
  autoClientId: Boolean? = null,
  clientAuth: ClientAuth? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  host: String? = null,
  idleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
  keyCertOptions: io.vertx.core.net.KeyCertOptions? = null,
  keyStoreOptions: io.vertx.core.net.JksOptions? = null,
  logActivity: Boolean? = null,
  maxMessageSize: Int? = null,
  openSslEngineOptions: io.vertx.core.net.OpenSSLEngineOptions? = null,
  pemKeyCertOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  pemTrustOptions: io.vertx.core.net.PemTrustOptions? = null,
  pfxKeyCertOptions: io.vertx.core.net.PfxOptions? = null,
  pfxTrustOptions: io.vertx.core.net.PfxOptions? = null,
  port: Int? = null,
  proxyProtocolTimeout: Long? = null,
  proxyProtocolTimeoutUnit: TimeUnit? = null,
  readIdleTimeout: Int? = null,
  receiveBufferSize: Int? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  sendBufferSize: Int? = null,
  sni: Boolean? = null,
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
  timeoutOnConnect: Int? = null,
  trafficClass: Int? = null,
  trustOptions: io.vertx.core.net.TrustOptions? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  useAlpn: Boolean? = null,
  useProxyProtocol: Boolean? = null,
  useWebSocket: Boolean? = null,
  webSocketMaxFrameSize: Int? = null,
  writeIdleTimeout: Int? = null): MqttServerOptions = io.vertx.mqtt.MqttServerOptions().apply {

  if (acceptBacklog != null) {
    this.setAcceptBacklog(acceptBacklog)
  }
  if (activityLogDataFormat != null) {
    this.setActivityLogDataFormat(activityLogDataFormat)
  }
  if (autoClientId != null) {
    this.setAutoClientId(autoClientId)
  }
  if (clientAuth != null) {
    this.setClientAuth(clientAuth)
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
  if (host != null) {
    this.setHost(host)
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
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (maxMessageSize != null) {
    this.setMaxMessageSize(maxMessageSize)
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
  if (port != null) {
    this.setPort(port)
  }
  if (proxyProtocolTimeout != null) {
    this.setProxyProtocolTimeout(proxyProtocolTimeout)
  }
  if (proxyProtocolTimeoutUnit != null) {
    this.setProxyProtocolTimeoutUnit(proxyProtocolTimeoutUnit)
  }
  if (readIdleTimeout != null) {
    this.setReadIdleTimeout(readIdleTimeout)
  }
  if (receiveBufferSize != null) {
    this.setReceiveBufferSize(receiveBufferSize)
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
  if (sni != null) {
    this.setSni(sni)
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
  if (timeoutOnConnect != null) {
    this.setTimeoutOnConnect(timeoutOnConnect)
  }
  if (trafficClass != null) {
    this.setTrafficClass(trafficClass)
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
  if (useProxyProtocol != null) {
    this.setUseProxyProtocol(useProxyProtocol)
  }
  if (useWebSocket != null) {
    this.setUseWebSocket(useWebSocket)
  }
  if (webSocketMaxFrameSize != null) {
    this.setWebSocketMaxFrameSize(webSocketMaxFrameSize)
  }
  if (writeIdleTimeout != null) {
    this.setWriteIdleTimeout(writeIdleTimeout)
  }
}

