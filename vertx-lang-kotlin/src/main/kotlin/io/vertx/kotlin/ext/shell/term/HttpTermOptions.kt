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
import io.vertx.core.http.ClientAuth
import io.vertx.core.http.Http2Settings
import io.vertx.core.http.HttpVersion
import io.vertx.core.net.JdkSSLEngineOptions
import io.vertx.core.net.JksOptions
import io.vertx.core.net.OpenSSLEngineOptions
import io.vertx.core.net.PemKeyCertOptions
import io.vertx.core.net.PemTrustOptions
import io.vertx.core.net.PfxOptions
import io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.ext.shell.term.HttpTermOptions] objects.
 *
 * The web term configuration options.
 *
 * @param acceptBacklog  Set the accept back log
 * @param acceptUnmaskedFrames  Set <code>true</code> when the server accepts unmasked frame. As default Server doesn't accept unmasked frame, you can bypass this behaviour (RFC 6455) setting <code>true</code>. It's set to <code>false</code> as default.
 * @param alpnVersions  Set the list of protocol versions to provide to the server during the Application-Layer Protocol Negotiatiation.
 * @param authOptions  Set the auth options.
 * @param charset  Set the charset used for encoding / decoding text data from/to SockJS
 * @param clientAuth  Set whether client auth is required
 * @param compressionLevel  This method allows to set the compression level to be used in http1.x/2 response bodies when compression support is turned on (@see setCompressionSupported) and the client advertises to support <code>deflate/gzip</code> compression in the <code>Accept-Encoding</code> header default value is : 6 (Netty legacy) The compression level determines how much the data is compressed on a scale from 1 to 9, where '9' is trying to achieve the maximum compression ratio while '1' instead is giving priority to speed instead of compression ratio using some algorithm optimizations and skipping pedantic loops that usually gives just little improvements While one can think that best value is always the maximum compression ratio, there's a trade-off to consider: the most compressed level requires the most computational work to compress/decompress data, e.g. more dictionary lookups and loops. E.g. you have it set fairly high on a high-volume website, you may experience performance degradation and latency on resource serving due to CPU overload, and, however - as the computational work is required also client side while decompressing - setting an higher compression level can result in an overall higher page load time especially nowadays when many clients are handled mobile devices with a low CPU profile. see also: http://www.gzip.org/algorithm.txt
 * @param compressionSupported  Set whether the server should support gzip/deflate compression (serving compressed responses to clients advertising support for them with Accept-Encoding header)
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param decoderInitialBufferSize  Set the initial buffer size for the HTTP decoder
 * @param decompressionSupported  Set whether the server supports decompression
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param handle100ContinueAutomatically  Set whether 100 Continue should be handled automatically
 * @param host  Set the host
 * @param http2ConnectionWindowSize  Set the default HTTP/2 connection window size. It overrides the initial window size set by , so the connection window size is greater than for its streams, in order the data throughput. <p/> A value of <code>-1</code> reuses the initial window size setting.
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.core.http.HttpServerOptions]
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param initialSettings  Set the HTTP/2 connection settings immediatly sent by the server when a client connects.
 * @param intputrc  The path of the <i>inputrc</i> config.
 * @param jdkSslEngineOptions 
 * @param keyCertOptions  Set the key/cert options.
 * @param keyStoreOptions  Set the key/cert options in jks format, aka Java keystore.
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param maxChunkSize  Set the maximum HTTP chunk size that  will receive
 * @param maxHeaderSize  Set the maximum length of all headers for HTTP/1.x .
 * @param maxInitialLineLength  Set the maximum length of the initial line for HTTP/1.x (e.g. <code>"GET / HTTP/1.0"</code>)
 * @param maxWebSocketFrameSize  Set the maximum WebSocket frames size
 * @param maxWebSocketMessageSize  Set the maximum WebSocket message size
 * @param openSslEngineOptions 
 * @param pemKeyCertOptions  Set the key/cert store options in pem format.
 * @param pemTrustOptions  Set the trust options in pem format
 * @param perFrameWebSocketCompressionSupported  Enable or disable support for the WebSocket per-frame deflate compression extension.
 * @param perMessageWebSocketCompressionSupported  Enable or disable support for WebSocket per-message deflate compression extension.
 * @param pfxKeyCertOptions  Set the key/cert options in pfx format.
 * @param pfxTrustOptions  Set the trust options in pfx format
 * @param port  Set the port
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param sendBufferSize  Set the TCP send buffer size
 * @param shellHtmlResource  Set <code>shell.html</code> resource to use.
 * @param sni  Set whether the server supports Server Name Indiciation
 * @param soLinger  Set whether SO_linger keep alive is enabled
 * @param sockJSHandlerOptions  The SockJS handler options.
 * @param sockJSPath  Configure the SockJS path, the default value is <code>/term/<star></code>.
 * @param ssl  Set whether SSL/TLS is enabled
 * @param sslEngineOptions  Set to use SSL engine implementation to use.
 * @param sslHandshakeTimeout  Set the SSL handshake timeout, default time unit is seconds.
 * @param sslHandshakeTimeoutUnit  Set the SSL handshake timeout unit. If not specified, default is seconds.
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native transport.
 * @param tcpKeepAlive  Set whether TCP keep alive is enabled
 * @param tcpNoDelay  Set whether TCP no delay is enabled
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native transport.
 * @param termJsResource  Set <code>term.js</code> resource to use.
 * @param trafficClass  Set the value of traffic class
 * @param trustOptions  Set the trust options.
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param useAlpn  Set the ALPN usage.
 * @param vertsShellJsResource  Set <code>vertxshell.js</code> resource to use.
 * @param webSocketAllowServerNoContext  Set whether the WebSocket server will accept the <code>server_no_context_takeover</code> parameter of the per-message deflate compression extension offered by the client.
 * @param webSocketCompressionLevel  Set the WebSocket compression level.
 * @param webSocketPreferredClientNoContext  Set whether the WebSocket server will accept the <code>client_no_context_takeover</code> parameter of the per-message deflate compression extension offered by the client.
 * @param webSocketSubProtocols  Set the WebSocket list of sub-protocol supported by the server.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.term.HttpTermOptions original] using Vert.x codegen.
 */
