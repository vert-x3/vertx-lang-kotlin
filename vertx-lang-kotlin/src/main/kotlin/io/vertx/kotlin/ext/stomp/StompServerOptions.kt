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
package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.StompServerOptions
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
 * A function providing a DSL for building [io.vertx.ext.stomp.StompServerOptions] objects.
 *
 * STOMP Server options. You can also configure the Net Server used by the STOMP server from these options.
 *
 * @param acceptBacklog  Set the accept back log
 * @param activityLogDataFormat  Set the value of Netty's logging handler's data format: Netty's pipeline is configured for logging on Netty's logger.
 * @param clientAuth  Set whether client auth is required
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param heartbeat  Sets the heartbeat configuration.
 * @param host  Set the host
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received nor sent within the timeout. If you want change default time unit, use [io.vertx.core.net.NetServerOptions]
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param jdkSslEngineOptions 
 * @param keyCertOptions  Set the key/cert options.
 * @param keyStoreOptions  Set the key/cert options in jks format, aka Java keystore.
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param maxBodyLength  Sets the max body length accepted by the server. 10 Mb by default.
 * @param maxFrameInTransaction  Sets the maximum number of frame that can be added in a transaction. If the number of frame added to a transaction exceeds this threshold, the client receives an <code>ERROR</code> frame and is disconnected. The default is 1000.
 * @param maxHeaderLength  Sets the max header length.
 * @param maxHeaders  Sets the maximum number of headers. 1000 by default.
 * @param maxSubscriptionsByClient  Sets the maximum of subscriptions a client is allowed to register. If a client exceeds this number, it receives an error and the connection is closed.
 * @param openSslEngineOptions 
 * @param pemKeyCertOptions  Set the key/cert store options in pem format.
 * @param pemTrustOptions  Set the trust options in pem format
 * @param pfxKeyCertOptions  Set the key/cert options in pfx format.
 * @param pfxTrustOptions  Set the trust options in pfx format
 * @param port  Sets the port on which the server is going to listen for TCP connection.
 * @param proxyProtocolTimeout  Set the Proxy protocol timeout, default time unit is seconds.
 * @param proxyProtocolTimeoutUnit  Set the Proxy protocol timeout unit. If not specified, default is seconds.
 * @param readIdleTimeout  Set the read idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.core.net.NetServerOptions]
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param registerWriteHandler  Whether a write-handler should be registered on the [io.vertx.core.eventbus.EventBus]. <p> Defaults to <code>false</code>.
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param secured  Enables or disables the server security feature. It requires an [io.vertx.ext.auth.authentication.AuthenticationProvider] handler.
 * @param sendBufferSize  Set the TCP send buffer size
 * @param sendErrorOnNoSubscriptions  Sets whether or not an error is sent to the client when this client sends a message to an not subscribed destinations (no subscriptions on this destination).
 * @param sni  Set whether the server supports Server Name Indiciation
 * @param soLinger  Set whether SO_linger keep alive is enabled
 * @param ssl  Set whether SSL/TLS is enabled
 * @param sslEngineOptions  Set to use SSL engine implementation to use.
 * @param sslHandshakeTimeout  Set the SSL handshake timeout, default time unit is seconds.
 * @param sslHandshakeTimeoutUnit  Set the SSL handshake timeout unit. If not specified, default is seconds.
 * @param supportedVersions  Sets the STOMP protocol versions supported by the server. Versions must be given in the decreasing order.
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native transport.
 * @param tcpKeepAlive  Set whether TCP keep alive is enabled
 * @param tcpKeepAliveCount  The maximum number of keepalive probes TCP should send before dropping the connection.
 * @param tcpKeepAliveIdleSeconds  The time in seconds the connection needs to remain idle before TCP starts sending keepalive probes, if the socket option keepalive has been set.
 * @param tcpKeepAliveIntervalSeconds  The time in seconds between individual keepalive probes.
 * @param tcpNoDelay  Set whether TCP no delay is enabled
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native transport.
 * @param tcpUserTimeout  Sets the <code>TCP_USER_TIMEOUT</code> option - only with linux native transport.
 * @param timeFactor  Sets the time factor.
 * @param trafficClass  Set the value of traffic class
 * @param trafficShapingOptions  Set traffic shaping options. If not specified, traffic is unthrottled.
 * @param trailingLine  Sets whether or not an empty line should be appended to the written STOMP frame. This option is disabled by default. This option is not compliant with the STOMP specification, and so is not documented on purpose.
 * @param transactionChunkSize  Sets the chunk size when replaying a transaction. To avoid blocking the event loop for too long, large transactions are split into chunks, replayed one by one. This settings sets the chunk size.
 * @param trustOptions  Set the trust options.
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param useAlpn  Set the ALPN usage.
 * @param useProxyProtocol  Set whether the server uses the HA Proxy protocol
 * @param websocketBridge  Enables or disables the web socket bridge.
 * @param websocketPath  Sets the websocket path. Only frames received on this path would be considered as STOMP frame.
 * @param writeIdleTimeout  Set the write idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is sent within the timeout. If you want change default time unit, use [io.vertx.core.net.NetServerOptions]
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerOptions original] using Vert.x codegen.
 */
