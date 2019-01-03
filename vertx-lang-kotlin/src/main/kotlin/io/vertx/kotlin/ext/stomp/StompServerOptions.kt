package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.StompServerOptions
import io.vertx.core.http.ClientAuth
import io.vertx.core.net.JdkSSLEngineOptions
import io.vertx.core.net.JksOptions
import io.vertx.core.net.OpenSSLEngineOptions
import io.vertx.core.net.PemKeyCertOptions
import io.vertx.core.net.PemTrustOptions
import io.vertx.core.net.PfxOptions
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.ext.stomp.StompServerOptions] objects.
 *
 * STOMP Server options. You can also configure the Net Server used by the STOMP server from these options.
 *
 * @param acceptBacklog  Set the accept back log
 * @param clientAuth  Set whether client auth is required
 * @param clientAuthRequired  Set whether client auth is required
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param heartbeat  Sets the heartbeat configuration.
 * @param host  Set the host
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.core.net.NetServerOptions]
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param jdkSslEngineOptions 
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
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param secured  Enables or disables the server security feature. It requires an [io.vertx.ext.auth.AuthProvider] handler.
 * @param sendBufferSize  Set the TCP send buffer size
 * @param sendErrorOnNoSubscriptions  Sets whether or not an error is sent to the client when this client sends a message to an not subscribed destinations (no subscriptions on this destination).
 * @param sni  Set whether the server supports Server Name Indiciation
 * @param soLinger  Set whether SO_linger keep alive is enabled
 * @param ssl  Set whether SSL/TLS is enabled
 * @param supportedVersions  Sets the STOMP protocol versions supported by the server. Versions must be given in the decreasing order.
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native transport.
 * @param tcpKeepAlive  Set whether TCP keep alive is enabled
 * @param tcpNoDelay  Set whether TCP no delay is enabled
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native transport.
 * @param timeFactor  Sets the time factor.
 * @param trafficClass  Set the value of traffic class
 * @param trailingLine  Sets whether or not an empty line should be appended to the written STOMP frame. This option is disabled by default. This option is not compliant with the STOMP specification, and so is not documented on purpose.
 * @param transactionChunkSize  Sets the chunk size when replaying a transaction. To avoid blocking the event loop for too long, large transactions are split into chunks, replayed one by one. This settings sets the chunk size.
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param useAlpn  Set the ALPN usage.
 * @param usePooledBuffers  Set whether Netty pooled buffers are enabled
 * @param websocketBridge  Enables or disables the web socket bridge.
 * @param websocketPath  Sets the websocket path. Only frames received on this path would be considered as STOMP frame.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerOptions original] using Vert.x codegen.
 */
