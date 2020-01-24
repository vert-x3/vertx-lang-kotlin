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
package io.vertx.kotlin.mysqlclient

import io.vertx.mysqlclient.MySQLConnectOptions
import io.vertx.core.net.JdkSSLEngineOptions
import io.vertx.core.net.JksOptions
import io.vertx.core.net.OpenSSLEngineOptions
import io.vertx.core.net.PemKeyCertOptions
import io.vertx.core.net.PemTrustOptions
import io.vertx.core.net.PfxOptions
import io.vertx.core.net.ProxyOptions
import io.vertx.mysqlclient.SslMode
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.mysqlclient.MySQLConnectOptions] objects.
 *
 * Connect options for configuring [io.vertx.mysqlclient.MySQLConnection] or [io.vertx.mysqlclient.MySQLPool].
 *
 * @param cachePreparedStatements  Set whether prepared statements cache should be enabled.
 * @param characterEncoding  Set the Java charset for encoding string values, this value is UTF-8 by default.
 * @param charset  Set the charset for the connection.
 * @param collation  Set the collation for the connection.
 * @param connectTimeout  Set the connect timeout
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param database  Specify the default database for the connection.
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param host  Specify the host for connecting to the server.
 * @param hostnameVerificationAlgorithm  Set the hostname verification algorithm interval To disable hostname verification, set hostnameVerificationAlgorithm to an empty String
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.mysqlclient.MySQLConnectOptions]
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param jdkSslEngineOptions 
 * @param keyStoreOptions  Set the key/cert options in jks format, aka Java keystore.
 * @param localAddress  Set the local interface to bind for network connections. When the local address is null, it will pick any local address, the default local address is null.
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param metricsName  Set the metrics name identifying the reported metrics, useful for grouping metrics with the same name.
 * @param openSslEngineOptions 
 * @param password  Specify the user password to be used for the authentication.
 * @param pemKeyCertOptions  Set the key/cert store options in pem format.
 * @param pemTrustOptions  Set the trust options in pem format
 * @param pfxKeyCertOptions  Set the key/cert options in pfx format.
 * @param pfxTrustOptions  Set the trust options in pfx format
 * @param port  Specify the port for connecting to the server.
 * @param preparedStatementCacheMaxSize  Set the maximum number of prepared statements that the connection will cache.
 * @param preparedStatementCacheSqlLimit  Set the maximum length of prepared statement SQL string that the connection will cache.
 * @param properties  Set properties for this client, which will be sent to server at the connection start.
 * @param proxyOptions  Set proxy options for connections via CONNECT proxy (e.g. Squid) or a SOCKS proxy.
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reconnectAttempts  Set the value of reconnect attempts
 * @param reconnectInterval  Set the reconnect interval
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param sendBufferSize  Set the TCP send buffer size
 * @param serverRsaPublicKeyPath  Set the path of server RSA public key which is mostly used for encrypting password under insecure connections when performing authentication.
 * @param serverRsaPublicKeyValue  Set the value of server RSA public key which is mostly used for encrypting password under insecure connections when performing authentication.
 * @param soLinger  Set whether SO_linger keep alive is enabled
 * @param ssl  Set whether SSL/TLS is enabled
 * @param sslHandshakeTimeout  Set the SSL handshake timeout, default time unit is seconds.
 * @param sslHandshakeTimeoutUnit  Set the SSL handshake timeout unit. If not specified, default is seconds.
 * @param sslMode  Set the [io.vertx.mysqlclient.SslMode] for the client, this option can be used to specify the desired security state of the connection to the server.
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native transport.
 * @param tcpKeepAlive  Set whether TCP keep alive is enabled
 * @param tcpNoDelay  Set whether TCP no delay is enabled
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native transport.
 * @param trafficClass  Set the value of traffic class
 * @param trustAll  Set whether all server certificates should be trusted
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param useAffectedRows  Sets how affected rows are calculated on update/delete/insert, if set to <code>true</code> an update that effectively does not change any data returns zero affected rows. See <a href="https://dev.mysql.com/doc/refman/8.0/en/mysql-affected-rows.html">mysql-affected-rows</a> for details.
 * @param useAlpn  Set the ALPN usage.
 * @param user  Specify the user account to be used for the authentication.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mysqlclient.MySQLConnectOptions original] using Vert.x codegen.
 */
