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
package io.vertx.kotlin.core.shareddata

import io.vertx.core.shareddata.Counter
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.shareddata.Counter.get]
 *
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.Counter] using Vert.x codegen.
 */
@Deprecated(message = "Instead use get returning a future and chain with coAwait()", replaceWith = ReplaceWith("get().coAwait()"))
suspend fun Counter.getAwait(): Long {
  return awaitResult {
    this.get(it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.Counter.incrementAndGet]
 *
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.Counter] using Vert.x codegen.
 */
@Deprecated(message = "Instead use incrementAndGet returning a future and chain with coAwait()", replaceWith = ReplaceWith("incrementAndGet().coAwait()"))
suspend fun Counter.incrementAndGetAwait(): Long {
  return awaitResult {
    this.incrementAndGet(it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.Counter.getAndIncrement]
 *
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.Counter] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getAndIncrement returning a future and chain with coAwait()", replaceWith = ReplaceWith("getAndIncrement().coAwait()"))
suspend fun Counter.getAndIncrementAwait(): Long {
  return awaitResult {
    this.getAndIncrement(it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.Counter.decrementAndGet]
 *
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.Counter] using Vert.x codegen.
 */
@Deprecated(message = "Instead use decrementAndGet returning a future and chain with coAwait()", replaceWith = ReplaceWith("decrementAndGet().coAwait()"))
suspend fun Counter.decrementAndGetAwait(): Long {
  return awaitResult {
    this.decrementAndGet(it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.Counter.addAndGet]
 *
 * @param value the value to add
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.Counter] using Vert.x codegen.
 */
@Deprecated(message = "Instead use addAndGet returning a future and chain with coAwait()", replaceWith = ReplaceWith("addAndGet(value).coAwait()"))
suspend fun Counter.addAndGetAwait(value: Long): Long {
  return awaitResult {
    this.addAndGet(value, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.Counter.getAndAdd]
 *
 * @param value the value to add
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.Counter] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getAndAdd returning a future and chain with coAwait()", replaceWith = ReplaceWith("getAndAdd(value).coAwait()"))
suspend fun Counter.getAndAddAwait(value: Long): Long {
  return awaitResult {
    this.getAndAdd(value, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.Counter.compareAndSet]
 *
 * @param expected the expected value
 * @param value the new value
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.Counter] using Vert.x codegen.
 */
@Deprecated(message = "Instead use compareAndSet returning a future and chain with coAwait()", replaceWith = ReplaceWith("compareAndSet(expected, value).coAwait()"))
suspend fun Counter.compareAndSetAwait(expected: Long, value: Long): Boolean {
  return awaitResult {
    this.compareAndSet(expected, value, it)
  }
}

