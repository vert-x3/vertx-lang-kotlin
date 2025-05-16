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
package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.ConsulClientOptions
import io.netty.handler.logging.ByteBufFormat
import io.vertx.core.http.Http2Settings
import io.vertx.core.http.HttpVersion
import io.vertx.core.net.JdkSSLEngineOptions
import io.vertx.core.net.JksOptions
import io.vertx.core.net.OpenSSLEngineOptions
import io.vertx.core.net.PemKeyCertOptions
import io.vertx.core.net.PemTrustOptions
import io.vertx.core.net.PfxOptions
import io.vertx.core.net.ProxyOptions
import io.vertx.core.tracing.TracingPolicy
import io.vertx.uritemplate.ExpandOptions
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.ext.consul.ConsulClientOptions] objects.
 *
 * Options used to create Consul client.
 *
 * @param aclToken  Set the ACL token. When provided, the client will use this token when making requests to the Consul by providing the "?token" query parameter. When not provided, the empty token, which maps to the 'anonymous' ACL policy, is used.
 * @param activityLogDataFormat  Set the value of Netty's logging handler's data format: Netty's pipeline is configured for logging on Netty's logger.
 * @param alpnVersions  Set the list of protocol versions to provide to the server during the Application-Layer Protocol Negotiation. When the list is empty, the client provides a best effort list according to [io.vertx.ext.consul.ConsulClientOptions]: <ul>   <li>: [ "h2", "http/1.1" ]</li>   <li>otherwise: [[io.vertx.core.http.HttpClientOptions]]</li> </ul>
 * @param connectTimeout  Set the connect timeout
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param dc  Set the datacenter name. When provided, the client will use it when making requests to the Consul by providing the "?dc" query parameter. When not provided, the datacenter of the consul agent is queried.
 * @param decoderInitialBufferSize  set to <code>initialBufferSizeHttpDecoder</code> the initial buffer of the HttpDecoder.
 * @param decompressionSupported  Whether the client should send requests with an <code>accepting-encoding</code> header set to a compression algorithm.
 * @param defaultHost  Set the default host name to be used by this client in requests if none is provided when making the request.
 * @param defaultPort  Set the default port to be used by this client in requests if none is provided when making the request.
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param followRedirects  Configure the default behavior of the client to follow HTTP <code>30x</code> redirections.
 * @param forceSni  By default, the server name is only sent for Fully Qualified Domain Name (FQDN), setting this property to <code>true</code> forces the server name to be always sent.
 * @param http2ClearTextUpgrade  Set to <code>true</code> when an <i>h2c</i> connection is established using an HTTP/1.1 upgrade request, and <code>false</code> when an <i>h2c</i> connection is established directly (with prior knowledge).
 * @param http2ClearTextUpgradeWithPreflightRequest  Set to <code>true</code> when an <i>h2c</i> connection established using an HTTP/1.1 upgrade request should perform a preflight <code>OPTIONS</code> request to the origin server to establish the <i>h2c</i> connection.
 * @param http2ConnectionWindowSize  Set the default HTTP/2 connection window size. It overrides the initial window size set by , so the connection window size is greater than for its streams, in order the data throughput. <p/> A value of <code>-1</code> reuses the initial window size setting.
 * @param http2KeepAliveTimeout  Set the keep alive timeout for HTTP/2 connections, in seconds. <p/> This value determines how long a connection remains unused in the pool before being evicted and closed. <p/> A timeout of <code>0</code> means there is no timeout.
 * @param http2MaxPoolSize  Set the maximum pool size for HTTP/2 connections
 * @param http2MultiplexingLimit  Set a client limit of the number concurrent streams for each HTTP/2 connection, this limits the number of streams the client can create for a connection. The effective number of streams for a connection is the min of this value and the server's initial settings. <p/> Setting the value to <code>-1</code> means to use the value sent by the server's initial settings. <code>-1</code> is the default value.
 * @param http2UpgradeMaxContentLength  Set the HTTP/2 upgrade maximum length of the aggregated content in bytes. This is only taken into account when  is set to <code>false</code> (which is the default). When  is <code>true</code>, then the client makes a preflight OPTIONS request and the upgrade will not send a body, voiding the requirements.
 * @param idleTimeout  Set the idle timeout, in seconds. zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout.
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param initialSettings  Set the HTTP/2 connection settings immediately sent by to the server when the client connects.
 * @param jdkSslEngineOptions 
 * @param keepAlive  Set whether keep alive is enabled on the client
 * @param keepAliveTimeout  Set the keep alive timeout for HTTP/1.x, in seconds. <p/> This value determines how long a connection remains unused in the pool before being evicted and closed. <p/> A timeout of <code>0</code> means there is no timeout.
 * @param keyCertOptions  Set the key/cert options.
 * @param keyStoreOptions  Set the key/cert options in jks format, aka Java keystore.
 * @param localAddress  Set the local interface to bind for network connections. When the local address is null, it will pick any local address, the default local address is null.
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param maxChunkSize  Set the maximum HTTP chunk size
 * @param maxHeaderSize  Set the maximum length of all headers for HTTP/1.x .
 * @param maxInitialLineLength  Set the maximum length of the initial line for HTTP/1.x (e.g. <code>"HTTP/1.1 200 OK"</code>)
 * @param maxPoolSize  Set the maximum pool size for connections
 * @param maxRedirects  Set to <code>maxRedirects</code> the maximum number of redirection a request can follow.
 * @param maxWaitQueueSize  Set the maximum requests allowed in the wait queue, any requests beyond the max size will result in a ConnectionPoolTooBusyException.  If the value is set to a negative number then the queue will be unbounded.
 * @param maxWebSocketFrameSize  Set the max websocket frame size
 * @param maxWebSocketMessageSize  Set the max websocket message size
 * @param maxWebSockets  Set the max number of WebSockets per endpoint.
 * @param metricsName  Set the metrics name identifying the reported metrics, useful for grouping metrics with the same name.
 * @param name  Set the client name, used when the client is shared, otherwise ignored.
 * @param nonProxyHosts  Set a list of remote hosts that are not proxied when the client is configured to use a proxy. This list serves the same purpose than the JVM <code>nonProxyHosts</code> configuration. <p> Entries can use the <i>*</i> wildcard character for pattern matching, e.g <i>*.example.com</i> matches <i>www.example.com</i>.
 * @param openSslEngineOptions 
 * @param pemKeyCertOptions  Set the key/cert store options in pem format.
 * @param pemTrustOptions  Set the trust options.
 * @param pfxKeyCertOptions  Set the key/cert options in pfx format.
 * @param pfxTrustOptions  Set the trust options in pfx format
 * @param pipelining  Set whether pipe-lining is enabled on the client
 * @param pipeliningLimit  Set the limit of pending requests a pipe-lined HTTP/1 connection can send.
 * @param poolCleanerPeriod  Set the connection pool cleaner period in milli seconds, a non positive value disables expiration checks and connections will remain in the pool until they are closed.
 * @param poolEventLoopSize  Set the number of event-loop the pool use. <ul>   <li>when the size is <code>0</code>, the client pool will use the current event-loop</li>   <li>otherwise the client will create and use its own event loop</li> </ul> The default size is <code>0</code>.
 * @param protocolVersion  Set the protocol version.
 * @param proxyOptions  Set proxy options for connections via CONNECT proxy (e.g. Squid) or a SOCKS proxy.
 * @param readIdleTimeout  Set the read idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.ext.consul.ConsulClientOptions]
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param sendBufferSize  Set the TCP send buffer size
 * @param sendUnmaskedFrames  Set true when the client wants to skip frame masking. You may want to set it true on server by server websocket communication: In this case you are by passing RFC6455 protocol. It's false as default.
 * @param shared  Set to <code>true</code> to share the client. <p> There can be multiple shared clients distinguished by [io.vertx.core.http.HttpClientOptions], when no specific name is set, the [io.vertx.core.http.HttpClientOptions] is used.
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
 * @param templateExpandOptions 
 * @param timeout  Sets the amount of time (in milliseconds) after which if the request does not return any data within the timeout period an failure will be passed to the handler and the request will be closed.
 * @param tracingPolicy  Set the tracing policy for the client behavior when Vert.x has tracing enabled.
 * @param trafficClass  Set the value of traffic class
 * @param trustAll  Set whether all server certificates should be trusted
 * @param trustOptions  Set the trust options.
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param tryUseCompression  Set whether compression is enabled
 * @param tryUsePerFrameWebSocketCompression  Set whether the client will offer the WebSocket per-frame deflate compression extension.
 * @param tryUsePerMessageWebSocketCompression  Set whether the client will offer the WebSocket per-message deflate compression extension.
 * @param useAlpn  Set the ALPN usage.
 * @param userAgent  Sets the Web Client user agent header. Defaults to Vert.x-WebClient/&lt;version&gt;.
 * @param userAgentEnabled  Sets whether the Web Client should send a user agent header. Defaults to true.
 * @param verifyHost  Set whether hostname verification is enabled
 * @param webSocketClosingTimeout  Set the amount of time a client WebSocket will wait until it closes the TCP connection after receiving a close frame. <p> When a WebSocket is closed, the server should close the TCP connection. This timeout will close the TCP connection on the client when it expires. <p> Set to <code>0L</code> closes the TCP connection immediately after receiving the close frame. <p> Set to a negative value to disable it.
 * @param webSocketCompressionAllowClientNoContext  Set whether the <code>client_no_context_takeover</code> parameter of the WebSocket per-message deflate compression extension will be offered.
 * @param webSocketCompressionLevel  Set the WebSocket deflate compression level.
 * @param webSocketCompressionRequestServerNoContext  Set whether the <code>server_no_context_takeover</code> parameter of the WebSocket per-message deflate compression extension will be offered.
 * @param writeIdleTimeout  Set the write idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is sent within the timeout. If you want change default time unit, use [io.vertx.ext.consul.ConsulClientOptions]
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClientOptions original] using Vert.x codegen.
 */
