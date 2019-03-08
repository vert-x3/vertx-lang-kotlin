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

import io.vertx.redis.op.SetOptions

/**
 * A function providing a DSL for building [io.vertx.redis.op.SetOptions] objects.
 *
 *
 * @param ex 
 * @param nx 
 * @param px 
 * @param xx 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.SetOptions original] using Vert.x codegen.
 */
fun setOptionsOf(
  ex: Long? = null,
  nx: Boolean? = null,
  px: Long? = null,
  xx: Boolean? = null): SetOptions = io.vertx.redis.op.SetOptions().apply {

  if (ex != null) {
    this.setEX(ex)
  }
  if (nx != null) {
    this.setNX(nx)
  }
  if (px != null) {
    this.setPX(px)
  }
  if (xx != null) {
    this.setXX(xx)
  }
}

/**
 * A function providing a DSL for building [io.vertx.redis.op.SetOptions] objects.
 *
 *
 * @param ex 
 * @param nx 
 * @param px 
 * @param xx 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.SetOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("setOptionsOf(ex, nx, px, xx)")
)
fun SetOptions(
  ex: Long? = null,
  nx: Boolean? = null,
  px: Long? = null,
  xx: Boolean? = null): SetOptions = io.vertx.redis.op.SetOptions().apply {

  if (ex != null) {
    this.setEX(ex)
  }
  if (nx != null) {
    this.setNX(nx)
  }
  if (px != null) {
    this.setPX(px)
  }
  if (xx != null) {
    this.setXX(xx)
  }
}

