package io.vertx.kotlin.ext.shell.term

import io.vertx.ext.shell.term.SSHTermOptions
import io.vertx.core.net.JksOptions
import io.vertx.core.net.PemKeyCertOptions
import io.vertx.core.net.PfxOptions
import io.vertx.ext.auth.AuthOptions

/**
 * A function providing a DSL for building [io.vertx.ext.shell.term.SSHTermOptions] objects.
 *
 * The SSH term configuration options.
 *
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
fun SSHTermOptions(
  defaultCharset: String? = null,
  host: String? = null,
  intputrc: String? = null,
  keyPairOptions: io.vertx.core.net.JksOptions? = null,
  pemKeyPairOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  pfxKeyPairOptions: io.vertx.core.net.PfxOptions? = null,
  port: Int? = null): SSHTermOptions = io.vertx.ext.shell.term.SSHTermOptions().apply {

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

