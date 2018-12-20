package io.vertx.kotlin.core.net

import io.vertx.core.net.JksOptions

/**
 * A function providing a DSL for building [io.vertx.core.net.JksOptions] objects.
 *
 * Key or trust store options configuring private key and/or certificates based on Java Keystore files.
 * <p>
 * When used as a key store, it should point to a store containing a private key and its certificate.
 * When used as a trust store, it should point to a store containing a list of trusted certificates.
 * <p>
 * The store can either be loaded by Vert.x from the filesystem:
 * <p>
 * <pre>
 * HttpServerOptions options = HttpServerOptions.httpServerOptions();
 * options.setKeyStore(new JKSOptions().setPath("/mykeystore.jks").setPassword("foo"));
 * </pre>
 *
 * Or directly provided as a buffer:
 * <p>
 *
 * <pre>
 * Buffer store = vertx.fileSystem().readFileSync("/mykeystore.jks");
 * options.setKeyStore(new JKSOptions().setValue(store).setPassword("foo"));
 * </pre>
 *
 * @param password  Set the password for the key store
 * @param path  Set the path to the key store
 * @param value  Set the key store as a buffer
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.JksOptions original] using Vert.x codegen.
 */
fun jksOptionsOf(
  password: String? = null,
  path: String? = null,
  value: io.vertx.core.buffer.Buffer? = null): JksOptions = io.vertx.core.net.JksOptions().apply {

  if (password != null) {
    this.setPassword(password)
  }
  if (path != null) {
    this.setPath(path)
  }
  if (value != null) {
    this.setValue(value)
  }
}

