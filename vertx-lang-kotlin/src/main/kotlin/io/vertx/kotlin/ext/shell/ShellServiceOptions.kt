package io.vertx.kotlin.ext.shell

import io.vertx.ext.shell.ShellServiceOptions
import io.vertx.ext.shell.term.HttpTermOptions
import io.vertx.ext.shell.term.SSHTermOptions
import io.vertx.ext.shell.term.TelnetTermOptions

/**
 * A function providing a DSL for building [io.vertx.ext.shell.ShellServiceOptions] objects.
 *
 * The configurations options for the shell service, the shell connectors can be configured
 * with ,  and .
 *
 * @param httpOptions 
 * @param reaperInterval  Set the repear interval, i.e the period at which session eviction is performed.
 * @param sessionTimeout  Set the session timeout.
 * @param sshOptions  Set the SSH options, if the option is null, SSH will not be started.
 * @param telnetOptions  Set the Telnet options, if the option is null, Telnet will not be started.
 * @param welcomeMessage  Set the shell welcome message, i.e the message displayed in the user console when he connects to the shell.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.ShellServiceOptions original] using Vert.x codegen.
 */
fun ShellServiceOptions(
  httpOptions: io.vertx.ext.shell.term.HttpTermOptions? = null,
  reaperInterval: Long? = null,
  sessionTimeout: Long? = null,
  sshOptions: io.vertx.ext.shell.term.SSHTermOptions? = null,
  telnetOptions: io.vertx.ext.shell.term.TelnetTermOptions? = null,
  welcomeMessage: String? = null): ShellServiceOptions = io.vertx.ext.shell.ShellServiceOptions().apply {

  if (httpOptions != null) {
    this.setHttpOptions(httpOptions)
  }
  if (reaperInterval != null) {
    this.setReaperInterval(reaperInterval)
  }
  if (sessionTimeout != null) {
    this.setSessionTimeout(sessionTimeout)
  }
  if (sshOptions != null) {
    this.setSSHOptions(sshOptions)
  }
  if (telnetOptions != null) {
    this.setTelnetOptions(telnetOptions)
  }
  if (welcomeMessage != null) {
    this.setWelcomeMessage(welcomeMessage)
  }
}

