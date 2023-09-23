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
package io.vertx.kotlin.redis.client

import io.vertx.redis.client.PoolOptions

fun poolOptionsOf(
  name: String? = null,
  cleanerInterval: Int? = null,
  maxSize: Int? = null,
  maxWaiting: Int? = null,
  recycleTimeout: Int? = null): PoolOptions = io.vertx.redis.client.PoolOptions().apply {

  if (name != null) {
    this.setName(name)
  }
  if (cleanerInterval != null) {
    this.setCleanerInterval(cleanerInterval)
  }
  if (maxSize != null) {
    this.setMaxSize(maxSize)
  }
  if (maxWaiting != null) {
    this.setMaxWaiting(maxWaiting)
  }
  if (recycleTimeout != null) {
    this.setRecycleTimeout(recycleTimeout)
  }
}

