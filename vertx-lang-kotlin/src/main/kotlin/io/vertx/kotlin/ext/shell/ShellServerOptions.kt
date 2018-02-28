package io.vertx.kotlin.ext.shell

import io.vertx.ext.shell.ShellServerOptions

/**
 * A function providing a DSL for building [io.vertx.ext.shell.ShellServerOptions] objects.
 *
 * The configurations options for the shell server.
 *
 * @param reaperInterval  Set the repear interval, i.e the period at which session eviction is performed.
 * @param sessionTimeout  Set the session timeout.
 * @param welcomeMessage  Set the shell welcome message, i.e the message displayed in the user console when he connects to the shell.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.ShellServerOptions original] using Vert.x codegen.
 */
fun ShellServerOptions(
  reaperInterval: Long? = null,
  sessionTimeout: Long? = null,
  welcomeMessage: String? = null): ShellServerOptions = io.vertx.ext.shell.ShellServerOptions().apply {

  if (reaperInterval != null) {
    this.setReaperInterval(reaperInterval)
  }
  if (sessionTimeout != null) {
    this.setSessionTimeout(sessionTimeout)
  }
  if (welcomeMessage != null) {
    this.setWelcomeMessage(welcomeMessage)
  }
}