fun consulClientOptionsOf(
  aclToken: String? = null,
  activityLogDataFormat: ByteBufFormat? = null,
  alpnVersions: Iterable<HttpVersion>? = null,
  connectTimeout: Int? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  dc: String? = null,
  decoderInitialBufferSize: Int? = null,
  decompressionSupported: Boolean? = null,
  defaultHost: String? = null,
  defaultPort: Int? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  followRedirects: Boolean? = null,
  forceSni: Boolean? = null,
  http2ClearTextUpgrade: Boolean? = null,
  http2ClearTextUpgradeWithPreflightRequest: Boolean? = null,
  http2ConnectionWindowSize: Int? = null,
  http2KeepAliveTimeout: Int? = null,
  http2MaxPoolSize: Int? = null,
  http2MultiplexingLimit: Int? = null,
  http2UpgradeMaxContentLength: Int? = null,
  idleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  initialSettings: io.vertx.core.http.Http2Settings? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
  keepAlive: Boolean? = null,
  keepAliveTimeout: Int? = null,
  keyCertOptions: io.vertx.core.net.KeyCertOptions? = null,
  keyStoreOptions: io.vertx.core.net.JksOptions? = null,
  localAddress: String? = null,
  logActivity: Boolean? = null,
  maxChunkSize: Int? = null,
  maxHeaderSize: Int? = null,
  maxInitialLineLength: Int? = null,
  maxPoolSize: Int? = null,
  maxRedirects: Int? = null,
  maxWaitQueueSize: Int? = null,
  maxWebSocketFrameSize: Int? = null,
  maxWebSocketMessageSize: Int? = null,
  maxWebSockets: Int? = null,
  metricsName: String? = null,
  name: String? = null,
  nonProxyHosts: Iterable<String>? = null,
  openSslEngineOptions: io.vertx.core.net.OpenSSLEngineOptions? = null,
  pemKeyCertOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  pemTrustOptions: io.vertx.core.net.PemTrustOptions? = null,
  pfxKeyCertOptions: io.vertx.core.net.PfxOptions? = null,
  pfxTrustOptions: io.vertx.core.net.PfxOptions? = null,
  pipelining: Boolean? = null,
  pipeliningLimit: Int? = null,
  poolCleanerPeriod: Int? = null,
  poolEventLoopSize: Int? = null,
  protocolVersion: HttpVersion? = null,
  proxyOptions: io.vertx.core.net.ProxyOptions? = null,
  readIdleTimeout: Int? = null,
  receiveBufferSize: Int? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  sendBufferSize: Int? = null,
  sendUnmaskedFrames: Boolean? = null,
  shared: Boolean? = null,
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
  templateExpandOptions: io.vertx.uritemplate.ExpandOptions? = null,
  timeout: Long? = null,
  tracingPolicy: TracingPolicy? = null,
  trafficClass: Int? = null,
  trustAll: Boolean? = null,
  trustOptions: io.vertx.core.net.TrustOptions? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  tryUseCompression: Boolean? = null,
  tryUsePerFrameWebSocketCompression: Boolean? = null,
  tryUsePerMessageWebSocketCompression: Boolean? = null,
  useAlpn: Boolean? = null,
  userAgent: String? = null,
  userAgentEnabled: Boolean? = null,
  verifyHost: Boolean? = null,
  webSocketClosingTimeout: Int? = null,
  webSocketCompressionAllowClientNoContext: Boolean? = null,
  webSocketCompressionLevel: Int? = null,
  webSocketCompressionRequestServerNoContext: Boolean? = null,
  writeIdleTimeout: Int? = null): ConsulClientOptions = io.vertx.ext.consul.ConsulClientOptions().apply {

  if (aclToken != null) {
    this.setAclToken(aclToken)
  }
  if (activityLogDataFormat != null) {
    this.setActivityLogDataFormat(activityLogDataFormat)
  }
  if (alpnVersions != null) {
    this.setAlpnVersions(alpnVersions.toList())
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
  if (dc != null) {
    this.setDc(dc)
  }
  if (decoderInitialBufferSize != null) {
    this.setDecoderInitialBufferSize(decoderInitialBufferSize)
  }
  if (decompressionSupported != null) {
    this.setDecompressionSupported(decompressionSupported)
  }
  if (defaultHost != null) {
    this.setDefaultHost(defaultHost)
  }
  if (defaultPort != null) {
    this.setDefaultPort(defaultPort)
  }
  if (enabledCipherSuites != null) {
    for (item in enabledCipherSuites) {
      this.addEnabledCipherSuite(item)
    }
  }
  if (enabledSecureTransportProtocols != null) {
    this.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols.toSet())
  }
  if (followRedirects != null) {
    this.setFollowRedirects(followRedirects)
  }
  if (forceSni != null) {
    this.setForceSni(forceSni)
  }
  if (http2ClearTextUpgrade != null) {
    this.setHttp2ClearTextUpgrade(http2ClearTextUpgrade)
  }
  if (http2ClearTextUpgradeWithPreflightRequest != null) {
    this.setHttp2ClearTextUpgradeWithPreflightRequest(http2ClearTextUpgradeWithPreflightRequest)
  }
  if (http2ConnectionWindowSize != null) {
    this.setHttp2ConnectionWindowSize(http2ConnectionWindowSize)
  }
  if (http2KeepAliveTimeout != null) {
    this.setHttp2KeepAliveTimeout(http2KeepAliveTimeout)
  }
  if (http2MaxPoolSize != null) {
    this.setHttp2MaxPoolSize(http2MaxPoolSize)
  }
  if (http2MultiplexingLimit != null) {
    this.setHttp2MultiplexingLimit(http2MultiplexingLimit)
  }
  if (http2UpgradeMaxContentLength != null) {
    this.setHttp2UpgradeMaxContentLength(http2UpgradeMaxContentLength)
  }
  if (idleTimeout != null) {
    this.setIdleTimeout(idleTimeout)
  }
  if (idleTimeoutUnit != null) {
    this.setIdleTimeoutUnit(idleTimeoutUnit)
  }
  if (initialSettings != null) {
    this.setInitialSettings(initialSettings)
  }
  if (jdkSslEngineOptions != null) {
    this.setJdkSslEngineOptions(jdkSslEngineOptions)
  }
  if (keepAlive != null) {
    this.setKeepAlive(keepAlive)
  }
  if (keepAliveTimeout != null) {
    this.setKeepAliveTimeout(keepAliveTimeout)
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
  if (maxChunkSize != null) {
    this.setMaxChunkSize(maxChunkSize)
  }
  if (maxHeaderSize != null) {
    this.setMaxHeaderSize(maxHeaderSize)
  }
  if (maxInitialLineLength != null) {
    this.setMaxInitialLineLength(maxInitialLineLength)
  }
  if (maxPoolSize != null) {
    this.setMaxPoolSize(maxPoolSize)
  }
  if (maxRedirects != null) {
    this.setMaxRedirects(maxRedirects)
  }
  if (maxWaitQueueSize != null) {
    this.setMaxWaitQueueSize(maxWaitQueueSize)
  }
  if (maxWebSocketFrameSize != null) {
    this.setMaxWebSocketFrameSize(maxWebSocketFrameSize)
  }
  if (maxWebSocketMessageSize != null) {
    this.setMaxWebSocketMessageSize(maxWebSocketMessageSize)
  }
  if (maxWebSockets != null) {
    this.setMaxWebSockets(maxWebSockets)
  }
  if (metricsName != null) {
    this.setMetricsName(metricsName)
  }
  if (name != null) {
    this.setName(name)
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
  if (pipelining != null) {
    this.setPipelining(pipelining)
  }
  if (pipeliningLimit != null) {
    this.setPipeliningLimit(pipeliningLimit)
  }
  if (poolCleanerPeriod != null) {
    this.setPoolCleanerPeriod(poolCleanerPeriod)
  }
  if (poolEventLoopSize != null) {
    this.setPoolEventLoopSize(poolEventLoopSize)
  }
  if (protocolVersion != null) {
    this.setProtocolVersion(protocolVersion)
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
  if (reuseAddress != null) {
    this.setReuseAddress(reuseAddress)
  }
  if (reusePort != null) {
    this.setReusePort(reusePort)
  }
  if (sendBufferSize != null) {
    this.setSendBufferSize(sendBufferSize)
  }
  if (sendUnmaskedFrames != null) {
    this.setSendUnmaskedFrames(sendUnmaskedFrames)
  }
  if (shared != null) {
    this.setShared(shared)
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
  if (templateExpandOptions != null) {
    this.setTemplateExpandOptions(templateExpandOptions)
  }
  if (timeout != null) {
    this.setTimeout(timeout)
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
  if (tryUseCompression != null) {
    this.setTryUseCompression(tryUseCompression)
  }
  if (tryUsePerFrameWebSocketCompression != null) {
    this.setTryUsePerFrameWebSocketCompression(tryUsePerFrameWebSocketCompression)
  }
  if (tryUsePerMessageWebSocketCompression != null) {
    this.setTryUsePerMessageWebSocketCompression(tryUsePerMessageWebSocketCompression)
  }
  if (useAlpn != null) {
    this.setUseAlpn(useAlpn)
  }
  if (userAgent != null) {
    this.setUserAgent(userAgent)
  }
  if (userAgentEnabled != null) {
    this.setUserAgentEnabled(userAgentEnabled)
  }
  if (verifyHost != null) {
    this.setVerifyHost(verifyHost)
  }
  if (webSocketClosingTimeout != null) {
    this.setWebSocketClosingTimeout(webSocketClosingTimeout)
  }
  if (webSocketCompressionAllowClientNoContext != null) {
    this.setWebSocketCompressionAllowClientNoContext(webSocketCompressionAllowClientNoContext)
  }
  if (webSocketCompressionLevel != null) {
    this.setWebSocketCompressionLevel(webSocketCompressionLevel)
  }
  if (webSocketCompressionRequestServerNoContext != null) {
    this.setWebSocketCompressionRequestServerNoContext(webSocketCompressionRequestServerNoContext)
  }
  if (writeIdleTimeout != null) {
    this.setWriteIdleTimeout(writeIdleTimeout)
  }
}

