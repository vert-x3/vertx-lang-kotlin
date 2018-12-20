package io.vertx.kotlin.core.net

import io.vertx.core.net.PemKeyCertOptions

/**
 * A function providing a DSL for building [io.vertx.core.net.PemKeyCertOptions] objects.
 *
 * Key store options configuring a list of private key and its certificate based on
 * <i>Privacy-enhanced Electronic Email</i> (PEM) files.
 * <p>
 *
 * A key file must contain a <b>non encrypted</b> private key in <b>PKCS8</b> format wrapped in a PEM
 * block, for example:
 * <p>
 *
 * <pre>
 * -----BEGIN PRIVATE KEY-----
 * MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDV6zPk5WqLwS0a
 * ...
 * K5xBhtm1AhdnZjx5KfW3BecE
 * -----END PRIVATE KEY-----
 * </pre><p>
 *
 * Or contain a <b>non encrypted</b> private key in <b>PKCS1</b> format wrapped in a PEM
 * block, for example:
 * <p>
 *
 * <pre>
 * -----BEGIN RSA PRIVATE KEY-----
 * MIIEowIBAAKCAQEAlO4gbHeFb/fmbUF/tOJfNPJumJUEqgzAzx8MBXv9Acyw9IRa
 * ...
 * zJ14Yd+t2fsLYVs2H0gxaA4DW6neCzgY3eKpSU0EBHUCFSXp/1+/
 * -----END RSA PRIVATE KEY-----
 * </pre><p>
 *
 * A certificate file must contain an X.509 certificate wrapped in a PEM block, for example:
 * <p>
 *
 * <pre>
 * -----BEGIN CERTIFICATE-----
 * MIIDezCCAmOgAwIBAgIEZOI/3TANBgkqhkiG9w0BAQsFADBuMRAwDgYDVQQGEwdV
 * ...
 * +tmLSvYS39O2nqIzzAUfztkYnUlZmB0l/mKkVqbGJA==
 * -----END CERTIFICATE-----
 * </pre>
 *
 * Keys and certificates can either be loaded by Vert.x from the filesystem:
 * <p>
 * <pre>
 * HttpServerOptions options = new HttpServerOptions();
 * options.setPemKeyCertOptions(new PemKeyCertOptions().setKeyPath("/mykey.pem").setCertPath("/mycert.pem"));
 * </pre>
 *
 * Or directly provided as a buffer:<p>
 *
 * <pre>
 * Buffer key = vertx.fileSystem().readFileSync("/mykey.pem");
 * Buffer cert = vertx.fileSystem().readFileSync("/mycert.pem");
 * options.setPemKeyCertOptions(new PemKeyCertOptions().setKeyValue(key).setCertValue(cert));
 * </pre>
 *
 * Several key/certificate pairs can be used:
 * <p>
 * <pre>
 * HttpServerOptions options = new HttpServerOptions();
 * options.setPemKeyCertOptions(new PemKeyCertOptions()
 *    .addKeyPath("/mykey1.pem").addCertPath("/mycert1.pem")
 *    .addKeyPath("/mykey2.pem").addCertPath("/mycert2.pem"));
 * </pre>
 *
 * @param certPath  Set the path of the first certificate, replacing the previous certificates paths
 * @param certPaths  Set all the paths to the certificates files
 * @param certValue  Set the first certificate as a buffer, replacing the previous certificates buffers
 * @param certValues  Set all the certificates as a list of buffer
 * @param keyPath  Set the path of the first key file, replacing the keys paths
 * @param keyPaths  Set all the paths to the keys files
 * @param keyValue  Set the first key a a buffer, replacing the previous keys buffers
 * @param keyValues  Set all the keys as a list of buffer
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.PemKeyCertOptions original] using Vert.x codegen.
 */
fun pemKeyCertOptionsOf(
  certPath: String? = null,
  certPaths: Iterable<String>? = null,
  certValue: io.vertx.core.buffer.Buffer? = null,
  certValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  keyPath: String? = null,
  keyPaths: Iterable<String>? = null,
  keyValue: io.vertx.core.buffer.Buffer? = null,
  keyValues: Iterable<io.vertx.core.buffer.Buffer>? = null): PemKeyCertOptions = io.vertx.core.net.PemKeyCertOptions().apply {

  if (certPath != null) {
    this.setCertPath(certPath)
  }
  if (certPaths != null) {
    this.setCertPaths(certPaths.toList())
  }
  if (certValue != null) {
    this.setCertValue(certValue)
  }
  if (certValues != null) {
    this.setCertValues(certValues.toList())
  }
  if (keyPath != null) {
    this.setKeyPath(keyPath)
  }
  if (keyPaths != null) {
    this.setKeyPaths(keyPaths.toList())
  }
  if (keyValue != null) {
    this.setKeyValue(keyValue)
  }
  if (keyValues != null) {
    this.setKeyValues(keyValues.toList())
  }
}

