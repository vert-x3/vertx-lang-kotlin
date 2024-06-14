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
package io.vertx.kotlin.ext.shell.term

import io.vertx.ext.shell.term.HttpTermOptions
import io.netty.handler.logging.ByteBufFormat
import io.vertx.core.buffer.Buffer
import io.vertx.core.http.ClientAuth
import io.vertx.core.http.Http2Settings
import io.vertx.core.http.HttpVersion
import io.vertx.core.net.TrafficShapingOptions
import io.vertx.core.tracing.TracingPolicy
import io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.ext.shell.term.HttpTermOptions] objects.
 *
 * The web term configuration options.
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
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received nor sent within the timeout. If you want change default time unit, use [io.vertx.core.http.HttpServerOptions]
 * @param readIdleTimeout  Set the read idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.core.http.HttpServerOptions]
 * @param writeIdleTimeout  Set the write idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is sent within the timeout. If you want change default time unit, use [io.vertx.core.http.HttpServerOptions]
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
 * @param acceptBacklog  Set the accept back log
 * @param port  Set the port
 * @param host  Set the host
 * @param clientAuth  Set whether client auth is required
 * @param sni  Set whether the server supports Server Name Indiciation
 * @param useProxyProtocol  Set whether the server uses the HA Proxy protocol
 * @param proxyProtocolTimeout  Set the Proxy protocol timeout, default time unit is seconds.
 * @param proxyProtocolTimeoutUnit  Set the Proxy protocol timeout unit. If not specified, default is seconds.
 * @param trafficShapingOptions  Set traffic shaping options. If not specified, traffic is unthrottled.
 * @param keyCertOptions  Set the key/cert options.
 * @param compressionSupported  Set whether the server should support gzip/deflate compression (serving compressed responses to clients advertising support for them with Accept-Encoding header)
 * @param compressionLevel  This method allows to set the compression level to be used in http1.x/2 response bodies when compression support is turned on (@see setCompressionSupported) and the client advertises to support <code>deflate/gzip</code> compression in the <code>Accept-Encoding</code> header default value is : 6 (Netty legacy) The compression level determines how much the data is compressed on a scale from 1 to 9, where '9' is trying to achieve the maximum compression ratio while '1' instead is giving priority to speed instead of compression ratio using some algorithm optimizations and skipping pedantic loops that usually gives just little improvements While one can think that best value is always the maximum compression ratio, there's a trade-off to consider: the most compressed level requires the most computational work to compress/decompress data, e.g. more dictionary lookups and loops. E.g. you have it set fairly high on a high-volume website, you may experience performance degradation and latency on resource serving due to CPU overload, and, however - as the computational work is required also client side while decompressing - setting an higher compression level can result in an overall higher page load time especially nowadays when many clients are handled mobile devices with a low CPU profile. see also: http://www.gzip.org/algorithm.txt
 * @param compressors  Set the list of compressor to use instead of using the default gzip/deflate [io.vertx.core.http.HttpServerOptions] configuration. <p> This is only active when [io.vertx.ext.shell.term.HttpTermOptions] is <code>true</code>.
 * @param acceptUnmaskedFrames  Set <code>true</code> when the server accepts unmasked frame. As default Server doesn't accept unmasked frame, you can bypass this behaviour (RFC 6455) setting <code>true</code>. It's set to <code>false</code> as default.
 * @param maxWebSocketFrameSize  Set the maximum WebSocket frames size
 * @param maxWebSocketMessageSize  Set the maximum WebSocket message size
 * @param webSocketSubProtocols  Set the WebSocket list of sub-protocol supported by the server.
 * @param handle100ContinueAutomatically  Set whether 100 Continue should be handled automatically
 * @param maxChunkSize  Set the maximum HTTP chunk size that  will receive
 * @param maxInitialLineLength  Set the maximum length of the initial line for HTTP/1.x (e.g. <code>"GET / HTTP/1.0"</code>)
 * @param maxHeaderSize  Set the maximum length of all headers for HTTP/1.x .
 * @param maxFormAttributeSize  Set the maximum size of a form attribute. Set to <code>-1</code> to allow unlimited length
 * @param maxFormFields  Set the maximum number of fields of a form. Set to <code>-1</code> to allow unlimited number of attributes
 * @param maxFormBufferedBytes  Set the maximum number of bytes a server can buffer when decoding a form. Set to <code>-1</code> to allow unlimited length
 * @param initialSettings  Set the HTTP/2 connection settings immediatly sent by the server when a client connects.
 * @param alpnVersions  Set the list of protocol versions to provide to the server during the Application-Layer Protocol Negotiatiation.
 * @param http2ClearTextEnabled  Set whether HTTP/2 over clear text is enabled or disabled, default is enabled.
 * @param http2ConnectionWindowSize  Set the default HTTP/2 connection window size. It overrides the initial window size set by , so the connection window size is greater than for its streams, in order the data throughput. <p/> A value of <code>-1</code> reuses the initial window size setting.
 * @param decompressionSupported  Set whether the server supports decompression
 * @param decoderInitialBufferSize  Set the initial buffer size for the HTTP decoder
 * @param perFrameWebSocketCompressionSupported  Enable or disable support for the WebSocket per-frame deflate compression extension.
 * @param perMessageWebSocketCompressionSupported  Enable or disable support for WebSocket per-message deflate compression extension.
 * @param webSocketCompressionLevel  Set the WebSocket compression level.
 * @param webSocketAllowServerNoContext  Set whether the WebSocket server will accept the <code>server_no_context_takeover</code> parameter of the per-message deflate compression extension offered by the client.
 * @param webSocketPreferredClientNoContext  Set whether the WebSocket server will accept the <code>client_no_context_takeover</code> parameter of the per-message deflate compression extension offered by the client.
 * @param webSocketClosingTimeout  Set the amount of time a server WebSocket will wait until it closes the TCP connection after sending a close frame. <p> When a server closes a WebSocket, it should wait the client close frame to close the TCP connection. This timeout will close the TCP connection on the server when it expires. When the TCP connection is closed receiving the close frame, the  instead of the  will be called. <p> Set to <code>0L</code> closes the TCP connection immediately after sending the close frame. <p> Set to a negative value to disable it.
 * @param tracingPolicy  Set the tracing policy for the server behavior when Vert.x has tracing enabled.
 * @param registerWriteHandler  Has no effect on HTTP server options.
 * @param registerWebSocketWriteHandlers  Whether write-handlers for server websockets should be registered on the [io.vertx.core.eventbus.EventBus]. <p> Defaults to <code>false</code>.
 * @param http2RstFloodMaxRstFramePerWindow  Set the max number of RST frame allowed per time window, this is used to prevent HTTP/2 RST frame flood DDOS attacks. The default value is [io.vertx.core.http.HttpServerOptions], setting zero or a negative value, disables flood protection.
 * @param http2RstFloodWindowDuration  Set the duration of the time window when checking the max number of RST frames, this is used to prevent HTTP/2 RST frame flood DDOS attacks. The default value is [io.vertx.core.http.HttpServerOptions], setting zero or a negative value, disables flood protection.
 * @param http2RstFloodWindowDurationTimeUnit  Set the time unit of the duration of the time window when checking the max number of RST frames, this is used to prevent HTTP/2 RST frame flood DDOS attacks. The default value is [io.vertx.core.http.HttpServerOptions], setting zero or a negative value, disables the flood protection.
 * @param sockJSHandlerOptions  The SockJS handler options.
 * @param sockJSPath  Configure the SockJS path, the default value is <code>/term/<star></code>.
 * @param authOptions  Set the auth options.
 * @param vertsShellJsResource  Set <code>vertxshell.js</code> resource to use.
 * @param termJsResource  Set <code>term.js</code> resource to use.
 * @param shellHtmlResource  Set <code>shell.html</code> resource to use.
 * @param charset  Set the charset used for encoding / decoding text data from/to SockJS
 * @param intputrc  The path of the <i>inputrc</i> config.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.term.HttpTermOptions original] using Vert.x codegen.
 */
