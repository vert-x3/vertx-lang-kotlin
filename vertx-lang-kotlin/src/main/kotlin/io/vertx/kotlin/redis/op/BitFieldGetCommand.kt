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
package io.vertx.kotlin.redis.op

import io.vertx.redis.op.BitFieldGetCommand

fun bitFieldGetCommandOf(
  offset: Long? = null,
  type: String? = null): BitFieldGetCommand = io.vertx.redis.op.BitFieldGetCommand().apply {

  if (offset != null) {
    this.setOffset(offset)
  }
  if (type != null) {
    this.setType(type)
  }
}

@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("bitFieldGetCommandOf(offset, type)")
)
fun BitFieldGetCommand(
  offset: Long? = null,
  type: String? = null): BitFieldGetCommand = io.vertx.redis.op.BitFieldGetCommand().apply {

  if (offset != null) {
    this.setOffset(offset)
  }
  if (type != null) {
    this.setType(type)
  }
}