fun mySQLConnectOptionsOf(
  cachePreparedStatements: Boolean? = null,
  characterEncoding: String? = null,
  charset: String? = null,
  collation: String? = null,
  connectTimeout: Int? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  database: String? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  host: String? = null,
  hostnameVerificationAlgorithm: String? = null,
  idleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
  keyStoreOptions: io.vertx.core.net.JksOptions? = null,
  localAddress: String? = null,
  logActivity: Boolean? = null,
  metricsName: String? = null,
  openSslEngineOptions: io.vertx.core.net.OpenSSLEngineOptions? = null,
  password: String? = null,
  pemKeyCertOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  pemTrustOptions: io.vertx.core.net.PemTrustOptions? = null,
  pfxKeyCertOptions: io.vertx.core.net.PfxOptions? = null,
  pfxTrustOptions: io.vertx.core.net.PfxOptions? = null,
  port: Int? = null,
  preparedStatementCacheMaxSize: Int? = null,
  preparedStatementCacheSqlLimit: Int? = null,
  properties: Map<String, String>? = null,
  proxyOptions: io.vertx.core.net.ProxyOptions? = null,
  receiveBufferSize: Int? = null,
  reconnectAttempts: Int? = null,
  reconnectInterval: Long? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  sendBufferSize: Int? = null,
  serverRsaPublicKeyPath: String? = null,
  serverRsaPublicKeyValue: io.vertx.core.buffer.Buffer? = null,
  soLinger: Int? = null,
  ssl: Boolean? = null,
  sslHandshakeTimeout: Long? = null,
  sslHandshakeTimeoutUnit: TimeUnit? = null,
  sslMode: SslMode? = null,
  tcpCork: Boolean? = null,
  tcpFastOpen: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  tcpNoDelay: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  trafficClass: Int? = null,
  trustAll: Boolean? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  useAffectedRows: Boolean? = null,
  useAlpn: Boolean? = null,
  user: String? = null): MySQLConnectOptions = io.vertx.mysqlclient.MySQLConnectOptions().apply {

  if (cachePreparedStatements != null) {
    this.setCachePreparedStatements(cachePreparedStatements)
  }
  if (characterEncoding != null) {
    this.setCharacterEncoding(characterEncoding)
  }
  if (charset != null) {
    this.setCharset(charset)
  }
  if (collation != null) {
    this.setCollation(collation)
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
  if (database != null) {
    this.setDatabase(database)
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
  if (keyStoreOptions != null) {
    this.setKeyStoreOptions(keyStoreOptions)
  }
  if (localAddress != null) {
    this.setLocalAddress(localAddress)
  }
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (metricsName != null) {
    this.setMetricsName(metricsName)
  }
  if (openSslEngineOptions != null) {
    this.setOpenSslEngineOptions(openSslEngineOptions)
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
  if (port != null) {
    this.setPort(port)
  }
  if (preparedStatementCacheMaxSize != null) {
    this.setPreparedStatementCacheMaxSize(preparedStatementCacheMaxSize)
  }
  if (preparedStatementCacheSqlLimit != null) {
    this.setPreparedStatementCacheSqlLimit(preparedStatementCacheSqlLimit)
  }
  if (properties != null) {
    this.setProperties(properties)
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
  if (serverRsaPublicKeyPath != null) {
    this.setServerRsaPublicKeyPath(serverRsaPublicKeyPath)
  }
  if (serverRsaPublicKeyValue != null) {
    this.setServerRsaPublicKeyValue(serverRsaPublicKeyValue)
  }
  if (soLinger != null) {
    this.setSoLinger(soLinger)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (sslHandshakeTimeout != null) {
    this.setSslHandshakeTimeout(sslHandshakeTimeout)
  }
  if (sslHandshakeTimeoutUnit != null) {
    this.setSslHandshakeTimeoutUnit(sslHandshakeTimeoutUnit)
  }
  if (sslMode != null) {
    this.setSslMode(sslMode)
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
  if (trustStoreOptions != null) {
    this.setTrustStoreOptions(trustStoreOptions)
  }
  if (useAffectedRows != null) {
    this.setUseAffectedRows(useAffectedRows)
  }
  if (useAlpn != null) {
    this.setUseAlpn(useAlpn)
  }
  if (user != null) {
    this.setUser(user)
  }
}

/**
 * A function providing a DSL for building [io.vertx.mysqlclient.MySQLConnectOptions] objects.
 *
 * Connect options for configuring [io.vertx.mysqlclient.MySQLConnection] or [io.vertx.mysqlclient.MySQLPool].
 *
 * @param cachePreparedStatements  Set whether prepared statements cache should be enabled.
 * @param characterEncoding  Set the Java charset for encoding string values, this value is UTF-8 by default.
 * @param charset  Set the charset for the connection.
 * @param collation  Set the collation for the connection.
 * @param connectTimeout  Set the connect timeout
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param database  Specify the default database for the connection.
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param host  Specify the host for connecting to the server.
 * @param hostnameVerificationAlgorithm  Set the hostname verification algorithm interval To disable hostname verification, set hostnameVerificationAlgorithm to an empty String
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.mysqlclient.MySQLConnectOptions]
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param jdkSslEngineOptions 
 * @param keyStoreOptions  Set the key/cert options in jks format, aka Java keystore.
 * @param localAddress  Set the local interface to bind for network connections. When the local address is null, it will pick any local address, the default local address is null.
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param metricsName  Set the metrics name identifying the reported metrics, useful for grouping metrics with the same name.
 * @param openSslEngineOptions 
 * @param password  Specify the user password to be used for the authentication.
 * @param pemKeyCertOptions  Set the key/cert store options in pem format.
 * @param pemTrustOptions  Set the trust options in pem format
 * @param pfxKeyCertOptions  Set the key/cert options in pfx format.
 * @param pfxTrustOptions  Set the trust options in pfx format
 * @param port  Specify the port for connecting to the server.
 * @param preparedStatementCacheMaxSize  Set the maximum number of prepared statements that the connection will cache.
 * @param preparedStatementCacheSqlLimit  Set the maximum length of prepared statement SQL string that the connection will cache.
 * @param properties  Set properties for this client, which will be sent to server at the connection start.
 * @param proxyOptions  Set proxy options for connections via CONNECT proxy (e.g. Squid) or a SOCKS proxy.
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reconnectAttempts  Set the value of reconnect attempts
 * @param reconnectInterval  Set the reconnect interval
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param sendBufferSize  Set the TCP send buffer size
 * @param serverRsaPublicKeyPath  Set the path of server RSA public key which is mostly used for encrypting password under insecure connections when performing authentication.
 * @param serverRsaPublicKeyValue  Set the value of server RSA public key which is mostly used for encrypting password under insecure connections when performing authentication.
 * @param soLinger  Set whether SO_linger keep alive is enabled
 * @param ssl  Set whether SSL/TLS is enabled
 * @param sslHandshakeTimeout  Set the SSL handshake timeout, default time unit is seconds.
 * @param sslHandshakeTimeoutUnit  Set the SSL handshake timeout unit. If not specified, default is seconds.
 * @param sslMode  Set the [io.vertx.mysqlclient.SslMode] for the client, this option can be used to specify the desired security state of the connection to the server.
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native transport.
 * @param tcpKeepAlive  Set whether TCP keep alive is enabled
 * @param tcpNoDelay  Set whether TCP no delay is enabled
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native transport.
 * @param trafficClass  Set the value of traffic class
 * @param trustAll  Set whether all server certificates should be trusted
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param useAffectedRows  Sets how affected rows are calculated on update/delete/insert, if set to <code>true</code> an update that effectively does not change any data returns zero affected rows. See <a href="https://dev.mysql.com/doc/refman/8.0/en/mysql-affected-rows.html">mysql-affected-rows</a> for details.
 * @param useAlpn  Set the ALPN usage.
 * @param user  Specify the user account to be used for the authentication.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mysqlclient.MySQLConnectOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("mySQLConnectOptionsOf(cachePreparedStatements, characterEncoding, charset, collation, connectTimeout, crlPaths, crlValues, database, enabledCipherSuites, enabledSecureTransportProtocols, host, hostnameVerificationAlgorithm, idleTimeout, idleTimeoutUnit, jdkSslEngineOptions, keyStoreOptions, localAddress, logActivity, metricsName, openSslEngineOptions, password, pemKeyCertOptions, pemTrustOptions, pfxKeyCertOptions, pfxTrustOptions, port, preparedStatementCacheMaxSize, preparedStatementCacheSqlLimit, properties, proxyOptions, receiveBufferSize, reconnectAttempts, reconnectInterval, reuseAddress, reusePort, sendBufferSize, serverRsaPublicKeyPath, serverRsaPublicKeyValue, soLinger, ssl, sslHandshakeTimeout, sslHandshakeTimeoutUnit, sslMode, tcpCork, tcpFastOpen, tcpKeepAlive, tcpNoDelay, tcpQuickAck, trafficClass, trustAll, trustStoreOptions, useAffectedRows, useAlpn, user)")
)
fun MySQLConnectOptions(
  cachePreparedStatements: Boolean? = null,
  characterEncoding: String? = null,
  charset: String? = null,
  collation: String? = null,
  connectTimeout: Int? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  database: String? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  host: String? = null,
  hostnameVerificationAlgorithm: String? = null,
  idleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
  keyStoreOptions: io.vertx.core.net.JksOptions? = null,
  localAddress: String? = null,
  logActivity: Boolean? = null,
  metricsName: String? = null,
  openSslEngineOptions: io.vertx.core.net.OpenSSLEngineOptions? = null,
  password: String? = null,
  pemKeyCertOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  pemTrustOptions: io.vertx.core.net.PemTrustOptions? = null,
  pfxKeyCertOptions: io.vertx.core.net.PfxOptions? = null,
  pfxTrustOptions: io.vertx.core.net.PfxOptions? = null,
  port: Int? = null,
  preparedStatementCacheMaxSize: Int? = null,
  preparedStatementCacheSqlLimit: Int? = null,
  properties: Map<String, String>? = null,
  proxyOptions: io.vertx.core.net.ProxyOptions? = null,
  receiveBufferSize: Int? = null,
  reconnectAttempts: Int? = null,
  reconnectInterval: Long? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  sendBufferSize: Int? = null,
  serverRsaPublicKeyPath: String? = null,
  serverRsaPublicKeyValue: io.vertx.core.buffer.Buffer? = null,
  soLinger: Int? = null,
  ssl: Boolean? = null,
  sslHandshakeTimeout: Long? = null,
  sslHandshakeTimeoutUnit: TimeUnit? = null,
  sslMode: SslMode? = null,
  tcpCork: Boolean? = null,
  tcpFastOpen: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  tcpNoDelay: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  trafficClass: Int? = null,
  trustAll: Boolean? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  useAffectedRows: Boolean? = null,
  useAlpn: Boolean? = null,
  user: String? = null): MySQLConnectOptions = io.vertx.mysqlclient.MySQLConnectOptions().apply {

  if (cachePreparedStatements != null) {
    this.setCachePreparedStatements(cachePreparedStatements)
  }
  if (characterEncoding != null) {
    this.setCharacterEncoding(characterEncoding)
  }
  if (charset != null) {
    this.setCharset(charset)
  }
  if (collation != null) {
    this.setCollation(collation)
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
  if (database != null) {
    this.setDatabase(database)
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
  if (keyStoreOptions != null) {
    this.setKeyStoreOptions(keyStoreOptions)
  }
  if (localAddress != null) {
    this.setLocalAddress(localAddress)
  }
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (metricsName != null) {
    this.setMetricsName(metricsName)
  }
  if (openSslEngineOptions != null) {
    this.setOpenSslEngineOptions(openSslEngineOptions)
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
  if (port != null) {
    this.setPort(port)
  }
  if (preparedStatementCacheMaxSize != null) {
    this.setPreparedStatementCacheMaxSize(preparedStatementCacheMaxSize)
  }
  if (preparedStatementCacheSqlLimit != null) {
    this.setPreparedStatementCacheSqlLimit(preparedStatementCacheSqlLimit)
  }
  if (properties != null) {
    this.setProperties(properties)
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
  if (serverRsaPublicKeyPath != null) {
    this.setServerRsaPublicKeyPath(serverRsaPublicKeyPath)
  }
  if (serverRsaPublicKeyValue != null) {
    this.setServerRsaPublicKeyValue(serverRsaPublicKeyValue)
  }
  if (soLinger != null) {
    this.setSoLinger(soLinger)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (sslHandshakeTimeout != null) {
    this.setSslHandshakeTimeout(sslHandshakeTimeout)
  }
  if (sslHandshakeTimeoutUnit != null) {
    this.setSslHandshakeTimeoutUnit(sslHandshakeTimeoutUnit)
  }
  if (sslMode != null) {
    this.setSslMode(sslMode)
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
  if (trustStoreOptions != null) {
    this.setTrustStoreOptions(trustStoreOptions)
  }
  if (useAffectedRows != null) {
    this.setUseAffectedRows(useAffectedRows)
  }
  if (useAlpn != null) {
    this.setUseAlpn(useAlpn)
  }
  if (user != null) {
    this.setUser(user)
  }
}

