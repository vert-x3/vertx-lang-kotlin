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
package io.vertx.kotlin.ext.mail

import io.vertx.ext.mail.DKIMSignOptions
import io.vertx.ext.mail.CanonicalizationAlgorithm
import io.vertx.ext.mail.DKIMSignAlgorithm

/**
 * A function providing a DSL for building [io.vertx.ext.mail.DKIMSignOptions] objects.
 *
 *
 * This represents the options used to perform DKIM Signature signing action.
 *
 * See: https://tools.ietf.org/html/rfc6376
 *
 * @param auid  Sets the Agent or User Identifier(AUID)
 * @param bodyCanonAlgo  Sets the canonicalization algorithm for mail body.
 * @param bodyLimit  Sets the body limit to sign.
 * @param copiedHeaders  Sets the copied headers used in DKIM.
 * @param expireTime  Sets the expire time in seconds when the signature sign will be expired. Success call of this method indicates that the signature sign timestamp is enabled.
 * @param headerCanonAlgo  Sets the canonicalization algorithm for signed headers.
 * @param privateKey  Sets the PKCS#8 format private key used to sign the email.
 * @param privateKeyPath  Sets the PKCS#8 format private key file path.
 * @param sdid  Sets the Singing Domain Identifier(SDID).
 * @param selector  Sets the selector used to query the public key.
 * @param signAlgo  Sets the signing algorithm.
 * @param signatureTimestamp  Sets to enable or disable signature sign timestmap. Default is disabled.
 * @param signedHeaders  Sets the email signedHeaders used to sign.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mail.DKIMSignOptions original] using Vert.x codegen.
 */
fun dkimSignOptionsOf(
  auid: String? = null,
  bodyCanonAlgo: CanonicalizationAlgorithm? = null,
  bodyLimit: Int? = null,
  copiedHeaders: Iterable<String>? = null,
  expireTime: Long? = null,
  headerCanonAlgo: CanonicalizationAlgorithm? = null,
  privateKey: String? = null,
  privateKeyPath: String? = null,
  sdid: String? = null,
  selector: String? = null,
  signAlgo: DKIMSignAlgorithm? = null,
  signatureTimestamp: Boolean? = null,
  signedHeaders: Iterable<String>? = null): DKIMSignOptions = io.vertx.ext.mail.DKIMSignOptions().apply {

  if (auid != null) {
    this.setAuid(auid)
  }
  if (bodyCanonAlgo != null) {
    this.setBodyCanonAlgo(bodyCanonAlgo)
  }
  if (bodyLimit != null) {
    this.setBodyLimit(bodyLimit)
  }
  if (copiedHeaders != null) {
    this.setCopiedHeaders(copiedHeaders.toList())
  }
  if (expireTime != null) {
    this.setExpireTime(expireTime)
  }
  if (headerCanonAlgo != null) {
    this.setHeaderCanonAlgo(headerCanonAlgo)
  }
  if (privateKey != null) {
    this.setPrivateKey(privateKey)
  }
  if (privateKeyPath != null) {
    this.setPrivateKeyPath(privateKeyPath)
  }
  if (sdid != null) {
    this.setSdid(sdid)
  }
  if (selector != null) {
    this.setSelector(selector)
  }
  if (signAlgo != null) {
    this.setSignAlgo(signAlgo)
  }
  if (signatureTimestamp != null) {
    this.setSignatureTimestamp(signatureTimestamp)
  }
  if (signedHeaders != null) {
    this.setSignedHeaders(signedHeaders.toList())
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.mail.DKIMSignOptions] objects.
 *
 *
 * This represents the options used to perform DKIM Signature signing action.
 *
 * See: https://tools.ietf.org/html/rfc6376
 *
 * @param auid  Sets the Agent or User Identifier(AUID)
 * @param bodyCanonAlgo  Sets the canonicalization algorithm for mail body.
 * @param bodyLimit  Sets the body limit to sign.
 * @param copiedHeaders  Sets the copied headers used in DKIM.
 * @param expireTime  Sets the expire time in seconds when the signature sign will be expired. Success call of this method indicates that the signature sign timestamp is enabled.
 * @param headerCanonAlgo  Sets the canonicalization algorithm for signed headers.
 * @param privateKey  Sets the PKCS#8 format private key used to sign the email.
 * @param privateKeyPath  Sets the PKCS#8 format private key file path.
 * @param sdid  Sets the Singing Domain Identifier(SDID).
 * @param selector  Sets the selector used to query the public key.
 * @param signAlgo  Sets the signing algorithm.
 * @param signatureTimestamp  Sets to enable or disable signature sign timestmap. Default is disabled.
 * @param signedHeaders  Sets the email signedHeaders used to sign.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mail.DKIMSignOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("dkimSignOptionsOf(auid, bodyCanonAlgo, bodyLimit, copiedHeaders, expireTime, headerCanonAlgo, privateKey, privateKeyPath, sdid, selector, signAlgo, signatureTimestamp, signedHeaders)")
)
fun DKIMSignOptions(
  auid: String? = null,
  bodyCanonAlgo: CanonicalizationAlgorithm? = null,
  bodyLimit: Int? = null,
  copiedHeaders: Iterable<String>? = null,
  expireTime: Long? = null,
  headerCanonAlgo: CanonicalizationAlgorithm? = null,
  privateKey: String? = null,
  privateKeyPath: String? = null,
  sdid: String? = null,
  selector: String? = null,
  signAlgo: DKIMSignAlgorithm? = null,
  signatureTimestamp: Boolean? = null,
  signedHeaders: Iterable<String>? = null): DKIMSignOptions = io.vertx.ext.mail.DKIMSignOptions().apply {

  if (auid != null) {
    this.setAuid(auid)
  }
  if (bodyCanonAlgo != null) {
    this.setBodyCanonAlgo(bodyCanonAlgo)
  }
  if (bodyLimit != null) {
    this.setBodyLimit(bodyLimit)
  }
  if (copiedHeaders != null) {
    this.setCopiedHeaders(copiedHeaders.toList())
  }
  if (expireTime != null) {
    this.setExpireTime(expireTime)
  }
  if (headerCanonAlgo != null) {
    this.setHeaderCanonAlgo(headerCanonAlgo)
  }
  if (privateKey != null) {
    this.setPrivateKey(privateKey)
  }
  if (privateKeyPath != null) {
    this.setPrivateKeyPath(privateKeyPath)
  }
  if (sdid != null) {
    this.setSdid(sdid)
  }
  if (selector != null) {
    this.setSelector(selector)
  }
  if (signAlgo != null) {
    this.setSignAlgo(signAlgo)
  }
  if (signatureTimestamp != null) {
    this.setSignatureTimestamp(signatureTimestamp)
  }
  if (signedHeaders != null) {
    this.setSignedHeaders(signedHeaders.toList())
  }
}

