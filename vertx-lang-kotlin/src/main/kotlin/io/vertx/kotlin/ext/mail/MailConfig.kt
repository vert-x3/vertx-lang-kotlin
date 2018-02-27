package io.vertx.kotlin.ext.mail

import io.vertx.ext.mail.MailConfig
import io.vertx.ext.mail.LoginOption
import io.vertx.ext.mail.StartTLSOptions

/**
 * A function providing a DSL for building [io.vertx.ext.mail.MailConfig] objects.
 *
 * represents the configuration of a mail service with mail server hostname,
 * port, security options, login options and login/password
 *
 * @param allowRcptErrors  set if sending allows rcpt errors <p> if true, the mail will be sent to the recipients that the server accepted, if any <p>
 * @param authMethods  set string of allowed auth methods. if set only these methods will be used if the server supports them. If null or empty all supported methods may be used
 * @param disableEsmtp  set if ESMTP should be tried as first command (EHLO) <p> rfc 1869 states that clients should always attempt EHLO as first command to determine if ESMTP is supported, if this returns an error code, HELO is tried to use old SMTP. If there is a server that does not support EHLO and does not give an error code back, the connection should be closed and retried with HELO. We do not do that and rather support turning off ESMTP with a setting. The odds of this actually happening are very small since the client will not connect to arbitrary smtp hosts on the internet. Since the client knows that is connects to a host that doesn't support ESMTP/EHLO in that way, the property has to be set to false. <p>
 * @param hostname  Set the hostname of the smtp server.
 * @param keepAlive  set if connection pool is enabled default is true <p> if the connection pooling is disabled, the max number of sockets is enforced nevertheless <p>
 * @param keyStore  get the key store filename to be used when opening SMTP connections <p> if not set, an options object will be created based on other settings (ssl and trustAll)
 * @param keyStorePassword  get the key store password to be used when opening SMTP connections
 * @param login  Set the login mode for the connection. <p> Either DISABLED, OPTIONAL or REQUIRED
 * @param maxPoolSize  set the max allowed number of open connections to the mail server if not set the default is 10
 * @param ownHostname  set the hostname to be used for HELO/EHLO and the Message-ID
 * @param password  Set the password for the login.
 * @param port  Set the port of the smtp server.
 * @param ssl  Set the sslOnConnect mode for the connection.
 * @param starttls  Set the tls security mode for the connection. <p> Either NONE, OPTIONAL or REQUIRED
 * @param trustAll  set whether to trust all certificates on ssl connect the option is also applied to STARTTLS operation
 * @param username  Set the username for the login.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mail.MailConfig original] using Vert.x codegen.
 */
fun MailConfig(
  allowRcptErrors: Boolean? = null,
  authMethods: String? = null,
  disableEsmtp: Boolean? = null,
  hostname: String? = null,
  keepAlive: Boolean? = null,
  keyStore: String? = null,
  keyStorePassword: String? = null,
  login: LoginOption? = null,
  maxPoolSize: Int? = null,
  ownHostname: String? = null,
  password: String? = null,
  port: Int? = null,
  ssl: Boolean? = null,
  starttls: StartTLSOptions? = null,
  trustAll: Boolean? = null,
  username: String? = null): MailConfig = io.vertx.ext.mail.MailConfig().apply {

  if (allowRcptErrors != null) {
    this.setAllowRcptErrors(allowRcptErrors)
  }
  if (authMethods != null) {
    this.setAuthMethods(authMethods)
  }
  if (disableEsmtp != null) {
    this.setDisableEsmtp(disableEsmtp)
  }
  if (hostname != null) {
    this.setHostname(hostname)
  }
  if (keepAlive != null) {
    this.setKeepAlive(keepAlive)
  }
  if (keyStore != null) {
    this.setKeyStore(keyStore)
  }
  if (keyStorePassword != null) {
    this.setKeyStorePassword(keyStorePassword)
  }
  if (login != null) {
    this.setLogin(login)
  }
  if (maxPoolSize != null) {
    this.setMaxPoolSize(maxPoolSize)
  }
  if (ownHostname != null) {
    this.setOwnHostname(ownHostname)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (starttls != null) {
    this.setStarttls(starttls)
  }
  if (trustAll != null) {
    this.setTrustAll(trustAll)
  }
  if (username != null) {
    this.setUsername(username)
  }
}

