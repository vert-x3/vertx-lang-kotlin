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
package io.vertx.kotlin.ext.web

import io.vertx.ext.web.Http2PushMapping

fun http2PushMappingOf(
  extensionTarget: String? = null,
  filePath: String? = null,
  noPush: Boolean? = null): Http2PushMapping = io.vertx.ext.web.Http2PushMapping().apply {

  if (extensionTarget != null) {
    this.setExtensionTarget(extensionTarget)
  }
  if (filePath != null) {
    this.setFilePath(filePath)
  }
  if (noPush != null) {
    this.setNoPush(noPush)
  }
}

@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("http2PushMappingOf(extensionTarget, filePath, noPush)")
)
fun Http2PushMapping(
  extensionTarget: String? = null,
  filePath: String? = null,
  noPush: Boolean? = null): Http2PushMapping = io.vertx.ext.web.Http2PushMapping().apply {

  if (extensionTarget != null) {
    this.setExtensionTarget(extensionTarget)
  }
  if (filePath != null) {
    this.setFilePath(filePath)
  }
  if (noPush != null) {
    this.setNoPush(noPush)
  }
}