fun stompServerOptionsOf(
  acceptBacklog: Int? = null,
  activityLogDataFormat: ByteBufFormat? = null,
  clientAuth: ClientAuth? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  heartbeat: io.vertx.core.json.JsonObject? = null,
  host: String? = null,
  idleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
  keyCertOptions: io.vertx.core.net.KeyCertOptions? = null,
  keyStoreOptions: io.vertx.core.net.JksOptions? = null,
  logActivity: Boolean? = null,
  maxBodyLength: Int? = null,
  maxFrameInTransaction: Int? = null,
  maxHeaderLength: Int? = null,
  maxHeaders: Int? = null,
  maxSubscriptionsByClient: Int? = null,
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
  registerWriteHandler: Boolean? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  secured: Boolean? = null,
  sendBufferSize: Int? = null,
  sendErrorOnNoSubscriptions: Boolean? = null,
  sni: Boolean? = null,
  soLinger: Int? = null,
  ssl: Boolean? = null,
  sslEngineOptions: io.vertx.core.net.SSLEngineOptions? = null,
  sslHandshakeTimeout: Long? = null,
  sslHandshakeTimeoutUnit: TimeUnit? = null,
  supportedVersions: Iterable<String>? = null,
  tcpCork: Boolean? = null,
  tcpFastOpen: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  tcpKeepAliveCount: Int? = null,
  tcpKeepAliveIdleSeconds: Int? = null,
  tcpKeepAliveIntervalSeconds: Int? = null,
  tcpNoDelay: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  tcpUserTimeout: Int? = null,
  timeFactor: Int? = null,
  trafficClass: Int? = null,
  trafficShapingOptions: io.vertx.core.net.TrafficShapingOptions? = null,
  trailingLine: Boolean? = null,
  transactionChunkSize: Int? = null,
  trustOptions: io.vertx.core.net.TrustOptions? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  useAlpn: Boolean? = null,
  useProxyProtocol: Boolean? = null,
  websocketBridge: Boolean? = null,
  websocketPath: String? = null,
  writeIdleTimeout: Int? = null): StompServerOptions = io.vertx.ext.stomp.StompServerOptions().apply {

  if (acceptBacklog != null) {
    this.setAcceptBacklog(acceptBacklog)
  }
  if (activityLogDataFormat != null) {
    this.setActivityLogDataFormat(activityLogDataFormat)
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
  if (heartbeat != null) {
    this.setHeartbeat(heartbeat)
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
  if (maxBodyLength != null) {
    this.setMaxBodyLength(maxBodyLength)
  }
  if (maxFrameInTransaction != null) {
    this.setMaxFrameInTransaction(maxFrameInTransaction)
  }
  if (maxHeaderLength != null) {
    this.setMaxHeaderLength(maxHeaderLength)
  }
  if (maxHeaders != null) {
    this.setMaxHeaders(maxHeaders)
  }
  if (maxSubscriptionsByClient != null) {
    this.setMaxSubscriptionsByClient(maxSubscriptionsByClient)
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
  if (registerWriteHandler != null) {
    this.setRegisterWriteHandler(registerWriteHandler)
  }
  if (reuseAddress != null) {
    this.setReuseAddress(reuseAddress)
  }
  if (reusePort != null) {
    this.setReusePort(reusePort)
  }
  if (secured != null) {
    this.setSecured(secured)
  }
  if (sendBufferSize != null) {
    this.setSendBufferSize(sendBufferSize)
  }
  if (sendErrorOnNoSubscriptions != null) {
    this.setSendErrorOnNoSubscriptions(sendErrorOnNoSubscriptions)
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
  if (supportedVersions != null) {
    this.setSupportedVersions(supportedVersions.toList())
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
  if (timeFactor != null) {
    this.setTimeFactor(timeFactor)
  }
  if (trafficClass != null) {
    this.setTrafficClass(trafficClass)
  }
  if (trafficShapingOptions != null) {
    this.setTrafficShapingOptions(trafficShapingOptions)
  }
  if (trailingLine != null) {
    this.setTrailingLine(trailingLine)
  }
  if (transactionChunkSize != null) {
    this.setTransactionChunkSize(transactionChunkSize)
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
  if (websocketBridge != null) {
    this.setWebsocketBridge(websocketBridge)
  }
  if (websocketPath != null) {
    this.setWebsocketPath(websocketPath)
  }
  if (writeIdleTimeout != null) {
    this.setWriteIdleTimeout(writeIdleTimeout)
  }
}

