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
package io.vertx.kotlin.httpproxy.cache

import io.vertx.httpproxy.cache.CacheOptions

/**
 * A function providing a DSL for building [io.vertx.httpproxy.cache.CacheOptions] objects.
 *
 * Cache options.
 *
 * @param maxSize  Set the max number of entries the cache can hold.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.httpproxy.cache.CacheOptions original] using Vert.x codegen.
 */
fun cacheOptionsOf(
  maxSize: Int? = null): CacheOptions = io.vertx.httpproxy.cache.CacheOptions().apply {

  if (maxSize != null) {
    this.setMaxSize(maxSize)
  }
}