fun stompServerOptionsOf(
  acceptBacklog: Int? = null,
  clientAuth: ClientAuth? = null,
  clientAuthRequired: Boolean? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  heartbeat: io.vertx.core.json.JsonObject? = null,
  host: String? = null,
  idleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
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
  receiveBufferSize: Int? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  secured: Boolean? = null,
  sendBufferSize: Int? = null,
  sendErrorOnNoSubscriptions: Boolean? = null,
  sni: Boolean? = null,
  soLinger: Int? = null,
  ssl: Boolean? = null,
  supportedVersions: Iterable<String>? = null,
  tcpCork: Boolean? = null,
  tcpFastOpen: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  tcpNoDelay: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  timeFactor: Int? = null,
  trafficClass: Int? = null,
  trailingLine: Boolean? = null,
  transactionChunkSize: Int? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  useAlpn: Boolean? = null,
  usePooledBuffers: Boolean? = null,
  websocketBridge: Boolean? = null,
  websocketPath: String? = null): StompServerOptions = io.vertx.ext.stomp.StompServerOptions().apply {

  if (acceptBacklog != null) {
    this.setAcceptBacklog(acceptBacklog)
  }
  if (clientAuth != null) {
    this.setClientAuth(clientAuth)
  }
  if (clientAuthRequired != null) {
    this.setClientAuthRequired(clientAuthRequired)
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
  if (receiveBufferSize != null) {
    this.setReceiveBufferSize(receiveBufferSize)
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
  if (tcpNoDelay != null) {
    this.setTcpNoDelay(tcpNoDelay)
  }
  if (tcpQuickAck != null) {
    this.setTcpQuickAck(tcpQuickAck)
  }
  if (timeFactor != null) {
    this.setTimeFactor(timeFactor)
  }
  if (trafficClass != null) {
    this.setTrafficClass(trafficClass)
  }
  if (trailingLine != null) {
    this.setTrailingLine(trailingLine)
  }
  if (transactionChunkSize != null) {
    this.setTransactionChunkSize(transactionChunkSize)
  }
  if (trustStoreOptions != null) {
    this.setTrustStoreOptions(trustStoreOptions)
  }
  if (useAlpn != null) {
    this.setUseAlpn(useAlpn)
  }
  if (usePooledBuffers != null) {
    this.setUsePooledBuffers(usePooledBuffers)
  }
  if (websocketBridge != null) {
    this.setWebsocketBridge(websocketBridge)
  }
  if (websocketPath != null) {
    this.setWebsocketPath(websocketPath)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.stomp.StompServerOptions] objects.
 *
 * STOMP Server options. You can also configure the Net Server used by the STOMP server from these options.
 *
 * @param acceptBacklog  Set the accept back log
 * @param clientAuth  Set whether client auth is required
 * @param clientAuthRequired  Set whether client auth is required
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param heartbeat  Sets the heartbeat configuration.
 * @param host  Set the host
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.core.net.NetServerOptions]
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param jdkSslEngineOptions 
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
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param secured  Enables or disables the server security feature. It requires an [io.vertx.ext.auth.AuthProvider] handler.
 * @param sendBufferSize  Set the TCP send buffer size
 * @param sendErrorOnNoSubscriptions  Sets whether or not an error is sent to the client when this client sends a message to an not subscribed destinations (no subscriptions on this destination).
 * @param sni  Set whether the server supports Server Name Indiciation
 * @param soLinger  Set whether SO_linger keep alive is enabled
 * @param ssl  Set whether SSL/TLS is enabled
 * @param supportedVersions  Sets the STOMP protocol versions supported by the server. Versions must be given in the decreasing order.
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native transport.
 * @param tcpKeepAlive  Set whether TCP keep alive is enabled
 * @param tcpNoDelay  Set whether TCP no delay is enabled
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native transport.
 * @param timeFactor  Sets the time factor.
 * @param trafficClass  Set the value of traffic class
 * @param trailingLine  Sets whether or not an empty line should be appended to the written STOMP frame. This option is disabled by default. This option is not compliant with the STOMP specification, and so is not documented on purpose.
 * @param transactionChunkSize  Sets the chunk size when replaying a transaction. To avoid blocking the event loop for too long, large transactions are split into chunks, replayed one by one. This settings sets the chunk size.
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param useAlpn  Set the ALPN usage.
 * @param usePooledBuffers  Set whether Netty pooled buffers are enabled
 * @param websocketBridge  Enables or disables the web socket bridge.
 * @param websocketPath  Sets the websocket path. Only frames received on this path would be considered as STOMP frame.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.StompServerOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("stompServerOptionsOf(acceptBacklog, clientAuth, clientAuthRequired, crlPaths, crlValues, enabledCipherSuites, enabledSecureTransportProtocols, heartbeat, host, idleTimeout, idleTimeoutUnit, jdkSslEngineOptions, keyStoreOptions, logActivity, maxBodyLength, maxFrameInTransaction, maxHeaderLength, maxHeaders, maxSubscriptionsByClient, openSslEngineOptions, pemKeyCertOptions, pemTrustOptions, pfxKeyCertOptions, pfxTrustOptions, port, receiveBufferSize, reuseAddress, reusePort, secured, sendBufferSize, sendErrorOnNoSubscriptions, sni, soLinger, ssl, supportedVersions, tcpCork, tcpFastOpen, tcpKeepAlive, tcpNoDelay, tcpQuickAck, timeFactor, trafficClass, trailingLine, transactionChunkSize, trustStoreOptions, useAlpn, usePooledBuffers, websocketBridge, websocketPath)")
)
fun StompServerOptions(
  acceptBacklog: Int? = null,
  clientAuth: ClientAuth? = null,
  clientAuthRequired: Boolean? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  heartbeat: io.vertx.core.json.JsonObject? = null,
  host: String? = null,
  idleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
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
  receiveBufferSize: Int? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  secured: Boolean? = null,
  sendBufferSize: Int? = null,
  sendErrorOnNoSubscriptions: Boolean? = null,
  sni: Boolean? = null,
  soLinger: Int? = null,
  ssl: Boolean? = null,
  supportedVersions: Iterable<String>? = null,
  tcpCork: Boolean? = null,
  tcpFastOpen: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  tcpNoDelay: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  timeFactor: Int? = null,
  trafficClass: Int? = null,
  trailingLine: Boolean? = null,
  transactionChunkSize: Int? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  useAlpn: Boolean? = null,
  usePooledBuffers: Boolean? = null,
  websocketBridge: Boolean? = null,
  websocketPath: String? = null): StompServerOptions = io.vertx.ext.stomp.StompServerOptions().apply {

  if (acceptBacklog != null) {
    this.setAcceptBacklog(acceptBacklog)
  }
  if (clientAuth != null) {
    this.setClientAuth(clientAuth)
  }
  if (clientAuthRequired != null) {
    this.setClientAuthRequired(clientAuthRequired)
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
  if (receiveBufferSize != null) {
    this.setReceiveBufferSize(receiveBufferSize)
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
  if (tcpNoDelay != null) {
    this.setTcpNoDelay(tcpNoDelay)
  }
  if (tcpQuickAck != null) {
    this.setTcpQuickAck(tcpQuickAck)
  }
  if (timeFactor != null) {
    this.setTimeFactor(timeFactor)
  }
  if (trafficClass != null) {
    this.setTrafficClass(trafficClass)
  }
  if (trailingLine != null) {
    this.setTrailingLine(trailingLine)
  }
  if (transactionChunkSize != null) {
    this.setTransactionChunkSize(transactionChunkSize)
  }
  if (trustStoreOptions != null) {
    this.setTrustStoreOptions(trustStoreOptions)
  }
  if (useAlpn != null) {
    this.setUseAlpn(useAlpn)
  }
  if (usePooledBuffers != null) {
    this.setUsePooledBuffers(usePooledBuffers)
  }
  if (websocketBridge != null) {
    this.setWebsocketBridge(websocketBridge)
  }
  if (websocketPath != null) {
    this.setWebsocketPath(websocketPath)
  }
}