fun httpTermOptionsOf(
  acceptBacklog: Int? = null,
  acceptUnmaskedFrames: Boolean? = null,
  alpnVersions: Iterable<HttpVersion>? = null,
  authOptions: io.vertx.core.json.JsonObject? = null,
  charset: String? = null,
  clientAuth: ClientAuth? = null,
  compressionLevel: Int? = null,
  compressionSupported: Boolean? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  decoderInitialBufferSize: Int? = null,
  decompressionSupported: Boolean? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  handle100ContinueAutomatically: Boolean? = null,
  host: String? = null,
  http2ConnectionWindowSize: Int? = null,
  idleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  initialSettings: io.vertx.core.http.Http2Settings? = null,
  intputrc: String? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
  keyCertOptions: io.vertx.core.net.KeyCertOptions? = null,
  keyStoreOptions: io.vertx.core.net.JksOptions? = null,
  logActivity: Boolean? = null,
  maxChunkSize: Int? = null,
  maxHeaderSize: Int? = null,
  maxInitialLineLength: Int? = null,
  maxWebSocketFrameSize: Int? = null,
  maxWebSocketMessageSize: Int? = null,
  openSslEngineOptions: io.vertx.core.net.OpenSSLEngineOptions? = null,
  pemKeyCertOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  pemTrustOptions: io.vertx.core.net.PemTrustOptions? = null,
  perFrameWebSocketCompressionSupported: Boolean? = null,
  perMessageWebSocketCompressionSupported: Boolean? = null,
  pfxKeyCertOptions: io.vertx.core.net.PfxOptions? = null,
  pfxTrustOptions: io.vertx.core.net.PfxOptions? = null,
  port: Int? = null,
  receiveBufferSize: Int? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  sendBufferSize: Int? = null,
  shellHtmlResource: io.vertx.core.buffer.Buffer? = null,
  sni: Boolean? = null,
  soLinger: Int? = null,
  sockJSHandlerOptions: io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions? = null,
  sockJSPath: String? = null,
  ssl: Boolean? = null,
  sslEngineOptions: io.vertx.core.net.SSLEngineOptions? = null,
  sslHandshakeTimeout: Long? = null,
  sslHandshakeTimeoutUnit: TimeUnit? = null,
  tcpCork: Boolean? = null,
  tcpFastOpen: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  tcpNoDelay: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  termJsResource: io.vertx.core.buffer.Buffer? = null,
  trafficClass: Int? = null,
  trustOptions: io.vertx.core.net.TrustOptions? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  useAlpn: Boolean? = null,
  vertsShellJsResource: io.vertx.core.buffer.Buffer? = null,
  webSocketAllowServerNoContext: Boolean? = null,
  webSocketCompressionLevel: Int? = null,
  webSocketPreferredClientNoContext: Boolean? = null,
  webSocketSubProtocols: Iterable<String>? = null): HttpTermOptions = io.vertx.ext.shell.term.HttpTermOptions().apply {

  if (acceptBacklog != null) {
    this.setAcceptBacklog(acceptBacklog)
  }
  if (acceptUnmaskedFrames != null) {
    this.setAcceptUnmaskedFrames(acceptUnmaskedFrames)
  }
  if (alpnVersions != null) {
    this.setAlpnVersions(alpnVersions.toList())
  }
  if (authOptions != null) {
    this.setAuthOptions(authOptions)
  }
  if (charset != null) {
    this.setCharset(charset)
  }
  if (clientAuth != null) {
    this.setClientAuth(clientAuth)
  }
  if (compressionLevel != null) {
    this.setCompressionLevel(compressionLevel)
  }
  if (compressionSupported != null) {
    this.setCompressionSupported(compressionSupported)
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
  if (decoderInitialBufferSize != null) {
    this.setDecoderInitialBufferSize(decoderInitialBufferSize)
  }
  if (decompressionSupported != null) {
    this.setDecompressionSupported(decompressionSupported)
  }
  if (enabledCipherSuites != null) {
    for (item in enabledCipherSuites) {
      this.addEnabledCipherSuite(item)
    }
  }
  if (enabledSecureTransportProtocols != null) {
    this.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols.toSet())
  }
  if (handle100ContinueAutomatically != null) {
    this.setHandle100ContinueAutomatically(handle100ContinueAutomatically)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (http2ConnectionWindowSize != null) {
    this.setHttp2ConnectionWindowSize(http2ConnectionWindowSize)
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
  if (intputrc != null) {
    this.setIntputrc(intputrc)
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
  if (maxChunkSize != null) {
    this.setMaxChunkSize(maxChunkSize)
  }
  if (maxHeaderSize != null) {
    this.setMaxHeaderSize(maxHeaderSize)
  }
  if (maxInitialLineLength != null) {
    this.setMaxInitialLineLength(maxInitialLineLength)
  }
  if (maxWebSocketFrameSize != null) {
    this.setMaxWebSocketFrameSize(maxWebSocketFrameSize)
  }
  if (maxWebSocketMessageSize != null) {
    this.setMaxWebSocketMessageSize(maxWebSocketMessageSize)
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
  if (perFrameWebSocketCompressionSupported != null) {
    this.setPerFrameWebSocketCompressionSupported(perFrameWebSocketCompressionSupported)
  }
  if (perMessageWebSocketCompressionSupported != null) {
    this.setPerMessageWebSocketCompressionSupported(perMessageWebSocketCompressionSupported)
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
  if (sendBufferSize != null) {
    this.setSendBufferSize(sendBufferSize)
  }
  if (shellHtmlResource != null) {
    this.setShellHtmlResource(shellHtmlResource)
  }
  if (sni != null) {
    this.setSni(sni)
  }
  if (soLinger != null) {
    this.setSoLinger(soLinger)
  }
  if (sockJSHandlerOptions != null) {
    this.setSockJSHandlerOptions(sockJSHandlerOptions)
  }
  if (sockJSPath != null) {
    this.setSockJSPath(sockJSPath)
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
  if (termJsResource != null) {
    this.setTermJsResource(termJsResource)
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
  if (vertsShellJsResource != null) {
    this.setVertsShellJsResource(vertsShellJsResource)
  }
  if (webSocketAllowServerNoContext != null) {
    this.setWebSocketAllowServerNoContext(webSocketAllowServerNoContext)
  }
  if (webSocketCompressionLevel != null) {
    this.setWebSocketCompressionLevel(webSocketCompressionLevel)
  }
  if (webSocketPreferredClientNoContext != null) {
    this.setWebSocketPreferredClientNoContext(webSocketPreferredClientNoContext)
  }
  if (webSocketSubProtocols != null) {
    this.setWebSocketSubProtocols(webSocketSubProtocols.toList())
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.shell.term.HttpTermOptions] objects.
 *
 * The web term configuration options.
 *
 * @param acceptBacklog  Set the accept back log
 * @param acceptUnmaskedFrames  Set <code>true</code> when the server accepts unmasked frame. As default Server doesn't accept unmasked frame, you can bypass this behaviour (RFC 6455) setting <code>true</code>. It's set to <code>false</code> as default.
 * @param alpnVersions  Set the list of protocol versions to provide to the server during the Application-Layer Protocol Negotiatiation.
 * @param authOptions  Set the auth options.
 * @param charset  Set the charset used for encoding / decoding text data from/to SockJS
 * @param clientAuth  Set whether client auth is required
 * @param compressionLevel  This method allows to set the compression level to be used in http1.x/2 response bodies when compression support is turned on (@see setCompressionSupported) and the client advertises to support <code>deflate/gzip</code> compression in the <code>Accept-Encoding</code> header default value is : 6 (Netty legacy) The compression level determines how much the data is compressed on a scale from 1 to 9, where '9' is trying to achieve the maximum compression ratio while '1' instead is giving priority to speed instead of compression ratio using some algorithm optimizations and skipping pedantic loops that usually gives just little improvements While one can think that best value is always the maximum compression ratio, there's a trade-off to consider: the most compressed level requires the most computational work to compress/decompress data, e.g. more dictionary lookups and loops. E.g. you have it set fairly high on a high-volume website, you may experience performance degradation and latency on resource serving due to CPU overload, and, however - as the computational work is required also client side while decompressing - setting an higher compression level can result in an overall higher page load time especially nowadays when many clients are handled mobile devices with a low CPU profile. see also: http://www.gzip.org/algorithm.txt
 * @param compressionSupported  Set whether the server should support gzip/deflate compression (serving compressed responses to clients advertising support for them with Accept-Encoding header)
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param decoderInitialBufferSize  Set the initial buffer size for the HTTP decoder
 * @param decompressionSupported  Set whether the server supports decompression
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param handle100ContinueAutomatically  Set whether 100 Continue should be handled automatically
 * @param host  Set the host
 * @param http2ConnectionWindowSize  Set the default HTTP/2 connection window size. It overrides the initial window size set by , so the connection window size is greater than for its streams, in order the data throughput. <p/> A value of <code>-1</code> reuses the initial window size setting.
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.core.http.HttpServerOptions]
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param initialSettings  Set the HTTP/2 connection settings immediatly sent by the server when a client connects.
 * @param intputrc  The path of the <i>inputrc</i> config.
 * @param jdkSslEngineOptions 
 * @param keyCertOptions  Set the key/cert options.
 * @param keyStoreOptions  Set the key/cert options in jks format, aka Java keystore.
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param maxChunkSize  Set the maximum HTTP chunk size that  will receive
 * @param maxHeaderSize  Set the maximum length of all headers for HTTP/1.x .
 * @param maxInitialLineLength  Set the maximum length of the initial line for HTTP/1.x (e.g. <code>"GET / HTTP/1.0"</code>)
 * @param maxWebSocketFrameSize  Set the maximum WebSocket frames size
 * @param maxWebSocketMessageSize  Set the maximum WebSocket message size
 * @param openSslEngineOptions 
 * @param pemKeyCertOptions  Set the key/cert store options in pem format.
 * @param pemTrustOptions  Set the trust options in pem format
 * @param perFrameWebSocketCompressionSupported  Enable or disable support for the WebSocket per-frame deflate compression extension.
 * @param perMessageWebSocketCompressionSupported  Enable or disable support for WebSocket per-message deflate compression extension.
 * @param pfxKeyCertOptions  Set the key/cert options in pfx format.
 * @param pfxTrustOptions  Set the trust options in pfx format
 * @param port  Set the port
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param sendBufferSize  Set the TCP send buffer size
 * @param shellHtmlResource  Set <code>shell.html</code> resource to use.
 * @param sni  Set whether the server supports Server Name Indiciation
 * @param soLinger  Set whether SO_linger keep alive is enabled
 * @param sockJSHandlerOptions  The SockJS handler options.
 * @param sockJSPath  Configure the SockJS path, the default value is <code>/term/<star></code>.
 * @param ssl  Set whether SSL/TLS is enabled
 * @param sslEngineOptions  Set to use SSL engine implementation to use.
 * @param sslHandshakeTimeout  Set the SSL handshake timeout, default time unit is seconds.
 * @param sslHandshakeTimeoutUnit  Set the SSL handshake timeout unit. If not specified, default is seconds.
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native transport.
 * @param tcpKeepAlive  Set whether TCP keep alive is enabled
 * @param tcpNoDelay  Set whether TCP no delay is enabled
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native transport.
 * @param termJsResource  Set <code>term.js</code> resource to use.
 * @param trafficClass  Set the value of traffic class
 * @param trustOptions  Set the trust options.
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param useAlpn  Set the ALPN usage.
 * @param vertsShellJsResource  Set <code>vertxshell.js</code> resource to use.
 * @param webSocketAllowServerNoContext  Set whether the WebSocket server will accept the <code>server_no_context_takeover</code> parameter of the per-message deflate compression extension offered by the client.
 * @param webSocketCompressionLevel  Set the WebSocket compression level.
 * @param webSocketPreferredClientNoContext  Set whether the WebSocket server will accept the <code>client_no_context_takeover</code> parameter of the per-message deflate compression extension offered by the client.
 * @param webSocketSubProtocols  Set the WebSocket list of sub-protocol supported by the server.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.term.HttpTermOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("httpTermOptionsOf(acceptBacklog, acceptUnmaskedFrames, alpnVersions, authOptions, charset, clientAuth, compressionLevel, compressionSupported, crlPaths, crlValues, decoderInitialBufferSize, decompressionSupported, enabledCipherSuites, enabledSecureTransportProtocols, handle100ContinueAutomatically, host, http2ConnectionWindowSize, idleTimeout, idleTimeoutUnit, initialSettings, intputrc, jdkSslEngineOptions, keyCertOptions, keyStoreOptions, logActivity, maxChunkSize, maxHeaderSize, maxInitialLineLength, maxWebSocketFrameSize, maxWebSocketMessageSize, openSslEngineOptions, pemKeyCertOptions, pemTrustOptions, perFrameWebSocketCompressionSupported, perMessageWebSocketCompressionSupported, pfxKeyCertOptions, pfxTrustOptions, port, receiveBufferSize, reuseAddress, reusePort, sendBufferSize, shellHtmlResource, sni, soLinger, sockJSHandlerOptions, sockJSPath, ssl, sslEngineOptions, sslHandshakeTimeout, sslHandshakeTimeoutUnit, tcpCork, tcpFastOpen, tcpKeepAlive, tcpNoDelay, tcpQuickAck, termJsResource, trafficClass, trustOptions, trustStoreOptions, useAlpn, vertsShellJsResource, webSocketAllowServerNoContext, webSocketCompressionLevel, webSocketPreferredClientNoContext, webSocketSubProtocols)")
)
fun HttpTermOptions(
  acceptBacklog: Int? = null,
  acceptUnmaskedFrames: Boolean? = null,
  alpnVersions: Iterable<HttpVersion>? = null,
  authOptions: io.vertx.core.json.JsonObject? = null,
  charset: String? = null,
  clientAuth: ClientAuth? = null,
  compressionLevel: Int? = null,
  compressionSupported: Boolean? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  decoderInitialBufferSize: Int? = null,
  decompressionSupported: Boolean? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  handle100ContinueAutomatically: Boolean? = null,
  host: String? = null,
  http2ConnectionWindowSize: Int? = null,
  idleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  initialSettings: io.vertx.core.http.Http2Settings? = null,
  intputrc: String? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
  keyCertOptions: io.vertx.core.net.KeyCertOptions? = null,
  keyStoreOptions: io.vertx.core.net.JksOptions? = null,
  logActivity: Boolean? = null,
  maxChunkSize: Int? = null,
  maxHeaderSize: Int? = null,
  maxInitialLineLength: Int? = null,
  maxWebSocketFrameSize: Int? = null,
  maxWebSocketMessageSize: Int? = null,
  openSslEngineOptions: io.vertx.core.net.OpenSSLEngineOptions? = null,
  pemKeyCertOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  pemTrustOptions: io.vertx.core.net.PemTrustOptions? = null,
  perFrameWebSocketCompressionSupported: Boolean? = null,
  perMessageWebSocketCompressionSupported: Boolean? = null,
  pfxKeyCertOptions: io.vertx.core.net.PfxOptions? = null,
  pfxTrustOptions: io.vertx.core.net.PfxOptions? = null,
  port: Int? = null,
  receiveBufferSize: Int? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  sendBufferSize: Int? = null,
  shellHtmlResource: io.vertx.core.buffer.Buffer? = null,
  sni: Boolean? = null,
  soLinger: Int? = null,
  sockJSHandlerOptions: io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions? = null,
  sockJSPath: String? = null,
  ssl: Boolean? = null,
  sslEngineOptions: io.vertx.core.net.SSLEngineOptions? = null,
  sslHandshakeTimeout: Long? = null,
  sslHandshakeTimeoutUnit: TimeUnit? = null,
  tcpCork: Boolean? = null,
  tcpFastOpen: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  tcpNoDelay: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  termJsResource: io.vertx.core.buffer.Buffer? = null,
  trafficClass: Int? = null,
  trustOptions: io.vertx.core.net.TrustOptions? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  useAlpn: Boolean? = null,
  vertsShellJsResource: io.vertx.core.buffer.Buffer? = null,
  webSocketAllowServerNoContext: Boolean? = null,
  webSocketCompressionLevel: Int? = null,
  webSocketPreferredClientNoContext: Boolean? = null,
  webSocketSubProtocols: Iterable<String>? = null): HttpTermOptions = io.vertx.ext.shell.term.HttpTermOptions().apply {

  if (acceptBacklog != null) {
    this.setAcceptBacklog(acceptBacklog)
  }
  if (acceptUnmaskedFrames != null) {
    this.setAcceptUnmaskedFrames(acceptUnmaskedFrames)
  }
  if (alpnVersions != null) {
    this.setAlpnVersions(alpnVersions.toList())
  }
  if (authOptions != null) {
    this.setAuthOptions(authOptions)
  }
  if (charset != null) {
    this.setCharset(charset)
  }
  if (clientAuth != null) {
    this.setClientAuth(clientAuth)
  }
  if (compressionLevel != null) {
    this.setCompressionLevel(compressionLevel)
  }
  if (compressionSupported != null) {
    this.setCompressionSupported(compressionSupported)
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
  if (decoderInitialBufferSize != null) {
    this.setDecoderInitialBufferSize(decoderInitialBufferSize)
  }
  if (decompressionSupported != null) {
    this.setDecompressionSupported(decompressionSupported)
  }
  if (enabledCipherSuites != null) {
    for (item in enabledCipherSuites) {
      this.addEnabledCipherSuite(item)
    }
  }
  if (enabledSecureTransportProtocols != null) {
    this.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols.toSet())
  }
  if (handle100ContinueAutomatically != null) {
    this.setHandle100ContinueAutomatically(handle100ContinueAutomatically)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (http2ConnectionWindowSize != null) {
    this.setHttp2ConnectionWindowSize(http2ConnectionWindowSize)
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
  if (intputrc != null) {
    this.setIntputrc(intputrc)
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
  if (maxChunkSize != null) {
    this.setMaxChunkSize(maxChunkSize)
  }
  if (maxHeaderSize != null) {
    this.setMaxHeaderSize(maxHeaderSize)
  }
  if (maxInitialLineLength != null) {
    this.setMaxInitialLineLength(maxInitialLineLength)
  }
  if (maxWebSocketFrameSize != null) {
    this.setMaxWebSocketFrameSize(maxWebSocketFrameSize)
  }
  if (maxWebSocketMessageSize != null) {
    this.setMaxWebSocketMessageSize(maxWebSocketMessageSize)
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
  if (perFrameWebSocketCompressionSupported != null) {
    this.setPerFrameWebSocketCompressionSupported(perFrameWebSocketCompressionSupported)
  }
  if (perMessageWebSocketCompressionSupported != null) {
    this.setPerMessageWebSocketCompressionSupported(perMessageWebSocketCompressionSupported)
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
  if (sendBufferSize != null) {
    this.setSendBufferSize(sendBufferSize)
  }
  if (shellHtmlResource != null) {
    this.setShellHtmlResource(shellHtmlResource)
  }
  if (sni != null) {
    this.setSni(sni)
  }
  if (soLinger != null) {
    this.setSoLinger(soLinger)
  }
  if (sockJSHandlerOptions != null) {
    this.setSockJSHandlerOptions(sockJSHandlerOptions)
  }
  if (sockJSPath != null) {
    this.setSockJSPath(sockJSPath)
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
  if (termJsResource != null) {
    this.setTermJsResource(termJsResource)
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
  if (vertsShellJsResource != null) {
    this.setVertsShellJsResource(vertsShellJsResource)
  }
  if (webSocketAllowServerNoContext != null) {
    this.setWebSocketAllowServerNoContext(webSocketAllowServerNoContext)
  }
  if (webSocketCompressionLevel != null) {
    this.setWebSocketCompressionLevel(webSocketCompressionLevel)
  }
  if (webSocketPreferredClientNoContext != null) {
    this.setWebSocketPreferredClientNoContext(webSocketPreferredClientNoContext)
  }
  if (webSocketSubProtocols != null) {
    this.setWebSocketSubProtocols(webSocketSubProtocols.toList())
  }
}

