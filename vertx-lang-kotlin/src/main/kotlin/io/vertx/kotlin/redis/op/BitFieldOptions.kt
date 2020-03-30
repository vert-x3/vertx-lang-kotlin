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

import io.vertx.redis.op.BitFieldOptions
import io.vertx.redis.op.BitFieldGetCommand
import io.vertx.redis.op.BitFieldIncrbyCommand
import io.vertx.redis.op.BitFieldSetCommand

/**
 * A function providing a DSL for building [io.vertx.redis.op.BitFieldOptions] objects.
 *
 *
 * @param get 
 * @param incrby 
 * @param set 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.BitFieldOptions original] using Vert.x codegen.
 */
fun bitFieldOptionsOf(
  get: io.vertx.redis.op.BitFieldGetCommand? = null,
  incrby: io.vertx.redis.op.BitFieldIncrbyCommand? = null,
  set: io.vertx.redis.op.BitFieldSetCommand? = null): BitFieldOptions = io.vertx.redis.op.BitFieldOptions().apply {

  if (get != null) {
    this.setGet(get)
  }
  if (incrby != null) {
    this.setIncrby(incrby)
  }
  if (set != null) {
    this.setSet(set)
  }
}

/**
 * A function providing a DSL for building [io.vertx.redis.op.BitFieldOptions] objects.
 *
 *
 * @param get 
 * @param incrby 
 * @param set 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.BitFieldOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("bitFieldOptionsOf(get, incrby, set)")
)
fun BitFieldOptions(
  get: io.vertx.redis.op.BitFieldGetCommand? = null,
  incrby: io.vertx.redis.op.BitFieldIncrbyCommand? = null,
  set: io.vertx.redis.op.BitFieldSetCommand? = null): BitFieldOptions = io.vertx.redis.op.BitFieldOptions().apply {

  if (get != null) {
    this.setGet(get)
  }
  if (incrby != null) {
    this.setIncrby(incrby)
  }
  if (set != null) {
    this.setSet(set)
  }
}

