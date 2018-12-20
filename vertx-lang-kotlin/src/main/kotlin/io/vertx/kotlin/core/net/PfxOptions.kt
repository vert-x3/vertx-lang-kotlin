package io.vertx.kotlin.core.net

import io.vertx.core.net.PfxOptions

/**
 * A function providing a DSL for building [io.vertx.core.net.PfxOptions] objects.
 *
 * Key or trust store options configuring private key and/or certificates based on PKCS#12 files.
 * <p>
 * When used as a key store, it should point to a store containing a private key and its certificate.
 * When used as a trust store, it should point to a store containing a list of accepted certificates.
 * <p>
 *
 * The store can either be loaded by Vert.x from the filesystem:
 * <p>
 * <pre>
 * HttpServerOptions options = new HttpServerOptions();
 * options.setPfxKeyCertOptions(new PfxOptions().setPath("/mykeystore.p12").setPassword("foo"));
 * </pre>
 *
 * Or directly provided as a buffer:<p>
 *
 * <pre>
 * Buffer store = vertx.fileSystem().readFileSync("/mykeystore.p12");
 * options.setPfxKeyCertOptions(new PfxOptions().setValue(store).setPassword("foo"));
 * </pre>
 *
 * @param password  Set the password
 * @param path  Set the path
 * @param value  Set the store as a buffer
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.PfxOptions original] using Vert.x codegen.
 */
fun pfxOptionsOf(
  password: String? = null,
  path: String? = null,
  value: io.vertx.core.buffer.Buffer? = null): PfxOptions = io.vertx.core.net.PfxOptions().apply {

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

