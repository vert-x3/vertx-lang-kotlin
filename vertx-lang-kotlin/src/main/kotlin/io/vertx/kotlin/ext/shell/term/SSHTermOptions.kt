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

import io.vertx.ext.shell.term.SSHTermOptions

/**
 * A function providing a DSL for building [io.vertx.ext.shell.term.SSHTermOptions] objects.
 *
 * The SSH term configuration options.
 *
 * @param authOptions  Set the auth options.
 * @param defaultCharset  Set the default charset to use when the client does not specifies one.
 * @param host  Set the host
 * @param intputrc  The path of the <i>inputrc</i> config.
 * @param keyPairOptions  Set the key pair options in jks format, aka Java keystore.
 * @param pemKeyPairOptions  Set the key pair store options in pem format.
 * @param pfxKeyPairOptions  Set the key pair options in pfx format.
 * @param port  Set the port
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.term.SSHTermOptions original] using Vert.x codegen.
 */
fun sshTermOptionsOf(
  authOptions: io.vertx.core.json.JsonObject? = null,
  defaultCharset: String? = null,
  host: String? = null,
  intputrc: String? = null,
  keyPairOptions: io.vertx.core.net.JksOptions? = null,
  pemKeyPairOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  pfxKeyPairOptions: io.vertx.core.net.PfxOptions? = null,
  port: Int? = null): SSHTermOptions = io.vertx.ext.shell.term.SSHTermOptions().apply {

  if (authOptions != null) {
    this.setAuthOptions(authOptions)
  }
  if (defaultCharset != null) {
    this.setDefaultCharset(defaultCharset)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (intputrc != null) {
    this.setIntputrc(intputrc)
  }
  if (keyPairOptions != null) {
    this.setKeyPairOptions(keyPairOptions)
  }
  if (pemKeyPairOptions != null) {
    this.setPemKeyPairOptions(pemKeyPairOptions)
  }
  if (pfxKeyPairOptions != null) {
    this.setPfxKeyPairOptions(pfxKeyPairOptions)
  }
  if (port != null) {
    this.setPort(port)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.shell.term.SSHTermOptions] objects.
 *
 * The SSH term configuration options.
 *
 * @param authOptions  Set the auth options.
 * @param defaultCharset  Set the default charset to use when the client does not specifies one.
 * @param host  Set the host
 * @param intputrc  The path of the <i>inputrc</i> config.
 * @param keyPairOptions  Set the key pair options in jks format, aka Java keystore.
 * @param pemKeyPairOptions  Set the key pair store options in pem format.
 * @param pfxKeyPairOptions  Set the key pair options in pfx format.
 * @param port  Set the port
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.shell.term.SSHTermOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("sshTermOptionsOf(authOptions, defaultCharset, host, intputrc, keyPairOptions, pemKeyPairOptions, pfxKeyPairOptions, port)")
)
fun SSHTermOptions(
  authOptions: io.vertx.core.json.JsonObject? = null,
  defaultCharset: String? = null,
  host: String? = null,
  intputrc: String? = null,
  keyPairOptions: io.vertx.core.net.JksOptions? = null,
  pemKeyPairOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  pfxKeyPairOptions: io.vertx.core.net.PfxOptions? = null,
  port: Int? = null): SSHTermOptions = io.vertx.ext.shell.term.SSHTermOptions().apply {

  if (authOptions != null) {
    this.setAuthOptions(authOptions)
  }
  if (defaultCharset != null) {
    this.setDefaultCharset(defaultCharset)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (intputrc != null) {
    this.setIntputrc(intputrc)
  }
  if (keyPairOptions != null) {
    this.setKeyPairOptions(keyPairOptions)
  }
  if (pemKeyPairOptions != null) {
    this.setPemKeyPairOptions(pemKeyPairOptions)
  }
  if (pfxKeyPairOptions != null) {
    this.setPfxKeyPairOptions(pfxKeyPairOptions)
  }
  if (port != null) {
    this.setPort(port)
  }
}

