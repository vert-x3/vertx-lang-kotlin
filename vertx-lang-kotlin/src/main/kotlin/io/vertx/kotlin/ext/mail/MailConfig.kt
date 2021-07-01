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
package io.vertx.kotlin.ext.mail

import io.vertx.ext.mail.MailConfig
import io.vertx.core.net.JdkSSLEngineOptions
import io.vertx.core.net.JksOptions
import io.vertx.core.net.OpenSSLEngineOptions
import io.vertx.core.net.PemKeyCertOptions
import io.vertx.core.net.PemTrustOptions
import io.vertx.core.net.PfxOptions
import io.vertx.core.net.ProxyOptions
import io.vertx.ext.mail.DKIMSignOptions
import io.vertx.ext.mail.LoginOption
import io.vertx.ext.mail.StartTLSOptions
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.ext.mail.MailConfig] objects.
 *
 * represents the configuration of a mail service with mail server hostname,
 * port, security options, login options and login/password
 *
 * @param allowRcptErrors  set if sending allows rcpt errors <p> if true, the mail will be sent to the recipients that the server accepted, if any <p>
 * @param applicationLayerProtocols  Set the list of application-layer protocols to provide to the server during the Application-Layer Protocol Negotiation.
 * @param authMethods  set string of allowed auth methods. if set only these methods will be used if the server supports them. If null or empty all supported methods may be used
 * @param connectTimeout  Set the connect timeout
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param disableEsmtp  set if ESMTP should be tried as first command (EHLO) <p> rfc 1869 states that clients should always attempt EHLO as first command to determine if ESMTP is supported, if this returns an error code, HELO is tried to use old SMTP. If there is a server that does not support EHLO and does not give an error code back, the connection should be closed and retried with HELO. We do not do that and rather support turning off ESMTP with a setting. The odds of this actually happening are very small since the client will not connect to arbitrary smtp hosts on the internet. Since the client knows that is connects to a host that doesn't support ESMTP/EHLO in that way, the property has to be set to false. <p>
 * @param dkimSignOption  Sets one DKIMSignOptions for convenient.
 * @param dkimSignOptions  Sets DKIMSignOptions.
 * @param enableDKIM  Sets true to enable DKIM Signatures, sets false to disable it. <p>     This is used most for temporary disable DKIM without removing DKIM opations from current config. </p>
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param hostname  Set the hostname of the smtp server.
 * @param hostnameVerificationAlgorithm  Set the hostname verification algorithm interval To disable hostname verification, set hostnameVerificationAlgorithm to an empty String
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.ext.mail.MailConfig]
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param jdkSslEngineOptions 
 * @param keepAlive  set if connection pool is enabled default is true <p> if the connection pooling is disabled, the max number of sockets is enforced nevertheless <p>
 * @param keepAliveTimeout  Set the keep alive timeout for SMTP connection, Defaults in seconds. <p/> This value determines how long a connection remains unused in the pool before being evicted and closed. <p/> A timeout of <code>0</code> means there is no timeout.
 * @param keepAliveTimeoutUnit  Sets <code>TimeUnit</code> of keeping connections in the pool alive.
 * @param keyCertOptions  Set the key/cert options.
 * @param keyStore  get the key store filename to be used when opening SMTP connections <p> if not set, an options object will be created based on other settings (ssl and trustAll)
 * @param keyStoreOptions  Set the key/cert options in jks format, aka Java keystore.
 * @param keyStorePassword  get the key store password to be used when opening SMTP connections
 * @param localAddress  Set the local interface to bind for network connections. When the local address is null, it will pick any local address, the default local address is null.
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param login  Set the login mode for the connection. <p> Either DISABLED, OPTIONAL or REQUIRED
 * @param maxPoolSize  set the max allowed number of open connections to the mail server if not set the default is 10
 * @param metricsName  Set the metrics name identifying the reported metrics, useful for grouping metrics with the same name.
 * @param multiPartOnly  Sets to encode multipart only or not. When sets to <code>true</code>, the mail message will be encoded as multipart even for simple mails without attachments, see https://github.com/vert-x3/vertx-mail-client/issues/161.
 * @param nonProxyHosts  Set a list of remote hosts that are not proxied when the client is configured to use a proxy. This list serves the same purpose than the JVM <code>nonProxyHosts</code> configuration. <p> Entries can use the <i>*</i> wildcard character for pattern matching, e.g <i>*.example.com</i> matches <i>www.example.com</i>.
 * @param ntDomain  Sets the domain used on NTLM authentication
 * @param openSslEngineOptions 
 * @param ownHostname  set the hostname to be used for HELO/EHLO and the Message-ID
 * @param password  Set the password for the login.
 * @param pemKeyCertOptions  Set the key/cert store options in pem format.
 * @param pemTrustOptions  Set the trust options in pem format
 * @param pfxKeyCertOptions  Set the key/cert options in pfx format.
 * @param pfxTrustOptions  Set the trust options in pfx format
 * @param pipelining  Sets to enable/disable the pipelining capability if SMTP server supports it.
 * @param poolCleanerPeriod  Set the connection pool cleaner period, defaults in milli seconds, a non positive value disables expiration checks and connections will remain in the pool until they are closed.
 * @param poolCleanerPeriodUnit  Sets the <code>TimeUnit</code> of pool cleaning period.
 * @param port  Set the port of the smtp server.
 * @param proxyOptions  Set proxy options for connections via CONNECT proxy (e.g. Squid) or a SOCKS proxy.
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reconnectAttempts  Set the value of reconnect attempts
 * @param reconnectInterval  Set the reconnect interval
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param sendBufferSize  Set the TCP send buffer size
 * @param soLinger  Set whether SO_linger keep alive is enabled
 * @param ssl  Set whether SSL/TLS is enabled
 * @param sslEngineOptions  Set to use SSL engine implementation to use.
 * @param sslHandshakeTimeout  Set the SSL handshake timeout, default time unit is seconds.
 * @param sslHandshakeTimeoutUnit  Set the SSL handshake timeout unit. If not specified, default is seconds.
 * @param starttls  Set the tls security mode for the connection. <p> Either NONE, OPTIONAL or REQUIRED
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native transport.
 * @param tcpKeepAlive  Set whether TCP keep alive is enabled
 * @param tcpNoDelay  Set whether TCP no delay is enabled
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native transport.
 * @param trafficClass  Set the value of traffic class
 * @param trustAll  Set whether all server certificates should be trusted
 * @param trustOptions  Set the trust options.
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param useAlpn  Set the ALPN usage.
 * @param userAgent  Sets the Mail User Agent(MUA) name.<p> It is used to generate the boundary in case of MultiPart email and the Message-ID. If <code>null</code> is set, DEFAULT_USER_AGENT is used.</p>
 * @param username  Set the username for the login.
 * @param workstation  Sets the workstation used on NTLM authentication
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mail.MailConfig original] using Vert.x codegen.
 */
