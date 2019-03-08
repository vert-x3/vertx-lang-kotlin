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

import io.vertx.redis.op.LimitOptions

/**
 * A function providing a DSL for building [io.vertx.redis.op.LimitOptions] objects.
 *
 *
 * @param count 
 * @param offset 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.LimitOptions original] using Vert.x codegen.
 */
fun limitOptionsOf(
  count: Long? = null,
  offset: Long? = null): LimitOptions = io.vertx.redis.op.LimitOptions().apply {

  if (count != null) {
    this.setCount(count)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
}

/**
 * A function providing a DSL for building [io.vertx.redis.op.LimitOptions] objects.
 *
 *
 * @param count 
 * @param offset 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.LimitOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("limitOptionsOf(count, offset)")
)
fun LimitOptions(
  count: Long? = null,
  offset: Long? = null): LimitOptions = io.vertx.redis.op.LimitOptions().apply {

  if (count != null) {
    this.setCount(count)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
}

