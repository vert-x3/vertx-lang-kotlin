package io.vertx.kotlin.ext.auth

import io.vertx.ext.auth.PubSecKeyOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.PubSecKeyOptions] objects.
 *
 * Options describing how a Cryptographic Key.
 *
 * @param algorithm 
 * @param certificate 
 * @param publicKey 
 * @param secretKey 
 * @param symmetric 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.PubSecKeyOptions original] using Vert.x codegen.
 */
fun pubSecKeyOptionsOf(
  algorithm: String? = null,
  certificate: Boolean? = null,
  publicKey: String? = null,
  secretKey: String? = null,
  symmetric: Boolean? = null): PubSecKeyOptions = io.vertx.ext.auth.PubSecKeyOptions().apply {

  if (algorithm != null) {
    this.setAlgorithm(algorithm)
  }
  if (certificate != null) {
    this.setCertificate(certificate)
  }
  if (publicKey != null) {
    this.setPublicKey(publicKey)
  }
  if (secretKey != null) {
    this.setSecretKey(secretKey)
  }
  if (symmetric != null) {
    this.setSymmetric(symmetric)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.auth.PubSecKeyOptions] objects.
 *
 * Options describing how a Cryptographic Key.
 *
 * @param algorithm 
 * @param certificate 
 * @param publicKey 
 * @param secretKey 
 * @param symmetric 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.PubSecKeyOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("pubSecKeyOptionsOf(algorithm, certificate, publicKey, secretKey, symmetric)")
)
fun PubSecKeyOptions(
  algorithm: String? = null,
  certificate: Boolean? = null,
  publicKey: String? = null,
  secretKey: String? = null,
  symmetric: Boolean? = null): PubSecKeyOptions = io.vertx.ext.auth.PubSecKeyOptions().apply {

  if (algorithm != null) {
    this.setAlgorithm(algorithm)
  }
  if (certificate != null) {
    this.setCertificate(certificate)
  }
  if (publicKey != null) {
    this.setPublicKey(publicKey)
  }
  if (secretKey != null) {
    this.setSecretKey(secretKey)
  }
  if (symmetric != null) {
    this.setSymmetric(symmetric)
  }
}