fun httpTermOptionsOf(
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
  acceptBacklog: Int? = null,
  port: Int? = null,
  host: String? = null,
  clientAuth: ClientAuth? = null,
  sni: Boolean? = null,
  useProxyProtocol: Boolean? = null,
  proxyProtocolTimeout: Long? = null,
  proxyProtocolTimeoutUnit: TimeUnit? = null,
  trafficShapingOptions: io.vertx.core.net.TrafficShapingOptions? = null,
  keyCertOptions: io.vertx.core.net.KeyCertOptions? = null,
  compressionSupported: Boolean? = null,
  compressionLevel: Int? = null,
  compressors: Iterable<io.netty.handler.codec.compression.CompressionOptions>? = null,
  acceptUnmaskedFrames: Boolean? = null,
  maxWebSocketFrameSize: Int? = null,
  maxWebSocketMessageSize: Int? = null,
  webSocketSubProtocols: Iterable<String>? = null,
  handle100ContinueAutomatically: Boolean? = null,
  maxChunkSize: Int? = null,
  maxInitialLineLength: Int? = null,
  maxHeaderSize: Int? = null,
  maxFormAttributeSize: Int? = null,
  maxFormFields: Int? = null,
  maxFormBufferedBytes: Int? = null,
  initialSettings: io.vertx.core.http.Http2Settings? = null,
  alpnVersions: Iterable<HttpVersion>? = null,
  http2ClearTextEnabled: Boolean? = null,
  http2ConnectionWindowSize: Int? = null,
  decompressionSupported: Boolean? = null,
  decoderInitialBufferSize: Int? = null,
  perFrameWebSocketCompressionSupported: Boolean? = null,
  perMessageWebSocketCompressionSupported: Boolean? = null,
  webSocketCompressionLevel: Int? = null,
  webSocketAllowServerNoContext: Boolean? = null,
  webSocketPreferredClientNoContext: Boolean? = null,
  webSocketClosingTimeout: Int? = null,
  tracingPolicy: TracingPolicy? = null,
  registerWriteHandler: Boolean? = null,
  registerWebSocketWriteHandlers: Boolean? = null,
  http2RstFloodMaxRstFramePerWindow: Int? = null,
  http2RstFloodWindowDuration: Int? = null,
  http2RstFloodWindowDurationTimeUnit: TimeUnit? = null,
  sockJSHandlerOptions: io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions? = null,
  sockJSPath: String? = null,
  authOptions: io.vertx.core.json.JsonObject? = null,
  vertsShellJsResource: io.vertx.core.buffer.Buffer? = null,
  termJsResource: io.vertx.core.buffer.Buffer? = null,
  shellHtmlResource: io.vertx.core.buffer.Buffer? = null,
  charset: String? = null,
  intputrc: String? = null): HttpTermOptions = io.vertx.ext.shell.term.HttpTermOptions().apply {

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
  if (keyCertOptions != null) {
    this.setKeyCertOptions(keyCertOptions)
  }
  if (compressionSupported != null) {
    this.setCompressionSupported(compressionSupported)
  }
  if (compressionLevel != null) {
    this.setCompressionLevel(compressionLevel)
  }
  if (compressors != null) {
    this.setCompressors(compressors.toList())
  }
  if (acceptUnmaskedFrames != null) {
    this.setAcceptUnmaskedFrames(acceptUnmaskedFrames)
  }
  if (maxWebSocketFrameSize != null) {
    this.setMaxWebSocketFrameSize(maxWebSocketFrameSize)
  }
  if (maxWebSocketMessageSize != null) {
    this.setMaxWebSocketMessageSize(maxWebSocketMessageSize)
  }
  if (webSocketSubProtocols != null) {
    this.setWebSocketSubProtocols(webSocketSubProtocols.toList())
  }
  if (handle100ContinueAutomatically != null) {
    this.setHandle100ContinueAutomatically(handle100ContinueAutomatically)
  }
  if (maxChunkSize != null) {
    this.setMaxChunkSize(maxChunkSize)
  }
  if (maxInitialLineLength != null) {
    this.setMaxInitialLineLength(maxInitialLineLength)
  }
  if (maxHeaderSize != null) {
    this.setMaxHeaderSize(maxHeaderSize)
  }
  if (maxFormAttributeSize != null) {
    this.setMaxFormAttributeSize(maxFormAttributeSize)
  }
  if (maxFormFields != null) {
    this.setMaxFormFields(maxFormFields)
  }
  if (maxFormBufferedBytes != null) {
    this.setMaxFormBufferedBytes(maxFormBufferedBytes)
  }
  if (initialSettings != null) {
    this.setInitialSettings(initialSettings)
  }
  if (alpnVersions != null) {
    this.setAlpnVersions(alpnVersions.toList())
  }
  if (http2ClearTextEnabled != null) {
    this.setHttp2ClearTextEnabled(http2ClearTextEnabled)
  }
  if (http2ConnectionWindowSize != null) {
    this.setHttp2ConnectionWindowSize(http2ConnectionWindowSize)
  }
  if (decompressionSupported != null) {
    this.setDecompressionSupported(decompressionSupported)
  }
  if (decoderInitialBufferSize != null) {
    this.setDecoderInitialBufferSize(decoderInitialBufferSize)
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
  if (webSocketClosingTimeout != null) {
    this.setWebSocketClosingTimeout(webSocketClosingTimeout)
  }
  if (tracingPolicy != null) {
    this.setTracingPolicy(tracingPolicy)
  }
  if (registerWriteHandler != null) {
    this.setRegisterWriteHandler(registerWriteHandler)
  }
  if (registerWebSocketWriteHandlers != null) {
    this.setRegisterWebSocketWriteHandlers(registerWebSocketWriteHandlers)
  }
  if (http2RstFloodMaxRstFramePerWindow != null) {
    this.setHttp2RstFloodMaxRstFramePerWindow(http2RstFloodMaxRstFramePerWindow)
  }
  if (http2RstFloodWindowDuration != null) {
    this.setHttp2RstFloodWindowDuration(http2RstFloodWindowDuration)
  }
  if (http2RstFloodWindowDurationTimeUnit != null) {
    this.setHttp2RstFloodWindowDurationTimeUnit(http2RstFloodWindowDurationTimeUnit)
  }
  if (sockJSHandlerOptions != null) {
    this.setSockJSHandlerOptions(sockJSHandlerOptions)
  }
  if (sockJSPath != null) {
    this.setSockJSPath(sockJSPath)
  }
  if (authOptions != null) {
    this.setAuthOptions(authOptions)
  }
  if (vertsShellJsResource != null) {
    this.setVertsShellJsResource(vertsShellJsResource)
  }
  if (termJsResource != null) {
    this.setTermJsResource(termJsResource)
  }
  if (shellHtmlResource != null) {
    this.setShellHtmlResource(shellHtmlResource)
  }
  if (charset != null) {
    this.setCharset(charset)
  }
  if (intputrc != null) {
    this.setIntputrc(intputrc)
  }
}