fun mailConfigOf(
  allowRcptErrors: Boolean? = null,
  applicationLayerProtocols: Iterable<String>? = null,
  authMethods: String? = null,
  connectTimeout: Int? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  disableEsmtp: Boolean? = null,
  dkimSignOption: io.vertx.ext.mail.DKIMSignOptions? = null,
  dkimSignOptions: Iterable<io.vertx.ext.mail.DKIMSignOptions>? = null,
  enableDKIM: Boolean? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  hostname: String? = null,
  hostnameVerificationAlgorithm: String? = null,
  idleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
  keepAlive: Boolean? = null,
  keepAliveTimeout: Int? = null,
  keepAliveTimeoutUnit: TimeUnit? = null,
  keyCertOptions: io.vertx.core.net.KeyCertOptions? = null,
  keyStore: String? = null,
  keyStoreOptions: io.vertx.core.net.JksOptions? = null,
  keyStorePassword: String? = null,
  localAddress: String? = null,
  logActivity: Boolean? = null,
  login: LoginOption? = null,
  maxPoolSize: Int? = null,
  metricsName: String? = null,
  multiPartOnly: Boolean? = null,
  nonProxyHosts: Iterable<String>? = null,
  ntDomain: String? = null,
  openSslEngineOptions: io.vertx.core.net.OpenSSLEngineOptions? = null,
  ownHostname: String? = null,
  password: String? = null,
  pemKeyCertOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  pemTrustOptions: io.vertx.core.net.PemTrustOptions? = null,
  pfxKeyCertOptions: io.vertx.core.net.PfxOptions? = null,
  pfxTrustOptions: io.vertx.core.net.PfxOptions? = null,
  pipelining: Boolean? = null,
  poolCleanerPeriod: Int? = null,
  poolCleanerPeriodUnit: TimeUnit? = null,
  port: Int? = null,
  proxyOptions: io.vertx.core.net.ProxyOptions? = null,
  receiveBufferSize: Int? = null,
  reconnectAttempts: Int? = null,
  reconnectInterval: Long? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  sendBufferSize: Int? = null,
  soLinger: Int? = null,
  ssl: Boolean? = null,
  sslEngineOptions: io.vertx.core.net.SSLEngineOptions? = null,
  sslHandshakeTimeout: Long? = null,
  sslHandshakeTimeoutUnit: TimeUnit? = null,
  starttls: StartTLSOptions? = null,
  tcpCork: Boolean? = null,
  tcpFastOpen: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  tcpNoDelay: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  trafficClass: Int? = null,
  trustAll: Boolean? = null,
  trustOptions: io.vertx.core.net.TrustOptions? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  useAlpn: Boolean? = null,
  userAgent: String? = null,
  username: String? = null,
  workstation: String? = null): MailConfig = io.vertx.ext.mail.MailConfig().apply {

  if (allowRcptErrors != null) {
    this.setAllowRcptErrors(allowRcptErrors)
  }
  if (applicationLayerProtocols != null) {
    this.setApplicationLayerProtocols(applicationLayerProtocols.toList())
  }
  if (authMethods != null) {
    this.setAuthMethods(authMethods)
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
  if (disableEsmtp != null) {
    this.setDisableEsmtp(disableEsmtp)
  }
  if (dkimSignOption != null) {
    this.setDKIMSignOption(dkimSignOption)
  }
  if (dkimSignOptions != null) {
    this.setDKIMSignOptions(dkimSignOptions.toList())
  }
  if (enableDKIM != null) {
    this.setEnableDKIM(enableDKIM)
  }
  if (enabledCipherSuites != null) {
    for (item in enabledCipherSuites) {
      this.addEnabledCipherSuite(item)
    }
  }
  if (enabledSecureTransportProtocols != null) {
    this.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols.toSet())
  }
  if (hostname != null) {
    this.setHostname(hostname)
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
  if (keepAlive != null) {
    this.setKeepAlive(keepAlive)
  }
  if (keepAliveTimeout != null) {
    this.setKeepAliveTimeout(keepAliveTimeout)
  }
  if (keepAliveTimeoutUnit != null) {
    this.setKeepAliveTimeoutUnit(keepAliveTimeoutUnit)
  }
  if (keyCertOptions != null) {
    this.setKeyCertOptions(keyCertOptions)
  }
  if (keyStore != null) {
    this.setKeyStore(keyStore)
  }
  if (keyStoreOptions != null) {
    this.setKeyStoreOptions(keyStoreOptions)
  }
  if (keyStorePassword != null) {
    this.setKeyStorePassword(keyStorePassword)
  }
  if (localAddress != null) {
    this.setLocalAddress(localAddress)
  }
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (login != null) {
    this.setLogin(login)
  }
  if (maxPoolSize != null) {
    this.setMaxPoolSize(maxPoolSize)
  }
  if (metricsName != null) {
    this.setMetricsName(metricsName)
  }
  if (multiPartOnly != null) {
    this.setMultiPartOnly(multiPartOnly)
  }
  if (nonProxyHosts != null) {
    this.setNonProxyHosts(nonProxyHosts.toList())
  }
  if (ntDomain != null) {
    this.setNtDomain(ntDomain)
  }
  if (openSslEngineOptions != null) {
    this.setOpenSslEngineOptions(openSslEngineOptions)
  }
  if (ownHostname != null) {
    this.setOwnHostname(ownHostname)
  }
  if (password != null) {
    this.setPassword(password)
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
  if (poolCleanerPeriod != null) {
    this.setPoolCleanerPeriod(poolCleanerPeriod)
  }
  if (poolCleanerPeriodUnit != null) {
    this.setPoolCleanerPeriodUnit(poolCleanerPeriodUnit)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (proxyOptions != null) {
    this.setProxyOptions(proxyOptions)
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
  if (starttls != null) {
    this.setStarttls(starttls)
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
  if (userAgent != null) {
    this.setUserAgent(userAgent)
  }
  if (username != null) {
    this.setUsername(username)
  }
  if (workstation != null) {
    this.setWorkstation(workstation)
  }
}

