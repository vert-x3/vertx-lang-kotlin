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
import io.vertx.core.buffer.Buffer
import io.vertx.core.http.ClientAuth
import io.vertx.core.net.TrafficShapingOptions
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.ext.stomp.StompServerOptions] objects.
 *
 * STOMP Server options. You can also configure the Net Server used by the STOMP server from these options.
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
 * @param keyCertOptions  Set the key/cert options.
 * @param acceptBacklog  Set the accept back log
 * @param host  Set the host
 * @param clientAuth  Set whether client auth is required
 * @param sni  Set whether the server supports Server Name Indiciation
 * @param useProxyProtocol  Set whether the server uses the HA Proxy protocol
 * @param proxyProtocolTimeout  Set the Proxy protocol timeout, default time unit is seconds.
 * @param proxyProtocolTimeoutUnit  Set the Proxy protocol timeout unit. If not specified, default is seconds.
 * @param trafficShapingOptions  Set traffic shaping options. If not specified, traffic is unthrottled.
 * @param registerWriteHandler  Whether a write-handler should be registered on the [io.vertx.core.eventbus.EventBus]. <p> Defaults to <code>false</code>.
 * @param maxBodyLength  Sets the max body length accepted by the server. 10 Mb by default.
 * @param maxHeaderLength  Sets the max header length.
 * @param maxHeaders  Sets the maximum number of headers. 1000 by default.
 * @param supportedVersions  Sets the STOMP protocol versions supported by the server. Versions must be given in the decreasing order.
 * @param secured  Enables or disables the server security feature. It requires an [io.vertx.ext.auth.authentication.AuthenticationProvider] handler.
 * @param sendErrorOnNoSubscriptions  Sets whether or not an error is sent to the client when this client sends a message to an not subscribed destinations (no subscriptions on this destination).
 * @param timeFactor  Sets the time factor.
 * @param port  Sets the port on which the server is going to listen for TCP connection.
 * @param heartbeat  Sets the heartbeat configuration.
 * @param maxFrameInTransaction  Sets the maximum number of frame that can be added in a transaction. If the number of frame added to a transaction exceeds this threshold, the client receives an <code>ERROR</code> frame and is disconnected. The default is 1000.
 * @param transactionChunkSize  Sets the chunk size when replaying a transaction. To avoid blocking the event loop for too long, large transactions are split into chunks, replayed one by one. This settings sets the chunk size.
 * @param maxSubscriptionsByClient  Sets the maximum of subscriptions a client is allowed to register. If a client exceeds this number, it receives an error and the connection is closed.
 * @param websocketBridge  Enables or disables the web socket bridge.
 * @param websocketPath  Sets the websocket path. Only frames received on this path would be considered as STOMP frame.
 * @param trailingLine  Sets whether or not an empty line should be appended to the written STOMP frame. This option is disabled by default. This option is not compliant with the STOMP specification, and so is not documented on purpose.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerOptions original] using Vert.x codegen.
 */
fun stompServerOptionsOf(
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
  keyCertOptions: io.vertx.core.net.KeyCertOptions? = null,
  acceptBacklog: Int? = null,
  host: String? = null,
  clientAuth: ClientAuth? = null,
  sni: Boolean? = null,
  useProxyProtocol: Boolean? = null,
  proxyProtocolTimeout: Long? = null,
  proxyProtocolTimeoutUnit: TimeUnit? = null,
  trafficShapingOptions: io.vertx.core.net.TrafficShapingOptions? = null,
  registerWriteHandler: Boolean? = null,
  maxBodyLength: Int? = null,
  maxHeaderLength: Int? = null,
  maxHeaders: Int? = null,
  supportedVersions: Iterable<String>? = null,
  secured: Boolean? = null,
  sendErrorOnNoSubscriptions: Boolean? = null,
  timeFactor: Int? = null,
  port: Int? = null,
  heartbeat: io.vertx.core.json.JsonObject? = null,
  maxFrameInTransaction: Int? = null,
  transactionChunkSize: Int? = null,
  maxSubscriptionsByClient: Int? = null,
  websocketBridge: Boolean? = null,
  websocketPath: String? = null,
  trailingLine: Boolean? = null): StompServerOptions = io.vertx.ext.stomp.StompServerOptions().apply {

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
  if (keyCertOptions != null) {
    this.setKeyCertOptions(keyCertOptions)
  }
  if (acceptBacklog != null) {
    this.setAcceptBacklog(acceptBacklog)
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
  if (useProxyProtocol != null) {
    this.setUseProxyProtocol(useProxyProtocol)
  }
  if (proxyProtocolTimeout != null) {
    this.setProxyProtocolTimeout(proxyProtocolTimeout)
  }
  if (proxyProtocolTimeoutUnit != null) {
    this.setProxyProtocolTimeoutUnit(proxyProtocolTimeoutUnit)
  }
  if (trafficShapingOptions != null) {
    this.setTrafficShapingOptions(trafficShapingOptions)
  }
  if (registerWriteHandler != null) {
    this.setRegisterWriteHandler(registerWriteHandler)
  }
  if (maxBodyLength != null) {
    this.setMaxBodyLength(maxBodyLength)
  }
  if (maxHeaderLength != null) {
    this.setMaxHeaderLength(maxHeaderLength)
  }
  if (maxHeaders != null) {
    this.setMaxHeaders(maxHeaders)
  }
  if (supportedVersions != null) {
    this.setSupportedVersions(supportedVersions.toList())
  }
  if (secured != null) {
    this.setSecured(secured)
  }
  if (sendErrorOnNoSubscriptions != null) {
    this.setSendErrorOnNoSubscriptions(sendErrorOnNoSubscriptions)
  }
  if (timeFactor != null) {
    this.setTimeFactor(timeFactor)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (heartbeat != null) {
    this.setHeartbeat(heartbeat)
  }
  if (maxFrameInTransaction != null) {
    this.setMaxFrameInTransaction(maxFrameInTransaction)
  }
  if (transactionChunkSize != null) {
    this.setTransactionChunkSize(transactionChunkSize)
  }
  if (maxSubscriptionsByClient != null) {
    this.setMaxSubscriptionsByClient(maxSubscriptionsByClient)
  }
  if (websocketBridge != null) {
    this.setWebsocketBridge(websocketBridge)
  }
  if (websocketPath != null) {
    this.setWebsocketPath(websocketPath)
  }
  if (trailingLine != null) {
    this.setTrailingLine(trailingLine)
  }
}

